//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.19 at 08:20:01 PM CEST 
//


package com.xml_web_service.model;

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
 *         &lt;element name="accomodation" type="{http://com/xml_web_service/model}Accomodation"/>
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
    "accomodation"
})
@XmlRootElement(name = "SendAccRequest")
public class SendAccRequest {

    @XmlElement(required = true)
    protected Accomodation accomodation;

    /**
     * Gets the value of the accomodation property.
     * 
     * @return
     *     possible object is
     *     {@link Accomodation }
     *     
     */
    public Accomodation getAccomodation() {
        return accomodation;
    }

    /**
     * Sets the value of the accomodation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accomodation }
     *     
     */
    public void setAccomodation(Accomodation value) {
        this.accomodation = value;
    }

}
