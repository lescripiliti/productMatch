
package com.b2winc.query.item;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * SKU de Itens Embutidos.Ex: CD Antivirus + Licenca
 * 
 * <p>Java class for embeddedSku complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the embeddedSku property.
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
     * Sets the value of the embeddedSku property.
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
     * Gets the value of the embeddesQty property.
     * 
     */
    public int getEmbeddesQty() {
        return embeddesQty;
    }

    /**
     * Sets the value of the embeddesQty property.
     * 
     */
    public void setEmbeddesQty(int value) {
        this.embeddesQty = value;
    }

}
