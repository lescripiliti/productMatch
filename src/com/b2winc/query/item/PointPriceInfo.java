
package com.b2winc.query.item;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pointPriceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the ruleId property.
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
     * Sets the value of the ruleId property.
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
     * Gets the value of the ruleCreationUser property.
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
     * Sets the value of the ruleCreationUser property.
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
     * Gets the value of the ruleCreationDate property.
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
     * Sets the value of the ruleCreationDate property.
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
     * Gets the value of the ruleAppliedFor property.
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
     * Sets the value of the ruleAppliedFor property.
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
     * Gets the value of the pointPrice property.
     * 
     */
    public double getPointPrice() {
        return pointPrice;
    }

    /**
     * Sets the value of the pointPrice property.
     * 
     */
    public void setPointPrice(double value) {
        this.pointPrice = value;
    }

    /**
     * Gets the value of the pointPriceFormatted property.
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
     * Sets the value of the pointPriceFormatted property.
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
     * Gets the value of the conversionFactor property.
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
     * Sets the value of the conversionFactor property.
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
