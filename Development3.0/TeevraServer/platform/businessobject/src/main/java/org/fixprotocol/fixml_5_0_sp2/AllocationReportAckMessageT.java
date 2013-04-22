
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
 * AllocationReportAck can be found in Volume5 of the specification 
 * 
 * <p>Java class for AllocationReportAck_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllocationReportAck_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}AllocationReportAckElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}AllocationReportAckAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllocationReportAck_message_t", propOrder = {
    "pty",
    "allocAck"
})
public class AllocationReportAckMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "AllocAck")
    protected List<AllocAckGrpBlockT> allocAck;
    @XmlAttribute(name = "RptID")
    protected String rptID;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "BizDt")
    protected XMLGregorianCalendar bizDt;
    @XmlAttribute(name = "AvgPxInd")
    protected BigInteger avgPxInd;
    @XmlAttribute(name = "Qty")
    protected BigDecimal qty;
    @XmlAttribute(name = "TransTyp")
    protected String transTyp;
    @XmlAttribute(name = "ID2")
    protected String id2;
    @XmlAttribute(name = "TrdDt")
    protected XMLGregorianCalendar trdDt;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "Stat")
    protected BigInteger stat;
    @XmlAttribute(name = "RejCode")
    protected String rejCode;
    @XmlAttribute(name = "RptTyp")
    protected BigInteger rptTyp;
    @XmlAttribute(name = "ImReqTyp")
    protected BigInteger imReqTyp;
    @XmlAttribute(name = "MtchStat")
    protected String mtchStat;
    @XmlAttribute(name = "Prod")
    protected String prod;
    @XmlAttribute(name = "SecTyp")
    protected String secTyp;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;

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
     * Gets the value of the allocAck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allocAck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllocAck().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllocAckGrpBlockT }
     * 
     * 
     */
    public List<AllocAckGrpBlockT> getAllocAck() {
        if (allocAck == null) {
            allocAck = new ArrayList<AllocAckGrpBlockT>();
        }
        return this.allocAck;
    }

    /**
     * Gets the value of the rptID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptID() {
        return rptID;
    }

    /**
     * Sets the value of the rptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptID(String value) {
        this.rptID = value;
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
     * Gets the value of the bizDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBizDt() {
        return bizDt;
    }

    /**
     * Sets the value of the bizDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBizDt(XMLGregorianCalendar value) {
        this.bizDt = value;
    }

    /**
     * Gets the value of the avgPxInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvgPxInd() {
        return avgPxInd;
    }

    /**
     * Sets the value of the avgPxInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvgPxInd(BigInteger value) {
        this.avgPxInd = value;
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
     * Gets the value of the transTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransTyp() {
        return transTyp;
    }

    /**
     * Sets the value of the transTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransTyp(String value) {
        this.transTyp = value;
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
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStat() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStat(BigInteger value) {
        this.stat = value;
    }

    /**
     * Gets the value of the rejCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejCode() {
        return rejCode;
    }

    /**
     * Sets the value of the rejCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejCode(String value) {
        this.rejCode = value;
    }

    /**
     * Gets the value of the rptTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRptTyp() {
        return rptTyp;
    }

    /**
     * Sets the value of the rptTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRptTyp(BigInteger value) {
        this.rptTyp = value;
    }

    /**
     * Gets the value of the imReqTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getImReqTyp() {
        return imReqTyp;
    }

    /**
     * Sets the value of the imReqTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setImReqTyp(BigInteger value) {
        this.imReqTyp = value;
    }

    /**
     * Gets the value of the mtchStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtchStat() {
        return mtchStat;
    }

    /**
     * Sets the value of the mtchStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtchStat(String value) {
        this.mtchStat = value;
    }

    /**
     * Gets the value of the prod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProd() {
        return prod;
    }

    /**
     * Sets the value of the prod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProd(String value) {
        this.prod = value;
    }

    /**
     * Gets the value of the secTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecTyp() {
        return secTyp;
    }

    /**
     * Sets the value of the secTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecTyp(String value) {
        this.secTyp = value;
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