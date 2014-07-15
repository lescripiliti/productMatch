
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
 *         &lt;element ref="{http://www.b2winc.com/tools/getartistinfo}getArtistInfoResponse"/>
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
    "getArtistInfoResponse"
})
@XmlRootElement(name = "getArtistInfoResponse", namespace = "http://com/b2w/tools/ws")
public class GetArtistInfoResponse {

    @XmlElement(namespace = "http://www.b2winc.com/tools/getartistinfo", required = true)
    protected GetArtistInfoResponse2 getArtistInfoResponse;

    /**
     * Obtém o valor da propriedade getArtistInfoResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetArtistInfoResponse2 }
     *     
     */
    public GetArtistInfoResponse2 getGetArtistInfoResponse() {
        return getArtistInfoResponse;
    }

    /**
     * Define o valor da propriedade getArtistInfoResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetArtistInfoResponse2 }
     *     
     */
    public void setGetArtistInfoResponse(GetArtistInfoResponse2 value) {
        this.getArtistInfoResponse = value;
    }

}
