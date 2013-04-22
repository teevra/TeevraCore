
package org.fixprotocol.fixml_5_0_sp2;

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
 * <p>Java class for LegQuotGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegQuotGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegQuotGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegQuotGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegQuotGrp_Block_t", propOrder = {
    "leg",
    "stip",
    "pty",
    "bnchmkCurve"
})
public class LegQuotGrpBlockT {

    @XmlElement(name = "Leg")
    protected InstrumentLegBlockT leg;
    @XmlElement(name = "Stip")
    protected List<LegStipulationsBlockT> stip;
    @XmlElement(name = "Pty")
    protected List<NestedPartiesBlockT> pty;
    @XmlElement(name = "BnchmkCurve")
    protected LegBenchmarkCurveDataBlockT bnchmkCurve;
    @XmlAttribute(name = "Qty")
    protected BigDecimal qty;
    @XmlAttribute(name = "OrdQty")
    protected BigDecimal ordQty;
    @XmlAttribute(name = "SwapTyp")
    protected BigInteger swapTyp;
    @XmlAttribute(name = "SettlTyp")
    protected String settlTyp;
    @XmlAttribute(name = "SettlDt")
    protected XMLGregorianCalendar settlDt;
    @XmlAttribute(name = "PxTyp")
    protected BigInteger pxTyp;
    @XmlAttribute(name = "BidPx")
    protected BigDecimal bidPx;
    @XmlAttribute(name = "OfrPx")
    protected BigDecimal ofrPx;
    @XmlAttribute(name = "RefID")
    protected String refID;
    @XmlAttribute(name = "LegBidFwdPnts")
    protected BigDecimal legBidFwdPnts;
    @XmlAttribute(name = "LegOfrFwdPnts")
    protected BigDecimal legOfrFwdPnts;

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
     * {@link NestedPartiesBlockT }
     * 
     * 
     */
    public List<NestedPartiesBlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<NestedPartiesBlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the bnchmkCurve property.
     * 
     * @return
     *     possible object is
     *     {@link LegBenchmarkCurveDataBlockT }
     *     
     */
    public LegBenchmarkCurveDataBlockT getBnchmkCurve() {
        return bnchmkCurve;
    }

    /**
     * Sets the value of the bnchmkCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegBenchmarkCurveDataBlockT }
     *     
     */
    public void setBnchmkCurve(LegBenchmarkCurveDataBlockT value) {
        this.bnchmkCurve = value;
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
     * Gets the value of the pxTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPxTyp() {
        return pxTyp;
    }

    /**
     * Sets the value of the pxTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPxTyp(BigInteger value) {
        this.pxTyp = value;
    }

    /**
     * Gets the value of the bidPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBidPx() {
        return bidPx;
    }

    /**
     * Sets the value of the bidPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBidPx(BigDecimal value) {
        this.bidPx = value;
    }

    /**
     * Gets the value of the ofrPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfrPx() {
        return ofrPx;
    }

    /**
     * Sets the value of the ofrPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfrPx(BigDecimal value) {
        this.ofrPx = value;
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
     * Gets the value of the legBidFwdPnts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegBidFwdPnts() {
        return legBidFwdPnts;
    }

    /**
     * Sets the value of the legBidFwdPnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegBidFwdPnts(BigDecimal value) {
        this.legBidFwdPnts = value;
    }

    /**
     * Gets the value of the legOfrFwdPnts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegOfrFwdPnts() {
        return legOfrFwdPnts;
    }

    /**
     * Sets the value of the legOfrFwdPnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegOfrFwdPnts(BigDecimal value) {
        this.legOfrFwdPnts = value;
    }

}
