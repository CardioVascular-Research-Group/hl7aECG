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
 * <p>Java class for RoleClassRelationshipFormal.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassRelationshipFormal">
 *   &lt;restriction base="{urn:hl7-org:v3}RoleClassMutualRelationship">
 *     &lt;enumeration value="LIC"/>
 *     &lt;enumeration value="DSDLOC"/>
 *     &lt;enumeration value="NOT"/>
 *     &lt;enumeration value="PROV"/>
 *     &lt;enumeration value="AGNT"/>
 *     &lt;enumeration value="ASSIGNED"/>
 *     &lt;enumeration value="CON"/>
 *     &lt;enumeration value="ECON"/>
 *     &lt;enumeration value="NOK"/>
 *     &lt;enumeration value="SGNOFF"/>
 *     &lt;enumeration value="GUARD"/>
 *     &lt;enumeration value="EMP"/>
 *     &lt;enumeration value="MIL"/>
 *     &lt;enumeration value="CIT"/>
 *     &lt;enumeration value="COVPTY"/>
 *     &lt;enumeration value="CRINV"/>
 *     &lt;enumeration value="CRSPNSR"/>
 *     &lt;enumeration value="GUAR"/>
 *     &lt;enumeration value="PAT"/>
 *     &lt;enumeration value="PAYEE"/>
 *     &lt;enumeration value="PAYOR"/>
 *     &lt;enumeration value="POLHOLD"/>
 *     &lt;enumeration value="QUAL"/>
 *     &lt;enumeration value="RESBJ"/>
 *     &lt;enumeration value="SPNSR"/>
 *     &lt;enumeration value="STD"/>
 *     &lt;enumeration value="UNDWRT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassRelationshipFormal")
@XmlEnum(RoleClassMutualRelationship.class)
public enum RoleClassRelationshipFormal {

    LIC,
    DSDLOC,
    NOT,
    PROV,
    AGNT,
    ASSIGNED,
    CON,
    ECON,
    NOK,
    SGNOFF,
    GUARD,
    EMP,
    MIL,
    CIT,
    COVPTY,
    CRINV,
    CRSPNSR,
    GUAR,
    PAT,
    PAYEE,
    PAYOR,
    POLHOLD,
    QUAL,
    RESBJ,
    SPNSR,
    STD,
    UNDWRT;

    public String value() {
        return name();
    }

    public static RoleClassRelationshipFormal fromValue(String v) {
        return valueOf(v);
    }

}
