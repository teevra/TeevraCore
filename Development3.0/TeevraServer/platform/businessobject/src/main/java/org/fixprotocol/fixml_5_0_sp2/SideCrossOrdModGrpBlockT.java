
package org.fixprotocol.fixml_5_0_sp2;

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
 * <p>Java class for SideCrossOrdModGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SideCrossOrdModGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SideCrossOrdModGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SideCrossOrdModGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SideCrossOrdModGrp_Block_t", propOrder = {
    "pty",
    "preAll",
    "ordQty",
    "comm"
})
public class SideCrossOrdModGrpBlockT {

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "PreAll")
    protected List<PreAllocGrpBlockT> preAll;
    @XmlElement(name = "OrdQty", required = true)
    protected OrderQtyDataBlockT ordQty;
    @XmlElement(name = "Comm")
    protected CommissionDataBlockT comm;
    @XmlAttribute(name = "Side")
    protected String side;
    @XmlAttribute(name = "OrigClOrdID")
    protected String origClOrdID;
    @XmlAttribute(name = "ClOrdID")
    protected String clOrdID;
    @XmlAttribute(name = "ClOrdID2")
    protected String clOrdID2;
    @XmlAttribute(name = "ClOrdLinkID")
    protected String clOrdLinkID;
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
    @XmlAttribute(name = "QtyTyp")
    protected BigInteger qtyTyp;
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
    @XmlAttribute(name = "CshMgn")
    protected String cshMgn;
    @XmlAttribute(name = "ClrFeeInd")
    protected String clrFeeInd;
    @XmlAttribute(name = "SolFlag")
    protected SolicitedFlagEnumT solFlag;
    @XmlAttribute(name = "SideComplianceID")
    protected String sideComplianceID;
    @XmlAttribute(name = "SideTmFrc")
    protected XMLGregorianCalendar sideTmFrc;

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
     * Gets the value of the sideComplianceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSideComplianceID() {
        return sideComplianceID;
    }

    /**
     * Sets the value of the sideComplianceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSideComplianceID(String value) {
        this.sideComplianceID = value;
    }

    /**
     * Gets the value of the sideTmFrc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSideTmFrc() {
        return sideTmFrc;
    }

    /**
     * Sets the value of the sideTmFrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSideTmFrc(XMLGregorianCalendar value) {
        this.sideTmFrc = value;
    }

}
