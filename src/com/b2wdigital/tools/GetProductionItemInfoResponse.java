
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
 *         &lt;element ref="{http://www.b2winc.com/tools/getproductionitemInfo}getProductionItemInfoResponse"/>
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
    "getProductionItemInfoResponse"
})
@XmlRootElement(name = "getProductionItemInfoResponse", namespace = "http://com/b2w/tools/ws")
public class GetProductionItemInfoResponse {

    @XmlElement(namespace = "http://www.b2winc.com/tools/getproductionitemInfo", required = true)
    protected GetProductionItemInfoResponse2 getProductionItemInfoResponse;

    /**
     * Obtém o valor da propriedade getProductionItemInfoResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetProductionItemInfoResponse2 }
     *     
     */
    public GetProductionItemInfoResponse2 getGetProductionItemInfoResponse() {
        return getProductionItemInfoResponse;
    }

    /**
     * Define o valor da propriedade getProductionItemInfoResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetProductionItemInfoResponse2 }
     *     
     */
    public void setGetProductionItemInfoResponse(GetProductionItemInfoResponse2 value) {
        this.getProductionItemInfoResponse = value;
    }

}
