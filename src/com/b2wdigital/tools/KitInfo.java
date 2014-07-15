
package com.b2wdigital.tools;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de kitInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
         * Obtém o valor da propriedade quantity.
         * 
         */
        public long getQuantity() {
            return quantity;
        }

        /**
         * Define o valor da propriedade quantity.
         * 
         */
        public void setQuantity(long value) {
            this.quantity = value;
        }

        /**
         * Obtém o valor da propriedade percent.
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
         * Define o valor da propriedade percent.
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
         * Obtém o valor da propriedade skuReference.
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
         * Define o valor da propriedade skuReference.
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
