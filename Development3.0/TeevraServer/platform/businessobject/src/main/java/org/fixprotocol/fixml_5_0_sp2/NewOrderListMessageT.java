
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


/**
 * NewOrderList can be found in Volume4 of the specification 
 * 
 * <p>Java class for NewOrderList_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewOrderList_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}NewOrderListElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}NewOrderListAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewOrderList_message_t", propOrder = {
    "pty",
    "ord"
})
public class NewOrderListMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Pty")
    protected List<RootPartiesBlockT> pty;
    @XmlElement(name = "Ord", required = true)
    protected List<ListOrdGrpBlockT> ord;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "BidID")
    protected String bidID;
    @XmlAttribute(name = "ClBidID")
    protected String clBidID;
    @XmlAttribute(name = "ProgRptReqs")
    protected BigInteger progRptReqs;
    @XmlAttribute(name = "BidTyp")
    protected BigInteger bidTyp;
    @XmlAttribute(name = "ProgPeriodIntvl")
    protected BigInteger progPeriodIntvl;
    @XmlAttribute(name = "CxllationRights")
    protected CancellationRightsEnumT cxllationRights;
    @XmlAttribute(name = "MnyLaunderingStat")
    protected String mnyLaunderingStat;
    @XmlAttribute(name = "RegistID")
    protected String registID;
    @XmlAttribute(name = "ListExecInstTyp")
    protected String listExecInstTyp;
    @XmlAttribute(name = "ListExecInst")
    protected String listExecInst;
    @XmlAttribute(name = "ContingencyType")
    protected String contingencyType;
    @XmlAttribute(name = "EncListExecInstLen")
    protected BigInteger encListExecInstLen;
    @XmlAttribute(name = "EncListExecInst")
    protected String encListExecInst;
    @XmlAttribute(name = "AOSPct")
    protected BigDecimal aosPct;
    @XmlAttribute(name = "AOSValu")
    protected BigDecimal aosValu;
    @XmlAttribute(name = "AOSCurr")
    protected String aosCurr;
    @XmlAttribute(name = "TotNoOrds")
    protected BigInteger totNoOrds;
    @XmlAttribute(name = "LastFragment")
    protected LastFragmentEnumT lastFragment;

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
     * {@link ListOrdGrpBlockT }
     * 
     * 
     */
    public List<ListOrdGrpBlockT> getOrd() {
        if (ord == null) {
            ord = new ArrayList<ListOrdGrpBlockT>();
        }
        return this.ord;
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
     * Gets the value of the listExecInstTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListExecInstTyp() {
        return listExecInstTyp;
    }

    /**
     * Sets the value of the listExecInstTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListExecInstTyp(String value) {
        this.listExecInstTyp = value;
    }

    /**
     * Gets the value of the listExecInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListExecInst() {
        return listExecInst;
    }

    /**
     * Sets the value of the listExecInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListExecInst(String value) {
        this.listExecInst = value;
    }

    /**
     * Gets the value of the contingencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContingencyType() {
        return contingencyType;
    }

    /**
     * Sets the value of the contingencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContingencyType(String value) {
        this.contingencyType = value;
    }

    /**
     * Gets the value of the encListExecInstLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncListExecInstLen() {
        return encListExecInstLen;
    }

    /**
     * Sets the value of the encListExecInstLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncListExecInstLen(BigInteger value) {
        this.encListExecInstLen = value;
    }

    /**
     * Gets the value of the encListExecInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncListExecInst() {
        return encListExecInst;
    }

    /**
     * Sets the value of the encListExecInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncListExecInst(String value) {
        this.encListExecInst = value;
    }

    /**
     * Gets the value of the aosPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAOSPct() {
        return aosPct;
    }

    /**
     * Sets the value of the aosPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAOSPct(BigDecimal value) {
        this.aosPct = value;
    }

    /**
     * Gets the value of the aosValu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAOSValu() {
        return aosValu;
    }

    /**
     * Sets the value of the aosValu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAOSValu(BigDecimal value) {
        this.aosValu = value;
    }

    /**
     * Gets the value of the aosCurr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAOSCurr() {
        return aosCurr;
    }

    /**
     * Sets the value of the aosCurr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAOSCurr(String value) {
        this.aosCurr = value;
    }

    /**
     * Gets the value of the totNoOrds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNoOrds() {
        return totNoOrds;
    }

    /**
     * Sets the value of the totNoOrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNoOrds(BigInteger value) {
        this.totNoOrds = value;
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

}
