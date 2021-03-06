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
 * <p>Java class for DocumentTableStructure.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentTableStructure">
 *   &lt;restriction base="{urn:hl7-org:v3}ActDocumentStructureClass">
 *     &lt;enumeration value="TBLDATA"/>
 *     &lt;enumeration value="TBLHDR"/>
 *     &lt;enumeration value="TBLCOL"/>
 *     &lt;enumeration value="TBLCOLGP"/>
 *     &lt;enumeration value="tbody"/>
 *     &lt;enumeration value="tfoot"/>
 *     &lt;enumeration value="thead"/>
 *     &lt;enumeration value="TBLROW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentTableStructure")
@XmlEnum(ActDocumentStructureClass.class)
public enum DocumentTableStructure {

    TBLDATA(ActDocumentStructureClass.TBLDATA),
    TBLHDR(ActDocumentStructureClass.TBLHDR),
    TBLCOL(ActDocumentStructureClass.TBLCOL),
    TBLCOLGP(ActDocumentStructureClass.TBLCOLGP),
    @XmlEnumValue("tbody")
    TBODY(ActDocumentStructureClass.TBODY),
    @XmlEnumValue("tfoot")
    TFOOT(ActDocumentStructureClass.TFOOT),
    @XmlEnumValue("thead")
    THEAD(ActDocumentStructureClass.THEAD),
    TBLROW(ActDocumentStructureClass.TBLROW);
    private final ActDocumentStructureClass value;

    DocumentTableStructure(ActDocumentStructureClass v) {
        value = v;
    }

    public ActDocumentStructureClass value() {
        return value;
    }

    public static DocumentTableStructure fromValue(ActDocumentStructureClass v) {
        for (DocumentTableStructure c: DocumentTableStructure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
