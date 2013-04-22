
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
 * BidRequest can be found in Volume4 of the specification 
 * 
 * <p>Java class for BidRequest_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BidRequest_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}BidRequestElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}BidRequestAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidRequest_message_t", propOrder = {
    "descReq",
    "compReq"
})
public class BidRequestMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "DescReq")
    protected List<BidDescReqGrpBlockT> descReq;
    @XmlElement(name = "CompReq")
    protected List<BidCompReqGrpBlockT> compReq;
    @XmlAttribute(name = "BidID")
    protected String bidID;
    @XmlAttribute(name = "ClBidID")
    protected String clBidID;
    @XmlAttribute(name = "BidReqTransTyp")
    protected BidRequestTransTypeEnumT bidReqTransTyp;
    @XmlAttribute(name = "ListName")
    protected String listName;
    @XmlAttribute(name = "TotNoReltdSym")
    protected BigInteger totNoReltdSym;
    @XmlAttribute(name = "BidTyp")
    protected BigInteger bidTyp;
    @XmlAttribute(name = "NumTkts")
    protected BigInteger numTkts;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "SideValu1")
    protected BigDecimal sideValu1;
    @XmlAttribute(name = "SideValu2")
    protected BigDecimal sideValu2;
    @XmlAttribute(name = "LqdtyIndTyp")
    protected BigInteger lqdtyIndTyp;
    @XmlAttribute(name = "WtAvgLqdty")
    protected BigDecimal wtAvgLqdty;
    @XmlAttribute(name = "EFP")
    protected ExchangeForPhysicalEnumT efp;
    @XmlAttribute(name = "OutMainCntryUNdx")
    protected BigDecimal outMainCntryUNdx;
    @XmlAttribute(name = "CrssPct")
    protected BigDecimal crssPct;
    @XmlAttribute(name = "ProgRptReqs")
    protected BigInteger progRptReqs;
    @XmlAttribute(name = "ProgPeriodIntvl")
    protected BigInteger progPeriodIntvl;
    @XmlAttribute(name = "IncTaxInd")
    protected BigInteger incTaxInd;
    @XmlAttribute(name = "ForexReq")
    protected ForexReqEnumT forexReq;
    @XmlAttribute(name = "NumBidders")
    protected BigInteger numBidders;
    @XmlAttribute(name = "TrdDt")
    protected XMLGregorianCalendar trdDt;
    @XmlAttribute(name = "BidTrdTyp")
    protected BidTradeTypeEnumT bidTrdTyp;
    @XmlAttribute(name = "BasisPxTyp")
    protected String basisPxTyp;
    @XmlAttribute(name = "StrkTm")
    protected XMLGregorianCalendar strkTm;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;

    /**
     * Gets the value of the descReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BidDescReqGrpBlockT }
     * 
     * 
     */
    public List<BidDescReqGrpBlockT> getDescReq() {
        if (descReq == null) {
            descReq = new ArrayList<BidDescReqGrpBlockT>();
        }
        return this.descReq;
    }

    /**
     * Gets the value of the compReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BidCompReqGrpBlockT }
     * 
     * 
     */
    public List<BidCompReqGrpBlockT> getCompReq() {
        if (compReq == null) {
            compReq = new ArrayList<BidCompReqGrpBlockT>();
        }
        return this.compReq;
    }

    /**
     * Gets the value of the bidID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidID() {
        return bidID;
    }

    /**
     * Sets the value of the bidID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidID(String value) {
        this.bidID = value;
    }

    /**
     * Gets the value of the clBidID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClBidID() {
        return clBidID;
    }

    /**
     * Sets the value of the clBidID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClBidID(String value) {
        this.clBidID = value;
    }

    /**
     * Gets the value of the bidReqTransTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BidRequestTransTypeEnumT }
     *     
     */
    public BidRequestTransTypeEnumT getBidReqTransTyp() {
        return bidReqTransTyp;
    }

    /**
     * Sets the value of the bidReqTransTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidRequestTransTypeEnumT }
     *     
     */
    public void setBidReqTransTyp(BidRequestTransTypeEnumT value) {
        this.bidReqTransTyp = value;
    }

    /**
     * Gets the value of the listName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListName() {
        return listName;
    }

    /**
     * Sets the value of the listName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListName(String value) {
        this.listName = value;
    }

    /**
     * Gets the value of the totNoReltdSym property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNoReltdSym() {
        return totNoReltdSym;
    }

    /**
     * Sets the value of the totNoReltdSym property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNoReltdSym(BigInteger value) {
        this.totNoReltdSym = value;
    }

    /**
     * Gets the value of the bidTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBidTyp() {
        return bidTyp;
    }

    /**
     * Sets the value of the bidTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBidTyp(BigInteger value) {
        this.bidTyp = value;
    }

    /**
     * Gets the value of the numTkts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumTkts() {
        return numTkts;
    }

    /**
     * Sets the value of the numTkts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumTkts(BigInteger value) {
        this.numTkts = value;
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
     * Gets the value of the sideValu1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSideValu1() {
        return sideValu1;
    }

    /**
     * Sets the value of the sideValu1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSideValu1(BigDecimal value) {
        this.sideValu1 = value;
    }

    /**
     * Gets the value of the sideValu2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSideValu2() {
        return sideValu2;
    }

    /**
     * Sets the value of the sideValu2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSideValu2(BigDecimal value) {
        this.sideValu2 = value;
    }

    /**
     * Gets the value of the lqdtyIndTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLqdtyIndTyp() {
        return lqdtyIndTyp;
    }

    /**
     * Sets the value of the lqdtyIndTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLqdtyIndTyp(BigInteger value) {
        this.lqdtyIndTyp = value;
    }

    /**
     * Gets the value of the wtAvgLqdty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWtAvgLqdty() {
        return wtAvgLqdty;
    }

    /**
     * Sets the value of the wtAvgLqdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWtAvgLqdty(BigDecimal value) {
        this.wtAvgLqdty = value;
    }

    /**
     * Gets the value of the efp property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeForPhysicalEnumT }
     *     
     */
    public ExchangeForPhysicalEnumT getEFP() {
        return efp;
    }

    /**
     * Sets the value of the efp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeForPhysicalEnumT }
     *     
     */
    public void setEFP(ExchangeForPhysicalEnumT value) {
        this.efp = value;
    }

    /**
     * Gets the value of the outMainCntryUNdx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutMainCntryUNdx() {
        return outMainCntryUNdx;
    }

    /**
     * Sets the value of the outMainCntryUNdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutMainCntryUNdx(BigDecimal value) {
        this.outMainCntryUNdx = value;
    }

    /**
     * Gets the value of the crssPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCrssPct() {
        return crssPct;
    }

    /**
     * Sets the value of the crssPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCrssPct(BigDecimal value) {
        this.crssPct = value;
    }

    /**
     * Gets the value of the progRptReqs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProgRptReqs() {
        return progRptReqs;
    }

    /**
     * Sets the value of the progRptReqs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProgRptReqs(BigInteger value) {
        this.progRptReqs = value;
    }

    /**
     * Gets the value of the progPeriodIntvl property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProgPeriodIntvl() {
        return progPeriodIntvl;
    }

    /**
     * Sets the value of the progPeriodIntvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProgPeriodIntvl(BigInteger value) {
        this.progPeriodIntvl = value;
    }

    /**
     * Gets the value of the incTaxInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIncTaxInd() {
        return incTaxInd;
    }

    /**
     * Sets the value of the incTaxInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIncTaxInd(BigInteger value) {
        this.incTaxInd = value;
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
     * Gets the value of the numBidders property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumBidders() {
        return numBidders;
    }

    /**
     * Sets the value of the numBidders property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumBidders(BigInteger value) {
        this.numBidders = value;
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
     * Gets the value of the bidTrdTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BidTradeTypeEnumT }
     *     
     */
    public BidTradeTypeEnumT getBidTrdTyp() {
        return bidTrdTyp;
    }

    /**
     * Sets the value of the bidTrdTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidTradeTypeEnumT }
     *     
     */
    public void setBidTrdTyp(BidTradeTypeEnumT value) {
        this.bidTrdTyp = value;
    }

    /**
     * Gets the value of the basisPxTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasisPxTyp() {
        return basisPxTyp;
    }

    /**
     * Sets the value of the basisPxTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasisPxTyp(String value) {
        this.basisPxTyp = value;
    }

    /**
     * Gets the value of the strkTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStrkTm() {
        return strkTm;
    }

    /**
     * Sets the value of the strkTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStrkTm(XMLGregorianCalendar value) {
        this.strkTm = value;
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

}
