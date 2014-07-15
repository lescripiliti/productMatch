
package com.b2wdigital.tools;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * SKU de Itens Embutidos.
 * Ex: CD Antivirus + Licenca
 * 
 * <p>Classe Java de embeddedSku complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="embeddedSku">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="embeddedSku" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="embeddesQty" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "embeddedSku", propOrder = {
    "embeddedSku",
    "embeddesQty"
})
public class EmbeddedSku {

    @XmlElement(required = true)
    protected String embeddedSku;
    protected int embeddesQty;

    /**
     * Obtém o valor da propriedade embeddedSku.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbeddedSku() {
        return embeddedSku;
    }

    /**
     * Define o valor da propriedade embeddedSku.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbeddedSku(String value) {
        this.embeddedSku = value;
    }

    /**
     * Obtém o valor da propriedade embeddesQty.
     * 
     */
    public int getEmbeddesQty() {
        return embeddesQty;
    }

    /**
     * Define o valor da propriedade embeddesQty.
     * 
     */
    public void setEmbeddesQty(int value) {
        this.embeddesQty = value;
    }

}
