
package com.b2winc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.b2winc.com/getItemPriceList}getItemPriceListResponse"/>
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
    "getItemPriceListResponse"
})
@XmlRootElement(name = "getItemPriceListResponse", namespace = "http://com/b2winc/product/pricing/webservice")
public class GetItemPriceListResponse {

    @XmlElement(required = true)
    protected GetItemPriceListResponse2 getItemPriceListResponse;

    /**
     * Gets the value of the getItemPriceListResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetItemPriceListResponse2 }
     *     
     */
    public GetItemPriceListResponse2 getGetItemPriceListResponse() {
        return getItemPriceListResponse;
    }

    /**
     * Sets the value of the getItemPriceListResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetItemPriceListResponse2 }
     *     
     */
    public void setGetItemPriceListResponse(GetItemPriceListResponse2 value) {
        this.getItemPriceListResponse = value;
    }

}
