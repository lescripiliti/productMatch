
package com.b2winc.query.item;

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
 *         &lt;element ref="{http://www.b2winc.com/getBasicItemInfo}getBasicItemInfoResponse"/>
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
    "getBasicItemInfoResponse"
})
@XmlRootElement(name = "getBasicItemInfoResponse", namespace = "http://br/com/b2winc/service")
public class GetBasicItemInfoResponse {

    @XmlElement(namespace = "http://www.b2winc.com/getBasicItemInfo", required = true)
    protected GetBasicItemInfoResponse2 getBasicItemInfoResponse;

    /**
     * Gets the value of the getBasicItemInfoResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetBasicItemInfoResponse2 }
     *     
     */
    public GetBasicItemInfoResponse2 getGetBasicItemInfoResponse() {
        return getBasicItemInfoResponse;
    }

    /**
     * Sets the value of the getBasicItemInfoResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBasicItemInfoResponse2 }
     *     
     */
    public void setGetBasicItemInfoResponse(GetBasicItemInfoResponse2 value) {
        this.getBasicItemInfoResponse = value;
    }

}
