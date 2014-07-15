
package com.b2wdigital.tools;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dimensionInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dimensionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="fatorCubagem" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dimensionInfo", propOrder = {
    "width",
    "height",
    "length",
    "weight",
    "fatorCubagem"
})
public class DimensionInfo {

    @XmlElement(required = true)
    protected BigDecimal width;
    @XmlElement(required = true)
    protected BigDecimal height;
    @XmlElement(required = true)
    protected BigDecimal length;
    @XmlElement(required = true)
    protected BigDecimal weight;
    @XmlElement(required = true)
    protected BigDecimal fatorCubagem;

    /**
     * Obtém o valor da propriedade width.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Define o valor da propriedade width.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidth(BigDecimal value) {
        this.width = value;
    }

    /**
     * Obtém o valor da propriedade height.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * Define o valor da propriedade height.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeight(BigDecimal value) {
        this.height = value;
    }

    /**
     * Obtém o valor da propriedade length.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Define o valor da propriedade length.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLength(BigDecimal value) {
        this.length = value;
    }

    /**
     * Obtém o valor da propriedade weight.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Define o valor da propriedade weight.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Obtém o valor da propriedade fatorCubagem.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFatorCubagem() {
        return fatorCubagem;
    }

    /**
     * Define o valor da propriedade fatorCubagem.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFatorCubagem(BigDecimal value) {
        this.fatorCubagem = value;
    }

}
