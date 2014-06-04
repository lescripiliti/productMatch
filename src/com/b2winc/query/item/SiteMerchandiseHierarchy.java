
package com.b2winc.query.item;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteMerchandiseHierarchy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteMerchandiseHierarchy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="main" type="{http://www.b2winc.com/item}levelsSite"/>
 *         &lt;element name="secondary" type="{http://www.b2winc.com/item}levelsSite" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteMerchandiseHierarchy", propOrder = {
    "main",
    "secondary"
})
public class SiteMerchandiseHierarchy {

    @XmlElement(required = true)
    protected LevelsSite main;
    protected List<LevelsSite> secondary;

    /**
     * Gets the value of the main property.
     * 
     * @return
     *     possible object is
     *     {@link LevelsSite }
     *     
     */
    public LevelsSite getMain() {
        return main;
    }

    /**
     * Sets the value of the main property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelsSite }
     *     
     */
    public void setMain(LevelsSite value) {
        this.main = value;
    }

    /**
     * Gets the value of the secondary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LevelsSite }
     * 
     * 
     */
    public List<LevelsSite> getSecondary() {
        if (secondary == null) {
            secondary = new ArrayList<LevelsSite>();
        }
        return this.secondary;
    }

}
