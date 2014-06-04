
package com.b2winc.query.item;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mediaInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mediaInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="CD"/>
 *               &lt;enumeration value="DVD"/>
 *               &lt;enumeration value="LIVRO"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="propertyList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="l10nPropertyInfo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="l10nId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="property" type="{http://www.b2winc.com/item}propertyType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="artistList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="artistInfo" type="{http://www.b2winc.com/item}artistInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="trackList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="trackInfo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="propertyList">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="l10nPropertyInfo" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="l10nId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="property" type="{http://www.b2winc.com/item}propertyType"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="artistList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="artistInfo" type="{http://www.b2winc.com/item}artistInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "mediaInfo", propOrder = {
    "type",
    "propertyList",
    "artistList",
    "trackList"
})
public class MediaInfo {

    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected MediaInfo.PropertyList propertyList;
    protected MediaInfo.ArtistList artistList;
    protected MediaInfo.TrackList trackList;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the propertyList property.
     * 
     * @return
     *     possible object is
     *     {@link MediaInfo.PropertyList }
     *     
     */
    public MediaInfo.PropertyList getPropertyList() {
        return propertyList;
    }

    /**
     * Sets the value of the propertyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaInfo.PropertyList }
     *     
     */
    public void setPropertyList(MediaInfo.PropertyList value) {
        this.propertyList = value;
    }

    /**
     * Gets the value of the artistList property.
     * 
     * @return
     *     possible object is
     *     {@link MediaInfo.ArtistList }
     *     
     */
    public MediaInfo.ArtistList getArtistList() {
        return artistList;
    }

    /**
     * Sets the value of the artistList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaInfo.ArtistList }
     *     
     */
    public void setArtistList(MediaInfo.ArtistList value) {
        this.artistList = value;
    }

    /**
     * Gets the value of the trackList property.
     * 
     * @return
     *     possible object is
     *     {@link MediaInfo.TrackList }
     *     
     */
    public MediaInfo.TrackList getTrackList() {
        return trackList;
    }

    /**
     * Sets the value of the trackList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaInfo.TrackList }
     *     
     */
    public void setTrackList(MediaInfo.TrackList value) {
        this.trackList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="artistInfo" type="{http://www.b2winc.com/item}artistInfo" maxOccurs="unbounded" minOccurs="0"/>
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
        "artistInfo"
    })
    public static class ArtistList {

        protected List<ArtistInfo> artistInfo;

        /**
         * Gets the value of the artistInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the artistInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArtistInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ArtistInfo }
         * 
         * 
         */
        public List<ArtistInfo> getArtistInfo() {
            if (artistInfo == null) {
                artistInfo = new ArrayList<ArtistInfo>();
            }
            return this.artistInfo;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="l10nPropertyInfo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="l10nId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="property" type="{http://www.b2winc.com/item}propertyType"/>
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
    @XmlType(name = "", propOrder = {
        "l10NPropertyInfo"
    })
    public static class PropertyList {

        @XmlElement(name = "l10nPropertyInfo")
        protected List<MediaInfo.PropertyList.L10NPropertyInfo> l10NPropertyInfo;

        /**
         * Gets the value of the l10NPropertyInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the l10NPropertyInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getL10NPropertyInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MediaInfo.PropertyList.L10NPropertyInfo }
         * 
         * 
         */
        public List<MediaInfo.PropertyList.L10NPropertyInfo> getL10NPropertyInfo() {
            if (l10NPropertyInfo == null) {
                l10NPropertyInfo = new ArrayList<MediaInfo.PropertyList.L10NPropertyInfo>();
            }
            return this.l10NPropertyInfo;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="l10nId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="property" type="{http://www.b2winc.com/item}propertyType"/>
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
            "l10NId",
            "property"
        })
        public static class L10NPropertyInfo {

            @XmlElement(name = "l10nId", required = true)
            protected String l10NId;
            @XmlElement(required = true)
            protected PropertyType property;

            /**
             * Gets the value of the l10NId property.
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
             * Sets the value of the l10NId property.
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
             * Gets the value of the property property.
             * 
             * @return
             *     possible object is
             *     {@link PropertyType }
             *     
             */
            public PropertyType getProperty() {
                return property;
            }

            /**
             * Sets the value of the property property.
             * 
             * @param value
             *     allowed object is
             *     {@link PropertyType }
             *     
             */
            public void setProperty(PropertyType value) {
                this.property = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="trackInfo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="propertyList">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="l10nPropertyInfo" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="l10nId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="property" type="{http://www.b2winc.com/item}propertyType"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="artistList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="artistInfo" type="{http://www.b2winc.com/item}artistInfo" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "trackInfo"
    })
    public static class TrackList {

        protected List<MediaInfo.TrackList.TrackInfo> trackInfo;

        /**
         * Gets the value of the trackInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trackInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrackInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MediaInfo.TrackList.TrackInfo }
         * 
         * 
         */
        public List<MediaInfo.TrackList.TrackInfo> getTrackInfo() {
            if (trackInfo == null) {
                trackInfo = new ArrayList<MediaInfo.TrackList.TrackInfo>();
            }
            return this.trackInfo;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="propertyList">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="l10nPropertyInfo" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="l10nId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="property" type="{http://www.b2winc.com/item}propertyType"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="artistList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="artistInfo" type="{http://www.b2winc.com/item}artistInfo" maxOccurs="unbounded" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "propertyList",
            "artistList"
        })
        public static class TrackInfo {

            @XmlElement(required = true)
            protected MediaInfo.TrackList.TrackInfo.PropertyList propertyList;
            protected MediaInfo.TrackList.TrackInfo.ArtistList artistList;

            /**
             * Gets the value of the propertyList property.
             * 
             * @return
             *     possible object is
             *     {@link MediaInfo.TrackList.TrackInfo.PropertyList }
             *     
             */
            public MediaInfo.TrackList.TrackInfo.PropertyList getPropertyList() {
                return propertyList;
            }

            /**
             * Sets the value of the propertyList property.
             * 
             * @param value
             *     allowed object is
             *     {@link MediaInfo.TrackList.TrackInfo.PropertyList }
             *     
             */
            public void setPropertyList(MediaInfo.TrackList.TrackInfo.PropertyList value) {
                this.propertyList = value;
            }

            /**
             * Gets the value of the artistList property.
             * 
             * @return
             *     possible object is
             *     {@link MediaInfo.TrackList.TrackInfo.ArtistList }
             *     
             */
            public MediaInfo.TrackList.TrackInfo.ArtistList getArtistList() {
                return artistList;
            }

            /**
             * Sets the value of the artistList property.
             * 
             * @param value
             *     allowed object is
             *     {@link MediaInfo.TrackList.TrackInfo.ArtistList }
             *     
             */
            public void setArtistList(MediaInfo.TrackList.TrackInfo.ArtistList value) {
                this.artistList = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="artistInfo" type="{http://www.b2winc.com/item}artistInfo" maxOccurs="unbounded" minOccurs="0"/>
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
                "artistInfo"
            })
            public static class ArtistList {

                protected List<ArtistInfo> artistInfo;

                /**
                 * Gets the value of the artistInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the artistInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getArtistInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ArtistInfo }
                 * 
                 * 
                 */
                public List<ArtistInfo> getArtistInfo() {
                    if (artistInfo == null) {
                        artistInfo = new ArrayList<ArtistInfo>();
                    }
                    return this.artistInfo;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="l10nPropertyInfo" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="l10nId" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="property" type="{http://www.b2winc.com/item}propertyType"/>
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
            @XmlType(name = "", propOrder = {
                "l10NPropertyInfo"
            })
            public static class PropertyList {

                @XmlElement(name = "l10nPropertyInfo")
                protected List<MediaInfo.TrackList.TrackInfo.PropertyList.L10NPropertyInfo> l10NPropertyInfo;

                /**
                 * Gets the value of the l10NPropertyInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the l10NPropertyInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getL10NPropertyInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MediaInfo.TrackList.TrackInfo.PropertyList.L10NPropertyInfo }
                 * 
                 * 
                 */
                public List<MediaInfo.TrackList.TrackInfo.PropertyList.L10NPropertyInfo> getL10NPropertyInfo() {
                    if (l10NPropertyInfo == null) {
                        l10NPropertyInfo = new ArrayList<MediaInfo.TrackList.TrackInfo.PropertyList.L10NPropertyInfo>();
                    }
                    return this.l10NPropertyInfo;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="l10nId" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="property" type="{http://www.b2winc.com/item}propertyType"/>
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
                    "l10NId",
                    "property"
                })
                public static class L10NPropertyInfo {

                    @XmlElement(name = "l10nId", required = true)
                    protected String l10NId;
                    @XmlElement(required = true)
                    protected PropertyType property;

                    /**
                     * Gets the value of the l10NId property.
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
                     * Sets the value of the l10NId property.
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
                     * Gets the value of the property property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PropertyType }
                     *     
                     */
                    public PropertyType getProperty() {
                        return property;
                    }

                    /**
                     * Sets the value of the property property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PropertyType }
                     *     
                     */
                    public void setProperty(PropertyType value) {
                        this.property = value;
                    }

                }

            }

        }

    }

}
