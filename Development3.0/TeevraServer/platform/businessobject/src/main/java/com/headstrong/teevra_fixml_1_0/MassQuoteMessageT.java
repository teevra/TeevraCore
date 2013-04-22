
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


/**
 * MassQuote can be found in Volume3 of the specification 
 * 
 * <p>Java class for MassQuote_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MassQuote_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}MassQuoteElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}MassQuoteAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MassQuote_message_t", propOrder = {
    "pty",
    "quotSet"
})
public class MassQuoteMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "QuotSet", required = true)
    protected List<QuotSetGrpBlockT> quotSet;
    @XmlAttribute(name = "ReqID")
    protected String reqID;
    @XmlAttribute(name = "QID")
    protected String qid;
    @XmlAttribute(name = "Typ")
    protected BigInteger typ;
    @XmlAttribute(name = "RspLvl")
    protected BigInteger rspLvl;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "AcctIDSrc")
    protected String acctIDSrc;
    @XmlAttribute(name = "AcctTyp")
    protected BigInteger acctTyp;
    @XmlAttribute(name = "DefBidSz")
    protected BigDecimal defBidSz;
    @XmlAttribute(name = "DefOfrSz")
    protected BigDecimal defOfrSz;

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
     * Gets the value of the quotSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotSetGrpBlockT }
     * 
     * 
     */
    public List<QuotSetGrpBlockT> getQuotSet() {
        if (quotSet == null) {
            quotSet = new ArrayList<QuotSetGrpBlockT>();
        }
        return this.quotSet;
    }

    /**
     * Gets the value of the reqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqID() {
        return reqID;
    }

    /**
     * Sets the value of the reqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqID(String value) {
        this.reqID = value;
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
     * Gets the value of the rspLvl property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRspLvl() {
        return rspLvl;
    }

    /**
     * Sets the value of the rspLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRspLvl(BigInteger value) {
        this.rspLvl = value;
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
     * Gets the value of the defBidSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefBidSz() {
        return defBidSz;
    }

    /**
     * Sets the value of the defBidSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefBidSz(BigDecimal value) {
        this.defBidSz = value;
    }

    /**
     * Gets the value of the defOfrSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefOfrSz() {
        return defOfrSz;
    }

    /**
     * Sets the value of the defOfrSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefOfrSz(BigDecimal value) {
        this.defOfrSz = value;
    }

}
