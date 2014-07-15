
package com.b2wdigital.tools;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de siteInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="siteInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brandId" type="{http://www.b2winc.com/item}brandId"/>
 *         &lt;element name="siteMerchandiseHierarchy" type="{http://www.b2winc.com/item}SiteMerchandiseHierarchy"/>
 *         &lt;element name="specialUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellingTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialPageSWF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seeMoreInfo" type="{http://www.b2winc.com/item}seeMoreInfo" minOccurs="0"/>
 *         &lt;element name="TAGList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TAG" type="{http://www.b2winc.com/item}TAG" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ratingInfoList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ratingInfo" type="{http://www.b2winc.com/item}ratingInfo" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="releaseInfo" type="{http://www.b2winc.com/item}releaseInfo"/>
 *         &lt;element name="comercialStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="acessoryList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="crossSellingList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
@XmlType(name = "siteInfo", propOrder = {
    "brandId",
    "siteMerchandiseHierarchy",
    "specialUrl",
    "sellingTitle",
    "specialPageSWF",
    "seeMoreInfo",
    "tagList",
    "ratingInfoList",
    "releaseInfo",
    "comercialStatus",
    "acessoryList",
    "crossSellingList"
})
public class SiteInfo {

    @XmlElement(required = true)
    protected String brandId;
    @XmlElement(required = true)
    protected SiteMerchandiseHierarchy siteMerchandiseHierarchy;
    protected String specialUrl;
    protected String sellingTitle;
    protected String specialPageSWF;
    protected SeeMoreInfo seeMoreInfo;
    @XmlElement(name = "TAGList")
    protected SiteInfo.TAGList tagList;
    @XmlElement(required = true)
    protected SiteInfo.RatingInfoList ratingInfoList;
    @XmlElement(required = true)
    protected ReleaseInfo releaseInfo;
    protected boolean comercialStatus;
    protected SiteInfo.AcessoryList acessoryList;
    protected SiteInfo.CrossSellingList crossSellingList;

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

    /**
     * Obtém o valor da propriedade siteMerchandiseHierarchy.
     * 
     * @return
     *     possible object is
     *     {@link SiteMerchandiseHierarchy }
     *     
     */
    public SiteMerchandiseHierarchy getSiteMerchandiseHierarchy() {
        return siteMerchandiseHierarchy;
    }

    /**
     * Define o valor da propriedade siteMerchandiseHierarchy.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteMerchandiseHierarchy }
     *     
     */
    public void setSiteMerchandiseHierarchy(SiteMerchandiseHierarchy value) {
        this.siteMerchandiseHierarchy = value;
    }

    /**
     * Obtém o valor da propriedade specialUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialUrl() {
        return specialUrl;
    }

    /**
     * Define o valor da propriedade specialUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialUrl(String value) {
        this.specialUrl = value;
    }

    /**
     * Obtém o valor da propriedade sellingTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellingTitle() {
        return sellingTitle;
    }

    /**
     * Define o valor da propriedade sellingTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellingTitle(String value) {
        this.sellingTitle = value;
    }

    /**
     * Obtém o valor da propriedade specialPageSWF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialPageSWF() {
        return specialPageSWF;
    }

    /**
     * Define o valor da propriedade specialPageSWF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialPageSWF(String value) {
        this.specialPageSWF = value;
    }

    /**
     * Obtém o valor da propriedade seeMoreInfo.
     * 
     * @return
     *     possible object is
     *     {@link SeeMoreInfo }
     *     
     */
    public SeeMoreInfo getSeeMoreInfo() {
        return seeMoreInfo;
    }

    /**
     * Define o valor da propriedade seeMoreInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link SeeMoreInfo }
     *     
     */
    public void setSeeMoreInfo(SeeMoreInfo value) {
        this.seeMoreInfo = value;
    }

    /**
     * Obtém o valor da propriedade tagList.
     * 
     * @return
     *     possible object is
     *     {@link SiteInfo.TAGList }
     *     
     */
    public SiteInfo.TAGList getTAGList() {
        return tagList;
    }

    /**
     * Define o valor da propriedade tagList.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteInfo.TAGList }
     *     
     */
    public void setTAGList(SiteInfo.TAGList value) {
        this.tagList = value;
    }

    /**
     * Obtém o valor da propriedade ratingInfoList.
     * 
     * @return
     *     possible object is
     *     {@link SiteInfo.RatingInfoList }
     *     
     */
    public SiteInfo.RatingInfoList getRatingInfoList() {
        return ratingInfoList;
    }

    /**
     * Define o valor da propriedade ratingInfoList.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteInfo.RatingInfoList }
     *     
     */
    public void setRatingInfoList(SiteInfo.RatingInfoList value) {
        this.ratingInfoList = value;
    }

    /**
     * Obtém o valor da propriedade releaseInfo.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseInfo }
     *     
     */
    public ReleaseInfo getReleaseInfo() {
        return releaseInfo;
    }

    /**
     * Define o valor da propriedade releaseInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseInfo }
     *     
     */
    public void setReleaseInfo(ReleaseInfo value) {
        this.releaseInfo = value;
    }

    /**
     * Obtém o valor da propriedade comercialStatus.
     * 
     */
    public boolean isComercialStatus() {
        return comercialStatus;
    }

    /**
     * Define o valor da propriedade comercialStatus.
     * 
     */
    public void setComercialStatus(boolean value) {
        this.comercialStatus = value;
    }

    /**
     * Obtém o valor da propriedade acessoryList.
     * 
     * @return
     *     possible object is
     *     {@link SiteInfo.AcessoryList }
     *     
     */
    public SiteInfo.AcessoryList getAcessoryList() {
        return acessoryList;
    }

    /**
     * Define o valor da propriedade acessoryList.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteInfo.AcessoryList }
     *     
     */
    public void setAcessoryList(SiteInfo.AcessoryList value) {
        this.acessoryList = value;
    }

    /**
     * Obtém o valor da propriedade crossSellingList.
     * 
     * @return
     *     possible object is
     *     {@link SiteInfo.CrossSellingList }
     *     
     */
    public SiteInfo.CrossSellingList getCrossSellingList() {
        return crossSellingList;
    }

    /**
     * Define o valor da propriedade crossSellingList.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteInfo.CrossSellingList }
     *     
     */
    public void setCrossSellingList(SiteInfo.CrossSellingList value) {
        this.crossSellingList = value;
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
     *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "itemId"
    })
    public static class AcessoryList {

        @XmlElement(required = true)
        protected List<String> itemId;

        /**
         * Gets the value of the itemId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getItemId() {
            if (itemId == null) {
                itemId = new ArrayList<String>();
            }
            return this.itemId;
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
     *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "itemId"
    })
    public static class CrossSellingList {

        @XmlElement(required = true)
        protected List<String> itemId;

        /**
         * Gets the value of the itemId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getItemId() {
            if (itemId == null) {
                itemId = new ArrayList<String>();
            }
            return this.itemId;
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
     *         &lt;element name="ratingInfo" type="{http://www.b2winc.com/item}ratingInfo" maxOccurs="unbounded"/>
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
        "ratingInfo"
    })
    public static class RatingInfoList {

        @XmlElement(required = true)
        protected List<RatingInfo> ratingInfo;

        /**
         * Gets the value of the ratingInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ratingInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRatingInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RatingInfo }
         * 
         * 
         */
        public List<RatingInfo> getRatingInfo() {
            if (ratingInfo == null) {
                ratingInfo = new ArrayList<RatingInfo>();
            }
            return this.ratingInfo;
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
     *         &lt;element name="TAG" type="{http://www.b2winc.com/item}TAG" maxOccurs="unbounded"/>
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
        "tag"
    })
    public static class TAGList {

        @XmlElement(name = "TAG", required = true)
        protected List<TAG> tag;

        /**
         * Gets the value of the tag property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tag property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTAG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TAG }
         * 
         * 
         */
        public List<TAG> getTAG() {
            if (tag == null) {
                tag = new ArrayList<TAG>();
            }
            return this.tag;
        }

    }

}
