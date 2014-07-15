
package com.b2wdigital.tools;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NBMInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade nbm.
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
     * Define o valor da propriedade nbm.
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
     * Obtém o valor da propriedade nbmSequence.
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
     * Define o valor da propriedade nbmSequence.
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
