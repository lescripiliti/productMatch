
package com.b2wdigital.tools;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de item complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade legacyItemIdList.
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
     * Define o valor da propriedade legacyItemIdList.
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
     * Obtém o valor da propriedade supplierItemName.
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
     * Define o valor da propriedade supplierItemName.
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
     * Obtém o valor da propriedade giftWrapIndicator.
     * 
     */
    public boolean isGiftWrapIndicator() {
        return giftWrapIndicator;
    }

    /**
     * Define o valor da propriedade giftWrapIndicator.
     * 
     */
    public void setGiftWrapIndicator(boolean value) {
        this.giftWrapIndicator = value;
    }

    /**
     * Obtém o valor da propriedade exclusivityConstraintList.
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
     * Define o valor da propriedade exclusivityConstraintList.
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
     * Obtém o valor da propriedade expirationInfo.
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
     * Define o valor da propriedade expirationInfo.
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
     * Obtém o valor da propriedade merchandiseHierarchy.
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
     * Define o valor da propriedade merchandiseHierarchy.
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
     * Obtém o valor da propriedade sellingTitleList.
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
     * Define o valor da propriedade sellingTitleList.
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
     * Obtém o valor da propriedade descriptionList.
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
     * Define o valor da propriedade descriptionList.
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
     * Obtém o valor da propriedade itemProductionData.
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
     * Define o valor da propriedade itemProductionData.
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
     * Obtém o valor da propriedade siteDataInfo.
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
     * Define o valor da propriedade siteDataInfo.
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
     * Obtém o valor da propriedade priceList.
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
     * Define o valor da propriedade priceList.
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
     * Obtém o valor da propriedade skuList.
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
     * Define o valor da propriedade skuList.
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
     * Obtém o valor da propriedade itemPropertyList.
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
     * Define o valor da propriedade itemPropertyList.
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
     * Obtém o valor da propriedade saleRanking.
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
     * Define o valor da propriedade saleRanking.
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
     * Obtém o valor da propriedade sellingRank.
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
     * Define o valor da propriedade sellingRank.
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
     * Obtém o valor da propriedade stallment.
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
     * Define o valor da propriedade stallment.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
             * Obtém o valor da propriedade itemPropertyId.
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
             * Define o valor da propriedade itemPropertyId.
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
             * Obtém o valor da propriedade itemPropertyValue.
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
             * Define o valor da propriedade itemPropertyValue.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
             * Obtém o valor da propriedade legacyItemId.
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
             * Define o valor da propriedade legacyItemId.
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
             * Obtém o valor da propriedade brandid.
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
             * Define o valor da propriedade brandid.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
