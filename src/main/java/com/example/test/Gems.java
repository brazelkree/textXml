//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.26 at 07:28:02 PM EET 
//


package com.example.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.example.com/gems}gem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gem"
})
@XmlRootElement(name = "gems")
public class Gems {

    @XmlElementRef(name = "gem", namespace = "http://www.example.com/gems", type = JAXBElement.class)
    protected List<JAXBElement<? extends GemType>> gem;

    /**
     * Gets the value of the gem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Semiprecious }{@code >}
     * {@link JAXBElement }{@code <}{@link GemType }{@code >}
     * {@link JAXBElement }{@code <}{@link Precious }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends GemType>> getGem() {
        if (gem == null) {
            gem = new ArrayList<JAXBElement<? extends GemType>>();
        }
        return this.gem;
    }

}
