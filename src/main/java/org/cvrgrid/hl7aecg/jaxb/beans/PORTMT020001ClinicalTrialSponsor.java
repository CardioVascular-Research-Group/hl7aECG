//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.09 at 10:59:16 AM EST 
//


package org.cvrgrid.hl7aecg.jaxb.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PORT_MT020001.ClinicalTrialSponsor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PORT_MT020001.ClinicalTrialSponsor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sponsorOrganization" type="{urn:hl7-org:v3}PORT_MT020001.Organization"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{urn:hl7-org:v3}Classes" default="RoleHeir" />
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}RoleClass" />
 *       &lt;attribute name="templateId">
 *         &lt;simpleType>
 *           &lt;list itemType="{urn:hl7-org:v3}oid" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="typeID">
 *         &lt;simpleType>
 *           &lt;list itemType="{urn:hl7-org:v3}oid" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="realmCode">
 *         &lt;simpleType>
 *           &lt;list itemType="{urn:hl7-org:v3}cs" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}cs" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PORT_MT020001.ClinicalTrialSponsor", propOrder = {
    "sponsorOrganization"
})
public class PORTMT020001ClinicalTrialSponsor {

    @XmlElement(required = true)
    protected PORTMT020001Organization sponsorOrganization;
    @XmlAttribute(name = "type")
    protected Classes type;
    @XmlAttribute(name = "classCode")
    protected RoleClass classCode;
    @XmlAttribute(name = "templateId")
    protected List<String> templateId;
    @XmlAttribute(name = "typeID")
    protected List<String> typeID;
    @XmlAttribute(name = "realmCode")
    protected List<String> realmCode;
    @XmlAttribute(name = "nullFlavor")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nullFlavor;

    /**
     * Gets the value of the sponsorOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link PORTMT020001Organization }
     *     
     */
    public PORTMT020001Organization getSponsorOrganization() {
        return sponsorOrganization;
    }

    /**
     * Sets the value of the sponsorOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link PORTMT020001Organization }
     *     
     */
    public void setSponsorOrganization(PORTMT020001Organization value) {
        this.sponsorOrganization = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Classes }
     *     
     */
    public Classes getType() {
        if (type == null) {
            return Classes.ROLE_HEIR;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Classes }
     *     
     */
    public void setType(Classes value) {
        this.type = value;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link RoleClass }
     *     
     */
    public RoleClass getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleClass }
     *     
     */
    public void setClassCode(RoleClass value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTemplateId() {
        if (templateId == null) {
            templateId = new ArrayList<String>();
        }
        return this.templateId;
    }

    /**
     * Gets the value of the typeID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypeID() {
        if (typeID == null) {
            typeID = new ArrayList<String>();
        }
        return this.typeID;
    }

    /**
     * Gets the value of the realmCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realmCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealmCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRealmCode() {
        if (realmCode == null) {
            realmCode = new ArrayList<String>();
        }
        return this.realmCode;
    }

    /**
     * Gets the value of the nullFlavor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullFlavor() {
        return nullFlavor;
    }

    /**
     * Sets the value of the nullFlavor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullFlavor(String value) {
        this.nullFlavor = value;
    }

}
