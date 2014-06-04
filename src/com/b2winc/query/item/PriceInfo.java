
package com.b2winc.query.item;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for priceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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

    /**
     * Gets the value of the b2BContractId property.
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
     * Sets the value of the b2BContractId property.
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
     * Gets the value of the location property.
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
     * Sets the value of the location property.
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
     * Gets the value of the currency property.
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
     * Sets the value of the currency property.
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
     * Gets the value of the price property.
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
     * Sets the value of the price property.
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
     * Gets the value of the pointPrice property.
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
     * Sets the value of the pointPrice property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
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
         * Gets the value of the default property.
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
         * Sets the value of the default property.
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
         * Gets the value of the sale property.
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
         * Sets the value of the sale property.
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
         * Gets the value of the brandCard property.
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
         * Sets the value of the brandCard property.
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
         * Gets the value of the minimum property.
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
         * Sets the value of the minimum property.
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
         * Gets the value of the maximum property.
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
         * Sets the value of the maximum property.
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
         * Gets the value of the suggested property.
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
         * Sets the value of the suggested property.
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
