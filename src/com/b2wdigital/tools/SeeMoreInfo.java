
package com.b2wdigital.tools;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de seeMoreInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade seeMoreText.
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
     * Define o valor da propriedade seeMoreText.
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
     * Obtém o valor da propriedade seeMoreURL.
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
     * Define o valor da propriedade seeMoreURL.
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
