
package com.headstrong.teevra_fixml_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BaseHeader_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseHeader_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}BaseHeaderElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}BaseHeaderAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseHeader_t", propOrder = {
    "hop"
})
@XmlSeeAlso({
    MessageHeaderT.class,
    BatchHeaderT.class
})
public class BaseHeaderT {

    @XmlElement(name = "Hop")
    protected List<HopT> hop;
    @XmlAttribute(name = "SID")
    protected String sid;
    @XmlAttribute(name = "TID")
    protected String tid;
    @XmlAttribute(name = "OBID")
    protected String obid;
    @XmlAttribute(name = "D2ID")
    protected String d2ID;
    @XmlAttribute(name = "SSub")
    protected String sSub;
    @XmlAttribute(name = "SLoc")
    protected String sLoc;
    @XmlAttribute(name = "TSub")
    protected String tSub;
    @XmlAttribute(name = "TLoc")
    protected String tLoc;
    @XmlAttribute(name = "OBSub")
    protected String obSub;
    @XmlAttribute(name = "OBLoc")
    protected String obLoc;
    @XmlAttribute(name = "D2Sub")
    protected String d2Sub;
    @XmlAttribute(name = "D2Loc")
    protected String d2Loc;
    @XmlAttribute(name = "PosDup")
    protected PossDupFlagEnumT posDup;
    @XmlAttribute(name = "PosRsnd")
    protected PossResendEnumT posRsnd;
    @XmlAttribute(name = "Snt")
    protected XMLGregorianCalendar snt;
    @XmlAttribute(name = "OrigSnt")
    protected XMLGregorianCalendar origSnt;
    @XmlAttribute(name = "MsgEncd")
    protected String msgEncd;

    /**
     * Gets the value of the hop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HopT }
     * 
     * 
     */
    public List<HopT> getHop() {
        if (hop == null) {
            hop = new ArrayList<HopT>();
        }
        return this.hop;
    }

    /**
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSID() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSID(String value) {
        this.sid = value;
    }

    /**
     * Gets the value of the tid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTID() {
        return tid;
    }

    /**
     * Sets the value of the tid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTID(String value) {
        this.tid = value;
    }

    /**
     * Gets the value of the obid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBID() {
        return obid;
    }

    /**
     * Sets the value of the obid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBID(String value) {
        this.obid = value;
    }

    /**
     * Gets the value of the d2ID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getD2ID() {
        return d2ID;
    }

    /**
     * Sets the value of the d2ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setD2ID(String value) {
        this.d2ID = value;
    }

    /**
     * Gets the value of the sSub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSub() {
        return sSub;
    }

    /**
     * Sets the value of the sSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSub(String value) {
        this.sSub = value;
    }

    /**
     * Gets the value of the sLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLoc() {
        return sLoc;
    }

    /**
     * Sets the value of the sLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLoc(String value) {
        this.sLoc = value;
    }

    /**
     * Gets the value of the tSub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSub() {
        return tSub;
    }

    /**
     * Sets the value of the tSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSub(String value) {
        this.tSub = value;
    }

    /**
     * Gets the value of the tLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLoc() {
        return tLoc;
    }

    /**
     * Sets the value of the tLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLoc(String value) {
        this.tLoc = value;
    }

    /**
     * Gets the value of the obSub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBSub() {
        return obSub;
    }

    /**
     * Sets the value of the obSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBSub(String value) {
        this.obSub = value;
    }

    /**
     * Gets the value of the obLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBLoc() {
        return obLoc;
    }

    /**
     * Sets the value of the obLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBLoc(String value) {
        this.obLoc = value;
    }

    /**
     * Gets the value of the d2Sub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getD2Sub() {
        return d2Sub;
    }

    /**
     * Sets the value of the d2Sub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setD2Sub(String value) {
        this.d2Sub = value;
    }

    /**
     * Gets the value of the d2Loc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getD2Loc() {
        return d2Loc;
    }

    /**
     * Sets the value of the d2Loc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setD2Loc(String value) {
        this.d2Loc = value;
    }

    /**
     * Gets the value of the posDup property.
     * 
     * @return
     *     possible object is
     *     {@link PossDupFlagEnumT }
     *     
     */
    public PossDupFlagEnumT getPosDup() {
        return posDup;
    }

    /**
     * Sets the value of the posDup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PossDupFlagEnumT }
     *     
     */
    public void setPosDup(PossDupFlagEnumT value) {
        this.posDup = value;
    }

    /**
     * Gets the value of the posRsnd property.
     * 
     * @return
     *     possible object is
     *     {@link PossResendEnumT }
     *     
     */
    public PossResendEnumT getPosRsnd() {
        return posRsnd;
    }

    /**
     * Sets the value of the posRsnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PossResendEnumT }
     *     
     */
    public void setPosRsnd(PossResendEnumT value) {
        this.posRsnd = value;
    }

    /**
     * Gets the value of the snt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSnt() {
        return snt;
    }

    /**
     * Sets the value of the snt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSnt(XMLGregorianCalendar value) {
        this.snt = value;
    }

    /**
     * Gets the value of the origSnt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigSnt() {
        return origSnt;
    }

    /**
     * Sets the value of the origSnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigSnt(XMLGregorianCalendar value) {
        this.origSnt = value;
    }

    /**
     * Gets the value of the msgEncd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgEncd() {
        return msgEncd;
    }

    /**
     * Sets the value of the msgEncd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgEncd(String value) {
        this.msgEncd = value;
    }

}
