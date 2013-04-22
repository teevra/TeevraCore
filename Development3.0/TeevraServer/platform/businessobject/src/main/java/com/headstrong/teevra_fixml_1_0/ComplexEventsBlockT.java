
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
 * <p>Java class for ComplexEvents_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexEvents_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}ComplexEventsElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}ComplexEventsAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexEvents_Block_t", propOrder = {
    "evntDts"
})
public class ComplexEventsBlockT {

    @XmlElement(name = "EvntDts")
    protected List<ComplexEventDatesBlockT> evntDts;
    @XmlAttribute(name = "Typ")
    protected BigInteger typ;
    @XmlAttribute(name = "OptPayAmt")
    protected BigDecimal optPayAmt;
    @XmlAttribute(name = "Px")
    protected BigDecimal px;
    @XmlAttribute(name = "PxBndryMeth")
    protected BigInteger pxBndryMeth;
    @XmlAttribute(name = "PxBndryPrcsn")
    protected BigDecimal pxBndryPrcsn;
    @XmlAttribute(name = "PxTmTyp")
    protected BigInteger pxTmTyp;
    @XmlAttribute(name = "Cond")
    protected BigInteger cond;

    /**
     * Gets the value of the evntDts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evntDts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvntDts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplexEventDatesBlockT }
     * 
     * 
     */
    public List<ComplexEventDatesBlockT> getEvntDts() {
        if (evntDts == null) {
            evntDts = new ArrayList<ComplexEventDatesBlockT>();
        }
        return this.evntDts;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTyp(BigInteger value) {
        this.typ = value;
    }

    /**
     * Gets the value of the optPayAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOptPayAmt() {
        return optPayAmt;
    }

    /**
     * Sets the value of the optPayAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOptPayAmt(BigDecimal value) {
        this.optPayAmt = value;
    }

    /**
     * Gets the value of the px property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPx() {
        return px;
    }

    /**
     * Sets the value of the px property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPx(BigDecimal value) {
        this.px = value;
    }

    /**
     * Gets the value of the pxBndryMeth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPxBndryMeth() {
        return pxBndryMeth;
    }

    /**
     * Sets the value of the pxBndryMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPxBndryMeth(BigInteger value) {
        this.pxBndryMeth = value;
    }

    /**
     * Gets the value of the pxBndryPrcsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPxBndryPrcsn() {
        return pxBndryPrcsn;
    }

    /**
     * Sets the value of the pxBndryPrcsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPxBndryPrcsn(BigDecimal value) {
        this.pxBndryPrcsn = value;
    }

    /**
     * Gets the value of the pxTmTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPxTmTyp() {
        return pxTmTyp;
    }

    /**
     * Sets the value of the pxTmTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPxTmTyp(BigInteger value) {
        this.pxTmTyp = value;
    }

    /**
     * Gets the value of the cond property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCond() {
        return cond;
    }

    /**
     * Sets the value of the cond property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCond(BigInteger value) {
        this.cond = value;
    }

}
