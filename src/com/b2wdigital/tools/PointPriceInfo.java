
package com.b2wdigital.tools;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de pointPriceInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pointPriceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ruleId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="ruleCreationUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ruleCreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ruleAppliedFor">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="01"/>
 *               &lt;enumeration value="02"/>
 *               &lt;enumeration value="03"/>
 *               &lt;enumeration value="04"/>
 *               &lt;enumeration value="05"/>
 *               &lt;enumeration value="06"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pointPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pointPriceFormatted" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="conversionFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pointPriceInfo", propOrder = {
    "ruleId",
    "ruleCreationUser",
    "ruleCreationDate",
    "ruleAppliedFor",
    "pointPrice",
    "pointPriceFormatted",
    "conversionFactor"
})
public class PointPriceInfo {

    @XmlElement(required = true)
    protected BigInteger ruleId;
    @XmlElement(required = true)
    protected String ruleCreationUser;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ruleCreationDate;
    @XmlElement(required = true)
    protected String ruleAppliedFor;
    protected double pointPrice;
    @XmlElement(required = true)
    protected String pointPriceFormatted;
    protected Double conversionFactor;

    /**
     * Obtém o valor da propriedade ruleId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRuleId() {
        return ruleId;
    }

    /**
     * Define o valor da propriedade ruleId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRuleId(BigInteger value) {
        this.ruleId = value;
    }

    /**
     * Obtém o valor da propriedade ruleCreationUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleCreationUser() {
        return ruleCreationUser;
    }

    /**
     * Define o valor da propriedade ruleCreationUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleCreationUser(String value) {
        this.ruleCreationUser = value;
    }

    /**
     * Obtém o valor da propriedade ruleCreationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRuleCreationDate() {
        return ruleCreationDate;
    }

    /**
     * Define o valor da propriedade ruleCreationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRuleCreationDate(XMLGregorianCalendar value) {
        this.ruleCreationDate = value;
    }

    /**
     * Obtém o valor da propriedade ruleAppliedFor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleAppliedFor() {
        return ruleAppliedFor;
    }

    /**
     * Define o valor da propriedade ruleAppliedFor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleAppliedFor(String value) {
        this.ruleAppliedFor = value;
    }

    /**
     * Obtém o valor da propriedade pointPrice.
     * 
     */
    public double getPointPrice() {
        return pointPrice;
    }

    /**
     * Define o valor da propriedade pointPrice.
     * 
     */
    public void setPointPrice(double value) {
        this.pointPrice = value;
    }

    /**
     * Obtém o valor da propriedade pointPriceFormatted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointPriceFormatted() {
        return pointPriceFormatted;
    }

    /**
     * Define o valor da propriedade pointPriceFormatted.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointPriceFormatted(String value) {
        this.pointPriceFormatted = value;
    }

    /**
     * Obtém o valor da propriedade conversionFactor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConversionFactor() {
        return conversionFactor;
    }

    /**
     * Define o valor da propriedade conversionFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConversionFactor(Double value) {
        this.conversionFactor = value;
    }

}
