
package com.b2wdigital.tools;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getArtistInfoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getArtistInfoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="artistId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getArtistInfoRequest", namespace = "http://www.b2winc.com/tools/getartistinfo", propOrder = {
    "artistId"
})
public class GetArtistInfoRequest {

    @XmlElement(namespace = "")
    protected Long artistId;

    /**
     * Obtém o valor da propriedade artistId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getArtistId() {
        return artistId;
    }

    /**
     * Define o valor da propriedade artistId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setArtistId(Long value) {
        this.artistId = value;
    }

}
