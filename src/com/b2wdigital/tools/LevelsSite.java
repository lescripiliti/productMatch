
package com.b2wdigital.tools;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de levelsSite complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="levelsSite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="level1" type="{http://www.b2winc.com/item}levelSite"/>
 *         &lt;element name="level2" type="{http://www.b2winc.com/item}levelSite" minOccurs="0"/>
 *         &lt;element name="level3" type="{http://www.b2winc.com/item}levelSite" minOccurs="0"/>
 *         &lt;element name="level4" type="{http://www.b2winc.com/item}levelSite" minOccurs="0"/>
 *         &lt;element name="level5" type="{http://www.b2winc.com/item}levelSite" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "levelsSite", propOrder = {
    "level1",
    "level2",
    "level3",
    "level4",
    "level5"
})
public class LevelsSite {

    @XmlElement(required = true)
    protected LevelSite level1;
    protected LevelSite level2;
    protected LevelSite level3;
    protected LevelSite level4;
    protected LevelSite level5;

    /**
     * Obtém o valor da propriedade level1.
     * 
     * @return
     *     possible object is
     *     {@link LevelSite }
     *     
     */
    public LevelSite getLevel1() {
        return level1;
    }

    /**
     * Define o valor da propriedade level1.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelSite }
     *     
     */
    public void setLevel1(LevelSite value) {
        this.level1 = value;
    }

    /**
     * Obtém o valor da propriedade level2.
     * 
     * @return
     *     possible object is
     *     {@link LevelSite }
     *     
     */
    public LevelSite getLevel2() {
        return level2;
    }

    /**
     * Define o valor da propriedade level2.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelSite }
     *     
     */
    public void setLevel2(LevelSite value) {
        this.level2 = value;
    }

    /**
     * Obtém o valor da propriedade level3.
     * 
     * @return
     *     possible object is
     *     {@link LevelSite }
     *     
     */
    public LevelSite getLevel3() {
        return level3;
    }

    /**
     * Define o valor da propriedade level3.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelSite }
     *     
     */
    public void setLevel3(LevelSite value) {
        this.level3 = value;
    }

    /**
     * Obtém o valor da propriedade level4.
     * 
     * @return
     *     possible object is
     *     {@link LevelSite }
     *     
     */
    public LevelSite getLevel4() {
        return level4;
    }

    /**
     * Define o valor da propriedade level4.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelSite }
     *     
     */
    public void setLevel4(LevelSite value) {
        this.level4 = value;
    }

    /**
     * Obtém o valor da propriedade level5.
     * 
     * @return
     *     possible object is
     *     {@link LevelSite }
     *     
     */
    public LevelSite getLevel5() {
        return level5;
    }

    /**
     * Define o valor da propriedade level5.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelSite }
     *     
     */
    public void setLevel5(LevelSite value) {
        this.level5 = value;
    }

}
