//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.09 at 10:59:16 AM EST 
//


package org.cvrgrid.hl7aecg.jaxb.beans;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cs_OrganizationNamePartType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cs_OrganizationNamePartType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs_EntityNamePartType">
 *     &lt;enumeration value="PFX"/>
 *     &lt;enumeration value="SFX"/>
 *     &lt;enumeration value="DEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cs_OrganizationNamePartType")
@XmlEnum(CsEntityNamePartType.class)
public enum CsOrganizationNamePartType {

    PFX,
    SFX,
    DEL;

    public String value() {
        return name();
    }

    public static CsOrganizationNamePartType fromValue(String v) {
        return valueOf(v);
    }

}