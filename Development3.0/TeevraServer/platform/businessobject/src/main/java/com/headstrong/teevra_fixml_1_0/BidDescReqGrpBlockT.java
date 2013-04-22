
package com.headstrong.teevra_fixml_1_0;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidDescReqGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BidDescReqGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}BidDescReqGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}BidDescReqGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidDescReqGrp_Block_t")
public class BidDescReqGrpBlockT {

    @XmlAttribute(name = "BidDescptrTyp")
    protected BigInteger bidDescptrTyp;
    @XmlAttribute(name = "BidDescptr")
    protected String bidDescptr;
    @XmlAttribute(name = "SideValuInd")
    protected BigInteger sideValuInd;
    @XmlAttribute(name = "LqdtyValu")
    protected BigDecimal lqdtyValu;
    @XmlAttribute(name = "LqdtyNumSecurities")
    protected BigInteger lqdtyNumSecurities;
    @XmlAttribute(name = "LqdtyPctLow")
    protected BigDecimal lqdtyPctLow;
    @XmlAttribute(name = "LqdtyPctHigh")
    protected BigDecimal lqdtyPctHigh;
    @XmlAttribute(name = "EFPTrkngErr")
    protected BigDecimal efpTrkngErr;
    @XmlAttribute(name = "FairValu")
    protected BigDecimal fairValu;
    @XmlAttribute(name = "OutsideNdxPct")
    protected BigDecimal outsideNdxPct;
    @XmlAttribute(name = "ValuOfFuts")
    protected BigDecimal valuOfFuts;

    /**
     * Gets the value of the bidDescptrTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBidDescptrTyp() {
        return bidDescptrTyp;
    }

    /**
     * Sets the value of the bidDescptrTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBidDescptrTyp(BigInteger value) {
        this.bidDescptrTyp = value;
    }

    /**
     * Gets the value of the bidDescptr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidDescptr() {
        return bidDescptr;
    }

    /**
     * Sets the value of the bidDescptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidDescptr(String value) {
        this.bidDescptr = value;
    }

    /**
     * Gets the value of the sideValuInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSideValuInd() {
        return sideValuInd;
    }

    /**
     * Sets the value of the sideValuInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSideValuInd(BigInteger value) {
        this.sideValuInd = value;
    }

    /**
     * Gets the value of the lqdtyValu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLqdtyValu() {
        return lqdtyValu;
    }

    /**
     * Sets the value of the lqdtyValu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLqdtyValu(BigDecimal value) {
        this.lqdtyValu = value;
    }

    /**
     * Gets the value of the lqdtyNumSecurities property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLqdtyNumSecurities() {
        return lqdtyNumSecurities;
    }

    /**
     * Sets the value of the lqdtyNumSecurities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLqdtyNumSecurities(BigInteger value) {
        this.lqdtyNumSecurities = value;
    }

    /**
     * Gets the value of the lqdtyPctLow property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLqdtyPctLow() {
        return lqdtyPctLow;
    }

    /**
     * Sets the value of the lqdtyPctLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLqdtyPctLow(BigDecimal value) {
        this.lqdtyPctLow = value;
    }

    /**
     * Gets the value of the lqdtyPctHigh property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLqdtyPctHigh() {
        return lqdtyPctHigh;
    }

    /**
     * Sets the value of the lqdtyPctHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLqdtyPctHigh(BigDecimal value) {
        this.lqdtyPctHigh = value;
    }

    /**
     * Gets the value of the efpTrkngErr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEFPTrkngErr() {
        return efpTrkngErr;
    }

    /**
     * Sets the value of the efpTrkngErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEFPTrkngErr(BigDecimal value) {
        this.efpTrkngErr = value;
    }

    /**
     * Gets the value of the fairValu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFairValu() {
        return fairValu;
    }

    /**
     * Sets the value of the fairValu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFairValu(BigDecimal value) {
        this.fairValu = value;
    }

    /**
     * Gets the value of the outsideNdxPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutsideNdxPct() {
        return outsideNdxPct;
    }

    /**
     * Sets the value of the outsideNdxPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutsideNdxPct(BigDecimal value) {
        this.outsideNdxPct = value;
    }

    /**
     * Gets the value of the valuOfFuts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValuOfFuts() {
        return valuOfFuts;
    }

    /**
     * Sets the value of the valuOfFuts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValuOfFuts(BigDecimal value) {
        this.valuOfFuts = value;
    }

}
