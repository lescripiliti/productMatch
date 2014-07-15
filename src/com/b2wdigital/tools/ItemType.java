
package com.b2wdigital.tools;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de itemType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="itemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CD"/>
 *     &lt;enumeration value="DVD"/>
 *     &lt;enumeration value="BOOK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "itemType", namespace = "http://www.b2winc.com/ItemPerson")
@XmlEnum
public enum ItemType {

    CD,
    DVD,
    BOOK;

    public String value() {
        return name();
    }

    public static ItemType fromValue(String v) {
        return valueOf(v);
    }

}
