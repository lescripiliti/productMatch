
package com.b2winc.query.item;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for l10nItemProductionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="l10nItemProductionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="l10nId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="groupInfo" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="propertyList">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="property" type="{http://www.b2winc.com/item}propertyType" maxOccurs="unbounded"/>
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
@XmlType(name = "l10nItemProductionInfo", propOrder = {
    "l10NId",
    "groupList"
})
public class L10NItemProductionInfo {

    @XmlElement(name = "l10nId", required = true)
    protected String l10NId;
    @XmlElement(required = true)
    protected L10NItemProductionInfo.GroupList groupList;

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
     * Gets the value of the groupList property.
     * 
     * @return
     *     possible object is
     *     {@link L10NItemProductionInfo.GroupList }
     *     
     */
    public L10NItemProductionInfo.GroupList getGroupList() {
        return groupList;
    }

    /**
     * Sets the value of the groupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link L10NItemProductionInfo.GroupList }
     *     
     */
    public void setGroupList(L10NItemProductionInfo.GroupList value) {
        this.groupList = value;
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
     *         &lt;element name="groupInfo" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="propertyList">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="property" type="{http://www.b2winc.com/item}propertyType" maxOccurs="unbounded"/>
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
        "groupInfo"
    })
    public static class GroupList {

        @XmlElement(required = true)
        protected List<L10NItemProductionInfo.GroupList.GroupInfo> groupInfo;

        /**
         * Gets the value of the groupInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the groupInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroupInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link L10NItemProductionInfo.GroupList.GroupInfo }
         * 
         * 
         */
        public List<L10NItemProductionInfo.GroupList.GroupInfo> getGroupInfo() {
            if (groupInfo == null) {
                groupInfo = new ArrayList<L10NItemProductionInfo.GroupList.GroupInfo>();
            }
            return this.groupInfo;
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
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="propertyList">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="property" type="{http://www.b2winc.com/item}propertyType" maxOccurs="unbounded"/>
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
            "groupId",
            "groupName",
            "propertyList"
        })
        public static class GroupInfo {

            @XmlElement(required = true)
            protected BigInteger groupId;
            @XmlElement(required = true)
            protected String groupName;
            @XmlElement(required = true)
            protected L10NItemProductionInfo.GroupList.GroupInfo.PropertyList propertyList;

            /**
             * Gets the value of the groupId property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getGroupId() {
                return groupId;
            }

            /**
             * Sets the value of the groupId property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setGroupId(BigInteger value) {
                this.groupId = value;
            }

            /**
             * Gets the value of the groupName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGroupName() {
                return groupName;
            }

            /**
             * Sets the value of the groupName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGroupName(String value) {
                this.groupName = value;
            }

            /**
             * Gets the value of the propertyList property.
             * 
             * @return
             *     possible object is
             *     {@link L10NItemProductionInfo.GroupList.GroupInfo.PropertyList }
             *     
             */
            public L10NItemProductionInfo.GroupList.GroupInfo.PropertyList getPropertyList() {
                return propertyList;
            }

            /**
             * Sets the value of the propertyList property.
             * 
             * @param value
             *     allowed object is
             *     {@link L10NItemProductionInfo.GroupList.GroupInfo.PropertyList }
             *     
             */
            public void setPropertyList(L10NItemProductionInfo.GroupList.GroupInfo.PropertyList value) {
                this.propertyList = value;
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
             *         &lt;element name="property" type="{http://www.b2winc.com/item}propertyType" maxOccurs="unbounded"/>
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
                "property"
            })
            public static class PropertyList {

                @XmlElement(required = true)
                protected List<PropertyType> property;

                /**
                 * Gets the value of the property property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the property property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProperty().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PropertyType }
                 * 
                 * 
                 */
                public List<PropertyType> getProperty() {
                    if (property == null) {
                        property = new ArrayList<PropertyType>();
                    }
                    return this.property;
                }

            }

        }

    }

}
