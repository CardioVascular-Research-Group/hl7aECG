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
 * <p>Java class for PORT_MT020001.Series complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PORT_MT020001.Series">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" minOccurs="0"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE"/>
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}IVL_TS"/>
 *         &lt;element name="author" type="{urn:hl7-org:v3}PORT_MT020001.Author1" minOccurs="0"/>
 *         &lt;element name="secondaryPerformer" type="{urn:hl7-org:v3}PORT_MT020001.SecondaryPerformer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="support" type="{urn:hl7-org:v3}PORT_MT020001.Support2" minOccurs="0"/>
 *         &lt;element name="controlVariable" type="{urn:hl7-org:v3}PORT_MT020001.ControlVariable6" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="component" type="{urn:hl7-org:v3}PORT_MT020001.Component8" maxOccurs="unbounded"/>
 *         &lt;element name="subjectOf" type="{urn:hl7-org:v3}PORT_MT020001.Subject2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="derivation" type="{urn:hl7-org:v3}PORT_MT020001.DerivedFrom" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{urn:hl7-org:v3}Classes" default="Observation" />
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}ActClass" />
 *       &lt;attribute name="moodCode" type="{urn:hl7-org:v3}ActMood" />
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
@XmlType(name = "PORT_MT020001.Series", propOrder = {
    "id",
    "code",
    "effectiveTime",
    "author",
    "secondaryPerformer",
    "support",
    "controlVariable",
    "component",
    "subjectOf",
    "derivation"
})
public class PORTMT020001Series {

    protected II id;
    @XmlElement(required = true)
    protected CE code;
    @XmlElement(required = true)
    protected IVLTS effectiveTime;
    protected PORTMT020001Author1 author;
    protected List<PORTMT020001SecondaryPerformer> secondaryPerformer;
    protected PORTMT020001Support2 support;
    protected List<PORTMT020001ControlVariable6> controlVariable;
    @XmlElement(required = true)
    protected List<PORTMT020001Component8> component;
    protected List<PORTMT020001Subject2> subjectOf;
    protected List<PORTMT020001DerivedFrom> derivation;
    @XmlAttribute(name = "type")
    protected Classes type;
    @XmlAttribute(name = "classCode")
    protected ActClass classCode;
    @XmlAttribute(name = "moodCode")
    protected ActMood moodCode;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setId(II value) {
        this.id = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CE }
     *     
     */
    public CE getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setCode(CE value) {
        this.code = value;
    }

    /**
     * Gets the value of the effectiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link IVLTS }
     *     
     */
    public IVLTS getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Sets the value of the effectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setEffectiveTime(IVLTS value) {
        this.effectiveTime = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link PORTMT020001Author1 }
     *     
     */
    public PORTMT020001Author1 getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link PORTMT020001Author1 }
     *     
     */
    public void setAuthor(PORTMT020001Author1 value) {
        this.author = value;
    }

    /**
     * Gets the value of the secondaryPerformer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryPerformer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryPerformer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PORTMT020001SecondaryPerformer }
     * 
     * 
     */
    public List<PORTMT020001SecondaryPerformer> getSecondaryPerformer() {
        if (secondaryPerformer == null) {
            secondaryPerformer = new ArrayList<PORTMT020001SecondaryPerformer>();
        }
        return this.secondaryPerformer;
    }

    /**
     * Gets the value of the support property.
     * 
     * @return
     *     possible object is
     *     {@link PORTMT020001Support2 }
     *     
     */
    public PORTMT020001Support2 getSupport() {
        return support;
    }

    /**
     * Sets the value of the support property.
     * 
     * @param value
     *     allowed object is
     *     {@link PORTMT020001Support2 }
     *     
     */
    public void setSupport(PORTMT020001Support2 value) {
        this.support = value;
    }

    /**
     * Gets the value of the controlVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PORTMT020001ControlVariable6 }
     * 
     * 
     */
    public List<PORTMT020001ControlVariable6> getControlVariable() {
        if (controlVariable == null) {
            controlVariable = new ArrayList<PORTMT020001ControlVariable6>();
        }
        return this.controlVariable;
    }

    /**
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PORTMT020001Component8 }
     * 
     * 
     */
    public List<PORTMT020001Component8> getComponent() {
        if (component == null) {
            component = new ArrayList<PORTMT020001Component8>();
        }
        return this.component;
    }

    /**
     * Gets the value of the subjectOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PORTMT020001Subject2 }
     * 
     * 
     */
    public List<PORTMT020001Subject2> getSubjectOf() {
        if (subjectOf == null) {
            subjectOf = new ArrayList<PORTMT020001Subject2>();
        }
        return this.subjectOf;
    }

    /**
     * Gets the value of the derivation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derivation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PORTMT020001DerivedFrom }
     * 
     * 
     */
    public List<PORTMT020001DerivedFrom> getDerivation() {
        if (derivation == null) {
            derivation = new ArrayList<PORTMT020001DerivedFrom>();
        }
        return this.derivation;
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
            return Classes.OBSERVATION;
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
     *     {@link ActClass }
     *     
     */
    public ActClass getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActClass }
     *     
     */
    public void setClassCode(ActClass value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the moodCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActMood }
     *     
     */
    public ActMood getMoodCode() {
        return moodCode;
    }

    /**
     * Sets the value of the moodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActMood }
     *     
     */
    public void setMoodCode(ActMood value) {
        this.moodCode = value;
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
