
package com.b2winc.query.item;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for expirationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="expirationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isPerishable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="receivementDaysBeforeExpiration" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="shipmentDaysBeforeExpiration" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expirationInfo", propOrder = {
    "isPerishable",
    "receivementDaysBeforeExpiration",
    "shipmentDaysBeforeExpiration"
})
public class ExpirationInfo {

    protected boolean isPerishable;
    @XmlElement(required = true)
    protected BigInteger receivementDaysBeforeExpiration;
    @XmlElement(required = true)
    protected BigInteger shipmentDaysBeforeExpiration;

    /**
     * Gets the value of the isPerishable property.
     * 
     */
    public boolean isIsPerishable() {
        return isPerishable;
    }

    /**
     * Sets the value of the isPerishable property.
     * 
     */
    public void setIsPerishable(boolean value) {
        this.isPerishable = value;
    }

    /**
     * Gets the value of the receivementDaysBeforeExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReceivementDaysBeforeExpiration() {
        return receivementDaysBeforeExpiration;
    }

    /**
     * Sets the value of the receivementDaysBeforeExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReceivementDaysBeforeExpiration(BigInteger value) {
        this.receivementDaysBeforeExpiration = value;
    }

    /**
     * Gets the value of the shipmentDaysBeforeExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShipmentDaysBeforeExpiration() {
        return shipmentDaysBeforeExpiration;
    }

    /**
     * Sets the value of the shipmentDaysBeforeExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShipmentDaysBeforeExpiration(BigInteger value) {
        this.shipmentDaysBeforeExpiration = value;
    }

}
