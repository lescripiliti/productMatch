
package com.b2wdigital.tools;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de priceInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="priceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brandId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.b2winc.com/item}brandId">
 *               &lt;enumeration value="01"/>
 *               &lt;enumeration value="02"/>
 *               &lt;enumeration value="03"/>
 *               &lt;enumeration value="04"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="b2bContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="default" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="sale" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="brandCard" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="suggested" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pointPrice" type="{http://www.b2winc.com/item}pointPriceInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceInfo", propOrder = {
    "brandId",
    "b2BContractId",
    "location",
    "currency",
    "price",
    "pointPrice"
})
public class PriceInfo {

    @XmlElement(required = true)
    protected String brandId;
    @XmlElement(name = "b2bContractId")
    protected String b2BContractId;
    protected String location;
    protected String currency;
    @XmlElement(required = true)
    protected PriceInfo.Price price;
    @XmlElement(required = true)
    protected PointPriceInfo pointPrice;

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
     * Obtém o valor da propriedade b2BContractId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getB2BContractId() {
        return b2BContractId;
    }

    /**
     * Define o valor da propriedade b2BContractId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setB2BContractId(String value) {
        this.b2BContractId = value;
    }

    /**
     * Obtém o valor da propriedade location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Define o valor da propriedade location.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Obtém o valor da propriedade currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Define o valor da propriedade currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Obtém o valor da propriedade price.
     * 
     * @return
     *     possible object is
     *     {@link PriceInfo.Price }
     *     
     */
    public PriceInfo.Price getPrice() {
        return price;
    }

    /**
     * Define o valor da propriedade price.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInfo.Price }
     *     
     */
    public void setPrice(PriceInfo.Price value) {
        this.price = value;
    }

    /**
     * Obtém o valor da propriedade pointPrice.
     * 
     * @return
     *     possible object is
     *     {@link PointPriceInfo }
     *     
     */
    public PointPriceInfo getPointPrice() {
        return pointPrice;
    }

    /**
     * Define o valor da propriedade pointPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPriceInfo }
     *     
     */
    public void setPointPrice(PointPriceInfo value) {
        this.pointPrice = value;
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
     *         &lt;element name="default" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="sale" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="brandCard" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="suggested" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "_default",
        "sale",
        "brandCard",
        "minimum",
        "maximum",
        "suggested"
    })
    public static class Price {

        @XmlElement(name = "default", required = true)
        protected BigDecimal _default;
        @XmlElement(required = true)
        protected BigDecimal sale;
        protected BigDecimal brandCard;
        protected BigDecimal minimum;
        protected BigDecimal maximum;
        protected BigDecimal suggested;

        /**
         * Obtém o valor da propriedade default.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDefault() {
            return _default;
        }

        /**
         * Define o valor da propriedade default.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDefault(BigDecimal value) {
            this._default = value;
        }

        /**
         * Obtém o valor da propriedade sale.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSale() {
            return sale;
        }

        /**
         * Define o valor da propriedade sale.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSale(BigDecimal value) {
            this.sale = value;
        }

        /**
         * Obtém o valor da propriedade brandCard.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBrandCard() {
            return brandCard;
        }

        /**
         * Define o valor da propriedade brandCard.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBrandCard(BigDecimal value) {
            this.brandCard = value;
        }

        /**
         * Obtém o valor da propriedade minimum.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMinimum() {
            return minimum;
        }

        /**
         * Define o valor da propriedade minimum.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMinimum(BigDecimal value) {
            this.minimum = value;
        }

        /**
         * Obtém o valor da propriedade maximum.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaximum() {
            return maximum;
        }

        /**
         * Define o valor da propriedade maximum.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaximum(BigDecimal value) {
            this.maximum = value;
        }

        /**
         * Obtém o valor da propriedade suggested.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSuggested() {
            return suggested;
        }

        /**
         * Define o valor da propriedade suggested.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSuggested(BigDecimal value) {
            this.suggested = value;
        }

    }

}
