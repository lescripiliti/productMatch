
package com.b2winc.query.item;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UDA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UDA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UDA", propOrder = {
    "idAndTypeAndValue"
})
public class UDA {

    @XmlElementRefs({
        @XmlElementRef(name = "type", namespace = "http://www.b2winc.com/item", type = JAXBElement.class),
        @XmlElementRef(name = "value", namespace = "http://www.b2winc.com/item", type = JAXBElement.class),
        @XmlElementRef(name = "id", namespace = "http://www.b2winc.com/item", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends Serializable>> idAndTypeAndValue;

    /**
     * Gets the value of the idAndTypeAndValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idAndTypeAndValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdAndTypeAndValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getIdAndTypeAndValue() {
        if (idAndTypeAndValue == null) {
            idAndTypeAndValue = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.idAndTypeAndValue;
    }

}
