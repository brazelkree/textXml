//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.26 at 07:28:02 PM EET 
//


package com.example.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VisualParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisualParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="color">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="colorless"/>
 *               &lt;enumeration value="green"/>
 *               &lt;enumeration value="red"/>
 *               &lt;enumeration value="blue"/>
 *               &lt;enumeration value="purple"/>
 *               &lt;enumeration value="pink"/>
 *               &lt;enumeration value="yellow"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="transparency">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *               &lt;maxInclusive value="100"/>
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cutting">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[1-9]||[1-8][0-9]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisualParameters", propOrder = {
    "color",
    "transparency",
    "cutting"
})
public class VisualParameters {

    @XmlElement(required = true, defaultValue = "colorless")
    protected String color;
    protected int transparency;
    @XmlElement(required = true)
    protected String cutting;

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the transparency property.
     * 
     */
    public int getTransparency() {
        return transparency;
    }

    /**
     * Sets the value of the transparency property.
     * 
     */
    public void setTransparency(int value) {
        this.transparency = value;
    }

    /**
     * Gets the value of the cutting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutting() {
        return cutting;
    }

    /**
     * Sets the value of the cutting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutting(String value) {
        this.cutting = value;
    }

}