//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.03 at 03:05:55 PM EST 
//


package com.tfp.properties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TFPTransactionConfigType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TFPTransactionConfigType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Delivery" type="{}MessageDeliveryConfigType"/>
 *         &lt;element name="TDSPersistence" type="{}TDSPersistenceConfigType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="transactionType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TFPTransactionConfigType", propOrder = {
    "delivery",
    "tdsPersistence"
})
@XmlSeeAlso({
    com.tfp.properties.TFPBatchConfigType.Transaction.class
})
public class TFPTransactionConfigType {

    @XmlElement(name = "Delivery", required = true)
    protected MessageDeliveryConfigType delivery;
    @XmlElement(name = "TDSPersistence")
    protected TDSPersistenceConfigType tdsPersistence;
    @XmlAttribute(required = true)
    protected String transactionType;

    /**
     * Gets the value of the delivery property.
     * 
     * @return
     *     possible object is
     *     {@link MessageDeliveryConfigType }
     *     
     */
    public MessageDeliveryConfigType getDelivery() {
        return delivery;
    }

    /**
     * Sets the value of the delivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageDeliveryConfigType }
     *     
     */
    public void setDelivery(MessageDeliveryConfigType value) {
        this.delivery = value;
    }

    /**
     * Gets the value of the tdsPersistence property.
     * 
     * @return
     *     possible object is
     *     {@link TDSPersistenceConfigType }
     *     
     */
    public TDSPersistenceConfigType getTDSPersistence() {
        return tdsPersistence;
    }

    /**
     * Sets the value of the tdsPersistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDSPersistenceConfigType }
     *     
     */
    public void setTDSPersistence(TDSPersistenceConfigType value) {
        this.tdsPersistence = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

}
