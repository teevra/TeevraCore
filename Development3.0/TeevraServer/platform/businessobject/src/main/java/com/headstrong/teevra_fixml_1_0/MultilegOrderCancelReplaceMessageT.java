
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
 * MultilegOrderCancelReplace can be found in Volume4 of the specification 
 * 
 * <p>Java class for MultilegOrderCancelReplace_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultilegOrderCancelReplace_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}MultilegOrderCancelReplaceElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}MultilegOrderCancelReplaceAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultilegOrderCancelReplace_message_t", propOrder = {
    "pty",
    "preAllocMleg",
    "dsplyInstr",
    "trdSes",
    "instrmt",
    "undly",
    "ord",
    "ordQty",
    "trgrInstr",
    "comm",
    "pegInstr",
    "discInstr",
    "strtPrmGrp"
})
public class MultilegOrderCancelReplaceMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "PreAllocMleg")
    protected List<PreAllocMlegGrpBlockT> preAllocMleg;
    @XmlElement(name = "DsplyInstr")
    protected DisplayInstructionBlockT dsplyInstr;
    @XmlElement(name = "TrdSes")
    protected List<TrdgSesGrpBlockT> trdSes;
    @XmlElement(name = "Instrmt")
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "Undly")
    protected List<UndInstrmtGrpBlockT> undly;
    @XmlElement(name = "Ord")
    protected List<LegOrdGrpBlockT> ord;
    @XmlElement(name = "OrdQty", required = true)
    protected OrderQtyDataBlockT ordQty;
    @XmlElement(name = "TrgrInstr")
    protected TriggeringInstructionBlockT trgrInstr;
    @XmlElement(name = "Comm")
    protected CommissionDataBlockT comm;
    @XmlElement(name = "PegInstr")
    protected PegInstructionsBlockT pegInstr;
    @XmlElement(name = "DiscInstr")
    protected DiscretionInstructionsBlockT discInstr;
    @XmlElement(name = "StrtPrmGrp")
    protected List<StrategyParametersGrpBlockT> strtPrmGrp;
    @XmlAttribute(name = "OrdID")
    protected String ordID;
    @XmlAttribute(name = "OrigClOrdID")
    protected String origClOrdID;
    @XmlAttribute(name = "ClOrdID")
    protected String clOrdID;
    @XmlAttribute(name = "ClOrdID2")
    protected String clOrdID2;
    @XmlAttribute(name = "ClOrdLinkID")
    protected String clOrdLinkID;
    @XmlAttribute(name = "OrigOrdModTm")
    protected XMLGregorianCalendar origOrdModTm;
    @XmlAttribute(name = "OrignDt")
    protected XMLGregorianCalendar orignDt;
    @XmlAttribute(name = "TrdDt")
    protected XMLGregorianCalendar trdDt;
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
    @XmlAttribute(name = "CshMgn")
    protected String cshMgn;
    @XmlAttribute(name = "ClrFeeInd")
    protected String clrFeeInd;
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
    @XmlAttribute(name = "Side")
    protected String side;
    @XmlAttribute(name = "PrevClsPx")
    protected BigDecimal prevClsPx;
    @XmlAttribute(name = "SwapPnts")
    protected BigDecimal swapPnts;
    @XmlAttribute(name = "LocReqd")
    protected LocateReqdEnumT locReqd;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "QtyTyp")
    protected BigInteger qtyTyp;
    @XmlAttribute(name = "OrdTyp")
    protected String ordTyp;
    @XmlAttribute(name = "MlegModel")
    protected BigInteger mlegModel;
    @XmlAttribute(name = "MlegPxMeth")
    protected BigInteger mlegPxMeth;
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
    @XmlAttribute(name = "SolFlag")
    protected SolicitedFlagEnumT solFlag;
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
    @XmlAttribute(name = "Cpcty")
    protected OrderCapacityEnumT cpcty;
    @XmlAttribute(name = "Rstctions")
    protected String rstctions;
    @XmlAttribute(name = "PrTrdAnon")
    protected String prTrdAnon;
    @XmlAttribute(name = "CustCpcty")
    protected BigInteger custCpcty;
    @XmlAttribute(name = "ForexReq")
    protected ForexReqEnumT forexReq;
    @XmlAttribute(name = "SettlCcy")
    protected String settlCcy;
    @XmlAttribute(name = "BkngTyp")
    protected BigInteger bkngTyp;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;
    @XmlAttribute(name = "PosEfct")
    protected PositionEffectEnumT posEfct;
    @XmlAttribute(name = "Covered")
    protected BigInteger covered;
    @XmlAttribute(name = "MaxShow")
    protected BigDecimal maxShow;
    @XmlAttribute(name = "TgtStrategy")
    protected String tgtStrategy;
    @XmlAttribute(name = "TgtStrategyParameters")
    protected String tgtStrategyParameters;
    @XmlAttribute(name = "RFR")
    protected BigDecimal rfr;
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
    @XmlAttribute(name = "MLEGRptTypReq")
    protected BigInteger mlegRptTypReq;

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
     * Gets the value of the preAllocMleg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preAllocMleg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreAllocMleg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreAllocMlegGrpBlockT }
     * 
     * 
     */
    public List<PreAllocMlegGrpBlockT> getPreAllocMleg() {
        if (preAllocMleg == null) {
            preAllocMleg = new ArrayList<PreAllocMlegGrpBlockT>();
        }
        return this.preAllocMleg;
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
     * Gets the value of the ord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegOrdGrpBlockT }
     * 
     * 
     */
    public List<LegOrdGrpBlockT> getOrd() {
        if (ord == null) {
            ord = new ArrayList<LegOrdGrpBlockT>();
        }
        return this.ord;
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
     * Gets the value of the origClOrdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigClOrdID() {
        return origClOrdID;
    }

    /**
     * Sets the value of the origClOrdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigClOrdID(String value) {
        this.origClOrdID = value;
    }

    /**
     * Gets the value of the clOrdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClOrdID() {
        return clOrdID;
    }

    /**
     * Sets the value of the clOrdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClOrdID(String value) {
        this.clOrdID = value;
    }

    /**
     * Gets the value of the clOrdID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClOrdID2() {
        return clOrdID2;
    }

    /**
     * Sets the value of the clOrdID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClOrdID2(String value) {
        this.clOrdID2 = value;
    }

    /**
     * Gets the value of the clOrdLinkID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClOrdLinkID() {
        return clOrdLinkID;
    }

    /**
     * Sets the value of the clOrdLinkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClOrdLinkID(String value) {
        this.clOrdLinkID = value;
    }

    /**
     * Gets the value of the origOrdModTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigOrdModTm() {
        return origOrdModTm;
    }

    /**
     * Sets the value of the origOrdModTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigOrdModTm(XMLGregorianCalendar value) {
        this.origOrdModTm = value;
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
     * Gets the value of the swapPnts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSwapPnts() {
        return swapPnts;
    }

    /**
     * Sets the value of the swapPnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSwapPnts(BigDecimal value) {
        this.swapPnts = value;
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
     * Gets the value of the mlegModel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMlegModel() {
        return mlegModel;
    }

    /**
     * Sets the value of the mlegModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMlegModel(BigInteger value) {
        this.mlegModel = value;
    }

    /**
     * Gets the value of the mlegPxMeth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMlegPxMeth() {
        return mlegPxMeth;
    }

    /**
     * Sets the value of the mlegPxMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMlegPxMeth(BigInteger value) {
        this.mlegPxMeth = value;
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
     * Gets the value of the forexReq property.
     * 
     * @return
     *     possible object is
     *     {@link ForexReqEnumT }
     *     
     */
    public ForexReqEnumT getForexReq() {
        return forexReq;
    }

    /**
     * Sets the value of the forexReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForexReqEnumT }
     *     
     */
    public void setForexReq(ForexReqEnumT value) {
        this.forexReq = value;
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
     * Gets the value of the covered property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCovered() {
        return covered;
    }

    /**
     * Sets the value of the covered property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCovered(BigInteger value) {
        this.covered = value;
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

    /**
     * Gets the value of the mlegRptTypReq property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMLEGRptTypReq() {
        return mlegRptTypReq;
    }

    /**
     * Sets the value of the mlegRptTypReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMLEGRptTypReq(BigInteger value) {
        this.mlegRptTypReq = value;
    }

}