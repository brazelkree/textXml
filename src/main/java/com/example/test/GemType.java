//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.26 at 07:28:02 PM EET 
//


package com.example.test;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="visual-parameters" type="{http://www.example.com/gems}VisualParameters"/>
 *         &lt;element name="value" type="{http://www.example.com/gems}Value"/>
 *         &lt;element name="date-of-processing" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
 *       &lt;/sequence>
 *       &lt;attribute name="origin" type="{http://www.example.com/gems}Origin" default="Russia" />
 *       &lt;attribute name="id" use="required" type="{http://www.example.com/gems}GemId" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GemType", propOrder = {
    "visualParameters",
    "value",
    "dateOfProcessing"
})
@XmlSeeAlso({
    Precious.class,
    Semiprecious.class
})
public class GemType {

    @XmlElement(name = "visual-parameters", required = true)
    protected VisualParameters visualParameters;
    @XmlElement(required = true)
    protected String value;
    @XmlElement(name = "date-of-processing", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar dateOfProcessing;
    @XmlAttribute(name = "origin")
    protected String origin;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the visualParameters property.
     * 
     * @return
     *     possible object is
     *     {@link VisualParameters }
     *     
     */
    public VisualParameters getVisualParameters() {
        return visualParameters;
    }

    /**
     * Sets the value of the visualParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisualParameters }
     *     
     */
    public void setVisualParameters(VisualParameters value) {
        this.visualParameters = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the dateOfProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfProcessing() {
        return dateOfProcessing;
    }

    /**
     * Sets the value of the dateOfProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfProcessing(XMLGregorianCalendar value) {
        this.dateOfProcessing = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        if (origin == null) {
            return "Russia";
        } else {
            return origin;
        }
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
