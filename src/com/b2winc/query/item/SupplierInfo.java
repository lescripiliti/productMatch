
package com.b2winc.query.item;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for supplierInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="supplierInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="supplierDocument" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="supplierSkuId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="supplierOrderMultiple" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="minimumPurchaseQt" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supplierInfo", propOrder = {
    "supplierDocument",
    "supplierSkuId",
    "supplierOrderMultiple",
    "minimumPurchaseQt"
})
public class SupplierInfo {

    @XmlElement(required = true)
    protected String supplierDocument;
    @XmlElement(required = true)
    protected String supplierSkuId;
    @XmlElement(required = true)
    protected BigInteger supplierOrderMultiple;
    @XmlElement(required = true)
    protected BigInteger minimumPurchaseQt;

    /**
     * Gets the value of the supplierDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierDocument() {
        return supplierDocument;
    }

    /**
     * Sets the value of the supplierDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierDocument(String value) {
        this.supplierDocument = value;
    }

    /**
     * Gets the value of the supplierSkuId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierSkuId() {
        return supplierSkuId;
    }

    /**
     * Sets the value of the supplierSkuId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierSkuId(String value) {
        this.supplierSkuId = value;
    }

    /**
     * Gets the value of the supplierOrderMultiple property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSupplierOrderMultiple() {
        return supplierOrderMultiple;
    }

    /**
     * Sets the value of the supplierOrderMultiple property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSupplierOrderMultiple(BigInteger value) {
        this.supplierOrderMultiple = value;
    }

    /**
     * Gets the value of the minimumPurchaseQt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumPurchaseQt() {
        return minimumPurchaseQt;
    }

    /**
     * Sets the value of the minimumPurchaseQt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumPurchaseQt(BigInteger value) {
        this.minimumPurchaseQt = value;
    }

}
