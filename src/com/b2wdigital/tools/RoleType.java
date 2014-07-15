
package com.b2wdigital.tools;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de roleType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="roleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="participations">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="participation" type="{http://www.b2winc.com/ItemPerson}participationType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roleType", namespace = "http://www.b2winc.com/ItemPerson", propOrder = {
    "roleName",
    "participations"
})
public class RoleType {

    @XmlElement(required = true)
    protected String roleName;
    @XmlElement(required = true)
    protected RoleType.Participations participations;

    /**
     * Obtém o valor da propriedade roleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Define o valor da propriedade roleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleName(String value) {
        this.roleName = value;
    }

    /**
     * Obtém o valor da propriedade participations.
     * 
     * @return
     *     possible object is
     *     {@link RoleType.Participations }
     *     
     */
    public RoleType.Participations getParticipations() {
        return participations;
    }

    /**
     * Define o valor da propriedade participations.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleType.Participations }
     *     
     */
    public void setParticipations(RoleType.Participations value) {
        this.participations = value;
    }


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
     *         &lt;element name="participation" type="{http://www.b2winc.com/ItemPerson}participationType" maxOccurs="unbounded"/>
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
        "participation"
    })
    public static class Participations {

        @XmlElement(namespace = "http://www.b2winc.com/ItemPerson", required = true)
        protected List<ParticipationType> participation;

        /**
         * Gets the value of the participation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the participation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParticipation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParticipationType }
         * 
         * 
         */
        public List<ParticipationType> getParticipation() {
            if (participation == null) {
                participation = new ArrayList<ParticipationType>();
            }
            return this.participation;
        }

    }

}
