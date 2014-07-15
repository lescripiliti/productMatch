
package com.b2wdigital.tools;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.b2winc.com/tools/getProductIds}getProductIdsResponse"/>
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
    "getProductIdsResponse"
})
@XmlRootElement(name = "getProductIdsResponse", namespace = "http://com/b2w/tools/ws")
public class GetProductIdsResponse {

    @XmlElement(namespace = "http://www.b2winc.com/tools/getProductIds", required = true)
    protected GetProductIdsResponse2 getProductIdsResponse;

    /**
     * Obtém o valor da propriedade getProductIdsResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetProductIdsResponse2 }
     *     
     */
    public GetProductIdsResponse2 getGetProductIdsResponse() {
        return getProductIdsResponse;
    }

    /**
     * Define o valor da propriedade getProductIdsResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetProductIdsResponse2 }
     *     
     */
    public void setGetProductIdsResponse(GetProductIdsResponse2 value) {
        this.getProductIdsResponse = value;
    }

}
