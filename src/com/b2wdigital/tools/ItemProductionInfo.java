
package com.b2wdigital.tools;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de itemProductionInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="itemProductionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="l10nItemBrandProductionList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="l10nItemBrandProductionInfo" type="{http://www.b2winc.com/item}l10nItemBrandProductionInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="l10nItemProductionList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="l10nItemProductionInfo" type="{http://www.b2winc.com/item}l10nItemProductionInfo" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mediaList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mediaInfo" type="{http://www.b2winc.com/item}mediaInfo" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="imageList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="imageInfo" type="{http://www.b2winc.com/item}imageInfo" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemProductionInfo", propOrder = {
    "l10NItemBrandProductionList",
    "l10NItemProductionList",
    "mediaList",
    "imageList"
})
public class ItemProductionInfo {

    @XmlElement(name = "l10nItemBrandProductionList")
    protected ItemProductionInfo.L10NItemBrandProductionList l10NItemBrandProductionList;
    @XmlElement(name = "l10nItemProductionList")
    protected ItemProductionInfo.L10NItemProductionList l10NItemProductionList;
    protected ItemProductionInfo.MediaList mediaList;
    protected ItemProductionInfo.ImageList imageList;

    /**
     * Obtém o valor da propriedade l10NItemBrandProductionList.
     * 
     * @return
     *     possible object is
     *     {@link ItemProductionInfo.L10NItemBrandProductionList }
     *     
     */
    public ItemProductionInfo.L10NItemBrandProductionList getL10NItemBrandProductionList() {
        return l10NItemBrandProductionList;
    }

    /**
     * Define o valor da propriedade l10NItemBrandProductionList.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemProductionInfo.L10NItemBrandProductionList }
     *     
     */
    public void setL10NItemBrandProductionList(ItemProductionInfo.L10NItemBrandProductionList value) {
        this.l10NItemBrandProductionList = value;
    }

    /**
     * Obtém o valor da propriedade l10NItemProductionList.
     * 
     * @return
     *     possible object is
     *     {@link ItemProductionInfo.L10NItemProductionList }
     *     
     */
    public ItemProductionInfo.L10NItemProductionList getL10NItemProductionList() {
        return l10NItemProductionList;
    }

    /**
     * Define o valor da propriedade l10NItemProductionList.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemProductionInfo.L10NItemProductionList }
     *     
     */
    public void setL10NItemProductionList(ItemProductionInfo.L10NItemProductionList value) {
        this.l10NItemProductionList = value;
    }

    /**
     * Obtém o valor da propriedade mediaList.
     * 
     * @return
     *     possible object is
     *     {@link ItemProductionInfo.MediaList }
     *     
     */
    public ItemProductionInfo.MediaList getMediaList() {
        return mediaList;
    }

    /**
     * Define o valor da propriedade mediaList.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemProductionInfo.MediaList }
     *     
     */
    public void setMediaList(ItemProductionInfo.MediaList value) {
        this.mediaList = value;
    }

    /**
     * Obtém o valor da propriedade imageList.
     * 
     * @return
     *     possible object is
     *     {@link ItemProductionInfo.ImageList }
     *     
     */
    public ItemProductionInfo.ImageList getImageList() {
        return imageList;
    }

    /**
     * Define o valor da propriedade imageList.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemProductionInfo.ImageList }
     *     
     */
    public void setImageList(ItemProductionInfo.ImageList value) {
        this.imageList = value;
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
     *         &lt;element name="imageInfo" type="{http://www.b2winc.com/item}imageInfo" maxOccurs="unbounded"/>
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
        "imageInfo"
    })
    public static class ImageList {

        @XmlElement(required = true)
        protected List<ImageInfo> imageInfo;

        /**
         * Gets the value of the imageInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the imageInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImageInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImageInfo }
         * 
         * 
         */
        public List<ImageInfo> getImageInfo() {
            if (imageInfo == null) {
                imageInfo = new ArrayList<ImageInfo>();
            }
            return this.imageInfo;
        }

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
     *         &lt;element name="l10nItemBrandProductionInfo" type="{http://www.b2winc.com/item}l10nItemBrandProductionInfo" maxOccurs="unbounded" minOccurs="0"/>
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
        "l10NItemBrandProductionInfo"
    })
    public static class L10NItemBrandProductionList {

        @XmlElement(name = "l10nItemBrandProductionInfo")
        protected List<L10NItemBrandProductionInfo> l10NItemBrandProductionInfo;

        /**
         * Gets the value of the l10NItemBrandProductionInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the l10NItemBrandProductionInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getL10NItemBrandProductionInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link L10NItemBrandProductionInfo }
         * 
         * 
         */
        public List<L10NItemBrandProductionInfo> getL10NItemBrandProductionInfo() {
            if (l10NItemBrandProductionInfo == null) {
                l10NItemBrandProductionInfo = new ArrayList<L10NItemBrandProductionInfo>();
            }
            return this.l10NItemBrandProductionInfo;
        }

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
     *         &lt;element name="l10nItemProductionInfo" type="{http://www.b2winc.com/item}l10nItemProductionInfo" maxOccurs="unbounded"/>
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
        "l10NItemProductionInfo"
    })
    public static class L10NItemProductionList {

        @XmlElement(name = "l10nItemProductionInfo", required = true)
        protected List<L10NItemProductionInfo> l10NItemProductionInfo;

        /**
         * Gets the value of the l10NItemProductionInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the l10NItemProductionInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getL10NItemProductionInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link L10NItemProductionInfo }
         * 
         * 
         */
        public List<L10NItemProductionInfo> getL10NItemProductionInfo() {
            if (l10NItemProductionInfo == null) {
                l10NItemProductionInfo = new ArrayList<L10NItemProductionInfo>();
            }
            return this.l10NItemProductionInfo;
        }

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
     *         &lt;element name="mediaInfo" type="{http://www.b2winc.com/item}mediaInfo" maxOccurs="unbounded"/>
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
        "mediaInfo"
    })
    public static class MediaList {

        @XmlElement(required = true)
        protected List<MediaInfo> mediaInfo;

        /**
         * Gets the value of the mediaInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mediaInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMediaInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MediaInfo }
         * 
         * 
         */
        public List<MediaInfo> getMediaInfo() {
            if (mediaInfo == null) {
                mediaInfo = new ArrayList<MediaInfo>();
            }
            return this.mediaInfo;
        }

    }

}
