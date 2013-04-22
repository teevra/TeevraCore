//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.08 at 01:47:27 PM IST 
//


package org.fixprotocol.fixml_5_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * CpctyConfGrp is a component
 * 
 * <p>Java class for CpctyConfGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CpctyConfGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0}CpctyConfGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0}CpctyConfGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CpctyConfGrp_Block_t")
public class CpctyConfGrpBlockT {

    @XmlAttribute(name = "Cpcty", required = true)
    protected OrderCapacityEnumT cpcty;
    @XmlAttribute(name = "Rstctions")
    protected String rstctions;
    @XmlAttribute(name = "CpctyQty", required = true)
    protected BigDecimal cpctyQty;

    /**
     * Gets the value of the cpcty property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCapacityEnumT }
     *     
     */
    public OrderCapacityEnumT getCpcty() {
        return cpcty;
    }

    /**
     * Sets the value of the cpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCapacityEnumT }
     *     
     */
    public void setCpcty(OrderCapacityEnumT value) {
        this.cpcty = value;
    }

    /**
     * Gets the value of the rstctions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstctions() {
        return rstctions;
    }

    /**
     * Sets the value of the rstctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstctions(String value) {
        this.rstctions = value;
    }

    /**
     * Gets the value of the cpctyQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCpctyQty() {
        return cpctyQty;
    }

    /**
     * Sets the value of the cpctyQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCpctyQty(BigDecimal value) {
        this.cpctyQty = value;
    }

}
