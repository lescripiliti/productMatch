
package com.b2winc.query.item;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for levels complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="levels">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="level1" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="level2" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="level3" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="level4" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="level5" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "levels", propOrder = {
    "level1",
    "level2",
    "level3",
    "level4",
    "level5"
})
public class Levels {

    @XmlElement(required = true)
    protected BigInteger level1;
    @XmlElement(required = true)
    protected BigInteger level2;
    @XmlElement(required = true)
    protected BigInteger level3;
    @XmlElement(required = true)
    protected BigInteger level4;
    @XmlElement(required = true)
    protected BigInteger level5;

    /**
     * Gets the value of the level1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevel1() {
        return level1;
    }

    /**
     * Sets the value of the level1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevel1(BigInteger value) {
        this.level1 = value;
    }

    /**
     * Gets the value of the level2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevel2() {
        return level2;
    }

    /**
     * Sets the value of the level2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevel2(BigInteger value) {
        this.level2 = value;
    }

    /**
     * Gets the value of the level3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevel3() {
        return level3;
    }

    /**
     * Sets the value of the level3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevel3(BigInteger value) {
        this.level3 = value;
    }

    /**
     * Gets the value of the level4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevel4() {
        return level4;
    }

    /**
     * Sets the value of the level4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevel4(BigInteger value) {
        this.level4 = value;
    }

    /**
     * Gets the value of the level5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevel5() {
        return level5;
    }

    /**
     * Sets the value of the level5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevel5(BigInteger value) {
        this.level5 = value;
    }

}
