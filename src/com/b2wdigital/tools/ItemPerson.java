
package com.b2wdigital.tools;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				pessoa do produto (artista, autor, cantor)
 * 			
 * 
 * <p>Classe Java de ItemPerson complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ItemPerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imgUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="biography" type="{http://www.b2winc.com/ItemPerson}l10nBiography" minOccurs="0"/>
 *         &lt;element name="items" type="{http://www.b2winc.com/ItemPerson}ItemList" minOccurs="0"/>
 *         &lt;element name="participationList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mediaParticipation" type="{http://www.b2winc.com/ItemPerson}mediaParticipationType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="genres" type="{http://www.b2winc.com/ItemPerson}GenreList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemPerson", namespace = "http://www.b2winc.com/ItemPerson", propOrder = {
    "id",
    "name",
    "imgUrl",
    "biography",
    "items",
    "participationList",
    "genres"
})
public class ItemPerson {

    protected int id;
    @XmlElement(required = true)
    protected String name;
    protected String imgUrl;
    protected L10NBiography biography;
    protected ItemList items;
    @XmlElement(required = true)
    protected ItemPerson.ParticipationList participationList;
    protected GenreList genres;

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade imgUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * Define o valor da propriedade imgUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgUrl(String value) {
        this.imgUrl = value;
    }

    /**
     * Obtém o valor da propriedade biography.
     * 
     * @return
     *     possible object is
     *     {@link L10NBiography }
     *     
     */
    public L10NBiography getBiography() {
        return biography;
    }

    /**
     * Define o valor da propriedade biography.
     * 
     * @param value
     *     allowed object is
     *     {@link L10NBiography }
     *     
     */
    public void setBiography(L10NBiography value) {
        this.biography = value;
    }

    /**
     * Obtém o valor da propriedade items.
     * 
     * @return
     *     possible object is
     *     {@link ItemList }
     *     
     */
    public ItemList getItems() {
        return items;
    }

    /**
     * Define o valor da propriedade items.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemList }
     *     
     */
    public void setItems(ItemList value) {
        this.items = value;
    }

    /**
     * Obtém o valor da propriedade participationList.
     * 
     * @return
     *     possible object is
     *     {@link ItemPerson.ParticipationList }
     *     
     */
    public ItemPerson.ParticipationList getParticipationList() {
        return participationList;
    }

    /**
     * Define o valor da propriedade participationList.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPerson.ParticipationList }
     *     
     */
    public void setParticipationList(ItemPerson.ParticipationList value) {
        this.participationList = value;
    }

    /**
     * Obtém o valor da propriedade genres.
     * 
     * @return
     *     possible object is
     *     {@link GenreList }
     *     
     */
    public GenreList getGenres() {
        return genres;
    }

    /**
     * Define o valor da propriedade genres.
     * 
     * @param value
     *     allowed object is
     *     {@link GenreList }
     *     
     */
    public void setGenres(GenreList value) {
        this.genres = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="mediaParticipation" type="{http://www.b2winc.com/ItemPerson}mediaParticipationType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mediaParticipation"
    })
    public static class ParticipationList {

        @XmlElement(namespace = "http://www.b2winc.com/ItemPerson")
        protected List<MediaParticipationType> mediaParticipation;

        /**
         * Gets the value of the mediaParticipation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mediaParticipation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMediaParticipation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MediaParticipationType }
         * 
         * 
         */
        public List<MediaParticipationType> getMediaParticipation() {
            if (mediaParticipation == null) {
                mediaParticipation = new ArrayList<MediaParticipationType>();
            }
            return this.mediaParticipation;
        }

    }

}
