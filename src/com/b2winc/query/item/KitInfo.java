
package com.b2winc.query.item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kitInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kitInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="skuKit" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="skuId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="skuReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "kitInfo", propOrder = {
    "skuKit"
})
public class KitInfo {

    @XmlElement(required = true)
    protected List<KitInfo.SkuKit> skuKit;

    /**
     * Gets the value of the skuKit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skuKit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkuKit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KitInfo.SkuKit }
     * 
     * 
     */
    public List<KitInfo.SkuKit> getSkuKit() {
        if (skuKit == null) {
            skuKit = new ArrayList<KitInfo.SkuKit>();
        }
        return this.skuKit;
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
     *         &lt;element name="skuId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="skuReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "skuId",
        "quantity",
        "percent",
        "skuReference"
    })
    public static class SkuKit {

        @XmlElement(required = true)
        protected String skuId;
        protected long quantity;
        @XmlElement(required = true)
        protected BigDecimal percent;
        protected String skuReference;

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
         * Gets the value of the quantity property.
         * 
         */
        public long getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         */
        public void setQuantity(long value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the percent property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercent() {
            return percent;
        }

        /**
         * Sets the value of the percent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercent(BigDecimal value) {
            this.percent = value;
        }

        /**
         * Gets the value of the skuReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSkuReference() {
            return skuReference;
        }

        /**
         * Sets the value of the skuReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSkuReference(String value) {
            this.skuReference = value;
        }

    }

}
