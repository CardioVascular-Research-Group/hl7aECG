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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PORT_MT020001.AuthorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PORT_MT020001.AuthorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="assignedPerson" type="{urn:hl7-org:v3}PORT_MT020001.Person" minOccurs="0"/>
 *         &lt;element name="assignedDevice" type="{urn:hl7-org:v3}PORT_MT020001.Device" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="type" type="{urn:hl7-org:v3}Classes" default="Entity" />
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
 *       &lt;attribute name="stubId" type="{urn:hl7-org:v3}oid" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PORT_MT020001.AuthorType", propOrder = {
    "assignedPerson",
    "assignedDevice"
})
public class PORTMT020001AuthorType {

    protected PORTMT020001Person assignedPerson;
    protected PORTMT020001Device assignedDevice;
    @XmlAttribute(name = "type")
    protected Classes type;
    @XmlAttribute(name = "templateId")
    protected List<String> templateId;
    @XmlAttribute(name = "typeID")
    protected List<String> typeID;
    @XmlAttribute(name = "realmCode")
    protected List<String> realmCode;
    @XmlAttribute(name = "nullFlavor")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nullFlavor;
    @XmlAttribute(name = "stubId")
    protected String stubId;

    /**
     * Gets the value of the assignedPerson property.
     * 
     * @return
     *     possible object is
     *     {@link PORTMT020001Person }
     *     
     */
    public PORTMT020001Person getAssignedPerson() {
        return assignedPerson;
    }

    /**
     * Sets the value of the assignedPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PORTMT020001Person }
     *     
     */
    public void setAssignedPerson(PORTMT020001Person value) {
        this.assignedPerson = value;
    }

    /**
     * Gets the value of the assignedDevice property.
     * 
     * @return
     *     possible object is
     *     {@link PORTMT020001Device }
     *     
     */
    public PORTMT020001Device getAssignedDevice() {
        return assignedDevice;
    }

    /**
     * Sets the value of the assignedDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PORTMT020001Device }
     *     
     */
    public void setAssignedDevice(PORTMT020001Device value) {
        this.assignedDevice = value;
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
            return Classes.ENTITY;
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

    /**
     * Gets the value of the stubId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStubId() {
        return stubId;
    }

    /**
     * Sets the value of the stubId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStubId(String value) {
        this.stubId = value;
    }

}
