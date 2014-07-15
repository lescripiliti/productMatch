
package com.b2wdigital.tools;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de participationType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="participationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemAuthor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trackName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "participationType", namespace = "http://www.b2winc.com/ItemPerson", propOrder = {
    "itemId",
    "itemName",
    "itemAuthor",
    "trackName"
})
public class ParticipationType {

    @XmlElement(required = true)
    protected String itemId;
    @XmlElement(required = true)
    protected String itemName;
    @XmlElement(required = true)
    protected String itemAuthor;
    protected String trackName;

    /**
     * Obtém o valor da propriedade itemId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Define o valor da propriedade itemId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * Obtém o valor da propriedade itemName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Define o valor da propriedade itemName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Obtém o valor da propriedade itemAuthor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemAuthor() {
        return itemAuthor;
    }

    /**
     * Define o valor da propriedade itemAuthor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemAuthor(String value) {
        this.itemAuthor = value;
    }

    /**
     * Obtém o valor da propriedade trackName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackName() {
        return trackName;
    }

    /**
     * Define o valor da propriedade trackName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackName(String value) {
        this.trackName = value;
    }

}
