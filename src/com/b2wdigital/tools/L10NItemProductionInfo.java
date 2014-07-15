
package com.b2wdigital.tools;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de l10nItemProductionInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade l10NId.
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
     * Define o valor da propriedade l10NId.
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
     * Obtém o valor da propriedade groupList.
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
     * Define o valor da propriedade groupList.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
             * Obtém o valor da propriedade groupId.
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
             * Define o valor da propriedade groupId.
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
             * Obtém o valor da propriedade groupName.
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
             * Define o valor da propriedade groupName.
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
             * Obtém o valor da propriedade propertyList.
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
             * Define o valor da propriedade propertyList.
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
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
