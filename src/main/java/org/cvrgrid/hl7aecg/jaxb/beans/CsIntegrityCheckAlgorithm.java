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
 * <p>Java class for cs_IntegrityCheckAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cs_IntegrityCheckAlgorithm">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SHA-1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cs_IntegrityCheckAlgorithm")
@XmlEnum
public enum CsIntegrityCheckAlgorithm {

    @XmlEnumValue("SHA-1")
    SHA_1("SHA-1");
    private final String value;

    CsIntegrityCheckAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CsIntegrityCheckAlgorithm fromValue(String v) {
        for (CsIntegrityCheckAlgorithm c: CsIntegrityCheckAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
