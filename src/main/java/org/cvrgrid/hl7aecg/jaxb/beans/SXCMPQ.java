//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.09 at 10:59:16 AM EST 
//


package org.cvrgrid.hl7aecg.jaxb.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SXCM_PQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SXCM_PQ">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}PQ">
 *       &lt;attribute name="operator" type="{urn:hl7-org:v3}cs_SetOperator" default="I" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SXCM_PQ")
@XmlSeeAlso({
    IVLPQ.class
})
public class SXCMPQ
    extends PQ
{

    @XmlAttribute(name = "operator")
    protected CsSetOperator operator;

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link CsSetOperator }
     *     
     */
    public CsSetOperator getOperator() {
        if (operator == null) {
            return CsSetOperator.I;
        } else {
            return operator;
        }
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsSetOperator }
     *     
     */
    public void setOperator(CsSetOperator value) {
        this.operator = value;
    }

}
