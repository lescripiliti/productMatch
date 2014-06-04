
package com.b2winc.query.item;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="legacyItemIdList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="legacyItemIdData" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="legacyItemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="brandid" type="{http://www.b2winc.com/item}brandId"/>
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
 *         &lt;element name="supplierItemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="giftWrapIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="exclusivityConstraintList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="exclusivityConstraint" type="{http://www.b2winc.com/item}exclusivityConstraint" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="expirationInfo" type="{http://www.b2winc.com/item}expirationInfo"/>
 *         &lt;element name="merchandiseHierarchy" type="{http://www.b2winc.com/item}merchandiseHierarchy"/>
 *         &lt;element name="sellingTitleList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="l10nSellingTitleInfo" type="{http://www.b2winc.com/item}sellingTitleInfo" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="descriptionList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="l10nDescriptionInfo" type="{http://www.b2winc.com/item}descriptionInfo" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="itemProductionData" type="{http://www.b2winc.com/item}itemProductionInfo"/>
 *         &lt;element name="siteDataInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="siteInfo" type="{http://www.b2winc.com/item}siteInfo" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="priceList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="priceInfo" type="{http://www.b2winc.com/item}priceInfo" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="skuList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sku" type="{http://www.b2winc.com/item}sku" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="itemPropertyList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itemProperty" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="itemPropertyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="itemPropertyValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="saleRanking" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sellingRank" type="{http://www.b2winc.com/item}sellingRankList"/>
 *         &lt;element name="stallment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "itemId",
    "legacyItemIdList",
    "supplierItemName",
    "giftWrapIndicator",
    "exclusivityConstraintList",
    "expirationInfo",
    "merchandiseHierarchy",
    "sellingTitleList",
    "descriptionList",
    "itemProductionData",
    "siteDataInfo",
    "priceList",
    "skuList",
    "itemPropertyList",
    "saleRanking",
    "sellingRank",
    "stallment"
})
public class Item {

    @XmlElement(required = true)
    protected String itemId;
    protected Item.LegacyItemIdList legacyItemIdList;
    @XmlElement(required = true)
    protected String supplierItemName;
    protected boolean giftWrapIndicator;
    protected Item.ExclusivityConstraintList exclusivityConstraintList;
    @XmlElement(required = true)
    protected ExpirationInfo expirationInfo;
    @XmlElement(required = true)
    protected MerchandiseHierarchy merchandiseHierarchy;
    protected Item.SellingTitleList sellingTitleList;
    protected Item.DescriptionList descriptionList;
    @XmlElement(required = true)
    protected ItemProductionInfo itemProductionData;
    @XmlElement(required = true)
    protected Item.SiteDataInfo siteDataInfo;
    @XmlElement(required = true)
    protected Item.PriceList priceList;
    @XmlElement(required = true)
    protected Item.SkuList skuList;
    protected Item.ItemPropertyList itemPropertyList;
    protected Long saleRanking;
    @XmlElement(required = true)
    protected SellingRankList sellingRank;
    protected Integer stallment;

    /**
     * Gets the value of the itemId property.
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
     * Sets the value of the itemId property.
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
     * Gets the value of the legacyItemIdList property.
     * 
     * @return
     *     possible object is
     *     {@link Item.LegacyItemIdList }
     *     
     */
    public Item.LegacyItemIdList getLegacyItemIdList() {
        return legacyItemIdList;
    }

    /**
     * Sets the value of the legacyItemIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.LegacyItemIdList }
     *     
     */
    public void setLegacyItemIdList(Item.LegacyItemIdList value) {
        this.legacyItemIdList = value;
    }

    /**
     * Gets the value of the supplierItemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierItemName() {
        return supplierItemName;
    }

    /**
     * Sets the value of the supplierItemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierItemName(String value) {
        this.supplierItemName = value;
    }

    /**
     * Gets the value of the giftWrapIndicator property.
     * 
     */
    public boolean isGiftWrapIndicator() {
        return giftWrapIndicator;
    }

    /**
     * Sets the value of the giftWrapIndicator property.
     * 
     */
    public void setGiftWrapIndicator(boolean value) {
        this.giftWrapIndicator = value;
    }

    /**
     * Gets the value of the exclusivityConstraintList property.
     * 
     * @return
     *     possible object is
     *     {@link Item.ExclusivityConstraintList }
     *     
     */
    public Item.ExclusivityConstraintList getExclusivityConstraintList() {
        return exclusivityConstraintList;
    }

    /**
     * Sets the value of the exclusivityConstraintList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.ExclusivityConstraintList }
     *     
     */
    public void setExclusivityConstraintList(Item.ExclusivityConstraintList value) {
        this.exclusivityConstraintList = value;
    }

    /**
     * Gets the value of the expirationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExpirationInfo }
     *     
     */
    public ExpirationInfo getExpirationInfo() {
        return expirationInfo;
    }

    /**
     * Sets the value of the expirationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpirationInfo }
     *     
     */
    public void setExpirationInfo(ExpirationInfo value) {
        this.expirationInfo = value;
    }

    /**
     * Gets the value of the merchandiseHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link MerchandiseHierarchy }
     *     
     */
    public MerchandiseHierarchy getMerchandiseHierarchy() {
        return merchandiseHierarchy;
    }

    /**
     * Sets the value of the merchandiseHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchandiseHierarchy }
     *     
     */
    public void setMerchandiseHierarchy(MerchandiseHierarchy value) {
        this.merchandiseHierarchy = value;
    }

    /**
     * Gets the value of the sellingTitleList property.
     * 
     * @return
     *     possible object is
     *     {@link Item.SellingTitleList }
     *     
     */
    public Item.SellingTitleList getSellingTitleList() {
        return sellingTitleList;
    }

    /**
     * Sets the value of the sellingTitleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.SellingTitleList }
     *     
     */
    public void setSellingTitleList(Item.SellingTitleList value) {
        this.sellingTitleList = value;
    }

    /**
     * Gets the value of the descriptionList property.
     * 
     * @return
     *     possible object is
     *     {@link Item.DescriptionList }
     *     
     */
    public Item.DescriptionList getDescriptionList() {
        return descriptionList;
    }

    /**
     * Sets the value of the descriptionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.DescriptionList }
     *     
     */
    public void setDescriptionList(Item.DescriptionList value) {
        this.descriptionList = value;
    }

    /**
     * Gets the value of the itemProductionData property.
     * 
     * @return
     *     possible object is
     *     {@link ItemProductionInfo }
     *     
     */
    public ItemProductionInfo getItemProductionData() {
        return itemProductionData;
    }

    /**
     * Sets the value of the itemProductionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemProductionInfo }
     *     
     */
    public void setItemProductionData(ItemProductionInfo value) {
        this.itemProductionData = value;
    }

    /**
     * Gets the value of the siteDataInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Item.SiteDataInfo }
     *     
     */
    public Item.SiteDataInfo getSiteDataInfo() {
        return siteDataInfo;
    }

    /**
     * Sets the value of the siteDataInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.SiteDataInfo }
     *     
     */
    public void setSiteDataInfo(Item.SiteDataInfo value) {
        this.siteDataInfo = value;
    }

    /**
     * Gets the value of the priceList property.
     * 
     * @return
     *     possible object is
     *     {@link Item.PriceList }
     *     
     */
    public Item.PriceList getPriceList() {
        return priceList;
    }

    /**
     * Sets the value of the priceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.PriceList }
     *     
     */
    public void setPriceList(Item.PriceList value) {
        this.priceList = value;
    }

    /**
     * Gets the value of the skuList property.
     * 
     * @return
     *     possible object is
     *     {@link Item.SkuList }
     *     
     */
    public Item.SkuList getSkuList() {
        return skuList;
    }

    /**
     * Sets the value of the skuList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.SkuList }
     *     
     */
    public void setSkuList(Item.SkuList value) {
        this.skuList = value;
    }

    /**
     * Gets the value of the itemPropertyList property.
     * 
     * @return
     *     possible object is
     *     {@link Item.ItemPropertyList }
     *     
     */
    public Item.ItemPropertyList getItemPropertyList() {
        return itemPropertyList;
    }

    /**
     * Sets the value of the itemPropertyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.ItemPropertyList }
     *     
     */
    public void setItemPropertyList(Item.ItemPropertyList value) {
        this.itemPropertyList = value;
    }

    /**
     * Gets the value of the saleRanking property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaleRanking() {
        return saleRanking;
    }

    /**
     * Sets the value of the saleRanking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaleRanking(Long value) {
        this.saleRanking = value;
    }

    /**
     * Gets the value of the sellingRank property.
     * 
     * @return
     *     possible object is
     *     {@link SellingRankList }
     *     
     */
    public SellingRankList getSellingRank() {
        return sellingRank;
    }

    /**
     * Sets the value of the sellingRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingRankList }
     *     
     */
    public void setSellingRank(SellingRankList value) {
        this.sellingRank = value;
    }

    /**
     * Gets the value of the stallment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStallment() {
        return stallment;
    }

    /**
     * Sets the value of the stallment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStallment(Integer value) {
        this.stallment = value;
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
     *         &lt;element name="l10nDescriptionInfo" type="{http://www.b2winc.com/item}descriptionInfo" maxOccurs="unbounded"/>
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
        "l10NDescriptionInfo"
    })
    public static class DescriptionList {

        @XmlElement(name = "l10nDescriptionInfo", required = true)
        protected List<DescriptionInfo> l10NDescriptionInfo;

        /**
         * Gets the value of the l10NDescriptionInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the l10NDescriptionInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getL10NDescriptionInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DescriptionInfo }
         * 
         * 
         */
        public List<DescriptionInfo> getL10NDescriptionInfo() {
            if (l10NDescriptionInfo == null) {
                l10NDescriptionInfo = new ArrayList<DescriptionInfo>();
            }
            return this.l10NDescriptionInfo;
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
     *         &lt;element name="exclusivityConstraint" type="{http://www.b2winc.com/item}exclusivityConstraint" maxOccurs="unbounded"/>
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
        "exclusivityConstraint"
    })
    public static class ExclusivityConstraintList {

        @XmlElement(required = true)
        protected List<ExclusivityConstraint> exclusivityConstraint;

        /**
         * Gets the value of the exclusivityConstraint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exclusivityConstraint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExclusivityConstraint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExclusivityConstraint }
         * 
         * 
         */
        public List<ExclusivityConstraint> getExclusivityConstraint() {
            if (exclusivityConstraint == null) {
                exclusivityConstraint = new ArrayList<ExclusivityConstraint>();
            }
            return this.exclusivityConstraint;
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
     *         &lt;element name="itemProperty" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="itemPropertyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="itemPropertyValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "itemProperty"
    })
    public static class ItemPropertyList {

        @XmlElement(required = true)
        protected List<Item.ItemPropertyList.ItemProperty> itemProperty;

        /**
         * Gets the value of the itemProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.ItemPropertyList.ItemProperty }
         * 
         * 
         */
        public List<Item.ItemPropertyList.ItemProperty> getItemProperty() {
            if (itemProperty == null) {
                itemProperty = new ArrayList<Item.ItemPropertyList.ItemProperty>();
            }
            return this.itemProperty;
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
         *         &lt;element name="itemPropertyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="itemPropertyValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "itemPropertyId",
            "itemPropertyValue"
        })
        public static class ItemProperty {

            @XmlElement(required = true)
            protected String itemPropertyId;
            @XmlElement(required = true)
            protected String itemPropertyValue;

            /**
             * Gets the value of the itemPropertyId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemPropertyId() {
                return itemPropertyId;
            }

            /**
             * Sets the value of the itemPropertyId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemPropertyId(String value) {
                this.itemPropertyId = value;
            }

            /**
             * Gets the value of the itemPropertyValue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemPropertyValue() {
                return itemPropertyValue;
            }

            /**
             * Sets the value of the itemPropertyValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemPropertyValue(String value) {
                this.itemPropertyValue = value;
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
     *         &lt;element name="legacyItemIdData" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="legacyItemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="brandid" type="{http://www.b2winc.com/item}brandId"/>
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
        "legacyItemIdData"
    })
    public static class LegacyItemIdList {

        @XmlElement(required = true)
        protected List<Item.LegacyItemIdList.LegacyItemIdData> legacyItemIdData;

        /**
         * Gets the value of the legacyItemIdData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the legacyItemIdData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLegacyItemIdData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Item.LegacyItemIdList.LegacyItemIdData }
         * 
         * 
         */
        public List<Item.LegacyItemIdList.LegacyItemIdData> getLegacyItemIdData() {
            if (legacyItemIdData == null) {
                legacyItemIdData = new ArrayList<Item.LegacyItemIdList.LegacyItemIdData>();
            }
            return this.legacyItemIdData;
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
         *         &lt;element name="legacyItemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="brandid" type="{http://www.b2winc.com/item}brandId"/>
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
            "legacyItemId",
            "brandid"
        })
        public static class LegacyItemIdData {

            @XmlElement(required = true)
            protected String legacyItemId;
            @XmlElement(required = true)
            protected String brandid;

            /**
             * Gets the value of the legacyItemId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLegacyItemId() {
                return legacyItemId;
            }

            /**
             * Sets the value of the legacyItemId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLegacyItemId(String value) {
                this.legacyItemId = value;
            }

            /**
             * Gets the value of the brandid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBrandid() {
                return brandid;
            }

            /**
             * Sets the value of the brandid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBrandid(String value) {
                this.brandid = value;
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
     *         &lt;element name="priceInfo" type="{http://www.b2winc.com/item}priceInfo" maxOccurs="unbounded"/>
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
        "priceInfo"
    })
    public static class PriceList {

        @XmlElement(required = true)
        protected List<PriceInfo> priceInfo;

        /**
         * Gets the value of the priceInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the priceInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPriceInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PriceInfo }
         * 
         * 
         */
        public List<PriceInfo> getPriceInfo() {
            if (priceInfo == null) {
                priceInfo = new ArrayList<PriceInfo>();
            }
            return this.priceInfo;
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
     *         &lt;element name="l10nSellingTitleInfo" type="{http://www.b2winc.com/item}sellingTitleInfo" maxOccurs="unbounded"/>
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
        "l10NSellingTitleInfo"
    })
    public static class SellingTitleList {

        @XmlElement(name = "l10nSellingTitleInfo", required = true)
        protected List<SellingTitleInfo> l10NSellingTitleInfo;

        /**
         * Gets the value of the l10NSellingTitleInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the l10NSellingTitleInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getL10NSellingTitleInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SellingTitleInfo }
         * 
         * 
         */
        public List<SellingTitleInfo> getL10NSellingTitleInfo() {
            if (l10NSellingTitleInfo == null) {
                l10NSellingTitleInfo = new ArrayList<SellingTitleInfo>();
            }
            return this.l10NSellingTitleInfo;
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
     *         &lt;element name="siteInfo" type="{http://www.b2winc.com/item}siteInfo" maxOccurs="unbounded"/>
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
        "siteInfo"
    })
    public static class SiteDataInfo {

        @XmlElement(required = true)
        protected List<SiteInfo> siteInfo;

        /**
         * Gets the value of the siteInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the siteInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSiteInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SiteInfo }
         * 
         * 
         */
        public List<SiteInfo> getSiteInfo() {
            if (siteInfo == null) {
                siteInfo = new ArrayList<SiteInfo>();
            }
            return this.siteInfo;
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
     *         &lt;element name="sku" type="{http://www.b2winc.com/item}sku" maxOccurs="unbounded"/>
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
        "sku"
    })
    public static class SkuList {

        @XmlElement(required = true)
        protected List<Sku> sku;

        /**
         * Gets the value of the sku property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sku property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSku().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Sku }
         * 
         * 
         */
        public List<Sku> getSku() {
            if (sku == null) {
                sku = new ArrayList<Sku>();
            }
            return this.sku;
        }

    }

}
