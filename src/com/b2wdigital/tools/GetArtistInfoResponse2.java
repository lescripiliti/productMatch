
package com.b2wdigital.tools;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getArtistInfoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getArtistInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{http://www.b2winc.com/ItemPerson}ItemPerson" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getArtistInfoResponse", namespace = "http://www.b2winc.com/tools/getartistinfo", propOrder = {
    "item"
})
public class GetArtistInfoResponse2 {

    @XmlElement(namespace = "")
    protected ItemPerson item;

    /**
     * Obtém o valor da propriedade item.
     * 
     * @return
     *     possible object is
     *     {@link ItemPerson }
     *     
     */
    public ItemPerson getItem() {
        return item;
    }

    /**
     * Define o valor da propriedade item.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPerson }
     *     
     */
    public void setItem(ItemPerson value) {
        this.item = value;
    }

}
