
package com.b2winc.query.item;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for merchandiseHierarchy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="merchandiseHierarchy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="main" type="{http://www.b2winc.com/item}levels"/>
 *         &lt;element name="secondaryList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="secondary" type="{http://www.b2winc.com/item}levels" maxOccurs="unbounded"/>
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
@XmlType(name = "merchandiseHierarchy", propOrder = {
    "main",
    "secondaryList"
})
public class MerchandiseHierarchy {

    @XmlElement(required = true)
    protected Levels main;
    protected MerchandiseHierarchy.SecondaryList secondaryList;

    /**
     * Gets the value of the main property.
     * 
     * @return
     *     possible object is
     *     {@link Levels }
     *     
     */
    public Levels getMain() {
        return main;
    }

    /**
     * Sets the value of the main property.
     * 
     * @param value
     *     allowed object is
     *     {@link Levels }
     *     
     */
    public void setMain(Levels value) {
        this.main = value;
    }

    /**
     * Gets the value of the secondaryList property.
     * 
     * @return
     *     possible object is
     *     {@link MerchandiseHierarchy.SecondaryList }
     *     
     */
    public MerchandiseHierarchy.SecondaryList getSecondaryList() {
        return secondaryList;
    }

    /**
     * Sets the value of the secondaryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchandiseHierarchy.SecondaryList }
     *     
     */
    public void setSecondaryList(MerchandiseHierarchy.SecondaryList value) {
        this.secondaryList = value;
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
     *         &lt;element name="secondary" type="{http://www.b2winc.com/item}levels" maxOccurs="unbounded"/>
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
        "secondary"
    })
    public static class SecondaryList {

        @XmlElement(required = true)
        protected List<Levels> secondary;

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
         * {@link Levels }
         * 
         * 
         */
        public List<Levels> getSecondary() {
            if (secondary == null) {
                secondary = new ArrayList<Levels>();
            }
            return this.secondary;
        }

    }

}
