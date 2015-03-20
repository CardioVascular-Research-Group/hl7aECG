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
 * <p>Java class for RoleClassPassive.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassPassive">
 *   &lt;restriction base="{urn:hl7-org:v3}RoleClassAssociative">
 *     &lt;enumeration value="DST"/>
 *     &lt;enumeration value="RET"/>
 *     &lt;enumeration value="MANU"/>
 *     &lt;enumeration value="THER"/>
 *     &lt;enumeration value="SDLOC"/>
 *     &lt;enumeration value="DSDLOC"/>
 *     &lt;enumeration value="ISDLOC"/>
 *     &lt;enumeration value="ACCESS"/>
 *     &lt;enumeration value="BIRTHPL"/>
 *     &lt;enumeration value="EXPR"/>
 *     &lt;enumeration value="HLD"/>
 *     &lt;enumeration value="HLTHCHRT"/>
 *     &lt;enumeration value="IDENT"/>
 *     &lt;enumeration value="MNT"/>
 *     &lt;enumeration value="OWN"/>
 *     &lt;enumeration value="RGPR"/>
 *     &lt;enumeration value="TERR"/>
 *     &lt;enumeration value="WRTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassPassive")
@XmlEnum(RoleClassAssociative.class)
public enum RoleClassPassive {

    DST,
    RET,
    MANU,
    THER,
    SDLOC,
    DSDLOC,
    ISDLOC,
    ACCESS,
    BIRTHPL,
    EXPR,
    HLD,
    HLTHCHRT,
    IDENT,
    MNT,
    OWN,
    RGPR,
    TERR,
    WRTE;

    public String value() {
        return name();
    }

    public static RoleClassPassive fromValue(String v) {
        return valueOf(v);
    }

}
