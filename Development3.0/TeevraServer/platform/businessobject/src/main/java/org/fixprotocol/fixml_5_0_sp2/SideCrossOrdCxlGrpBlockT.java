
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
 * <p>Java class for SideCrossOrdCxlGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SideCrossOrdCxlGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SideCrossOrdCxlGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SideCrossOrdCxlGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SideCrossOrdCxlGrp_Block_t", propOrder = {
    "pty",
    "ordQty"
})
public class SideCrossOrdCxlGrpBlockT {

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "OrdQty", required = true)
    protected OrderQtyDataBlockT ordQty;
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
    @XmlAttribute(name = "OrigOrdModTm")
    protected XMLGregorianCalendar origOrdModTm;
    @XmlAttribute(name = "OrignDt")
    protected XMLGregorianCalendar orignDt;
    @XmlAttribute(name = "TrdDt")
    protected XMLGregorianCalendar trdDt;
    @XmlAttribute(name = "ComplianceID")
    protected String complianceID;
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
