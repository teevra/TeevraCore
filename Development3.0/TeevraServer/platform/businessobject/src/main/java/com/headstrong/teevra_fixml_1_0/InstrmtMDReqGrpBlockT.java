
package com.headstrong.teevra_fixml_1_0;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InstrmtMDReqGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrmtMDReqGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}InstrmtMDReqGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}InstrmtMDReqGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrmtMDReqGrp_Block_t", propOrder = {
    "instrmt",
    "undly",
    "leg"
})
public class InstrmtMDReqGrpBlockT {

    @XmlElement(name = "Instrmt", required = true)
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "Undly")
    protected UndInstrmtGrpBlockT undly;
    @XmlElement(name = "Leg")
    protected InstrmtLegGrpBlockT leg;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "Typ")
    protected BigInteger typ;
    @XmlAttribute(name = "SettlTyp")
    protected String settlTyp;
    @XmlAttribute(name = "SettlDt")
    protected XMLGregorianCalendar settlDt;
    @XmlAttribute(name = "Sz")
    protected BigDecimal sz;
    @XmlAttribute(name = "MDStrmID")
    protected String mdStrmID;

    /**
     * Gets the value of the instrmt property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentBlockT }
     *     
     */
    public InstrumentBlockT getInstrmt() {
        return instrmt;
    }

    /**
     * Sets the value of the instrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentBlockT }
     *     
     */
    public void setInstrmt(InstrumentBlockT value) {
        this.instrmt = value;
    }

    /**
     * Gets the value of the undly property.
     * 
     * @return
     *     possible object is
     *     {@link UndInstrmtGrpBlockT }
     *     
     */
    public UndInstrmtGrpBlockT getUndly() {
        return undly;
    }

    /**
     * Sets the value of the undly property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndInstrmtGrpBlockT }
     *     
     */
    public void setUndly(UndInstrmtGrpBlockT value) {
        this.undly = value;
    }

    /**
     * Gets the value of the leg property.
     * 
     * @return
     *     possible object is
     *     {@link InstrmtLegGrpBlockT }
     *     
     */
    public InstrmtLegGrpBlockT getLeg() {
        return leg;
    }

    /**
     * Sets the value of the leg property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrmtLegGrpBlockT }
     *     
     */
    public void setLeg(InstrmtLegGrpBlockT value) {
        this.leg = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
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
     * Gets the value of the settlTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlTyp() {
        return settlTyp;
    }

    /**
     * Sets the value of the settlTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlTyp(String value) {
        this.settlTyp = value;
    }

    /**
     * Gets the value of the settlDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettlDt() {
        return settlDt;
    }

    /**
     * Sets the value of the settlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettlDt(XMLGregorianCalendar value) {
        this.settlDt = value;
    }

    /**
     * Gets the value of the sz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSz() {
        return sz;
    }

    /**
     * Sets the value of the sz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSz(BigDecimal value) {
        this.sz = value;
    }

    /**
     * Gets the value of the mdStrmID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDStrmID() {
        return mdStrmID;
    }

    /**
     * Sets the value of the mdStrmID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDStrmID(String value) {
        this.mdStrmID = value;
    }

}