
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
 * ExecutionReport can be found in Volume4 of the specification 
 * 
 * <p>Java class for ExecutionReport_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecutionReport_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ExecutionReportElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ExecutionReportAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutionReport_message_t", propOrder = {
    "applSeqCtrl",
    "pty",
    "contra",
    "preAll",
    "instrmt",
    "finDetls",
    "undly",
    "stip",
    "ordQty",
    "trgrInstr",
    "pegInstr",
    "discInstr",
    "strtPrmGrp",
    "fillsGrp",
    "comm",
    "sprdBnchmkCurve",
    "yield",
    "rtSrc",
    "dsplyInstr",
    "contAmt",
    "exec",
    "miscFees",
    "trdRegTS"
})
public class ExecutionReportMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "ApplSeqCtrl")
    protected ApplicationSequenceControlBlockT applSeqCtrl;
    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "Contra")
    protected List<ContraGrpBlockT> contra;
    @XmlElement(name = "PreAll")
    protected List<PreAllocGrpBlockT> preAll;
    @XmlElement(name = "Instrmt", required = true)
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "FinDetls")
    protected FinancingDetailsBlockT finDetls;
    @XmlElement(name = "Undly")
    protected List<UndInstrmtGrpBlockT> undly;
    @XmlElement(name = "Stip")
    protected List<StipulationsBlockT> stip;
    @XmlElement(name = "OrdQty")
    protected OrderQtyDataBlockT ordQty;
    @XmlElement(name = "TrgrInstr")
    protected TriggeringInstructionBlockT trgrInstr;
    @XmlElement(name = "PegInstr")
    protected PegInstructionsBlockT pegInstr;
    @XmlElement(name = "DiscInstr")
    protected DiscretionInstructionsBlockT discInstr;
    @XmlElement(name = "StrtPrmGrp")
    protected List<StrategyParametersGrpBlockT> strtPrmGrp;
    @XmlElement(name = "FillsGrp")
    protected List<FillsGrpBlockT> fillsGrp;
    @XmlElement(name = "Comm")
    protected CommissionDataBlockT comm;
    @XmlElement(name = "SprdBnchmkCurve")
    protected SpreadOrBenchmarkCurveDataBlockT sprdBnchmkCurve;
    @XmlElement(name = "Yield")
    protected YieldDataBlockT yield;
    @XmlElement(name = "RtSrc")
    protected List<RateSourceBlockT> rtSrc;
    @XmlElement(name = "DsplyInstr")
    protected DisplayInstructionBlockT dsplyInstr;
    @XmlElement(name = "ContAmt")
    protected List<ContAmtGrpBlockT> contAmt;
    @XmlElement(name = "Exec")
    protected List<InstrmtLegExecGrpBlockT> exec;
    @XmlElement(name = "MiscFees")
    protected List<MiscFeesGrpBlockT> miscFees;
    @XmlElement(name = "TrdRegTS")
    protected List<TrdRegTimestampsBlockT> trdRegTS;
    @XmlAttribute(name = "OrdID")
    protected String ordID;
    @XmlAttribute(name = "OrdID2")
    protected String ordID2;
    @XmlAttribute(name = "ID2")
    protected String id2;
    @XmlAttribute(name = "ExecID2")
    protected String execID2;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "OrigID")
    protected String origID;
    @XmlAttribute(name = "LnkID")
    protected String lnkID;
    @XmlAttribute(name = "RspID")
    protected String rspID;
    @XmlAttribute(name = "StatReqID")
    protected String statReqID;
    @XmlAttribute(name = "MassStatReqID")
    protected String massStatReqID;
    @XmlAttribute(name = "HstCxID")
    protected String hstCxID;
    @XmlAttribute(name = "TotNumRpts")
    protected BigInteger totNumRpts;
    @XmlAttribute(name = "LastRptReqed")
    protected LastRptRequestedEnumT lastRptReqed;
    @XmlAttribute(name = "OrignDt")
    protected XMLGregorianCalendar orignDt;
    @XmlAttribute(name = "ListID")
    protected String listID;
    @XmlAttribute(name = "CrssID")
    protected String crssID;
    @XmlAttribute(name = "OrigCrssID")
    protected String origCrssID;
    @XmlAttribute(name = "CrssTyp")
    protected BigInteger crssTyp;
    @XmlAttribute(name = "MtchID")
    protected String mtchID;
    @XmlAttribute(name = "ExecID")
    protected String execID;
    @XmlAttribute(name = "ExecRefID")
    protected String execRefID;
    @XmlAttribute(name = "ExecTyp")
    protected String execTyp;
    @XmlAttribute(name = "Stat")
    protected String stat;
    @XmlAttribute(name = "WorkingInd")
    protected WorkingIndicatorEnumT workingInd;
    @XmlAttribute(name = "RejRsn")
    protected String rejRsn;
    @XmlAttribute(name = "ExecRstmtRsn")
    protected String execRstmtRsn;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "AcctIDSrc")
    protected String acctIDSrc;
    @XmlAttribute(name = "AcctTyp")
    protected BigInteger acctTyp;
    @XmlAttribute(name = "DayBkngInst")
    protected String dayBkngInst;
    @XmlAttribute(name = "BkngUnit")
    protected String bkngUnit;
    @XmlAttribute(name = "PreallocMeth")
    protected String preallocMeth;
    @XmlAttribute(name = "AllocID")
    protected String allocID;
    @XmlAttribute(name = "SettlTyp")
    protected String settlTyp;
    @XmlAttribute(name = "SettlDt")
    protected XMLGregorianCalendar settlDt;
    @XmlAttribute(name = "MtchTyp")
    protected String mtchTyp;
    @XmlAttribute(name = "OrdCat")
    protected String ordCat;
    @XmlAttribute(name = "CshMgn")
    protected String cshMgn;
    @XmlAttribute(name = "ClrFeeInd")
    protected String clrFeeInd;
    @XmlAttribute(name = "Side")
    protected String side;
    @XmlAttribute(name = "QtyTyp")
    protected BigInteger qtyTyp;
    @XmlAttribute(name = "LotTyp")
    protected String lotTyp;
    @XmlAttribute(name = "Typ")
    protected String typ;
    @XmlAttribute(name = "PxTyp")
    protected BigInteger pxTyp;
    @XmlAttribute(name = "Px")
    protected BigDecimal px;
    @XmlAttribute(name = "PxPrtScp")
    protected String pxPrtScp;
    @XmlAttribute(name = "StopPx")
    protected BigDecimal stopPx;
    @XmlAttribute(name = "PeggedPx")
    protected BigDecimal peggedPx;
    @XmlAttribute(name = "PggdRefPx")
    protected BigDecimal pggdRefPx;
    @XmlAttribute(name = "DsctnPx")
    protected BigDecimal dsctnPx;
    @XmlAttribute(name = "TgtStrategy")
    protected String tgtStrategy;
    @XmlAttribute(name = "TgtStrategyParameters")
    protected String tgtStrategyParameters;
    @XmlAttribute(name = "ParticipationRt")
    protected BigDecimal participationRt;
    @XmlAttribute(name = "TgtStrategyPerformance")
    protected BigDecimal tgtStrategyPerformance;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "ComplianceID")
    protected String complianceID;
    @XmlAttribute(name = "SolFlag")
    protected SolicitedFlagEnumT solFlag;
    @XmlAttribute(name = "TmInForce")
    protected String tmInForce;
    @XmlAttribute(name = "EfctvTm")
    protected XMLGregorianCalendar efctvTm;
    @XmlAttribute(name = "ExpireDt")
    protected XMLGregorianCalendar expireDt;
    @XmlAttribute(name = "ExpireTm")
    protected XMLGregorianCalendar expireTm;
    @XmlAttribute(name = "ExecInst")
    protected String execInst;
    @XmlAttribute(name = "AgrsrInd")
    protected AggressorIndicatorEnumT agrsrInd;
    @XmlAttribute(name = "Cpcty")
    protected OrderCapacityEnumT cpcty;
    @XmlAttribute(name = "Rstctions")
    protected String rstctions;
    @XmlAttribute(name = "PrTrdAnon")
    protected String prTrdAnon;
    @XmlAttribute(name = "CustCpcty")
    protected BigInteger custCpcty;
    @XmlAttribute(name = "LastQty")
    protected BigDecimal lastQty;
    @XmlAttribute(name = "CalcCcyLastQty")
    protected BigDecimal calcCcyLastQty;
    @XmlAttribute(name = "LastSwapPnts")
    protected BigDecimal lastSwapPnts;
    @XmlAttribute(name = "UndLastQty")
    protected BigDecimal undLastQty;
    @XmlAttribute(name = "LastPx")
    protected BigDecimal lastPx;
    @XmlAttribute(name = "UndLastPx")
    protected BigDecimal undLastPx;
    @XmlAttribute(name = "LastParPx")
    protected BigDecimal lastParPx;
    @XmlAttribute(name = "LastSpotRt")
    protected BigDecimal lastSpotRt;
    @XmlAttribute(name = "LastFwdPnts")
    protected BigDecimal lastFwdPnts;
    @XmlAttribute(name = "LastMkt")
    protected String lastMkt;
    @XmlAttribute(name = "SesID")
    protected String sesID;
    @XmlAttribute(name = "SesSub")
    protected String sesSub;
    @XmlAttribute(name = "TmBkt")
    protected String tmBkt;
    @XmlAttribute(name = "LastCpcty")
    protected String lastCpcty;
    @XmlAttribute(name = "LeavesQty")
    protected BigDecimal leavesQty;
    @XmlAttribute(name = "CumQty")
    protected BigDecimal cumQty;
    @XmlAttribute(name = "AvgPx")
    protected BigDecimal avgPx;
    @XmlAttribute(name = "DayOrdQty")
    protected BigDecimal dayOrdQty;
    @XmlAttribute(name = "DayCumQty")
    protected BigDecimal dayCumQty;
    @XmlAttribute(name = "DayAvgPx")
    protected BigDecimal dayAvgPx;
    @XmlAttribute(name = "TotNoFills")
    protected BigInteger totNoFills;
    @XmlAttribute(name = "LastFragment")
    protected LastFragmentEnumT lastFragment;
    @XmlAttribute(name = "GTBkngInst")
    protected BigInteger gtBkngInst;
    @XmlAttribute(name = "TrdDt")
    protected XMLGregorianCalendar trdDt;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "RptToExch")
    protected ReportToExchEnumT rptToExch;
    @XmlAttribute(name = "GrossTrdAmt")
    protected BigDecimal grossTrdAmt;
    @XmlAttribute(name = "NumDaysInt")
    protected BigInteger numDaysInt;
    @XmlAttribute(name = "ExDt")
    protected XMLGregorianCalendar exDt;
    @XmlAttribute(name = "AcrdIntRt")
    protected BigDecimal acrdIntRt;
    @XmlAttribute(name = "AcrdIntAmt")
    protected BigDecimal acrdIntAmt;
    @XmlAttribute(name = "IntAtMat")
    protected BigDecimal intAtMat;
    @XmlAttribute(name = "EndAcrdIntAmt")
    protected BigDecimal endAcrdIntAmt;
    @XmlAttribute(name = "StartCsh")
    protected BigDecimal startCsh;
    @XmlAttribute(name = "EndCsh")
    protected BigDecimal endCsh;
    @XmlAttribute(name = "TrddFlatSwitch")
    protected TradedFlatSwitchEnumT trddFlatSwitch;
    @XmlAttribute(name = "BasisFeatureDt")
    protected XMLGregorianCalendar basisFeatureDt;
    @XmlAttribute(name = "BasisFeaturePx")
    protected BigDecimal basisFeaturePx;
    @XmlAttribute(name = "Concession")
    protected BigDecimal concession;
    @XmlAttribute(name = "TotTakedown")
    protected BigDecimal totTakedown;
    @XmlAttribute(name = "NetMny")
    protected BigDecimal netMny;
    @XmlAttribute(name = "SettlCurrAmt")
    protected BigDecimal settlCurrAmt;
    @XmlAttribute(name = "SettlCcy")
    protected String settlCcy;
    @XmlAttribute(name = "SettlCurrFxRt")
    protected BigDecimal settlCurrFxRt;
    @XmlAttribute(name = "SettlCurrFxRtCalc")
    protected SettlCurrFxRateCalcEnumT settlCurrFxRtCalc;
    @XmlAttribute(name = "HandlInst")
    protected String handlInst;
    @XmlAttribute(name = "MinQty")
    protected BigDecimal minQty;
    @XmlAttribute(name = "MtchInc")
    protected BigDecimal mtchInc;
    @XmlAttribute(name = "MxPxLvls")
    protected BigInteger mxPxLvls;
    @XmlAttribute(name = "MaxFloor")
    protected BigDecimal maxFloor;
    @XmlAttribute(name = "PosEfct")
    protected PositionEffectEnumT posEfct;
    @XmlAttribute(name = "MaxShow")
    protected BigDecimal maxShow;
    @XmlAttribute(name = "BkngTyp")
    protected BigInteger bkngTyp;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;
    @XmlAttribute(name = "SettlDt2")
    protected XMLGregorianCalendar settlDt2;
    @XmlAttribute(name = "Qty2")
    protected BigDecimal qty2;
    @XmlAttribute(name = "LastFwdPnts2")
    protected BigDecimal lastFwdPnts2;
    @XmlAttribute(name = "MLegRptTyp")
    protected String mLegRptTyp;
    @XmlAttribute(name = "CxllationRights")
    protected CancellationRightsEnumT cxllationRights;
    @XmlAttribute(name = "MnyLaunderingStat")
    protected String mnyLaunderingStat;
    @XmlAttribute(name = "RegistID")
    protected String registID;
    @XmlAttribute(name = "Designation")
    protected String designation;
    @XmlAttribute(name = "TransBkdTm")
    protected XMLGregorianCalendar transBkdTm;
    @XmlAttribute(name = "ExecValuationPoint")
    protected XMLGregorianCalendar execValuationPoint;
    @XmlAttribute(name = "ExecPxTyp")
    protected ExecPriceTypeEnumT execPxTyp;
    @XmlAttribute(name = "ExecPxAdjment")
    protected BigDecimal execPxAdjment;
    @XmlAttribute(name = "PriInd")
    protected BigInteger priInd;
    @XmlAttribute(name = "PxImprvmnt")
    protected BigDecimal pxImprvmnt;
    @XmlAttribute(name = "LastLqdtyInd")
    protected BigInteger lastLqdtyInd;
    @XmlAttribute(name = "CopyMsgInd")
    protected String copyMsgInd;
    @XmlAttribute(name = "DividendYield")
    protected BigDecimal dividendYield;
    @XmlAttribute(name = "ManOrdInd")
    protected String manOrdInd;
    @XmlAttribute(name = "CustDrctdOrd")
    protected String custDrctdOrd;
    @XmlAttribute(name = "RcvdDptID")
    protected String rcvdDptID;
    @XmlAttribute(name = "CustOrdHdlInst")
    protected CustOrderHandlingInstEnumT custOrdHdlInst;
    @XmlAttribute(name = "OrdHndlInstSrc")
    protected BigInteger ordHndlInstSrc;
    @XmlAttribute(name = "Vol")
    protected BigDecimal vol;
    @XmlAttribute(name = "TmToExp")
    protected BigDecimal tmToExp;
    @XmlAttribute(name = "RFR")
    protected BigDecimal rfr;
    @XmlAttribute(name = "PxDelta")
    protected BigDecimal pxDelta;

    /**
     * Gets the value of the applSeqCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationSequenceControlBlockT }
     *     
     */
    public ApplicationSequenceControlBlockT getApplSeqCtrl() {
        return applSeqCtrl;
    }

    /**
     * Sets the value of the applSeqCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationSequenceControlBlockT }
     *     
     */
    public void setApplSeqCtrl(ApplicationSequenceControlBlockT value) {
        this.applSeqCtrl = value;
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
     * {@link PartiesBlockT }
     * 
     * 
     */
    public List<PartiesBlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<PartiesBlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the contra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContra().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContraGrpBlockT }
     * 
     * 
     */
    public List<ContraGrpBlockT> getContra() {
        if (contra == null) {
            contra = new ArrayList<ContraGrpBlockT>();
        }
        return this.contra;
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
     * {@link PreAllocGrpBlockT }
     * 
     * 
     */
    public List<PreAllocGrpBlockT> getPreAll() {
        if (preAll == null) {
            preAll = new ArrayList<PreAllocGrpBlockT>();
        }
        return this.preAll;
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
     * Gets the value of the finDetls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingDetailsBlockT }
     *     
     */
    public FinancingDetailsBlockT getFinDetls() {
        return finDetls;
    }

    /**
     * Sets the value of the finDetls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingDetailsBlockT }
     *     
     */
    public void setFinDetls(FinancingDetailsBlockT value) {
        this.finDetls = value;
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
     * Gets the value of the ordQty property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQtyDataBlockT }
     *     
     */
    public OrderQtyDataBlockT getOrdQty() {
        return ordQty;
    }

    /**
     * Sets the value of the ordQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQtyDataBlockT }
     *     
     */
    public void setOrdQty(OrderQtyDataBlockT value) {
        this.ordQty = value;
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
     * Gets the value of the fillsGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fillsGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFillsGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FillsGrpBlockT }
     * 
     * 
     */
    public List<FillsGrpBlockT> getFillsGrp() {
        if (fillsGrp == null) {
            fillsGrp = new ArrayList<FillsGrpBlockT>();
        }
        return this.fillsGrp;
    }

    /**
     * Gets the value of the comm property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionDataBlockT }
     *     
     */
    public CommissionDataBlockT getComm() {
        return comm;
    }

    /**
     * Sets the value of the comm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionDataBlockT }
     *     
     */
    public void setComm(CommissionDataBlockT value) {
        this.comm = value;
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
     * Gets the value of the rtSrc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rtSrc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRtSrc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateSourceBlockT }
     * 
     * 
     */
    public List<RateSourceBlockT> getRtSrc() {
        if (rtSrc == null) {
            rtSrc = new ArrayList<RateSourceBlockT>();
        }
        return this.rtSrc;
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
     * Gets the value of the contAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContAmtGrpBlockT }
     * 
     * 
     */
    public List<ContAmtGrpBlockT> getContAmt() {
        if (contAmt == null) {
            contAmt = new ArrayList<ContAmtGrpBlockT>();
        }
        return this.contAmt;
    }

    /**
     * Gets the value of the exec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrmtLegExecGrpBlockT }
     * 
     * 
     */
    public List<InstrmtLegExecGrpBlockT> getExec() {
        if (exec == null) {
            exec = new ArrayList<InstrmtLegExecGrpBlockT>();
        }
        return this.exec;
    }

    /**
     * Gets the value of the miscFees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the miscFees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiscFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiscFeesGrpBlockT }
     * 
     * 
     */
    public List<MiscFeesGrpBlockT> getMiscFees() {
        if (miscFees == null) {
            miscFees = new ArrayList<MiscFeesGrpBlockT>();
        }
        return this.miscFees;
    }

    /**
     * Gets the value of the trdRegTS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trdRegTS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrdRegTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrdRegTimestampsBlockT }
     * 
     * 
     */
    public List<TrdRegTimestampsBlockT> getTrdRegTS() {
        if (trdRegTS == null) {
            trdRegTS = new ArrayList<TrdRegTimestampsBlockT>();
        }
        return this.trdRegTS;
    }

    /**
     * Gets the value of the ordID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdID() {
        return ordID;
    }

    /**
     * Sets the value of the ordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdID(String value) {
        this.ordID = value;
    }

    /**
     * Gets the value of the ordID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdID2() {
        return ordID2;
    }

    /**
     * Sets the value of the ordID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdID2(String value) {
        this.ordID2 = value;
    }

    /**
     * Gets the value of the id2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID2() {
        return id2;
    }

    /**
     * Sets the value of the id2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID2(String value) {
        this.id2 = value;
    }

    /**
     * Gets the value of the execID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecID2() {
        return execID2;
    }

    /**
     * Sets the value of the execID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecID2(String value) {
        this.execID2 = value;
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
     * Gets the value of the origID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigID() {
        return origID;
    }

    /**
     * Sets the value of the origID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigID(String value) {
        this.origID = value;
    }

    /**
     * Gets the value of the lnkID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnkID() {
        return lnkID;
    }

    /**
     * Sets the value of the lnkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnkID(String value) {
        this.lnkID = value;
    }

    /**
     * Gets the value of the rspID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspID() {
        return rspID;
    }

    /**
     * Sets the value of the rspID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspID(String value) {
        this.rspID = value;
    }

    /**
     * Gets the value of the statReqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatReqID() {
        return statReqID;
    }

    /**
     * Sets the value of the statReqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatReqID(String value) {
        this.statReqID = value;
    }

    /**
     * Gets the value of the massStatReqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMassStatReqID() {
        return massStatReqID;
    }

    /**
     * Sets the value of the massStatReqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMassStatReqID(String value) {
        this.massStatReqID = value;
    }

    /**
     * Gets the value of the hstCxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHstCxID() {
        return hstCxID;
    }

    /**
     * Sets the value of the hstCxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHstCxID(String value) {
        this.hstCxID = value;
    }

    /**
     * Gets the value of the totNumRpts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNumRpts() {
        return totNumRpts;
    }

    /**
     * Sets the value of the totNumRpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNumRpts(BigInteger value) {
        this.totNumRpts = value;
    }

    /**
     * Gets the value of the lastRptReqed property.
     * 
     * @return
     *     possible object is
     *     {@link LastRptRequestedEnumT }
     *     
     */
    public LastRptRequestedEnumT getLastRptReqed() {
        return lastRptReqed;
    }

    /**
     * Sets the value of the lastRptReqed property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastRptRequestedEnumT }
     *     
     */
    public void setLastRptReqed(LastRptRequestedEnumT value) {
        this.lastRptReqed = value;
    }

    /**
     * Gets the value of the orignDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrignDt() {
        return orignDt;
    }

    /**
     * Sets the value of the orignDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrignDt(XMLGregorianCalendar value) {
        this.orignDt = value;
    }

    /**
     * Gets the value of the listID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListID() {
        return listID;
    }

    /**
     * Sets the value of the listID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListID(String value) {
        this.listID = value;
    }

    /**
     * Gets the value of the crssID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrssID() {
        return crssID;
    }

    /**
     * Sets the value of the crssID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrssID(String value) {
        this.crssID = value;
    }

    /**
     * Gets the value of the origCrssID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigCrssID() {
        return origCrssID;
    }

    /**
     * Sets the value of the origCrssID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigCrssID(String value) {
        this.origCrssID = value;
    }

    /**
     * Gets the value of the crssTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCrssTyp() {
        return crssTyp;
    }

    /**
     * Sets the value of the crssTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCrssTyp(BigInteger value) {
        this.crssTyp = value;
    }

    /**
     * Gets the value of the mtchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtchID() {
        return mtchID;
    }

    /**
     * Sets the value of the mtchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtchID(String value) {
        this.mtchID = value;
    }

    /**
     * Gets the value of the execID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecID() {
        return execID;
    }

    /**
     * Sets the value of the execID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecID(String value) {
        this.execID = value;
    }

    /**
     * Gets the value of the execRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecRefID() {
        return execRefID;
    }

    /**
     * Sets the value of the execRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecRefID(String value) {
        this.execRefID = value;
    }

    /**
     * Gets the value of the execTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecTyp() {
        return execTyp;
    }

    /**
     * Sets the value of the execTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecTyp(String value) {
        this.execTyp = value;
    }

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStat() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStat(String value) {
        this.stat = value;
    }

    /**
     * Gets the value of the workingInd property.
     * 
     * @return
     *     possible object is
     *     {@link WorkingIndicatorEnumT }
     *     
     */
    public WorkingIndicatorEnumT getWorkingInd() {
        return workingInd;
    }

    /**
     * Sets the value of the workingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkingIndicatorEnumT }
     *     
     */
    public void setWorkingInd(WorkingIndicatorEnumT value) {
        this.workingInd = value;
    }

    /**
     * Gets the value of the rejRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejRsn() {
        return rejRsn;
    }

    /**
     * Sets the value of the rejRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejRsn(String value) {
        this.rejRsn = value;
    }

    /**
     * Gets the value of the execRstmtRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecRstmtRsn() {
        return execRstmtRsn;
    }

    /**
     * Sets the value of the execRstmtRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecRstmtRsn(String value) {
        this.execRstmtRsn = value;
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
     * Gets the value of the acctIDSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctIDSrc() {
        return acctIDSrc;
    }

    /**
     * Sets the value of the acctIDSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctIDSrc(String value) {
        this.acctIDSrc = value;
    }

    /**
     * Gets the value of the acctTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcctTyp() {
        return acctTyp;
    }

    /**
     * Sets the value of the acctTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcctTyp(BigInteger value) {
        this.acctTyp = value;
    }

    /**
     * Gets the value of the dayBkngInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayBkngInst() {
        return dayBkngInst;
    }

    /**
     * Sets the value of the dayBkngInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayBkngInst(String value) {
        this.dayBkngInst = value;
    }

    /**
     * Gets the value of the bkngUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkngUnit() {
        return bkngUnit;
    }

    /**
     * Sets the value of the bkngUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBkngUnit(String value) {
        this.bkngUnit = value;
    }

    /**
     * Gets the value of the preallocMeth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreallocMeth() {
        return preallocMeth;
    }

    /**
     * Sets the value of the preallocMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreallocMeth(String value) {
        this.preallocMeth = value;
    }

    /**
     * Gets the value of the allocID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocID() {
        return allocID;
    }

    /**
     * Sets the value of the allocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocID(String value) {
        this.allocID = value;
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
     * Gets the value of the mtchTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtchTyp() {
        return mtchTyp;
    }

    /**
     * Sets the value of the mtchTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtchTyp(String value) {
        this.mtchTyp = value;
    }

    /**
     * Gets the value of the ordCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdCat() {
        return ordCat;
    }

    /**
     * Sets the value of the ordCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdCat(String value) {
        this.ordCat = value;
    }

    /**
     * Gets the value of the cshMgn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshMgn() {
        return cshMgn;
    }

    /**
     * Sets the value of the cshMgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCshMgn(String value) {
        this.cshMgn = value;
    }

    /**
     * Gets the value of the clrFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrFeeInd() {
        return clrFeeInd;
    }

    /**
     * Sets the value of the clrFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrFeeInd(String value) {
        this.clrFeeInd = value;
    }

    /**
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSide(String value) {
        this.side = value;
    }

    /**
     * Gets the value of the qtyTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtyTyp() {
        return qtyTyp;
    }

    /**
     * Sets the value of the qtyTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtyTyp(BigInteger value) {
        this.qtyTyp = value;
    }

    /**
     * Gets the value of the lotTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotTyp() {
        return lotTyp;
    }

    /**
     * Sets the value of the lotTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotTyp(String value) {
        this.lotTyp = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
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
     * Gets the value of the peggedPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeggedPx() {
        return peggedPx;
    }

    /**
     * Sets the value of the peggedPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeggedPx(BigDecimal value) {
        this.peggedPx = value;
    }

    /**
     * Gets the value of the pggdRefPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPggdRefPx() {
        return pggdRefPx;
    }

    /**
     * Sets the value of the pggdRefPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPggdRefPx(BigDecimal value) {
        this.pggdRefPx = value;
    }

    /**
     * Gets the value of the dsctnPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDsctnPx() {
        return dsctnPx;
    }

    /**
     * Sets the value of the dsctnPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDsctnPx(BigDecimal value) {
        this.dsctnPx = value;
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
     * Gets the value of the tgtStrategyPerformance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTgtStrategyPerformance() {
        return tgtStrategyPerformance;
    }

    /**
     * Sets the value of the tgtStrategyPerformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTgtStrategyPerformance(BigDecimal value) {
        this.tgtStrategyPerformance = value;
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
     * Gets the value of the solFlag property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitedFlagEnumT }
     *     
     */
    public SolicitedFlagEnumT getSolFlag() {
        return solFlag;
    }

    /**
     * Sets the value of the solFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitedFlagEnumT }
     *     
     */
    public void setSolFlag(SolicitedFlagEnumT value) {
        this.solFlag = value;
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
     * Gets the value of the agrsrInd property.
     * 
     * @return
     *     possible object is
     *     {@link AggressorIndicatorEnumT }
     *     
     */
    public AggressorIndicatorEnumT getAgrsrInd() {
        return agrsrInd;
    }

    /**
     * Sets the value of the agrsrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggressorIndicatorEnumT }
     *     
     */
    public void setAgrsrInd(AggressorIndicatorEnumT value) {
        this.agrsrInd = value;
    }

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
     * Gets the value of the prTrdAnon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrTrdAnon() {
        return prTrdAnon;
    }

    /**
     * Sets the value of the prTrdAnon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrTrdAnon(String value) {
        this.prTrdAnon = value;
    }

    /**
     * Gets the value of the custCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustCpcty() {
        return custCpcty;
    }

    /**
     * Sets the value of the custCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustCpcty(BigInteger value) {
        this.custCpcty = value;
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

    /**
     * Gets the value of the calcCcyLastQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalcCcyLastQty() {
        return calcCcyLastQty;
    }

    /**
     * Sets the value of the calcCcyLastQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalcCcyLastQty(BigDecimal value) {
        this.calcCcyLastQty = value;
    }

    /**
     * Gets the value of the lastSwapPnts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastSwapPnts() {
        return lastSwapPnts;
    }

    /**
     * Sets the value of the lastSwapPnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastSwapPnts(BigDecimal value) {
        this.lastSwapPnts = value;
    }

    /**
     * Gets the value of the undLastQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUndLastQty() {
        return undLastQty;
    }

    /**
     * Sets the value of the undLastQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUndLastQty(BigDecimal value) {
        this.undLastQty = value;
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
     * Gets the value of the undLastPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUndLastPx() {
        return undLastPx;
    }

    /**
     * Sets the value of the undLastPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUndLastPx(BigDecimal value) {
        this.undLastPx = value;
    }

    /**
     * Gets the value of the lastParPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastParPx() {
        return lastParPx;
    }

    /**
     * Sets the value of the lastParPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastParPx(BigDecimal value) {
        this.lastParPx = value;
    }

    /**
     * Gets the value of the lastSpotRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastSpotRt() {
        return lastSpotRt;
    }

    /**
     * Sets the value of the lastSpotRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastSpotRt(BigDecimal value) {
        this.lastSpotRt = value;
    }

    /**
     * Gets the value of the lastFwdPnts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastFwdPnts() {
        return lastFwdPnts;
    }

    /**
     * Sets the value of the lastFwdPnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastFwdPnts(BigDecimal value) {
        this.lastFwdPnts = value;
    }

    /**
     * Gets the value of the lastMkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastMkt() {
        return lastMkt;
    }

    /**
     * Sets the value of the lastMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastMkt(String value) {
        this.lastMkt = value;
    }

    /**
     * Gets the value of the sesID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesID() {
        return sesID;
    }

    /**
     * Sets the value of the sesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesID(String value) {
        this.sesID = value;
    }

    /**
     * Gets the value of the sesSub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesSub() {
        return sesSub;
    }

    /**
     * Sets the value of the sesSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesSub(String value) {
        this.sesSub = value;
    }

    /**
     * Gets the value of the tmBkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmBkt() {
        return tmBkt;
    }

    /**
     * Sets the value of the tmBkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmBkt(String value) {
        this.tmBkt = value;
    }

    /**
     * Gets the value of the lastCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastCpcty() {
        return lastCpcty;
    }

    /**
     * Sets the value of the lastCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastCpcty(String value) {
        this.lastCpcty = value;
    }

    /**
     * Gets the value of the leavesQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLeavesQty() {
        return leavesQty;
    }

    /**
     * Sets the value of the leavesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLeavesQty(BigDecimal value) {
        this.leavesQty = value;
    }

    /**
     * Gets the value of the cumQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCumQty() {
        return cumQty;
    }

    /**
     * Sets the value of the cumQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCumQty(BigDecimal value) {
        this.cumQty = value;
    }

    /**
     * Gets the value of the avgPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvgPx() {
        return avgPx;
    }

    /**
     * Sets the value of the avgPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgPx(BigDecimal value) {
        this.avgPx = value;
    }

    /**
     * Gets the value of the dayOrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDayOrdQty() {
        return dayOrdQty;
    }

    /**
     * Sets the value of the dayOrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDayOrdQty(BigDecimal value) {
        this.dayOrdQty = value;
    }

    /**
     * Gets the value of the dayCumQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDayCumQty() {
        return dayCumQty;
    }

    /**
     * Sets the value of the dayCumQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDayCumQty(BigDecimal value) {
        this.dayCumQty = value;
    }

    /**
     * Gets the value of the dayAvgPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDayAvgPx() {
        return dayAvgPx;
    }

    /**
     * Sets the value of the dayAvgPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDayAvgPx(BigDecimal value) {
        this.dayAvgPx = value;
    }

    /**
     * Gets the value of the totNoFills property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNoFills() {
        return totNoFills;
    }

    /**
     * Sets the value of the totNoFills property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNoFills(BigInteger value) {
        this.totNoFills = value;
    }

    /**
     * Gets the value of the lastFragment property.
     * 
     * @return
     *     possible object is
     *     {@link LastFragmentEnumT }
     *     
     */
    public LastFragmentEnumT getLastFragment() {
        return lastFragment;
    }

    /**
     * Sets the value of the lastFragment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastFragmentEnumT }
     *     
     */
    public void setLastFragment(LastFragmentEnumT value) {
        this.lastFragment = value;
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
     * Gets the value of the trdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrdDt() {
        return trdDt;
    }

    /**
     * Sets the value of the trdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrdDt(XMLGregorianCalendar value) {
        this.trdDt = value;
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
     * Gets the value of the rptToExch property.
     * 
     * @return
     *     possible object is
     *     {@link ReportToExchEnumT }
     *     
     */
    public ReportToExchEnumT getRptToExch() {
        return rptToExch;
    }

    /**
     * Sets the value of the rptToExch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportToExchEnumT }
     *     
     */
    public void setRptToExch(ReportToExchEnumT value) {
        this.rptToExch = value;
    }

    /**
     * Gets the value of the grossTrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossTrdAmt() {
        return grossTrdAmt;
    }

    /**
     * Sets the value of the grossTrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossTrdAmt(BigDecimal value) {
        this.grossTrdAmt = value;
    }

    /**
     * Gets the value of the numDaysInt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumDaysInt() {
        return numDaysInt;
    }

    /**
     * Sets the value of the numDaysInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumDaysInt(BigInteger value) {
        this.numDaysInt = value;
    }

    /**
     * Gets the value of the exDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExDt() {
        return exDt;
    }

    /**
     * Sets the value of the exDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExDt(XMLGregorianCalendar value) {
        this.exDt = value;
    }

    /**
     * Gets the value of the acrdIntRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcrdIntRt() {
        return acrdIntRt;
    }

    /**
     * Sets the value of the acrdIntRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcrdIntRt(BigDecimal value) {
        this.acrdIntRt = value;
    }

    /**
     * Gets the value of the acrdIntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcrdIntAmt() {
        return acrdIntAmt;
    }

    /**
     * Sets the value of the acrdIntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcrdIntAmt(BigDecimal value) {
        this.acrdIntAmt = value;
    }

    /**
     * Gets the value of the intAtMat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntAtMat() {
        return intAtMat;
    }

    /**
     * Sets the value of the intAtMat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntAtMat(BigDecimal value) {
        this.intAtMat = value;
    }

    /**
     * Gets the value of the endAcrdIntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndAcrdIntAmt() {
        return endAcrdIntAmt;
    }

    /**
     * Sets the value of the endAcrdIntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndAcrdIntAmt(BigDecimal value) {
        this.endAcrdIntAmt = value;
    }

    /**
     * Gets the value of the startCsh property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStartCsh() {
        return startCsh;
    }

    /**
     * Sets the value of the startCsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStartCsh(BigDecimal value) {
        this.startCsh = value;
    }

    /**
     * Gets the value of the endCsh property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndCsh() {
        return endCsh;
    }

    /**
     * Sets the value of the endCsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndCsh(BigDecimal value) {
        this.endCsh = value;
    }

    /**
     * Gets the value of the trddFlatSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link TradedFlatSwitchEnumT }
     *     
     */
    public TradedFlatSwitchEnumT getTrddFlatSwitch() {
        return trddFlatSwitch;
    }

    /**
     * Sets the value of the trddFlatSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradedFlatSwitchEnumT }
     *     
     */
    public void setTrddFlatSwitch(TradedFlatSwitchEnumT value) {
        this.trddFlatSwitch = value;
    }

    /**
     * Gets the value of the basisFeatureDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBasisFeatureDt() {
        return basisFeatureDt;
    }

    /**
     * Sets the value of the basisFeatureDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBasisFeatureDt(XMLGregorianCalendar value) {
        this.basisFeatureDt = value;
    }

    /**
     * Gets the value of the basisFeaturePx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBasisFeaturePx() {
        return basisFeaturePx;
    }

    /**
     * Sets the value of the basisFeaturePx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBasisFeaturePx(BigDecimal value) {
        this.basisFeaturePx = value;
    }

    /**
     * Gets the value of the concession property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConcession() {
        return concession;
    }

    /**
     * Sets the value of the concession property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConcession(BigDecimal value) {
        this.concession = value;
    }

    /**
     * Gets the value of the totTakedown property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotTakedown() {
        return totTakedown;
    }

    /**
     * Sets the value of the totTakedown property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotTakedown(BigDecimal value) {
        this.totTakedown = value;
    }

    /**
     * Gets the value of the netMny property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetMny() {
        return netMny;
    }

    /**
     * Sets the value of the netMny property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetMny(BigDecimal value) {
        this.netMny = value;
    }

    /**
     * Gets the value of the settlCurrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSettlCurrAmt() {
        return settlCurrAmt;
    }

    /**
     * Sets the value of the settlCurrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSettlCurrAmt(BigDecimal value) {
        this.settlCurrAmt = value;
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
     * Gets the value of the settlCurrFxRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSettlCurrFxRt() {
        return settlCurrFxRt;
    }

    /**
     * Sets the value of the settlCurrFxRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSettlCurrFxRt(BigDecimal value) {
        this.settlCurrFxRt = value;
    }

    /**
     * Gets the value of the settlCurrFxRtCalc property.
     * 
     * @return
     *     possible object is
     *     {@link SettlCurrFxRateCalcEnumT }
     *     
     */
    public SettlCurrFxRateCalcEnumT getSettlCurrFxRtCalc() {
        return settlCurrFxRtCalc;
    }

    /**
     * Sets the value of the settlCurrFxRtCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlCurrFxRateCalcEnumT }
     *     
     */
    public void setSettlCurrFxRtCalc(SettlCurrFxRateCalcEnumT value) {
        this.settlCurrFxRtCalc = value;
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
     * Gets the value of the bkngTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBkngTyp() {
        return bkngTyp;
    }

    /**
     * Sets the value of the bkngTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBkngTyp(BigInteger value) {
        this.bkngTyp = value;
    }

    /**
     * Gets the value of the txt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Sets the value of the txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxt(String value) {
        this.txt = value;
    }

    /**
     * Gets the value of the encTxtLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncTxtLen() {
        return encTxtLen;
    }

    /**
     * Sets the value of the encTxtLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncTxtLen(BigInteger value) {
        this.encTxtLen = value;
    }

    /**
     * Gets the value of the encTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncTxt() {
        return encTxt;
    }

    /**
     * Sets the value of the encTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncTxt(String value) {
        this.encTxt = value;
    }

    /**
     * Gets the value of the settlDt2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettlDt2() {
        return settlDt2;
    }

    /**
     * Sets the value of the settlDt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettlDt2(XMLGregorianCalendar value) {
        this.settlDt2 = value;
    }

    /**
     * Gets the value of the qty2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty2() {
        return qty2;
    }

    /**
     * Sets the value of the qty2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty2(BigDecimal value) {
        this.qty2 = value;
    }

    /**
     * Gets the value of the lastFwdPnts2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastFwdPnts2() {
        return lastFwdPnts2;
    }

    /**
     * Sets the value of the lastFwdPnts2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastFwdPnts2(BigDecimal value) {
        this.lastFwdPnts2 = value;
    }

    /**
     * Gets the value of the mLegRptTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMLegRptTyp() {
        return mLegRptTyp;
    }

    /**
     * Sets the value of the mLegRptTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMLegRptTyp(String value) {
        this.mLegRptTyp = value;
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
     * Gets the value of the execValuationPoint property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecValuationPoint() {
        return execValuationPoint;
    }

    /**
     * Sets the value of the execValuationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecValuationPoint(XMLGregorianCalendar value) {
        this.execValuationPoint = value;
    }

    /**
     * Gets the value of the execPxTyp property.
     * 
     * @return
     *     possible object is
     *     {@link ExecPriceTypeEnumT }
     *     
     */
    public ExecPriceTypeEnumT getExecPxTyp() {
        return execPxTyp;
    }

    /**
     * Sets the value of the execPxTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecPriceTypeEnumT }
     *     
     */
    public void setExecPxTyp(ExecPriceTypeEnumT value) {
        this.execPxTyp = value;
    }

    /**
     * Gets the value of the execPxAdjment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExecPxAdjment() {
        return execPxAdjment;
    }

    /**
     * Sets the value of the execPxAdjment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExecPxAdjment(BigDecimal value) {
        this.execPxAdjment = value;
    }

    /**
     * Gets the value of the priInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriInd() {
        return priInd;
    }

    /**
     * Sets the value of the priInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriInd(BigInteger value) {
        this.priInd = value;
    }

    /**
     * Gets the value of the pxImprvmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPxImprvmnt() {
        return pxImprvmnt;
    }

    /**
     * Sets the value of the pxImprvmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPxImprvmnt(BigDecimal value) {
        this.pxImprvmnt = value;
    }

    /**
     * Gets the value of the lastLqdtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastLqdtyInd() {
        return lastLqdtyInd;
    }

    /**
     * Sets the value of the lastLqdtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastLqdtyInd(BigInteger value) {
        this.lastLqdtyInd = value;
    }

    /**
     * Gets the value of the copyMsgInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyMsgInd() {
        return copyMsgInd;
    }

    /**
     * Sets the value of the copyMsgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyMsgInd(String value) {
        this.copyMsgInd = value;
    }

    /**
     * Gets the value of the dividendYield property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDividendYield() {
        return dividendYield;
    }

    /**
     * Sets the value of the dividendYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDividendYield(BigDecimal value) {
        this.dividendYield = value;
    }

    /**
     * Gets the value of the manOrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManOrdInd() {
        return manOrdInd;
    }

    /**
     * Sets the value of the manOrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManOrdInd(String value) {
        this.manOrdInd = value;
    }

    /**
     * Gets the value of the custDrctdOrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustDrctdOrd() {
        return custDrctdOrd;
    }

    /**
     * Sets the value of the custDrctdOrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustDrctdOrd(String value) {
        this.custDrctdOrd = value;
    }

    /**
     * Gets the value of the rcvdDptID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvdDptID() {
        return rcvdDptID;
    }

    /**
     * Sets the value of the rcvdDptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvdDptID(String value) {
        this.rcvdDptID = value;
    }

    /**
     * Gets the value of the custOrdHdlInst property.
     * 
     * @return
     *     possible object is
     *     {@link CustOrderHandlingInstEnumT }
     *     
     */
    public CustOrderHandlingInstEnumT getCustOrdHdlInst() {
        return custOrdHdlInst;
    }

    /**
     * Sets the value of the custOrdHdlInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustOrderHandlingInstEnumT }
     *     
     */
    public void setCustOrdHdlInst(CustOrderHandlingInstEnumT value) {
        this.custOrdHdlInst = value;
    }

    /**
     * Gets the value of the ordHndlInstSrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrdHndlInstSrc() {
        return ordHndlInstSrc;
    }

    /**
     * Sets the value of the ordHndlInstSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrdHndlInstSrc(BigInteger value) {
        this.ordHndlInstSrc = value;
    }

    /**
     * Gets the value of the vol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVol() {
        return vol;
    }

    /**
     * Sets the value of the vol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVol(BigDecimal value) {
        this.vol = value;
    }

    /**
     * Gets the value of the tmToExp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTmToExp() {
        return tmToExp;
    }

    /**
     * Sets the value of the tmToExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTmToExp(BigDecimal value) {
        this.tmToExp = value;
    }

    /**
     * Gets the value of the rfr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRFR() {
        return rfr;
    }

    /**
     * Sets the value of the rfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRFR(BigDecimal value) {
        this.rfr = value;
    }

    /**
     * Gets the value of the pxDelta property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPxDelta() {
        return pxDelta;
    }

    /**
     * Sets the value of the pxDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPxDelta(BigDecimal value) {
        this.pxDelta = value;
    }

}
