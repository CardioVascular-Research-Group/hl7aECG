package org.cvrgrid.hl7aecg;
/*
Copyright 2015 Johns Hopkins University Institute for Computational Medicine

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
/*
 * Created on Apr 6, 2006
 *
 */
/**
 * Represents the time series from all leads.
 * 
 * @author cyang, Andre Vilardo, Chris Jurado
 *  
 */
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
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


public class Hl7EcgLeadData {
	
	protected Logger log = null;

    private BigDecimal[] leadOriginValue, leadScaleValue;
 	private String[] leadOriginUnit, leadScaleUnit;
	private String[] leadName;
    private List<BigInteger>[] leadDigits;
    private BigDecimal timeIncrement;
	private String timeUnit;

    // jfreechart
    private int numberOfLeads;
    private int numberOfPoints;

	// 1 based index
    private int pageNumber = 1;
    private int pageSize = 3000;
    private int pageCount;
    

    @SuppressWarnings("unchecked")
	public Hl7EcgLeadData(List<PORTMT020001Component9> c9s) {
        this.log = Logger.getLogger(this.getClass());
        if (c9s == null) {
        	log.error("HL7AECG C9S data is null.");
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
                    this.timeIncrement = new BigDecimal(g.getIncrement().getValue());
                    this.timeUnit = g.getIncrement().getUnit();
                } else {
                	log.error("HL7AECG Code value is not an instance of GLISTTS.");
                }
            } else if (code.equals(Hl7Constants.CODE_TIME_RELATIVE)) {
                if (value instanceof GLISTPQ) {
                    GLISTPQ g = (GLISTPQ) value;            
                    this.timeIncrement = new BigDecimal(g.getIncrement().getValue());
                    this.timeUnit = g.getIncrement().getUnit();

                } else {
                	log.error("HL7AECG Code value is not an instance of GLISTPQ.");
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

    public void pageForward(int step) {
        pageNumber += step;
        if (pageNumber > pageCount) {
            pageNumber = pageCount;
        }
    }

    public void setPageWindow(double width) {
        if (width != 0) {
            this.pageSize = (int) Math.round(width / this.timeIncrement.doubleValue());
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
            if (i==0) totalRead += ecgDataset.getReadingSize();
        }
        return ret;
    }
    public int totalRead=0;
    
    public XYDataset getOneXYDataset(int leadIndex) {
        if (leadIndex < 0 || leadIndex >= this.numberOfLeads) {
            log.error("the leadIndex is out of bounds");
            return null;
        } else {
            PagedEcgXYDataset ecgDataset = new PagedEcgXYDataset(leadIndex);
            return ecgDataset;
        }
    }

    public String[] getLeadName() {
        return leadName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        if (pageNumber >= 1 && pageNumber <= this.pageCount) {
            this.pageNumber = pageNumber;
        }
    }

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

    /**
     * @author cyang Apr 10, 2006
     */
    public class PagedEcgXYDataset implements XYDataset {
        public int whichLead;
        private int readingSize = 5000;
        private int offset = 0;

        public int getReadingSize() {
            return readingSize;
        }

        public void setReadingSize(int count) {
            if (count > 0){
                this.readingSize = count;
            } 
            else{
                log.error("Error: trying to set readingSize to negative number " + count);
            }
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            if (offset >= 0 && offset < numberOfPoints) {
                this.offset = offset;
            } else {
                log.error("Error: trying to set an invalid offset value, "
                        + offset + "; numberofpoints " + numberOfPoints);
            }
        }

        private PagedEcgXYDataset(int whichLead) {
            this.whichLead = whichLead;
        }

        public void addChangeListener(DatasetChangeListener arg0) {
            log.error("addChangeListener not implemented ");
        }

        public void removeChangeListener(DatasetChangeListener arg0) {
            log.error("removeChangeListener not implemented. ");
        }

        public DatasetGroup getGroup() {
            log.error("getGroup not implemented. ");
            return null;
        }

        public void setGroup(DatasetGroup arg0) {
            log.error("setGroup not implemented. ");
        }

        public DomainOrder getDomainOrder() {
            log.error("getDomainOrder not implemented. ");
            return null;
        }

        public int getItemCount(int series) {
            if (readingSize + this.offset < numberOfPoints)
                return readingSize; //numberOfPoints;
            else
                return numberOfPoints - offset;
        }

        public Number getX(int series, int item) {
            return new Double(getXValue(series, item));
        }

        public double getXValue(int series, int item) {
            double inc = timeIncrement.doubleValue();
            double ret = inc * (this.offset + item);
            return ret;
        }

        public Number getY(int series, int item) {
            return (Number) leadDigits[this.whichLead].get(this.offset + item);
        }

        public double getYValue(int series, int item) {
            BigInteger tmp = (BigInteger) leadDigits[this.whichLead].get(this.offset + item);
            return tmp.doubleValue();
        }

        public int getSeriesCount() {
            return 1; // this.numberOfLeads;
        }

        @SuppressWarnings("rawtypes")
		public Comparable getSeriesKey(int series) {
            return leadName[whichLead];
        }

        @SuppressWarnings("rawtypes")
		public int indexOf(Comparable seriesKey) {
            if (leadName[this.whichLead].equals(seriesKey)) {
                return 0;
            } else {
                log.fatal("can not find the index for seriesKey " + seriesKey);
                return -1;
            }
        }
    }
}