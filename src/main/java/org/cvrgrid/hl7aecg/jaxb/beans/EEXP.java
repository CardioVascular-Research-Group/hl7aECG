//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.09 at 10:59:16 AM EST 
//


package org.cvrgrid.hl7aecg.jaxb.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				see xs:annotation/xs:documentation for ED, EC and SC...this type
 * 				is the equivalent of EC but for ENXP rather than SC
 * 			
 * 
 * <p>Java class for EEXP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EEXP">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}ED">
 *       &lt;attribute name="partType" type="{urn:hl7-org:v3}cs_EntityNamePartType" />
 *       &lt;attribute name="qualifier" type="{urn:hl7-org:v3}set_cs_EntityNamePartQualifier" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EEXP")
@XmlSeeAlso({
    ENXP.class
})
public abstract class EEXP
    extends ED
{

    @XmlAttribute(name = "partType")
    protected CsEntityNamePartType partType;
    @XmlAttribute(name = "qualifier")
    protected List<CsEntityNamePartQualifier> qualifier;

    /**
     * Gets the value of the partType property.
     * 
     * @return
     *     possible object is
     *     {@link CsEntityNamePartType }
     *     
     */
    public CsEntityNamePartType getPartType() {
        return partType;
    }

    /**
     * Sets the value of the partType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsEntityNamePartType }
     *     
     */
    public void setPartType(CsEntityNamePartType value) {
        this.partType = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CsEntityNamePartQualifier }
     * 
     * 
     */
    public List<CsEntityNamePartQualifier> getQualifier() {
        if (qualifier == null) {
            qualifier = new ArrayList<CsEntityNamePartQualifier>();
        }
        return this.qualifier;
    }

}
