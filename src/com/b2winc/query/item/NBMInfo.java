
package com.b2winc.query.item;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NBMInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NBMInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NBM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NBMSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NBMInfo", propOrder = {
    "nbm",
    "nbmSequence"
})
public class NBMInfo {

    @XmlElement(name = "NBM", required = true)
    protected String nbm;
    @XmlElement(name = "NBMSequence")
    protected String nbmSequence;

    /**
     * Gets the value of the nbm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNBM() {
        return nbm;
    }

    /**
     * Sets the value of the nbm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNBM(String value) {
        this.nbm = value;
    }

    /**
     * Gets the value of the nbmSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNBMSequence() {
        return nbmSequence;
    }

    /**
     * Sets the value of the nbmSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNBMSequence(String value) {
        this.nbmSequence = value;
    }

}
