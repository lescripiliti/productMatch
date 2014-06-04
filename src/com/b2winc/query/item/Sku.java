
package com.b2winc.query.item;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sku complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sku">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="skuId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="legacySkuIdList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="legacySkuIdData" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="legacySkuId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="brandId" type="{http://www.b2winc.com/item}brandId"/>
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
 *         &lt;element name="replanishmentList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="replanishment" type="{http://www.b2winc.com/item}replanishment" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EANList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NBMInfo" type="{http://www.b2winc.com/item}NBMInfo"/>
 *         &lt;element name="taxInfo" type="{http://www.b2winc.com/item}taxInfo"/>
 *         &lt;element name="manufacturerInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="manufacturerWarranty" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="skuManufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="supplierInfo" type="{http://www.b2winc.com/item}supplierInfo"/>
 *         &lt;element name="diffList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="diff" type="{http://www.b2winc.com/item}diff" maxOccurs="4"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="kitInfo" type="{http://www.b2winc.com/item}kitInfo" minOccurs="0"/>
 *         &lt;element name="dimensionInfo" type="{http://www.b2winc.com/item}dimensionInfo"/>
 *         &lt;element name="isXDocking" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sellableFlagList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sellableFlag" type="{http://www.b2winc.com/item}sellableFlag" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="isConsigned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isRentable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="saleClassification">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="A"/>
 *               &lt;enumeration value="B"/>
 *               &lt;enumeration value="C"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="soldSeparatelly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="costPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="skuBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isService" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="serviceMediaSkuId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="skuPropertyList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="skuProperty" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="skuPropertyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="skuPropertyValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="skuDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isFunKitchen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="extendedWarrantyPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="embeddedList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="embeddedSKUList" type="{http://www.b2winc.com/item}embeddedSku" maxOccurs="unbounded"/>
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
@XmlType(name = "sku", propOrder = {
    "skuId",
    "legacySkuIdList",
    "replanishmentList",
    "eanList",
    "nbmInfo",
    "taxInfo",
    "manufacturerInfo",
    "supplierInfo",
    "diffList",
    "kitInfo",
    "dimensionInfo",
    "isXDocking",
    "sellableFlagList",
    "isConsigned",
    "isRentable",
    "saleClassification",
    "soldSeparatelly",
    "costPrice",
    "skuBrand",
    "isbn",
    "isService",
    "serviceMediaSkuId",
    "skuPropertyList",
    "skuDescription",
    "isFunKitchen",
    "extendedWarrantyPeriod",
    "embeddedList"
})
public class Sku {

    @XmlElement(required = true)
    protected String skuId;
    protected Sku.LegacySkuIdList legacySkuIdList;
    protected Sku.ReplanishmentList replanishmentList;
    @XmlElement(name = "EANList", required = true)
    protected Sku.EANList eanList;
    @XmlElement(name = "NBMInfo", required = true)
    protected NBMInfo nbmInfo;
    @XmlElement(required = true)
    protected TaxInfo taxInfo;
    protected Sku.ManufacturerInfo manufacturerInfo;
    @XmlElement(required = true)
    protected SupplierInfo supplierInfo;
    protected Sku.DiffList diffList;
    protected KitInfo kitInfo;
    @XmlElement(required = true)
    protected DimensionInfo dimensionInfo;
    protected boolean isXDocking;
    @XmlElement(required = true)
    protected Sku.SellableFlagList sellableFlagList;
    protected boolean isConsigned;
    protected boolean isRentable;
    @XmlElement(required = true)
    protected String saleClassification;
    protected boolean soldSeparatelly;
    @XmlElement(required = true)
    protected BigDecimal costPrice;
    protected String skuBrand;
    @XmlElement(name = "ISBN")
    protected String isbn;
    protected boolean isService;
    protected String serviceMediaSkuId;
    protected Sku.SkuPropertyList skuPropertyList;
    protected String skuDescription;
    @XmlElement(defaultValue = "false")
    protected boolean isFunKitchen;
    protected int extendedWarrantyPeriod;
    protected Sku.EmbeddedList embeddedList;

    /**
     * Gets the value of the skuId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkuId() {
        return skuId;
    }

    /**
     * Sets the value of the skuId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkuId(String value) {
        this.skuId = value;
    }

    /**
     * Gets the value of the legacySkuIdList property.
     * 
     * @return
     *     possible object is
     *     {@link Sku.LegacySkuIdList }
     *     
     */
    public Sku.LegacySkuIdList getLegacySkuIdList() {
        return legacySkuIdList;
    }

    /**
     * Sets the value of the legacySkuIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sku.LegacySkuIdList }
     *     
     */
    public void setLegacySkuIdList(Sku.LegacySkuIdList value) {
        this.legacySkuIdList = value;
    }

    /**
     * Gets the value of the replanishmentList property.
     * 
     * @return
     *     possible object is
     *     {@link Sku.ReplanishmentList }
     *     
     */
    public Sku.ReplanishmentList getReplanishmentList() {
        return replanishmentList;
    }

    /**
     * Sets the value of the replanishmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sku.ReplanishmentList }
     *     
     */
    public void setReplanishmentList(Sku.ReplanishmentList value) {
        this.replanishmentList = value;
    }

    /**
     * Gets the value of the eanList property.
     * 
     * @return
     *     possible object is
     *     {@link Sku.EANList }
     *     
     */
    public Sku.EANList getEANList() {
        return eanList;
    }

    /**
     * Sets the value of the eanList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sku.EANList }
     *     
     */
    public void setEANList(Sku.EANList value) {
        this.eanList = value;
    }

    /**
     * Gets the value of the nbmInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NBMInfo }
     *     
     */
    public NBMInfo getNBMInfo() {
        return nbmInfo;
    }

    /**
     * Sets the value of the nbmInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NBMInfo }
     *     
     */
    public void setNBMInfo(NBMInfo value) {
        this.nbmInfo = value;
    }

    /**
     * Gets the value of the taxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaxInfo }
     *     
     */
    public TaxInfo getTaxInfo() {
        return taxInfo;
    }

    /**
     * Sets the value of the taxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInfo }
     *     
     */
    public void setTaxInfo(TaxInfo value) {
        this.taxInfo = value;
    }

    /**
     * Gets the value of the manufacturerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Sku.ManufacturerInfo }
     *     
     */
    public Sku.ManufacturerInfo getManufacturerInfo() {
        return manufacturerInfo;
    }

    /**
     * Sets the value of the manufacturerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sku.ManufacturerInfo }
     *     
     */
    public void setManufacturerInfo(Sku.ManufacturerInfo value) {
        this.manufacturerInfo = value;
    }

    /**
     * Gets the value of the supplierInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierInfo }
     *     
     */
    public SupplierInfo getSupplierInfo() {
        return supplierInfo;
    }

    /**
     * Sets the value of the supplierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierInfo }
     *     
     */
    public void setSupplierInfo(SupplierInfo value) {
        this.supplierInfo = value;
    }

    /**
     * Gets the value of the diffList property.
     * 
     * @return
     *     possible object is
     *     {@link Sku.DiffList }
     *     
     */
    public Sku.DiffList getDiffList() {
        return diffList;
    }

    /**
     * Sets the value of the diffList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sku.DiffList }
     *     
     */
    public void setDiffList(Sku.DiffList value) {
        this.diffList = value;
    }

    /**
     * Gets the value of the kitInfo property.
     * 
     * @return
     *     possible object is
     *     {@link KitInfo }
     *     
     */
    public KitInfo getKitInfo() {
        return kitInfo;
    }

    /**
     * Sets the value of the kitInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link KitInfo }
     *     
     */
    public void setKitInfo(KitInfo value) {
        this.kitInfo = value;
    }

    /**
     * Gets the value of the dimensionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionInfo }
     *     
     */
    public DimensionInfo getDimensionInfo() {
        return dimensionInfo;
    }

    /**
     * Sets the value of the dimensionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionInfo }
     *     
     */
    public void setDimensionInfo(DimensionInfo value) {
        this.dimensionInfo = value;
    }

    /**
     * Gets the value of the isXDocking property.
     * 
     */
    public boolean isIsXDocking() {
        return isXDocking;
    }

    /**
     * Sets the value of the isXDocking property.
     * 
     */
    public void setIsXDocking(boolean value) {
        this.isXDocking = value;
    }

    /**
     * Gets the value of the sellableFlagList property.
     * 
     * @return
     *     possible object is
     *     {@link Sku.SellableFlagList }
     *     
     */
    public Sku.SellableFlagList getSellableFlagList() {
        return sellableFlagList;
    }

    /**
     * Sets the value of the sellableFlagList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sku.SellableFlagList }
     *     
     */
    public void setSellableFlagList(Sku.SellableFlagList value) {
        this.sellableFlagList = value;
    }

    /**
     * Gets the value of the isConsigned property.
     * 
     */
    public boolean isIsConsigned() {
        return isConsigned;
    }

    /**
     * Sets the value of the isConsigned property.
     * 
     */
    public void setIsConsigned(boolean value) {
        this.isConsigned = value;
    }

    /**
     * Gets the value of the isRentable property.
     * 
     */
    public boolean isIsRentable() {
        return isRentable;
    }

    /**
     * Sets the value of the isRentable property.
     * 
     */
    public void setIsRentable(boolean value) {
        this.isRentable = value;
    }

    /**
     * Gets the value of the saleClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleClassification() {
        return saleClassification;
    }

    /**
     * Sets the value of the saleClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleClassification(String value) {
        this.saleClassification = value;
    }

    /**
     * Gets the value of the soldSeparatelly property.
     * 
     */
    public boolean isSoldSeparatelly() {
        return soldSeparatelly;
    }

    /**
     * Sets the value of the soldSeparatelly property.
     * 
     */
    public void setSoldSeparatelly(boolean value) {
        this.soldSeparatelly = value;
    }

    /**
     * Gets the value of the costPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    /**
     * Sets the value of the costPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostPrice(BigDecimal value) {
        this.costPrice = value;
    }

    /**
     * Gets the value of the skuBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkuBrand() {
        return skuBrand;
    }

    /**
     * Sets the value of the skuBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkuBrand(String value) {
        this.skuBrand = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN(String value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the isService property.
     * 
     */
    public boolean isIsService() {
        return isService;
    }

    /**
     * Sets the value of the isService property.
     * 
     */
    public void setIsService(boolean value) {
        this.isService = value;
    }

    /**
     * Gets the value of the serviceMediaSkuId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceMediaSkuId() {
        return serviceMediaSkuId;
    }

    /**
     * Sets the value of the serviceMediaSkuId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceMediaSkuId(String value) {
        this.serviceMediaSkuId = value;
    }

    /**
     * Gets the value of the skuPropertyList property.
     * 
     * @return
     *     possible object is
     *     {@link Sku.SkuPropertyList }
     *     
     */
    public Sku.SkuPropertyList getSkuPropertyList() {
        return skuPropertyList;
    }

    /**
     * Sets the value of the skuPropertyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sku.SkuPropertyList }
     *     
     */
    public void setSkuPropertyList(Sku.SkuPropertyList value) {
        this.skuPropertyList = value;
    }

    /**
     * Gets the value of the skuDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkuDescription() {
        return skuDescription;
    }

    /**
     * Sets the value of the skuDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkuDescription(String value) {
        this.skuDescription = value;
    }

    /**
     * Gets the value of the isFunKitchen property.
     * 
     */
    public boolean isIsFunKitchen() {
        return isFunKitchen;
    }

    /**
     * Sets the value of the isFunKitchen property.
     * 
     */
    public void setIsFunKitchen(boolean value) {
        this.isFunKitchen = value;
    }

    /**
     * Gets the value of the extendedWarrantyPeriod property.
     * 
     */
    public int getExtendedWarrantyPeriod() {
        return extendedWarrantyPeriod;
    }

    /**
     * Sets the value of the extendedWarrantyPeriod property.
     * 
     */
    public void setExtendedWarrantyPeriod(int value) {
        this.extendedWarrantyPeriod = value;
    }

    /**
     * Gets the value of the embeddedList property.
     * 
     * @return
     *     possible object is
     *     {@link Sku.EmbeddedList }
     *     
     */
    public Sku.EmbeddedList getEmbeddedList() {
        return embeddedList;
    }

    /**
     * Sets the value of the embeddedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sku.EmbeddedList }
     *     
     */
    public void setEmbeddedList(Sku.EmbeddedList value) {
        this.embeddedList = value;
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
     *         &lt;element name="diff" type="{http://www.b2winc.com/item}diff" maxOccurs="4"/>
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
        "diff"
    })
    public static class DiffList {

        @XmlElement(required = true)
        protected List<Diff> diff;

        /**
         * Gets the value of the diff property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the diff property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDiff().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Diff }
         * 
         * 
         */
        public List<Diff> getDiff() {
            if (diff == null) {
                diff = new ArrayList<Diff>();
            }
            return this.diff;
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
     *         &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "ean"
    })
    public static class EANList {

        @XmlElement(name = "EAN", required = true)
        protected List<String> ean;

        /**
         * Gets the value of the ean property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ean property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEAN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEAN() {
            if (ean == null) {
                ean = new ArrayList<String>();
            }
            return this.ean;
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
     *         &lt;element name="embeddedSKUList" type="{http://www.b2winc.com/item}embeddedSku" maxOccurs="unbounded"/>
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
        "embeddedSKUList"
    })
    public static class EmbeddedList {

        @XmlElement(required = true)
        protected List<EmbeddedSku> embeddedSKUList;

        /**
         * Gets the value of the embeddedSKUList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the embeddedSKUList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmbeddedSKUList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EmbeddedSku }
         * 
         * 
         */
        public List<EmbeddedSku> getEmbeddedSKUList() {
            if (embeddedSKUList == null) {
                embeddedSKUList = new ArrayList<EmbeddedSku>();
            }
            return this.embeddedSKUList;
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
     *         &lt;element name="legacySkuIdData" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="legacySkuId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="brandId" type="{http://www.b2winc.com/item}brandId"/>
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
        "legacySkuIdData"
    })
    public static class LegacySkuIdList {

        @XmlElement(required = true)
        protected List<Sku.LegacySkuIdList.LegacySkuIdData> legacySkuIdData;

        /**
         * Gets the value of the legacySkuIdData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the legacySkuIdData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLegacySkuIdData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Sku.LegacySkuIdList.LegacySkuIdData }
         * 
         * 
         */
        public List<Sku.LegacySkuIdList.LegacySkuIdData> getLegacySkuIdData() {
            if (legacySkuIdData == null) {
                legacySkuIdData = new ArrayList<Sku.LegacySkuIdList.LegacySkuIdData>();
            }
            return this.legacySkuIdData;
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
         *         &lt;element name="legacySkuId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="brandId" type="{http://www.b2winc.com/item}brandId"/>
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
            "legacySkuId",
            "brandId"
        })
        public static class LegacySkuIdData {

            @XmlElement(required = true)
            protected String legacySkuId;
            @XmlElement(required = true)
            protected String brandId;

            /**
             * Gets the value of the legacySkuId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLegacySkuId() {
                return legacySkuId;
            }

            /**
             * Sets the value of the legacySkuId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLegacySkuId(String value) {
                this.legacySkuId = value;
            }

            /**
             * Gets the value of the brandId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBrandId() {
                return brandId;
            }

            /**
             * Sets the value of the brandId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBrandId(String value) {
                this.brandId = value;
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
     *         &lt;element name="manufacturerWarranty" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="skuManufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "manufacturerWarranty",
        "skuManufacturer"
    })
    public static class ManufacturerInfo {

        protected BigInteger manufacturerWarranty;
        protected String skuManufacturer;

        /**
         * Gets the value of the manufacturerWarranty property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getManufacturerWarranty() {
            return manufacturerWarranty;
        }

        /**
         * Sets the value of the manufacturerWarranty property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setManufacturerWarranty(BigInteger value) {
            this.manufacturerWarranty = value;
        }

        /**
         * Gets the value of the skuManufacturer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSkuManufacturer() {
            return skuManufacturer;
        }

        /**
         * Sets the value of the skuManufacturer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSkuManufacturer(String value) {
            this.skuManufacturer = value;
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
     *         &lt;element name="replanishment" type="{http://www.b2winc.com/item}replanishment" maxOccurs="unbounded"/>
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
        "replanishment"
    })
    public static class ReplanishmentList {

        @XmlElement(required = true)
        protected List<Replanishment> replanishment;

        /**
         * Gets the value of the replanishment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the replanishment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReplanishment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Replanishment }
         * 
         * 
         */
        public List<Replanishment> getReplanishment() {
            if (replanishment == null) {
                replanishment = new ArrayList<Replanishment>();
            }
            return this.replanishment;
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
     *         &lt;element name="sellableFlag" type="{http://www.b2winc.com/item}sellableFlag" maxOccurs="unbounded"/>
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
        "sellableFlag"
    })
    public static class SellableFlagList {

        @XmlElement(required = true)
        protected List<SellableFlag> sellableFlag;

        /**
         * Gets the value of the sellableFlag property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sellableFlag property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSellableFlag().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SellableFlag }
         * 
         * 
         */
        public List<SellableFlag> getSellableFlag() {
            if (sellableFlag == null) {
                sellableFlag = new ArrayList<SellableFlag>();
            }
            return this.sellableFlag;
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
     *         &lt;element name="skuProperty" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="skuPropertyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="skuPropertyValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "skuProperty"
    })
    public static class SkuPropertyList {

        @XmlElement(required = true)
        protected List<Sku.SkuPropertyList.SkuProperty> skuProperty;

        /**
         * Gets the value of the skuProperty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the skuProperty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSkuProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Sku.SkuPropertyList.SkuProperty }
         * 
         * 
         */
        public List<Sku.SkuPropertyList.SkuProperty> getSkuProperty() {
            if (skuProperty == null) {
                skuProperty = new ArrayList<Sku.SkuPropertyList.SkuProperty>();
            }
            return this.skuProperty;
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
         *         &lt;element name="skuPropertyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="skuPropertyValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "skuPropertyId",
            "skuPropertyValue"
        })
        public static class SkuProperty {

            @XmlElement(required = true)
            protected String skuPropertyId;
            @XmlElement(required = true)
            protected String skuPropertyValue;

            /**
             * Gets the value of the skuPropertyId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSkuPropertyId() {
                return skuPropertyId;
            }

            /**
             * Sets the value of the skuPropertyId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSkuPropertyId(String value) {
                this.skuPropertyId = value;
            }

            /**
             * Gets the value of the skuPropertyValue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSkuPropertyValue() {
                return skuPropertyValue;
            }

            /**
             * Sets the value of the skuPropertyValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSkuPropertyValue(String value) {
                this.skuPropertyValue = value;
            }

        }

    }

}
