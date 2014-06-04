
package com.b2winc.query.item;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sellingRankList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sellingRankList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sellingRank" type="{http://www.b2winc.com/item}sellingRank" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sellingRankList", propOrder = {
    "sellingRank"
})
public class SellingRankList {

    @XmlElement(required = true)
    protected List<SellingRank> sellingRank;

    /**
     * Gets the value of the sellingRank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellingRank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellingRank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SellingRank }
     * 
     * 
     */
    public List<SellingRank> getSellingRank() {
        if (sellingRank == null) {
            sellingRank = new ArrayList<SellingRank>();
        }
        return this.sellingRank;
    }

}
