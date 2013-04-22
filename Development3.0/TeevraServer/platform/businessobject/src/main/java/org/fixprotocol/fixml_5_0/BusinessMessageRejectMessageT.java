//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.08 at 01:47:27 PM IST 
//


package org.fixprotocol.fixml_5_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * BusinessMessageReject can be found in Volume1 of the specification
 * 			  
 * 
 * <p>Java class for BusinessMessageReject_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessMessageReject_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0}BusinessMessageRejectElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0}BusinessMessageRejectAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessMessageReject_message_t")
public class BusinessMessageRejectMessageT
    extends AbstractMessageT
{

    @XmlAttribute(name = "RefSeqNum")
    protected BigInteger refSeqNum;
    @XmlAttribute(name = "RefMsgTyp", required = true)
    protected String refMsgTyp;
    @XmlAttribute(name = "BizRejRefID")
    protected String bizRejRefID;
    @XmlAttribute(name = "BizRejRsn", required = true)
    protected int bizRejRsn;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;

    /**
     * Gets the value of the refSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefSeqNum() {
        return refSeqNum;
    }

    /**
     * Sets the value of the refSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefSeqNum(BigInteger value) {
        this.refSeqNum = value;
    }

    /**
     * Gets the value of the refMsgTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefMsgTyp() {
        return refMsgTyp;
    }

    /**
     * Sets the value of the refMsgTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefMsgTyp(String value) {
        this.refMsgTyp = value;
    }

    /**
     * Gets the value of the bizRejRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizRejRefID() {
        return bizRejRefID;
    }

    /**
     * Sets the value of the bizRejRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizRejRefID(String value) {
        this.bizRejRefID = value;
    }

    /**
     * Gets the value of the bizRejRsn property.
     * 
     */
    public int getBizRejRsn() {
        return bizRejRsn;
    }

    /**
     * Sets the value of the bizRejRsn property.
     * 
     */
    public void setBizRejRsn(int value) {
        this.bizRejRsn = value;
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
