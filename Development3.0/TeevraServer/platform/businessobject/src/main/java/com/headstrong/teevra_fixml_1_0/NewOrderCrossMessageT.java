
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
 * NewOrderCross can be found in Volume4 of the specification 
 * 
 * <p>Java class for NewOrderCross_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewOrderCross_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}NewOrderCrossElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}NewOrderCrossAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewOrderCross_message_t", propOrder = {
    "pty",
    "sideCrossMod",
    "instrmt",
    "undly",
    "leg",
    "dsplyInstr",
    "trdSes",
    "stip",
    "trgrInstr",
    "sprdBnchmkCurve",
    "yield",
    "pegInstr",
    "discInstr",
    "strtPrmGrp"
})
public class NewOrderCrossMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Pty")
    protected List<RootPartiesBlockT> pty;
    @XmlElement(name = "SideCrossMod", required = true)
    protected List<SideCrossOrdModGrpBlockT> sideCrossMod;
    @XmlElement(name = "Instrmt", required = true)
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "Undly")
    protected List<UndInstrmtGrpBlockT> undly;
    @XmlElement(name = "Leg")
    protected List<InstrmtLegGrpBlockT> leg;
    @XmlElement(name = "DsplyInstr")
    protected DisplayInstructionBlockT dsplyInstr;
    @XmlElement(name = "TrdSes")
    protected List<TrdgSesGrpBlockT> trdSes;
    @XmlElement(name = "Stip")
    protected List<StipulationsBlockT> stip;
    @XmlElement(name = "TrgrInstr")
    protected TriggeringInstructionBlockT trgrInstr;
    @XmlElement(name = "SprdBnchmkCurve")
    protected SpreadOrBenchmarkCurveDataBlockT sprdBnchmkCurve;
    @XmlElement(name = "Yield")
    protected YieldDataBlockT yield;
    @XmlElement(name = "PegInstr")
    protected PegInstructionsBlockT pegInstr;
    @XmlElement(name = "DiscInstr")
    protected DiscretionInstructionsBlockT discInstr;
    @XmlElement(name = "StrtPrmGrp")
    protected List<StrategyParametersGrpBlockT> strtPrmGrp;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Typ")
    protected BigInteger typ;
    @XmlAttribute(name = "Priorty")
    protected BigInteger priorty;
    @XmlAttribute(name = "SettlTyp")
    protected String settlTyp;
    @XmlAttribute(name = "SettlDt")
    protected XMLGregorianCalendar settlDt;
    @XmlAttribute(name = "HandlInst")
    protected String handlInst;
    @XmlAttribute(name = "ExecInst")
    protected String execInst;
    @XmlAttribute(name = "MinQty")
    protected BigDecimal minQty;
    @XmlAttribute(name = "MtchInc")
    protected BigDecimal mtchInc;
    @XmlAttribute(name = "MxPxLvls")
    protected BigInteger mxPxLvls;
    @XmlAttribute(name = "MaxFloor")
    protected BigDecimal maxFloor;
    @XmlAttribute(name = "ExDest")
    protected String exDest;
    @XmlAttribute(name = "ExDestIDSrc")
    protected ExDestinationIDSourceEnumT exDestIDSrc;
    @XmlAttribute(name = "ProcCode")
    protected String procCode;
    @XmlAttribute(name = "PrevClsPx")
    protected BigDecimal prevClsPx;
    @XmlAttribute(name = "LocReqd")
    protected LocateReqdEnumT locReqd;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "TransBkdTm")
    protected XMLGregorianCalendar transBkdTm;
    @XmlAttribute(name = "OrdTyp")
    protected String ordTyp;
    @XmlAttribute(name = "PxTyp")
    protected BigInteger pxTyp;
    @XmlAttribute(name = "Px")
    protected BigDecimal px;
    @XmlAttribute(name = "PxPrtScp")
    protected String pxPrtScp;
    @XmlAttribute(name = "StopPx")
    protected BigDecimal stopPx;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "ComplianceID")
    protected String complianceID;
    @XmlAttribute(name = "IOIID")
    protected String ioiid;
    @XmlAttribute(name = "QID")
    protected String qid;
    @XmlAttribute(name = "TmInForce")
    protected String tmInForce;
    @XmlAttribute(name = "EfctvTm")
    protected XMLGregorianCalendar efctvTm;
    @XmlAttribute(name = "ExpireDt")
    protected XMLGregorianCalendar expireDt;
    @XmlAttribute(name = "ExpireTm")
    protected XMLGregorianCalendar expireTm;
    @XmlAttribute(name = "GTBkngInst")
    protected BigInteger gtBkngInst;
    @XmlAttribute(name = "MaxShow")
    protected BigDecimal maxShow;
    @XmlAttribute(name = "TgtStrategy")
    protected String tgtStrategy;
    @XmlAttribute(name = "TgtStrategyParameters")
    protected String tgtStrategyParameters;
    @XmlAttribute(name = "ParticipationRt")
    protected BigDecimal participationRt;
    @XmlAttribute(name = "CxllationRights")
    protected CancellationRightsEnumT cxllationRights;
    @XmlAttribute(name = "MnyLaunderingStat")
    protected String mnyLaunderingStat;
    @XmlAttribute(name = "RegistID")
    protected String registID;
    @XmlAttribute(name = "Designation")
    protected String designation;

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
     * {@link RootPartiesBlockT }
     * 
     * 
     */
    public List<RootPartiesBlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<RootPartiesBlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the sideCrossMod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sideCrossMod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSideCrossMod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SideCrossOrdModGrpBlockT }
     * 
     * 
     */
    public List<SideCrossOrdModGrpBlockT> getSideCrossMod() {
        if (sideCrossMod == null) {
            sideCrossMod = new ArrayList<SideCrossOrdModGrpBlockT>();
        }
        return this.sideCrossMod;
    }

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UndInstrmtGrpBlockT }
     * 
     * 
     */
    public List<UndInstrmtGrpBlockT> getUndly() {
        if (undly == null) {
            undly = new ArrayList<UndInstrmtGrpBlockT>();
        }
        return this.undly;
    }

    /**
     * Gets the value of the leg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrmtLegGrpBlockT }
     * 
     * 
     */
    public List<InstrmtLegGrpBlockT> getLeg() {
        if (leg == null) {
            leg = new ArrayList<InstrmtLegGrpBlockT>();
        }
        return this.leg;
    }

    /**
     * Gets the value of the dsplyInstr property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayInstructionBlockT }
     *     
     */
    public DisplayInstructionBlockT getDsplyInstr() {
        return dsplyInstr;
    }

    /**
     * Sets the value of the dsplyInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayInstructionBlockT }
     *     
     */
    public void setDsplyInstr(DisplayInstructionBlockT value) {
        this.dsplyInstr = value;
    }

    /**
     * Gets the value of the trdSes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trdSes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrdSes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrdgSesGrpBlockT }
     * 
     * 
     */
    public List<TrdgSesGrpBlockT> getTrdSes() {
        if (trdSes == null) {
            trdSes = new ArrayList<TrdgSesGrpBlockT>();
        }
        return this.trdSes;
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
     * {@link StipulationsBlockT }
     * 
     * 
     */
    public List<StipulationsBlockT> getStip() {
        if (stip == null) {
            stip = new ArrayList<StipulationsBlockT>();
        }
        return this.stip;
    }

    /**
     * Gets the value of the trgrInstr property.
     * 
     * @return
     *     possible object is
     *     {@link TriggeringInstructionBlockT }
     *     
     */
    public TriggeringInstructionBlockT getTrgrInstr() {
        return trgrInstr;
    }

    /**
     * Sets the value of the trgrInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeringInstructionBlockT }
     *     
     */
    public void setTrgrInstr(TriggeringInstructionBlockT value) {
        this.trgrInstr = value;
    }

    /**
     * Gets the value of the sprdBnchmkCurve property.
     * 
     * @return
     *     possible object is
     *     {@link SpreadOrBenchmarkCurveDataBlockT }
     *     
     */
    public SpreadOrBenchmarkCurveDataBlockT getSprdBnchmkCurve() {
        return sprdBnchmkCurve;
    }

    /**
     * Sets the value of the sprdBnchmkCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpreadOrBenchmarkCurveDataBlockT }
     *     
     */
    public void setSprdBnchmkCurve(SpreadOrBenchmarkCurveDataBlockT value) {
        this.sprdBnchmkCurve = value;
    }

    /**
     * Gets the value of the yield property.
     * 
     * @return
     *     possible object is
     *     {@link YieldDataBlockT }
     *     
     */
    public YieldDataBlockT getYield() {
        return yield;
    }

    /**
     * Sets the value of the yield property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldDataBlockT }
     *     
     */
    public void setYield(YieldDataBlockT value) {
        this.yield = value;
    }

    /**
     * Gets the value of the pegInstr property.
     * 
     * @return
     *     possible object is
     *     {@link PegInstructionsBlockT }
     *     
     */
    public PegInstructionsBlockT getPegInstr() {
        return pegInstr;
    }

    /**
     * Sets the value of the pegInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PegInstructionsBlockT }
     *     
     */
    public void setPegInstr(PegInstructionsBlockT value) {
        this.pegInstr = value;
    }

    /**
     * Gets the value of the discInstr property.
     * 
     * @return
     *     possible object is
     *     {@link DiscretionInstructionsBlockT }
     *     
     */
    public DiscretionInstructionsBlockT getDiscInstr() {
        return discInstr;
    }

    /**
     * Sets the value of the discInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscretionInstructionsBlockT }
     *     
     */
    public void setDiscInstr(DiscretionInstructionsBlockT value) {
        this.discInstr = value;
    }

    /**
     * Gets the value of the strtPrmGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strtPrmGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrtPrmGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrategyParametersGrpBlockT }
     * 
     * 
     */
    public List<StrategyParametersGrpBlockT> getStrtPrmGrp() {
        if (strtPrmGrp == null) {
            strtPrmGrp = new ArrayList<StrategyParametersGrpBlockT>();
        }
        return this.strtPrmGrp;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
     * Gets the value of the priorty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriorty() {
        return priorty;
    }

    /**
     * Sets the value of the priorty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriorty(BigInteger value) {
        this.priorty = value;
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
     * Gets the value of the handlInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlInst() {
        return handlInst;
    }

    /**
     * Sets the value of the handlInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlInst(String value) {
        this.handlInst = value;
    }

    /**
     * Gets the value of the execInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecInst() {
        return execInst;
    }

    /**
     * Sets the value of the execInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecInst(String value) {
        this.execInst = value;
    }

    /**
     * Gets the value of the minQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinQty() {
        return minQty;
    }

    /**
     * Sets the value of the minQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinQty(BigDecimal value) {
        this.minQty = value;
    }

    /**
     * Gets the value of the mtchInc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMtchInc() {
        return mtchInc;
    }

    /**
     * Sets the value of the mtchInc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMtchInc(BigDecimal value) {
        this.mtchInc = value;
    }

    /**
     * Gets the value of the mxPxLvls property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMxPxLvls() {
        return mxPxLvls;
    }

    /**
     * Sets the value of the mxPxLvls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMxPxLvls(BigInteger value) {
        this.mxPxLvls = value;
    }

    /**
     * Gets the value of the maxFloor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxFloor() {
        return maxFloor;
    }

    /**
     * Sets the value of the maxFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxFloor(BigDecimal value) {
        this.maxFloor = value;
    }

    /**
     * Gets the value of the exDest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExDest() {
        return exDest;
    }

    /**
     * Sets the value of the exDest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExDest(String value) {
        this.exDest = value;
    }

    /**
     * Gets the value of the exDestIDSrc property.
     * 
     * @return
     *     possible object is
     *     {@link ExDestinationIDSourceEnumT }
     *     
     */
    public ExDestinationIDSourceEnumT getExDestIDSrc() {
        return exDestIDSrc;
    }

    /**
     * Sets the value of the exDestIDSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExDestinationIDSourceEnumT }
     *     
     */
    public void setExDestIDSrc(ExDestinationIDSourceEnumT value) {
        this.exDestIDSrc = value;
    }

    /**
     * Gets the value of the procCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcCode() {
        return procCode;
    }

    /**
     * Sets the value of the procCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcCode(String value) {
        this.procCode = value;
    }

    /**
     * Gets the value of the prevClsPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrevClsPx() {
        return prevClsPx;
    }

    /**
     * Sets the value of the prevClsPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrevClsPx(BigDecimal value) {
        this.prevClsPx = value;
    }

    /**
     * Gets the value of the locReqd property.
     * 
     * @return
     *     possible object is
     *     {@link LocateReqdEnumT }
     *     
     */
    public LocateReqdEnumT getLocReqd() {
        return locReqd;
    }

    /**
     * Sets the value of the locReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocateReqdEnumT }
     *     
     */
    public void setLocReqd(LocateReqdEnumT value) {
        this.locReqd = value;
    }

    /**
     * Gets the value of the txnTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxnTm() {
        return txnTm;
    }

    /**
     * Sets the value of the txnTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxnTm(XMLGregorianCalendar value) {
        this.txnTm = value;
    }

    /**
     * Gets the value of the transBkdTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransBkdTm() {
        return transBkdTm;
    }

    /**
     * Sets the value of the transBkdTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransBkdTm(XMLGregorianCalendar value) {
        this.transBkdTm = value;
    }

    /**
     * Gets the value of the ordTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdTyp() {
        return ordTyp;
    }

    /**
     * Sets the value of the ordTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdTyp(String value) {
        this.ordTyp = value;
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
     * Gets the value of the pxPrtScp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPxPrtScp() {
        return pxPrtScp;
    }

    /**
     * Sets the value of the pxPrtScp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPxPrtScp(String value) {
        this.pxPrtScp = value;
    }

    /**
     * Gets the value of the stopPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStopPx() {
        return stopPx;
    }

    /**
     * Sets the value of the stopPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStopPx(BigDecimal value) {
        this.stopPx = value;
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
     * Gets the value of the complianceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplianceID() {
        return complianceID;
    }

    /**
     * Sets the value of the complianceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplianceID(String value) {
        this.complianceID = value;
    }

    /**
     * Gets the value of the ioiid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIOIID() {
        return ioiid;
    }

    /**
     * Sets the value of the ioiid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIOIID(String value) {
        this.ioiid = value;
    }

    /**
     * Gets the value of the qid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQID() {
        return qid;
    }

    /**
     * Sets the value of the qid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQID(String value) {
        this.qid = value;
    }

    /**
     * Gets the value of the tmInForce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmInForce() {
        return tmInForce;
    }

    /**
     * Sets the value of the tmInForce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmInForce(String value) {
        this.tmInForce = value;
    }

    /**
     * Gets the value of the efctvTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEfctvTm() {
        return efctvTm;
    }

    /**
     * Sets the value of the efctvTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEfctvTm(XMLGregorianCalendar value) {
        this.efctvTm = value;
    }

    /**
     * Gets the value of the expireDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDt() {
        return expireDt;
    }

    /**
     * Sets the value of the expireDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDt(XMLGregorianCalendar value) {
        this.expireDt = value;
    }

    /**
     * Gets the value of the expireTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireTm() {
        return expireTm;
    }

    /**
     * Sets the value of the expireTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireTm(XMLGregorianCalendar value) {
        this.expireTm = value;
    }

    /**
     * Gets the value of the gtBkngInst property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGTBkngInst() {
        return gtBkngInst;
    }

    /**
     * Sets the value of the gtBkngInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGTBkngInst(BigInteger value) {
        this.gtBkngInst = value;
    }

    /**
     * Gets the value of the maxShow property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxShow() {
        return maxShow;
    }

    /**
     * Sets the value of the maxShow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxShow(BigDecimal value) {
        this.maxShow = value;
    }

    /**
     * Gets the value of the tgtStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTgtStrategy() {
        return tgtStrategy;
    }

    /**
     * Sets the value of the tgtStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTgtStrategy(String value) {
        this.tgtStrategy = value;
    }

    /**
     * Gets the value of the tgtStrategyParameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTgtStrategyParameters() {
        return tgtStrategyParameters;
    }

    /**
     * Sets the value of the tgtStrategyParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTgtStrategyParameters(String value) {
        this.tgtStrategyParameters = value;
    }

    /**
     * Gets the value of the participationRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getParticipationRt() {
        return participationRt;
    }

    /**
     * Sets the value of the participationRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setParticipationRt(BigDecimal value) {
        this.participationRt = value;
    }

    /**
     * Gets the value of the cxllationRights property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationRightsEnumT }
     *     
     */
    public CancellationRightsEnumT getCxllationRights() {
        return cxllationRights;
    }

    /**
     * Sets the value of the cxllationRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationRightsEnumT }
     *     
     */
    public void setCxllationRights(CancellationRightsEnumT value) {
        this.cxllationRights = value;
    }

    /**
     * Gets the value of the mnyLaunderingStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnyLaunderingStat() {
        return mnyLaunderingStat;
    }

    /**
     * Sets the value of the mnyLaunderingStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnyLaunderingStat(String value) {
        this.mnyLaunderingStat = value;
    }

    /**
     * Gets the value of the registID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistID() {
        return registID;
    }

    /**
     * Sets the value of the registID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistID(String value) {
        this.registID = value;
    }

    /**
     * Gets the value of the designation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Sets the value of the designation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignation(String value) {
        this.designation = value;
    }

}
