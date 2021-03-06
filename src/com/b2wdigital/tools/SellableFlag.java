
package com.b2wdigital.tools;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de sellableFlag complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="sellableFlag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brandId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.b2winc.com/item}brandId">
 *               &lt;enumeration value="01"/>
 *               &lt;enumeration value="02"/>
 *               &lt;enumeration value="03"/>
 *               &lt;enumeration value="04"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="isSellable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isEligible" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sellableFlag", propOrder = {
    "brandId",
    "isSellable",
    "isEligible",
    "location"
})
public class SellableFlag {

    @XmlElement(required = true)
    protected String brandId;
    protected boolean isSellable;
    @XmlElement(required = true)
    protected String isEligible;
    protected String location;

    /**
     * Obt�m o valor da propriedade brandId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandId() {
        return brandId;
    }

    /**
     * Define o valor da propriedade brandId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandId(String value) {
        this.brandId = value;
    }

    /**
     * Obt�m o valor da propriedade isSellable.
     * 
     */
    public boolean isIsSellable() {
        return isSellable;
    }

    /**
     * Define o valor da propriedade isSellable.
     * 
     */
    public void setIsSellable(boolean value) {
        this.isSellable = value;
    }

    /**
     * Obt�m o valor da propriedade isEligible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsEligible() {
        return isEligible;
    }

    /**
     * Define o valor da propriedade isEligible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsEligible(String value) {
        this.isEligible = value;
    }

    /**
     * Obt�m o valor da propriedade location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Define o valor da propriedade location.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

}
