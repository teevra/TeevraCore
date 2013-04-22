
package com.headstrong.teevra_fixml_1_0;

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
 * ListStatus can be found in Volume4 of the specification 
 * 
 * <p>Java class for ListStatus_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListStatus_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}ListStatusElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}ListStatusAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListStatus_message_t", propOrder = {
    "listStat"
})
public class ListStatusMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "ListStat", required = true)
    protected List<OrdListStatGrpBlockT> listStat;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "ListStatTyp")
    protected BigInteger listStatTyp;
    @XmlAttribute(name = "NoRpts")
    protected BigInteger noRpts;
    @XmlAttribute(name = "ListOrdStat")
    protected BigInteger listOrdStat;
    @XmlAttribute(name = "ContingencyType")
    protected String contingencyType;
    @XmlAttribute(name = "ListRejectReason")
    protected String listRejectReason;
    @XmlAttribute(name = "RptSeq")
    protected BigInteger rptSeq;
    @XmlAttribute(name = "ListStatText")
    protected String listStatText;
    @XmlAttribute(name = "EncListStatTextLen")
    protected BigInteger encListStatTextLen;
    @XmlAttribute(name = "EncListStatText")
    protected String encListStatText;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "TotNoOrds")
    protected BigInteger totNoOrds;
    @XmlAttribute(name = "LastFragment")
    protected LastFragmentEnumT lastFragment;

    /**
     * Gets the value of the listStat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listStat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListStat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrdListStatGrpBlockT }
     * 
     * 
     */
    public List<OrdListStatGrpBlockT> getListStat() {
        if (listStat == null) {
            listStat = new ArrayList<OrdListStatGrpBlockT>();
        }
        return this.listStat;
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
     * Gets the value of the listStatTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getListStatTyp() {
        return listStatTyp;
    }

    /**
     * Sets the value of the listStatTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setListStatTyp(BigInteger value) {
        this.listStatTyp = value;
    }

    /**
     * Gets the value of the noRpts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoRpts() {
        return noRpts;
    }

    /**
     * Sets the value of the noRpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoRpts(BigInteger value) {
        this.noRpts = value;
    }

    /**
     * Gets the value of the listOrdStat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getListOrdStat() {
        return listOrdStat;
    }

    /**
     * Sets the value of the listOrdStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setListOrdStat(BigInteger value) {
        this.listOrdStat = value;
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
     * Gets the value of the listRejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListRejectReason() {
        return listRejectReason;
    }

    /**
     * Sets the value of the listRejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListRejectReason(String value) {
        this.listRejectReason = value;
    }

    /**
     * Gets the value of the rptSeq property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRptSeq() {
        return rptSeq;
    }

    /**
     * Sets the value of the rptSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRptSeq(BigInteger value) {
        this.rptSeq = value;
    }

    /**
     * Gets the value of the listStatText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListStatText() {
        return listStatText;
    }

    /**
     * Sets the value of the listStatText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListStatText(String value) {
        this.listStatText = value;
    }

    /**
     * Gets the value of the encListStatTextLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncListStatTextLen() {
        return encListStatTextLen;
    }

    /**
     * Sets the value of the encListStatTextLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncListStatTextLen(BigInteger value) {
        this.encListStatTextLen = value;
    }

    /**
     * Gets the value of the encListStatText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncListStatText() {
        return encListStatText;
    }

    /**
     * Sets the value of the encListStatText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncListStatText(String value) {
        this.encListStatText = value;
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
