
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
 * SettlementInstructions can be found in Volume5 of the specification 
 * 
 * <p>Java class for SettlementInstructions_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementInstructions_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SettlementInstructionsElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SettlementInstructionsAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInstructions_message_t", propOrder = {
    "setInst"
})
public class SettlementInstructionsMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "SetInst")
    protected List<SettlInstGrpBlockT> setInst;
    @XmlAttribute(name = "SettlInstMsgID")
    protected String settlInstMsgID;
    @XmlAttribute(name = "SettlInstReqID")
    protected String settlInstReqID;
    @XmlAttribute(name = "SettlInstMode")
    protected String settlInstMode;
    @XmlAttribute(name = "SettlInstReqRejCode")
    protected String settlInstReqRejCode;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;
    @XmlAttribute(name = "ClOrdID")
    protected String clOrdID;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;

    /**
     * Gets the value of the setInst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setInst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetInst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlInstGrpBlockT }
     * 
     * 
     */
    public List<SettlInstGrpBlockT> getSetInst() {
        if (setInst == null) {
            setInst = new ArrayList<SettlInstGrpBlockT>();
        }
        return this.setInst;
    }

    /**
     * Gets the value of the settlInstMsgID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlInstMsgID() {
        return settlInstMsgID;
    }

    /**
     * Sets the value of the settlInstMsgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlInstMsgID(String value) {
        this.settlInstMsgID = value;
    }

    /**
     * Gets the value of the settlInstReqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlInstReqID() {
        return settlInstReqID;
    }

    /**
     * Sets the value of the settlInstReqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlInstReqID(String value) {
        this.settlInstReqID = value;
    }

    /**
     * Gets the value of the settlInstMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlInstMode() {
        return settlInstMode;
    }

    /**
     * Sets the value of the settlInstMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlInstMode(String value) {
        this.settlInstMode = value;
    }

    /**
     * Gets the value of the settlInstReqRejCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlInstReqRejCode() {
        return settlInstReqRejCode;
    }

    /**
     * Sets the value of the settlInstReqRejCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlInstReqRejCode(String value) {
        this.settlInstReqRejCode = value;
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

}
