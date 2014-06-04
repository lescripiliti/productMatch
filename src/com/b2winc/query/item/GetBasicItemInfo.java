
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
 *         &lt;element ref="{http://www.b2winc.com/getBasicItemInfo}getBasicItemInfoRequest"/>
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
    "getBasicItemInfoRequest"
})
@XmlRootElement(name = "getBasicItemInfo", namespace = "http://br/com/b2winc/service")
public class GetBasicItemInfo {

    @XmlElement(namespace = "http://www.b2winc.com/getBasicItemInfo", required = true)
    protected GetBasicItemInfoRequest getBasicItemInfoRequest;

    /**
     * Gets the value of the getBasicItemInfoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetBasicItemInfoRequest }
     *     
     */
    public GetBasicItemInfoRequest getGetBasicItemInfoRequest() {
        return getBasicItemInfoRequest;
    }

    /**
     * Sets the value of the getBasicItemInfoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBasicItemInfoRequest }
     *     
     */
    public void setGetBasicItemInfoRequest(GetBasicItemInfoRequest value) {
        this.getBasicItemInfoRequest = value;
    }

}
