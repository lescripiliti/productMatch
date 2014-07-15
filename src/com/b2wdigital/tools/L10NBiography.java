
package com.b2wdigital.tools;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de l10nBiography complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="l10nBiography">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="l10nId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="biography" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "l10nBiography", namespace = "http://www.b2winc.com/ItemPerson", propOrder = {
    "l10NId",
    "biography"
})
public class L10NBiography {

    @XmlElement(name = "l10nId", required = true)
    protected String l10NId;
    protected String biography;

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
     * Obtém o valor da propriedade biography.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiography() {
        return biography;
    }

    /**
     * Define o valor da propriedade biography.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiography(String value) {
        this.biography = value;
    }

}
