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
 * <p>Java class for EntityClassDocumentReceiving.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityClassDocumentReceiving">
 *   &lt;restriction base="{urn:hl7-org:v3}EntityClass">
 *     &lt;enumeration value="ORG"/>
 *     &lt;enumeration value="PUB"/>
 *     &lt;enumeration value="STATE"/>
 *     &lt;enumeration value="PSN"/>
 *     &lt;enumeration value="HCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityClassDocumentReceiving")
@XmlEnum(EntityClass.class)
public enum EntityClassDocumentReceiving {

    ORG,
    PUB,
    STATE,
    PSN,
    HCE;

    public String value() {
        return name();
    }

    public static EntityClassDocumentReceiving fromValue(String v) {
        return valueOf(v);
    }

}