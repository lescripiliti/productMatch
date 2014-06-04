
package com.b2winc.query.item;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for levelsSite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the level1 property.
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
     * Sets the value of the level1 property.
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
     * Gets the value of the level2 property.
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
     * Sets the value of the level2 property.
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
     * Gets the value of the level3 property.
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
     * Sets the value of the level3 property.
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
     * Gets the value of the level4 property.
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
     * Sets the value of the level4 property.
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
     * Gets the value of the level5 property.
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
     * Sets the value of the level5 property.
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
