//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.08 at 01:47:27 PM IST 
//


package org.fixprotocol.fixml_5_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * RootSubParties is a component
 * 
 * <p>Java class for RootSubParties_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RootSubParties_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0}RootSubPartiesElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0}RootSubPartiesAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RootSubParties_Block_t")
public class RootSubPartiesBlockT {

    @XmlAttribute(name = "RtPtySubID")
    protected String rtPtySubID;
    @XmlAttribute(name = "RtPtySubIDTyp")
    protected Integer rtPtySubIDTyp;

    /**
     * Gets the value of the rtPtySubID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtPtySubID() {
        return rtPtySubID;
    }

    /**
     * Sets the value of the rtPtySubID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtPtySubID(String value) {
        this.rtPtySubID = value;
    }

    /**
     * Gets the value of the rtPtySubIDTyp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRtPtySubIDTyp() {
        return rtPtySubIDTyp;
    }

    /**
     * Sets the value of the rtPtySubIDTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRtPtySubIDTyp(Integer value) {
        this.rtPtySubIDTyp = value;
    }

}