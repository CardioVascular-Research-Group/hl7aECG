//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.09 at 10:59:16 AM EST 
//


package org.cvrgrid.hl7aecg.jaxb.beans;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListType">
 *   &lt;restriction base="{urn:hl7-org:v3}DocumentList">
 *     &lt;enumeration value="ordered"/>
 *     &lt;enumeration value="unordered"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListType")
@XmlEnum(DocumentList.class)
public enum ListType {

    @XmlEnumValue("ordered")
    ORDERED(DocumentList.ORDERED),
    @XmlEnumValue("unordered")
    UNORDERED(DocumentList.UNORDERED);
    private final DocumentList value;

    ListType(DocumentList v) {
        value = v;
    }

    public DocumentList value() {
        return value;
    }

    public static ListType fromValue(DocumentList v) {
        for (ListType c: ListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
