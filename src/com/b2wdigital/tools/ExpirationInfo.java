
package com.b2wdigital.tools;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de expirationInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade isPerishable.
     * 
     */
    public boolean isIsPerishable() {
        return isPerishable;
    }

    /**
     * Define o valor da propriedade isPerishable.
     * 
     */
    public void setIsPerishable(boolean value) {
        this.isPerishable = value;
    }

    /**
     * Obtém o valor da propriedade receivementDaysBeforeExpiration.
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
     * Define o valor da propriedade receivementDaysBeforeExpiration.
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
     * Obtém o valor da propriedade shipmentDaysBeforeExpiration.
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
     * Define o valor da propriedade shipmentDaysBeforeExpiration.
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
