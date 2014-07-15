
package com.b2wdigital.tools;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de sellingTitleInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="sellingTitleInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="l10nId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="sellingTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sellingTitleInfo", propOrder = {
    "l10NId",
    "brandId",
    "sellingTitle"
})
public class SellingTitleInfo {

    @XmlElement(name = "l10nId", required = true)
    protected String l10NId;
    @XmlElement(required = true)
    protected String brandId;
    @XmlElement(required = true)
    protected String sellingTitle;

    /**
     * Obtém o valor da propriedade l10NId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL10NId() {
        return l10NId;
    }

    /**
     * Define o valor da propriedade l10NId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL10NId(String value) {
        this.l10NId = value;
    }

    /**
     * Obtém o valor da propriedade brandId.
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
     * Obtém o valor da propriedade sellingTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellingTitle() {
        return sellingTitle;
    }

    /**
     * Define o valor da propriedade sellingTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellingTitle(String value) {
        this.sellingTitle = value;
    }

}
