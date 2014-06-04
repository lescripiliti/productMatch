
package com.b2winc.query.item;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for seeMoreInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seeMoreInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seeMoreText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seeMoreURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seeMoreInfo", propOrder = {
    "seeMoreText",
    "seeMoreURL"
})
public class SeeMoreInfo {

    @XmlElement(required = true)
    protected String seeMoreText;
    @XmlElement(required = true)
    protected String seeMoreURL;

    /**
     * Gets the value of the seeMoreText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeeMoreText() {
        return seeMoreText;
    }

    /**
     * Sets the value of the seeMoreText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeeMoreText(String value) {
        this.seeMoreText = value;
    }

    /**
     * Gets the value of the seeMoreURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeeMoreURL() {
        return seeMoreURL;
    }

    /**
     * Sets the value of the seeMoreURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeeMoreURL(String value) {
        this.seeMoreURL = value;
    }

}
