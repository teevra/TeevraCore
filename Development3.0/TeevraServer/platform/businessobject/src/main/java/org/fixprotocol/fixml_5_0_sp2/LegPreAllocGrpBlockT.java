
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegPreAllocGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegPreAllocGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegPreAllocGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegPreAllocGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegPreAllocGrp_Block_t", propOrder = {
    "pty"
})
public class LegPreAllocGrpBlockT {

    @XmlElement(name = "Pty")
    protected List<NestedParties2BlockT> pty;
    @XmlAttribute(name = "AllocAcct")
    protected String allocAcct;
    @XmlAttribute(name = "IndAllocID")
    protected String indAllocID;
    @XmlAttribute(name = "AllocQty")
    protected BigDecimal allocQty;
    @XmlAttribute(name = "AllocAcctIDSrc")
    protected String allocAcctIDSrc;
    @XmlAttribute(name = "AllocSettlCcy")
    protected String allocSettlCcy;

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
     * {@link NestedParties2BlockT }
     * 
     * 
     */
    public List<NestedParties2BlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<NestedParties2BlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the allocAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocAcct() {
        return allocAcct;
    }

    /**
     * Sets the value of the allocAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocAcct(String value) {
        this.allocAcct = value;
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
     * Gets the value of the allocQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAllocQty() {
        return allocQty;
    }

    /**
     * Sets the value of the allocQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAllocQty(BigDecimal value) {
        this.allocQty = value;
    }

    /**
     * Gets the value of the allocAcctIDSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocAcctIDSrc() {
        return allocAcctIDSrc;
    }

    /**
     * Sets the value of the allocAcctIDSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocAcctIDSrc(String value) {
        this.allocAcctIDSrc = value;
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

}