
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
 *         &lt;element ref="{http://www.b2winc.com/tools/getProductIds}getProductIdsRequest"/>
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
    "getProductIdsRequest"
})
@XmlRootElement(name = "getProductIds", namespace = "http://com/b2w/tools/ws")
public class GetProductIds {

    @XmlElement(namespace = "http://www.b2winc.com/tools/getProductIds", required = true)
    protected GetProductIdsRequest getProductIdsRequest;

    /**
     * Obtém o valor da propriedade getProductIdsRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetProductIdsRequest }
     *     
     */
    public GetProductIdsRequest getGetProductIdsRequest() {
        return getProductIdsRequest;
    }

    /**
     * Define o valor da propriedade getProductIdsRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetProductIdsRequest }
     *     
     */
    public void setGetProductIdsRequest(GetProductIdsRequest value) {
        this.getProductIdsRequest = value;
    }

}
