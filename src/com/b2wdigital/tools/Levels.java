
package com.b2wdigital.tools;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de levels complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade level1.
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
     * Define o valor da propriedade level1.
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
     * Obtém o valor da propriedade level2.
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
     * Define o valor da propriedade level2.
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
     * Obtém o valor da propriedade level3.
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
     * Define o valor da propriedade level3.
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
     * Obtém o valor da propriedade level4.
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
     * Define o valor da propriedade level4.
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
     * Obtém o valor da propriedade level5.
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
     * Define o valor da propriedade level5.
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
