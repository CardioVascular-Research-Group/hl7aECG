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
 * <p>Java class for EntityClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityClass">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ENT"/>
 *     &lt;enumeration value="HCE"/>
 *     &lt;enumeration value="LIV"/>
 *     &lt;enumeration value="NLIV"/>
 *     &lt;enumeration value="ANM"/>
 *     &lt;enumeration value="MIC"/>
 *     &lt;enumeration value="PLNT"/>
 *     &lt;enumeration value="PSN"/>
 *     &lt;enumeration value="MAT"/>
 *     &lt;enumeration value="MMAT"/>
 *     &lt;enumeration value="CONT"/>
 *     &lt;enumeration value="HOLD"/>
 *     &lt;enumeration value="DEV"/>
 *     &lt;enumeration value="CER"/>
 *     &lt;enumeration value="MODDV"/>
 *     &lt;enumeration value="CHEM"/>
 *     &lt;enumeration value="FOOD"/>
 *     &lt;enumeration value="ORG"/>
 *     &lt;enumeration value="PUB"/>
 *     &lt;enumeration value="STATE"/>
 *     &lt;enumeration value="PLC"/>
 *     &lt;enumeration value="CITY"/>
 *     &lt;enumeration value="COUNTRY"/>
 *     &lt;enumeration value="COUNTY"/>
 *     &lt;enumeration value="PROVINCE"/>
 *     &lt;enumeration value="RGRP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityClass")
@XmlEnum
public enum EntityClass {

    ENT,
    HCE,
    LIV,
    NLIV,
    ANM,
    MIC,
    PLNT,
    PSN,
    MAT,
    MMAT,
    CONT,
    HOLD,
    DEV,
    CER,
    MODDV,
    CHEM,
    FOOD,
    ORG,
    PUB,
    STATE,
    PLC,
    CITY,
    COUNTRY,
    COUNTY,
    PROVINCE,
    RGRP;

    public String value() {
        return name();
    }

    public static EntityClass fromValue(String v) {
        return valueOf(v);
    }

}