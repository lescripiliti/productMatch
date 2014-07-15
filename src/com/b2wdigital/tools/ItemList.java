
package com.b2wdigital.tools;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Lista de livros, cds ou dvds
 * 			
 * 
 * <p>Classe Java de ItemList complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ItemList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="type" type="{http://www.b2winc.com/ItemPerson}itemType"/>
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
@XmlType(name = "ItemList", namespace = "http://www.b2winc.com/ItemPerson", propOrder = {
    "item"
})
public class ItemList {

    @XmlElement(required = true)
    protected List<ItemList.Item> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemList.Item }
     * 
     * 
     */
    public List<ItemList.Item> getItem() {
        if (item == null) {
            item = new ArrayList<ItemList.Item>();
        }
        return this.item;
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
     *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="type" type="{http://www.b2winc.com/ItemPerson}itemType"/>
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
        "itemId",
        "type"
    })
    public static class Item {

        @XmlElement(namespace = "http://www.b2winc.com/ItemPerson")
        protected long itemId;
        @XmlElement(namespace = "http://www.b2winc.com/ItemPerson", required = true)
        protected ItemType type;

        /**
         * Obtém o valor da propriedade itemId.
         * 
         */
        public long getItemId() {
            return itemId;
        }

        /**
         * Define o valor da propriedade itemId.
         * 
         */
        public void setItemId(long value) {
            this.itemId = value;
        }

        /**
         * Obtém o valor da propriedade type.
         * 
         * @return
         *     possible object is
         *     {@link ItemType }
         *     
         */
        public ItemType getType() {
            return type;
        }

        /**
         * Define o valor da propriedade type.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemType }
         *     
         */
        public void setType(ItemType value) {
            this.type = value;
        }

    }

}
