//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.09 at 10:59:16 AM EST 
//


package org.cvrgrid.hl7aecg.jaxb.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 			Data that is primarily intended for human interpretation or for
 * 			further machine processing is outside the scope of HL7. This includes
 * 			unformatted or formatted written language, multimedia data, or
 * 			structured information as defined by a different standard (e.g.,
 * 			XML-signatures.)  Instead of the data itself, an ED may contain only
 * 			a reference (see TEL.) Note that the ST data type is a specialization
 * 			of the ED data type when the ED media type is text/plain.
 * 		
 * 
 * <p>Java class for ED complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ED">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}BIN">
 *       &lt;sequence>
 *         &lt;element name="reference" type="{urn:hl7-org:v3}TEL" minOccurs="0"/>
 *         &lt;element name="thumbnail" type="{urn:hl7-org:v3}ED_no_tn" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="mediaType" type="{urn:hl7-org:v3}cs" default="text/plain" />
 *       &lt;attribute name="compression" type="{urn:hl7-org:v3}cs_CompressionAlgorithm" />
 *       &lt;attribute name="integrityCheck" type="{urn:hl7-org:v3}bin" />
 *       &lt;attribute name="integrityCheckAlgorithm" type="{urn:hl7-org:v3}cs_IntegrityCheckAlgorithm" fixed="SHA-1" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ED")
@XmlSeeAlso({
    ST.class,
    EAXP.class,
    EDNoTn.class,
    EEXP.class
})
public class ED
    extends BIN
{

    @XmlAttribute(name = "mediaType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mediaType;
    @XmlAttribute(name = "compression")
    protected CsCompressionAlgorithm compression;
    @XmlAttribute(name = "integrityCheck")
    protected byte[] integrityCheck;
    @XmlAttribute(name = "integrityCheckAlgorithm")
    protected CsIntegrityCheckAlgorithm integrityCheckAlgorithm;

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        if (mediaType == null) {
            return "text/plain";
        } else {
            return mediaType;
        }
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the compression property.
     * 
     * @return
     *     possible object is
     *     {@link CsCompressionAlgorithm }
     *     
     */
    public CsCompressionAlgorithm getCompression() {
        return compression;
    }

    /**
     * Sets the value of the compression property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsCompressionAlgorithm }
     *     
     */
    public void setCompression(CsCompressionAlgorithm value) {
        this.compression = value;
    }

    /**
     * Gets the value of the integrityCheck property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIntegrityCheck() {
        return integrityCheck;
    }

    /**
     * Sets the value of the integrityCheck property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIntegrityCheck(byte[] value) {
        this.integrityCheck = ((byte[]) value);
    }

    /**
     * Gets the value of the integrityCheckAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link CsIntegrityCheckAlgorithm }
     *     
     */
    public CsIntegrityCheckAlgorithm getIntegrityCheckAlgorithm() {
        if (integrityCheckAlgorithm == null) {
            return CsIntegrityCheckAlgorithm.SHA_1;
        } else {
            return integrityCheckAlgorithm;
        }
    }

    /**
     * Sets the value of the integrityCheckAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsIntegrityCheckAlgorithm }
     *     
     */
    public void setIntegrityCheckAlgorithm(CsIntegrityCheckAlgorithm value) {
        this.integrityCheckAlgorithm = value;
    }

}
