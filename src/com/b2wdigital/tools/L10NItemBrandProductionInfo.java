
package com.b2wdigital.tools;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de l10nItemBrandProductionInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="l10nItemBrandProductionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="l10nId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="brandId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.b2winc.com/item}brandId">
 *               &lt;enumeration value="01"/>
 *               &lt;enumeration value="02"/>
 *               &lt;enumeration value="03"/>
 *               &lt;enumeration value="04"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="propertyList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="property" type="{http://www.b2winc.com/item}propertyType" maxOccurs="unbounded"/>
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
@XmlType(name = "l10nItemBrandProductionInfo", propOrder = {
    "l10NId",
    "brandId",
    "propertyList"
})
public class L10NItemBrandProductionInfo {

    @XmlElement(name = "l10nId", required = true)
    protected String l10NId;
    @XmlElement(required = true)
    protected String brandId;
    @XmlElement(required = true)
    protected L10NItemBrandProductionInfo.PropertyList propertyList;

    /**
     * Obtém o valor da propriedade l10NId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL10NId() {
        return l10NId;
    }

    /**
     * Define o valor da propriedade l10NId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL10NId(String value) {
        this.l10NId = value;
    }

    /**
     * Obtém o valor da propriedade brandId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandId() {
        return brandId;
    }

    /**
     * Define o valor da propriedade brandId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandId(String value) {
        this.brandId = value;
    }

    /**
     * Obtém o valor da propriedade propertyList.
     * 
     * @return
     *     possible object is
     *     {@link L10NItemBrandProductionInfo.PropertyList }
     *     
     */
    public L10NItemBrandProductionInfo.PropertyList getPropertyList() {
        return propertyList;
    }

    /**
     * Define o valor da propriedade propertyList.
     * 
     * @param value
     *     allowed object is
     *     {@link L10NItemBrandProductionInfo.PropertyList }
     *     
     */
    public void setPropertyList(L10NItemBrandProductionInfo.PropertyList value) {
        this.propertyList = value;
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
     *         &lt;element name="property" type="{http://www.b2winc.com/item}propertyType" maxOccurs="unbounded"/>
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
        "property"
    })
    public static class PropertyList {

        @XmlElement(required = true)
        protected List<PropertyType> property;

        /**
         * Gets the value of the property property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the property property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PropertyType }
         * 
         * 
         */
        public List<PropertyType> getProperty() {
            if (property == null) {
                property = new ArrayList<PropertyType>();
            }
            return this.property;
        }

    }

}
