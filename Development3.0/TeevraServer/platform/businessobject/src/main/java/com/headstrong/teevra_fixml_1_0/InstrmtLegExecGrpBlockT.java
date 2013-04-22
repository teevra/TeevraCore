
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InstrmtLegExecGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrmtLegExecGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}InstrmtLegExecGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}InstrmtLegExecGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrmtLegExecGrp_Block_t", propOrder = {
    "leg",
    "stip",
    "preAll",
    "pty"
})
public class InstrmtLegExecGrpBlockT {

    @XmlElement(name = "Leg")
    protected InstrumentLegBlockT leg;
    @XmlElement(name = "Stip")
    protected List<LegStipulationsBlockT> stip;
    @XmlElement(name = "PreAll")
    protected List<LegPreAllocGrpBlockT> preAll;
    @XmlElement(name = "Pty")
    protected List<NestedParties3BlockT> pty;
    @XmlAttribute(name = "Qty")
    protected BigDecimal qty;
    @XmlAttribute(name = "OrdQty")
    protected BigDecimal ordQty;
    @XmlAttribute(name = "SwapTyp")
    protected BigInteger swapTyp;
    @XmlAttribute(name = "LegAllocID")
    protected String legAllocID;
    @XmlAttribute(name = "PosEfct")
    protected PositionEffectEnumT posEfct;
    @XmlAttribute(name = "Cover")
    protected BigInteger cover;
    @XmlAttribute(name = "RefID")
    protected String refID;
    @XmlAttribute(name = "SettlTyp")
    protected String settlTyp;
    @XmlAttribute(name = "SettlDt")
    protected XMLGregorianCalendar settlDt;
    @XmlAttribute(name = "LastPx")
    protected BigDecimal lastPx;
    @XmlAttribute(name = "SettlCcy")
    protected String settlCcy;
    @XmlAttribute(name = "LegLastFwdPnts")
    protected BigDecimal legLastFwdPnts;
    @XmlAttribute(name = "LegCalcCcyLastQty")
    protected BigDecimal legCalcCcyLastQty;
    @XmlAttribute(name = "LegGrossTrdAmt")
    protected BigDecimal legGrossTrdAmt;
    @XmlAttribute(name = "LegVolatility")
    protected BigDecimal legVolatility;
    @XmlAttribute(name = "LegDividendYield")
    protected BigDecimal legDividendYield;
    @XmlAttribute(name = "LegCurrencyRatio")
    protected BigDecimal legCurrencyRatio;
    @XmlAttribute(name = "LegExecInst")
    protected String legExecInst;
    @XmlAttribute(name = "LastQty")
    protected BigDecimal lastQty;

    /**
     * Gets the value of the leg property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentLegBlockT }
     *     
     */
    public InstrumentLegBlockT getLeg() {
        return leg;
    }

    /**
     * Sets the value of the leg property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentLegBlockT }
     *     
     */
    public void setLeg(InstrumentLegBlockT value) {
        this.leg = value;
    }

    /**
     * Gets the value of the stip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegStipulationsBlockT }
     * 
     * 
     */
    public List<LegStipulationsBlockT> getStip() {
        if (stip == null) {
            stip = new ArrayList<LegStipulationsBlockT>();
        }
        return this.stip;
    }

    /**
     * Gets the value of the preAll property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preAll property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreAll().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegPreAllocGrpBlockT }
     * 
     * 
     */
    public List<LegPreAllocGrpBlockT> getPreAll() {
        if (preAll == null) {
            preAll = new ArrayList<LegPreAllocGrpBlockT>();
        }
        return this.preAll;
    }

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

    /**
     * Gets the value of the ordQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrdQty() {
        return ordQty;
    }

    /**
     * Sets the value of the ordQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrdQty(BigDecimal value) {
        this.ordQty = value;
    }

    /**
     * Gets the value of the swapTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSwapTyp() {
        return swapTyp;
    }

    /**
     * Sets the value of the swapTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSwapTyp(BigInteger value) {
        this.swapTyp = value;
    }

    /**
     * Gets the value of the legAllocID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegAllocID() {
        return legAllocID;
    }

    /**
     * Sets the value of the legAllocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegAllocID(String value) {
        this.legAllocID = value;
    }

    /**
     * Gets the value of the posEfct property.
     * 
     * @return
     *     possible object is
     *     {@link PositionEffectEnumT }
     *     
     */
    public PositionEffectEnumT getPosEfct() {
        return posEfct;
    }

    /**
     * Sets the value of the posEfct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionEffectEnumT }
     *     
     */
    public void setPosEfct(PositionEffectEnumT value) {
        this.posEfct = value;
    }

    /**
     * Gets the value of the cover property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCover() {
        return cover;
    }

    /**
     * Sets the value of the cover property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCover(BigInteger value) {
        this.cover = value;
    }

    /**
     * Gets the value of the refID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefID() {
        return refID;
    }

    /**
     * Sets the value of the refID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefID(String value) {
        this.refID = value;
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
     * Gets the value of the lastPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastPx() {
        return lastPx;
    }

    /**
     * Sets the value of the lastPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastPx(BigDecimal value) {
        this.lastPx = value;
    }

    /**
     * Gets the value of the settlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlCcy() {
        return settlCcy;
    }

    /**
     * Sets the value of the settlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlCcy(String value) {
        this.settlCcy = value;
    }

    /**
     * Gets the value of the legLastFwdPnts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegLastFwdPnts() {
        return legLastFwdPnts;
    }

    /**
     * Sets the value of the legLastFwdPnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegLastFwdPnts(BigDecimal value) {
        this.legLastFwdPnts = value;
    }

    /**
     * Gets the value of the legCalcCcyLastQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegCalcCcyLastQty() {
        return legCalcCcyLastQty;
    }

    /**
     * Sets the value of the legCalcCcyLastQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegCalcCcyLastQty(BigDecimal value) {
        this.legCalcCcyLastQty = value;
    }

    /**
     * Gets the value of the legGrossTrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegGrossTrdAmt() {
        return legGrossTrdAmt;
    }

    /**
     * Sets the value of the legGrossTrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegGrossTrdAmt(BigDecimal value) {
        this.legGrossTrdAmt = value;
    }

    /**
     * Gets the value of the legVolatility property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegVolatility() {
        return legVolatility;
    }

    /**
     * Sets the value of the legVolatility property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegVolatility(BigDecimal value) {
        this.legVolatility = value;
    }

    /**
     * Gets the value of the legDividendYield property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegDividendYield() {
        return legDividendYield;
    }

    /**
     * Sets the value of the legDividendYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegDividendYield(BigDecimal value) {
        this.legDividendYield = value;
    }

    /**
     * Gets the value of the legCurrencyRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegCurrencyRatio() {
        return legCurrencyRatio;
    }

    /**
     * Sets the value of the legCurrencyRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegCurrencyRatio(BigDecimal value) {
        this.legCurrencyRatio = value;
    }

    /**
     * Gets the value of the legExecInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegExecInst() {
        return legExecInst;
    }

    /**
     * Sets the value of the legExecInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegExecInst(String value) {
        this.legExecInst = value;
    }

    /**
     * Gets the value of the lastQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastQty() {
        return lastQty;
    }

    /**
     * Sets the value of the lastQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastQty(BigDecimal value) {
        this.lastQty = value;
    }

}
