
package com.b2wdigital.tools;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de sku complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade skuId.
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
     * Define o valor da propriedade skuId.
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
     * Obtém o valor da propriedade legacySkuIdList.
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
     * Define o valor da propriedade legacySkuIdList.
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
     * Obtém o valor da propriedade replanishmentList.
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
     * Define o valor da propriedade replanishmentList.
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
     * Obtém o valor da propriedade eanList.
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
     * Define o valor da propriedade eanList.
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
     * Obtém o valor da propriedade nbmInfo.
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
     * Define o valor da propriedade nbmInfo.
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
     * Obtém o valor da propriedade taxInfo.
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
     * Define o valor da propriedade taxInfo.
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
     * Obtém o valor da propriedade manufacturerInfo.
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
     * Define o valor da propriedade manufacturerInfo.
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
     * Obtém o valor da propriedade supplierInfo.
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
     * Define o valor da propriedade supplierInfo.
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
     * Obtém o valor da propriedade diffList.
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
     * Define o valor da propriedade diffList.
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
     * Obtém o valor da propriedade kitInfo.
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
     * Define o valor da propriedade kitInfo.
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
     * Obtém o valor da propriedade dimensionInfo.
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
     * Define o valor da propriedade dimensionInfo.
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
     * Obtém o valor da propriedade isXDocking.
     * 
     */
    public boolean isIsXDocking() {
        return isXDocking;
    }

    /**
     * Define o valor da propriedade isXDocking.
     * 
     */
    public void setIsXDocking(boolean value) {
        this.isXDocking = value;
    }

    /**
     * Obtém o valor da propriedade sellableFlagList.
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
     * Define o valor da propriedade sellableFlagList.
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
     * Obtém o valor da propriedade isConsigned.
     * 
     */
    public boolean isIsConsigned() {
        return isConsigned;
    }

    /**
     * Define o valor da propriedade isConsigned.
     * 
     */
    public void setIsConsigned(boolean value) {
        this.isConsigned = value;
    }

    /**
     * Obtém o valor da propriedade isRentable.
     * 
     */
    public boolean isIsRentable() {
        return isRentable;
    }

    /**
     * Define o valor da propriedade isRentable.
     * 
     */
    public void setIsRentable(boolean value) {
        this.isRentable = value;
    }

    /**
     * Obtém o valor da propriedade saleClassification.
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
     * Define o valor da propriedade saleClassification.
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
     * Obtém o valor da propriedade soldSeparatelly.
     * 
     */
    public boolean isSoldSeparatelly() {
        return soldSeparatelly;
    }

    /**
     * Define o valor da propriedade soldSeparatelly.
     * 
     */
    public void setSoldSeparatelly(boolean value) {
        this.soldSeparatelly = value;
    }

    /**
     * Obtém o valor da propriedade costPrice.
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
     * Define o valor da propriedade costPrice.
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
     * Obtém o valor da propriedade skuBrand.
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
     * Define o valor da propriedade skuBrand.
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
     * Obtém o valor da propriedade isbn.
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
     * Define o valor da propriedade isbn.
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
     * Obtém o valor da propriedade isService.
     * 
     */
    public boolean isIsService() {
        return isService;
    }

    /**
     * Define o valor da propriedade isService.
     * 
     */
    public void setIsService(boolean value) {
        this.isService = value;
    }

    /**
     * Obtém o valor da propriedade serviceMediaSkuId.
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
     * Define o valor da propriedade serviceMediaSkuId.
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
     * Obtém o valor da propriedade skuPropertyList.
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
     * Define o valor da propriedade skuPropertyList.
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
     * Obtém o valor da propriedade skuDescription.
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
     * Define o valor da propriedade skuDescription.
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
     * Obtém o valor da propriedade isFunKitchen.
     * 
     */
    public boolean isIsFunKitchen() {
        return isFunKitchen;
    }

    /**
     * Define o valor da propriedade isFunKitchen.
     * 
     */
    public void setIsFunKitchen(boolean value) {
        this.isFunKitchen = value;
    }

    /**
     * Obtém o valor da propriedade extendedWarrantyPeriod.
     * 
     */
    public int getExtendedWarrantyPeriod() {
        return extendedWarrantyPeriod;
    }

    /**
     * Define o valor da propriedade extendedWarrantyPeriod.
     * 
     */
    public void setExtendedWarrantyPeriod(int value) {
        this.extendedWarrantyPeriod = value;
    }

    /**
     * Obtém o valor da propriedade embeddedList.
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
     * Define o valor da propriedade embeddedList.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
             * Obtém o valor da propriedade legacySkuId.
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
             * Define o valor da propriedade legacySkuId.
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
             * Obtém o valor da propriedade brandId.
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
             * Define o valor da propriedade brandId.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
         * Obtém o valor da propriedade manufacturerWarranty.
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
         * Define o valor da propriedade manufacturerWarranty.
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
         * Obtém o valor da propriedade skuManufacturer.
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
         * Define o valor da propriedade skuManufacturer.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
             * Obtém o valor da propriedade skuPropertyId.
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
             * Define o valor da propriedade skuPropertyId.
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
             * Obtém o valor da propriedade skuPropertyValue.
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
             * Define o valor da propriedade skuPropertyValue.
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
