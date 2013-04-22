
package com.headstrong.teevra_fixml_1_0;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FillsGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FillsGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}FillsGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}FillsGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FillsGrp_Block_t", propOrder = {
    "pty"
})
public class FillsGrpBlockT {

    @XmlElement(name = "Pty")
    protected List<NestedParties4BlockT> pty;
    @XmlAttribute(name = "FillExecID")
    protected String fillExecID;
    @XmlAttribute(name = "FillPx")
    protected BigDecimal fillPx;
    @XmlAttribute(name = "FillQty")
    protected BigDecimal fillQty;
    @XmlAttribute(name = "LqdtyInd")
    protected BigInteger lqdtyInd;

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
     * {@link NestedParties4BlockT }
     * 
     * 
     */
    public List<NestedParties4BlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<NestedParties4BlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the fillExecID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillExecID() {
        return fillExecID;
    }

    /**
     * Sets the value of the fillExecID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillExecID(String value) {
        this.fillExecID = value;
    }

    /**
     * Gets the value of the fillPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFillPx() {
        return fillPx;
    }

    /**
     * Sets the value of the fillPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFillPx(BigDecimal value) {
        this.fillPx = value;
    }

    /**
     * Gets the value of the fillQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFillQty() {
        return fillQty;
    }

    /**
     * Sets the value of the fillQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFillQty(BigDecimal value) {
        this.fillQty = value;
    }

    /**
     * Gets the value of the lqdtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLqdtyInd() {
        return lqdtyInd;
    }

    /**
     * Sets the value of the lqdtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLqdtyInd(BigInteger value) {
        this.lqdtyInd = value;
    }

}
