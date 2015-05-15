/*
 * Created on Apr 6, 2006
 *
 */

package org.cvrgrid.hl7aecg;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.cvrgrid.hl7aecg.jaxb.beans.GLISTPQ;
import org.cvrgrid.hl7aecg.jaxb.beans.GLISTTS;
import org.cvrgrid.hl7aecg.jaxb.beans.PORTMT020001Component9;
import org.cvrgrid.hl7aecg.jaxb.beans.PORTMT020001Sequence;
import org.cvrgrid.hl7aecg.jaxb.beans.PQ;
import org.cvrgrid.hl7aecg.jaxb.beans.SLISTPQ;
import org.jfree.data.DomainOrder;
import org.jfree.data.general.DatasetChangeListener;
import org.jfree.data.general.DatasetGroup;
import org.jfree.data.xy.XYDataset;

/**
 * Represents the time series from all leads.
 * 
 * @author cyang
 *  
 */
public class Hl7EcgLeadData {

    private BigDecimal[] leadOriginValue, leadScaleValue;
 	private String[] leadOriginUnit, leadScaleUnit;
	private String[] leadName;
    private List<BigInteger>[] leadDigits;
    private String timeStart;
    private BigDecimal timeIncrement;
	private String timeUnit;
	private List timeSeries;

    // jfreechart
    private int numberOfLeads;
    private int numberOfPoints;

	// 1 based index
    private int pageNumber = 1;
    private int pageSize = 3000;
    private int pageCount;

    public void pageForward(int step) {
        pageNumber += step;
        if (pageNumber > pageCount) {
            pageNumber = pageCount;
        }
    }

    public void setPageWindow(double width) {
        if (width != 0) {
            this.pageSize = (int) Math.round(width
                    / this.timeIncrement.doubleValue());
            this.calcPageCount();
        }
    }

    public double getPageWindow() {
        return this.timeIncrement.doubleValue() * this.pageSize;
    }

    public void pageBackward(int step) {
        pageNumber -= step;
        if (pageNumber < 1) {
            pageNumber = 1;
        }
    }

    private void calcPageCount() {
        if (pageSize != 0) {
            double tmp = Math.ceil(((double) this.numberOfPoints) / this.pageSize);
            this.pageCount = (int) tmp;
        }
    }

    /**
     * Constructor
     * 
     * @param c9s
     *            array of data
     */
    public Hl7EcgLeadData(List<PORTMT020001Component9> c9s) {
        if (c9s == null) {
            return;
        }

        this.numberOfLeads = c9s.size() - 1;
        this.leadOriginUnit = new String[numberOfLeads];
        this.leadOriginValue = new BigDecimal[numberOfLeads];
        this.leadScaleUnit = new String[numberOfLeads];
        this.leadScaleValue = new BigDecimal[numberOfLeads];
        this.leadName = new String[numberOfLeads];
        this.leadDigits = new ArrayList[numberOfLeads];
        int leadIndex = -1;
        boolean isSet = false;
        
        for (PORTMT020001Component9 component9 : c9s) {
		    PORTMT020001Sequence sequence = component9.getSequence();
            String code = sequence.getCode().getCode();
            
            Object value = sequence.getValue();
            if (code.equals(Hl7Constants.CODE_TIME_ABSOLUTE)) {
                if (value instanceof GLISTTS) {
                    GLISTTS g = (GLISTTS) value;
                    this.timeStart = g.getHead().getValue();

                    // get increment
                    this.timeIncrement = new BigDecimal(g.getIncrement().getValue());
                    this.timeUnit = g.getIncrement().getUnit();

                } else {
                    // throw exception?
                }
            } else if (code.equals(Hl7Constants.CODE_TIME_RELATIVE)) {
                if (value instanceof GLISTPQ) {
                    GLISTPQ g = (GLISTPQ) value;
                    this.timeStart = g.getHead().getValue().toString();
//                  
                    // get increment
                    this.timeIncrement = new BigDecimal(g.getIncrement().getValue());
                    this.timeUnit = g.getIncrement().getUnit();

                } else {
                    // throw exception?
                }
            } else {
                leadIndex++;
                this.leadName[leadIndex] = code.replace(Hl7Constants.CODE_LEAD_PREFIX, "");
                if (value instanceof SLISTPQ) {
                    SLISTPQ s = (SLISTPQ) value;
                    PQ origin = s.getOrigin();
                    this.leadOriginValue[leadIndex] = new BigDecimal(origin.getValue());
                    this.leadOriginUnit[leadIndex] = origin.getUnit();

                    PQ scale = s.getScale();
                    this.leadScaleValue[leadIndex] = new BigDecimal(scale.getValue());
                    this.leadScaleUnit[leadIndex] = scale.getUnit();

                    // digits
                    List<BigInteger> digits = s.getDigits();

                    this.leadDigits[leadIndex] = digits;
                    if (!isSet) {
                        this.numberOfPoints = digits.size();
                        isSet = true;
                    }

                }
            }
        }
        this.calcPageCount();

    }

    public XYDataset[] getPagedXYDatasets() {
        return getAllXYDatasets((pageNumber - 1) * pageSize, pageSize);
    }

    private XYDataset[] getAllXYDatasets(int offset, int count) {
        XYDataset[] ret = new PagedEcgXYDataset[this.numberOfLeads];
        for (int i = 0; i < this.numberOfLeads; i++) {
            PagedEcgXYDataset ecgDataset = new PagedEcgXYDataset(i);
            ecgDataset.setOffset(offset);
            ecgDataset.setReadingSize(count);
            ret[i] = ecgDataset;
//            logger.debug(i + ": offset: " + ecgDataset.getOffset()
//                    + "; readingSize is " + ecgDataset.getReadingSize());
            if (i==0) totalRead += ecgDataset.getReadingSize();
        }
        return ret;
    }
    public int totalRead=0;
    
    public XYDataset getOneXYDataset(int leadIndex) {
        if (leadIndex < 0 || leadIndex >= this.numberOfLeads) {
//            logger.error("the leadIndex is out of bounds");
            return null;
        } else {
//            logger.debug("is called");
            PagedEcgXYDataset ecgDataset = new PagedEcgXYDataset(leadIndex);
            return ecgDataset;
        }
    }

    /**
     * represents one page of data from one lead
     * 
     * @author cyang Apr 10, 2006
     */
    public class PagedEcgXYDataset implements XYDataset {
        public int whichLead;

        private int readingSize = 5000;

        private int offset = 0;

        /**
         * @return Returns the readingSize.
         */
        public int getReadingSize() {
            return readingSize;
        }

        /**
         * @param readingSize
         *            The readingSize to set.
         */
        public void setReadingSize(int count) {
            if (count > 0)
                this.readingSize = count;
//            else
//                logger
//                        .error("Error: trying to set readingSize to negative number "
//                                + count);
        }

        /**
         * @return Returns the offset.
         */
        public int getOffset() {
            return offset;
        }

        /**
         * @param offset
         *            The offset to set.
         */
        public void setOffset(int offset) {
            if (offset >= 0 && offset < numberOfPoints) {
                this.offset = offset;
            } else {
//                logger.error("Error: trying to set an invalid offset value, "
//                        + offset + "; numberofpoints " + numberOfPoints);
            }
        }

        /**
         * constructor
         * 
         * @param whichLead
         *            zero based?
         */
        private PagedEcgXYDataset(int whichLead) {
            this.whichLead = whichLead;
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.jfree.data.general.Dataset#addChangeListener(org.jfree.data.general.DatasetChangeListener)
         */
        public void addChangeListener(DatasetChangeListener arg0) {
//            logger.debug("addChangeListener not implemented ");
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.jfree.data.general.Dataset#removeChangeListener(org.jfree.data.general.DatasetChangeListener)
         */
        public void removeChangeListener(DatasetChangeListener arg0) {
//            logger.debug("removeChangeListener not implemented. ");

        }

        /*
         * (non-Javadoc)
         * 
         * @see org.jfree.data.general.Dataset#getGroup()
         */
        public DatasetGroup getGroup() {
//            logger.debug("getGroup not implemented. ");
            return null;
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.jfree.data.general.Dataset#setGroup(org.jfree.data.general.DatasetGroup)
         */
        public void setGroup(DatasetGroup arg0) {
//            logger.debug("setGroup not implemented. ");

        }

        /*
         * (non-Javadoc)
         * 
         * @see org.jfree.data.xy.XYDataset#getDomainOrder()
         */
        public DomainOrder getDomainOrder() {
//            logger.debug("getDomainOrder not implemented. ");
            return null;
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.jfree.data.xy.XYDataset#getItemCount(int)
         */
        public int getItemCount(int series) {
            if (readingSize + this.offset < numberOfPoints)
                return readingSize; //numberOfPoints;
            else
                return numberOfPoints - offset;
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.jfree.data.xy.XYDataset#getX(int, int)
         */
        public Number getX(int series, int item) {

            return new Double(getXValue(series, item));
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.jfree.data.xy.XYDataset#getXValue(int, int)
         */
        public double getXValue(int series, int item) {
            double inc = timeIncrement.doubleValue();
            double ret = inc * (this.offset + item);

            return ret;
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.jfree.data.xy.XYDataset#getY(int, int)
         */
        public Number getY(int series, int item) {
            return (Number) leadDigits[this.whichLead].get(this.offset + item);
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.jfree.data.xy.XYDataset#getYValue(int, int)
         */
        public double getYValue(int series, int item) {
            BigInteger tmp = (BigInteger) leadDigits[this.whichLead]
                    .get(this.offset + item);
            return tmp.doubleValue();
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.jfree.data.general.SeriesDataset#getSeriesCount()
         */
        public int getSeriesCount() {

            return 1; // this.numberOfLeads;
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.jfree.data.general.SeriesDataset#getSeriesKey(int)
         */
        public Comparable getSeriesKey(int series) {
            return leadName[whichLead];
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.jfree.data.general.SeriesDataset#indexOf(java.lang.Comparable)
         */
        public int indexOf(Comparable seriesKey) {
            if (leadName[this.whichLead].equals(seriesKey)) {
                return 0;
            } else {
//                logger.fatal("can not find the index for seriesKey "
//                        + seriesKey);

                return -1;
            }
        }

    }

    /**
     * @return Returns the leadName.
     */
    public String[] getLeadName() {
        return leadName;
    }

    /**
     * @return Returns the pageNumber.
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * @param pageNumber - 1 based index of data pages.
     *            The pageNumber to set.
     */
    public void setPageNumber(int pageNumber) {
        if (pageNumber >= 1 && pageNumber <= this.pageCount) {
            this.pageNumber = pageNumber;
        }

    }

    /**
     * @return Returns the pageCount.
     */
    public int getPageCount() {
        return pageCount;
    }
    
    public int getNumberOfPoints() {
		return numberOfPoints;
	}
    public String getTimeUnit() {
		return timeUnit;
	}
    public double getTimeIncrement() {
		return timeIncrement.doubleValue();
	}
    public String getLeadScaleUnit(int lead) {
		return leadScaleUnit[lead];
	}
    public double getLeadScaleValue(int lead) {
		return leadScaleValue[lead].doubleValue();
	}

}
