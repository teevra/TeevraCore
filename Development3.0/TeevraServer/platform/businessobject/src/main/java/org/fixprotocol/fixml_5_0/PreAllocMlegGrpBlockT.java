//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.08 at 01:47:27 PM IST 
//


package org.fixprotocol.fixml_5_0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * PreAllocMlegGrp is a component
 * 
 * <p>Java class for PreAllocMlegGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreAllocMlegGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0}PreAllocMlegGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0}PreAllocMlegGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreAllocMlegGrp_Block_t", propOrder = {
    "pty"
})
public class PreAllocMlegGrpBlockT {

    @XmlElement(name = "Pty")
    protected List<NestedParties3BlockT> pty;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "ActIDSrc")
    protected Integer actIDSrc;
    @XmlAttribute(name = "AllocSettlCcy")
    protected String allocSettlCcy;
    @XmlAttribute(name = "IndAllocID")
    protected String indAllocID;
    @XmlAttribute(name = "Qty")
    protected BigDecimal qty;

    /**
     * Gets the value of the pty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NestedParties3BlockT }
     * 
     * 
     */
    public List<NestedParties3BlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<NestedParties3BlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcct(String value) {
        this.acct = value;
    }

    /**
     * Gets the value of the actIDSrc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActIDSrc() {
        return actIDSrc;
    }

    /**
     * Sets the value of the actIDSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActIDSrc(Integer value) {
        this.actIDSrc = value;
    }

    /**
     * Gets the value of the allocSettlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocSettlCcy() {
        return allocSettlCcy;
    }

    /**
     * Sets the value of the allocSettlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocSettlCcy(String value) {
        this.allocSettlCcy = value;
    }

    /**
     * Gets the value of the indAllocID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndAllocID() {
        return indAllocID;
    }

    /**
     * Sets the value of the indAllocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndAllocID(String value) {
        this.indAllocID = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

}