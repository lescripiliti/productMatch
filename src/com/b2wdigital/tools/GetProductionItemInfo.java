
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
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "itemId"
})
@XmlRootElement(name = "getProductionItemInfo", namespace = "http://com/b2w/tools/ws")
public class GetProductionItemInfo {

    @XmlElement(namespace = "http://com/b2w/tools/ws")
    protected long itemId;

    /**
     * Obtém o valor da propriedade itemId.
     * 
     */
    public long getItemId() {
        return itemId;
    }

    /**
     * Define o valor da propriedade itemId.
     * 
     */
    public void setItemId(long value) {
        this.itemId = value;
    }

}
