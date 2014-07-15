
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
 *         &lt;element ref="{http://www.b2winc.com/tools/getartistinfo}getArtistInfoRequest"/>
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
    "getArtistInfoRequest"
})
@XmlRootElement(name = "getArtistInfo", namespace = "http://com/b2w/tools/ws")
public class GetArtistInfo {

    @XmlElement(namespace = "http://www.b2winc.com/tools/getartistinfo", required = true)
    protected GetArtistInfoRequest getArtistInfoRequest;

    /**
     * Obtém o valor da propriedade getArtistInfoRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetArtistInfoRequest }
     *     
     */
    public GetArtistInfoRequest getGetArtistInfoRequest() {
        return getArtistInfoRequest;
    }

    /**
     * Define o valor da propriedade getArtistInfoRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetArtistInfoRequest }
     *     
     */
    public void setGetArtistInfoRequest(GetArtistInfoRequest value) {
        this.getArtistInfoRequest = value;
    }

}
