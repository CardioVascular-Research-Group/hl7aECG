//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.09 at 10:59:16 AM EST 
//


package org.cvrgrid.hl7aecg.jaxb.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				2003-10-02: pvb: see xs:annotation/xs:documentation for ED, EC and SC...
 * 			
 * 
 * <p>Java class for ENXP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ENXP">
 *   &lt;complexContent>
 *     &lt;restriction base="{urn:hl7-org:v3}EEXP">
 *       &lt;attribute name="mediaType" type="{urn:hl7-org:v3}cs" fixed="text/plain" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENXP")
@XmlSeeAlso({
    EnFam.class,
    EnDel.class,
    EnSfx.class,
    EnPfx.class,
    EnGiv.class
})
public class ENXP
    extends EEXP
{


}
