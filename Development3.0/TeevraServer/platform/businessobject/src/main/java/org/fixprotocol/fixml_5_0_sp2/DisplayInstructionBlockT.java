
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisplayInstruction_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayInstruction_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DisplayInstructionElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DisplayInstructionAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayInstruction_Block_t")
public class DisplayInstructionBlockT {

    @XmlAttribute(name = "DisplayQty")
    protected BigDecimal displayQty;
    @XmlAttribute(name = "SecDspQty")
    protected BigDecimal secDspQty;
    @XmlAttribute(name = "DspWhn")
    protected String dspWhn;
    @XmlAttribute(name = "DspMthd")
    protected String dspMthd;
    @XmlAttribute(name = "DsplLwQty")
    protected BigDecimal dsplLwQty;
    @XmlAttribute(name = "DisplayHighQty")
    protected BigDecimal displayHighQty;
    @XmlAttribute(name = "DspMinIncr")
    protected BigDecimal dspMinIncr;
    @XmlAttribute(name = "RfrshQty")
    protected BigDecimal rfrshQty;

    /**
     * Gets the value of the displayQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisplayQty() {
        return displayQty;
    }

    /**
     * Sets the value of the displayQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisplayQty(BigDecimal value) {
        this.displayQty = value;
    }

    /**
     * Gets the value of the secDspQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSecDspQty() {
        return secDspQty;
    }

    /**
     * Sets the value of the secDspQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSecDspQty(BigDecimal value) {
        this.secDspQty = value;
    }

    /**
     * Gets the value of the dspWhn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDspWhn() {
        return dspWhn;
    }

    /**
     * Sets the value of the dspWhn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDspWhn(String value) {
        this.dspWhn = value;
    }

    /**
     * Gets the value of the dspMthd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDspMthd() {
        return dspMthd;
    }

    /**
     * Sets the value of the dspMthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDspMthd(String value) {
        this.dspMthd = value;
    }

    /**
     * Gets the value of the dsplLwQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDsplLwQty() {
        return dsplLwQty;
    }

    /**
     * Sets the value of the dsplLwQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDsplLwQty(BigDecimal value) {
        this.dsplLwQty = value;
    }

    /**
     * Gets the value of the displayHighQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisplayHighQty() {
        return displayHighQty;
    }

    /**
     * Sets the value of the displayHighQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisplayHighQty(BigDecimal value) {
        this.displayHighQty = value;
    }

    /**
     * Gets the value of the dspMinIncr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDspMinIncr() {
        return dspMinIncr;
    }

    /**
     * Sets the value of the dspMinIncr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDspMinIncr(BigDecimal value) {
        this.dspMinIncr = value;
    }

    /**
     * Gets the value of the rfrshQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRfrshQty() {
        return rfrshQty;
    }

    /**
     * Sets the value of the rfrshQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRfrshQty(BigDecimal value) {
        this.rfrshQty = value;
    }

}
