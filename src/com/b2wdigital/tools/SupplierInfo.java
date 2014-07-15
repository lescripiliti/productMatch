
package com.b2wdigital.tools;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de supplierInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade supplierDocument.
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
     * Define o valor da propriedade supplierDocument.
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
     * Obtém o valor da propriedade supplierSkuId.
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
     * Define o valor da propriedade supplierSkuId.
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
     * Obtém o valor da propriedade supplierOrderMultiple.
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
     * Define o valor da propriedade supplierOrderMultiple.
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
     * Obtém o valor da propriedade minimumPurchaseQt.
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
     * Define o valor da propriedade minimumPurchaseQt.
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
