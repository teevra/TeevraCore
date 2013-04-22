//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.08 at 01:47:27 PM IST 
//


package org.fixprotocol.fixml_5_0;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Instrument is a component
 * 
 * <p>Java class for Instrument_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Instrument_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0}InstrumentElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0}InstrumentAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Instrument_Block_t", propOrder = {
    "aid",
    "evnt",
    "pty"
})
public class InstrumentBlockT {

    @XmlElement(name = "AID")
    protected SecAltIDGrpBlockT aid;
    @XmlElement(name = "Evnt")
    protected EvntGrpBlockT evnt;
    @XmlElement(name = "Pty")
    protected InstrumentPartiesBlockT pty;
    @XmlAttribute(name = "Sym")
    protected String sym;
    @XmlAttribute(name = "Sfx")
    protected SymbolSfxEnumT sfx;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Src")
    protected String src;
    @XmlAttribute(name = "Prod")
    protected Integer prod;
    @XmlAttribute(name = "CFI")
    protected String cfi;
    @XmlAttribute(name = "SecTyp")
    protected SecurityTypeEnumT secTyp;
    @XmlAttribute(name = "SubTyp")
    protected String subTyp;
    @XmlAttribute(name = "MMY")
    protected String mmy;
    @XmlAttribute(name = "MatDt")
    protected XMLGregorianCalendar matDt;
    @XmlAttribute(name = "MatTm")
    protected XMLGregorianCalendar matTm;
    @XmlAttribute(name = "SettlOnOpenFlag")
    protected String settlOnOpenFlag;
    @XmlAttribute(name = "AsgnMeth")
    protected String asgnMeth;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "CpnPmt")
    protected XMLGregorianCalendar cpnPmt;
    @XmlAttribute(name = "Issued")
    protected XMLGregorianCalendar issued;
    @XmlAttribute(name = "RepoCollSecTyp")
    protected Integer repoCollSecTyp;
    @XmlAttribute(name = "RepoTrm")
    protected Integer repoTrm;
    @XmlAttribute(name = "RepoRt")
    protected BigDecimal repoRt;
    @XmlAttribute(name = "Fctr")
    protected BigDecimal fctr;
    @XmlAttribute(name = "CrdRtg")
    protected String crdRtg;
    @XmlAttribute(name = "Rgstry")
    protected String rgstry;
    @XmlAttribute(name = "IssuCtry")
    protected String issuCtry;
    @XmlAttribute(name = "StPrv")
    protected String stPrv;
    @XmlAttribute(name = "Lcl")
    protected String lcl;
    @XmlAttribute(name = "Redeem")
    protected XMLGregorianCalendar redeem;
    @XmlAttribute(name = "StrkPx")
    protected BigDecimal strkPx;
    @XmlAttribute(name = "StrkCcy")
    protected String strkCcy;
    @XmlAttribute(name = "StrkMult")
    protected BigDecimal strkMult;
    @XmlAttribute(name = "StrkValu")
    protected BigDecimal strkValu;
    @XmlAttribute(name = "OptAt")
    protected String optAt;
    @XmlAttribute(name = "Mult")
    protected BigDecimal mult;
    @XmlAttribute(name = "MinPxIncr")
    protected BigDecimal minPxIncr;
    @XmlAttribute(name = "UOM")
    protected UnitofMeasureEnumT uom;
    @XmlAttribute(name = "TmUnit")
    protected TimeUnitEnumT tmUnit;
    @XmlAttribute(name = "CpnRt")
    protected BigDecimal cpnRt;
    @XmlAttribute(name = "Exch")
    protected String exch;
    @XmlAttribute(name = "PosLmt")
    protected Integer posLmt;
    @XmlAttribute(name = "NTPosLmt")
    protected Integer ntPosLmt;
    @XmlAttribute(name = "Issr")
    protected String issr;
    @XmlAttribute(name = "EncIssrLen")
    protected BigInteger encIssrLen;
    @XmlAttribute(name = "EncIssr")
    protected String encIssr;
    @XmlAttribute(name = "Desc")
    protected String desc;
    @XmlAttribute(name = "EncSecDescLen")
    protected BigInteger encSecDescLen;
    @XmlAttribute(name = "EncSecDesc")
    protected String encSecDesc;
    @XmlAttribute(name = "Pool")
    protected String pool;
    @XmlAttribute(name = "CSetMo")
    protected String cSetMo;
    @XmlAttribute(name = "CPPgm")
    protected String cpPgm;
    @XmlAttribute(name = "CPRegT")
    protected String cpRegT;
    @XmlAttribute(name = "Dated")
    protected XMLGregorianCalendar dated;
    @XmlAttribute(name = "IntAcrl")
    protected XMLGregorianCalendar intAcrl;

    /**
     * Gets the value of the aid property.
     * 
     * @return
     *     possible object is
     *     {@link SecAltIDGrpBlockT }
     *     
     */
    public SecAltIDGrpBlockT getAID() {
        return aid;
    }

    /**
     * Sets the value of the aid property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecAltIDGrpBlockT }
     *     
     */
    public void setAID(SecAltIDGrpBlockT value) {
        this.aid = value;
    }

    /**
     * Gets the value of the evnt property.
     * 
     * @return
     *     possible object is
     *     {@link EvntGrpBlockT }
     *     
     */
    public EvntGrpBlockT getEvnt() {
        return evnt;
    }

    /**
     * Sets the value of the evnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvntGrpBlockT }
     *     
     */
    public void setEvnt(EvntGrpBlockT value) {
        this.evnt = value;
    }

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentPartiesBlockT }
     *     
     */
    public InstrumentPartiesBlockT getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentPartiesBlockT }
     *     
     */
    public void setPty(InstrumentPartiesBlockT value) {
        this.pty = value;
    }

    /**
     * Gets the value of the sym property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSym() {
        return sym;
    }

    /**
     * Sets the value of the sym property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSym(String value) {
        this.sym = value;
    }

    /**
     * Gets the value of the sfx property.
     * 
     * @return
     *     possible object is
     *     {@link SymbolSfxEnumT }
     *     
     */
    public SymbolSfxEnumT getSfx() {
        return sfx;
    }

    /**
     * Sets the value of the sfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolSfxEnumT }
     *     
     */
    public void setSfx(SymbolSfxEnumT value) {
        this.sfx = value;
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
     * Gets the value of the src property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrc() {
        return src;
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrc(String value) {
        this.src = value;
    }

    /**
     * Gets the value of the prod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProd() {
        return prod;
    }

    /**
     * Sets the value of the prod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProd(Integer value) {
        this.prod = value;
    }

    /**
     * Gets the value of the cfi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFI() {
        return cfi;
    }

    /**
     * Sets the value of the cfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFI(String value) {
        this.cfi = value;
    }

    /**
     * Gets the value of the secTyp property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityTypeEnumT }
     *     
     */
    public SecurityTypeEnumT getSecTyp() {
        return secTyp;
    }

    /**
     * Sets the value of the secTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityTypeEnumT }
     *     
     */
    public void setSecTyp(SecurityTypeEnumT value) {
        this.secTyp = value;
    }

    /**
     * Gets the value of the subTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTyp() {
        return subTyp;
    }

    /**
     * Sets the value of the subTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTyp(String value) {
        this.subTyp = value;
    }

    /**
     * Gets the value of the mmy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMY() {
        return mmy;
    }

    /**
     * Sets the value of the mmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMY(String value) {
        this.mmy = value;
    }

    /**
     * Gets the value of the matDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMatDt() {
        return matDt;
    }

    /**
     * Sets the value of the matDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMatDt(XMLGregorianCalendar value) {
        this.matDt = value;
    }

    /**
     * Gets the value of the matTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMatTm() {
        return matTm;
    }

    /**
     * Sets the value of the matTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMatTm(XMLGregorianCalendar value) {
        this.matTm = value;
    }

    /**
     * Gets the value of the settlOnOpenFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlOnOpenFlag() {
        return settlOnOpenFlag;
    }

    /**
     * Sets the value of the settlOnOpenFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlOnOpenFlag(String value) {
        this.settlOnOpenFlag = value;
    }

    /**
     * Gets the value of the asgnMeth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsgnMeth() {
        return asgnMeth;
    }

    /**
     * Sets the value of the asgnMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsgnMeth(String value) {
        this.asgnMeth = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the cpnPmt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCpnPmt() {
        return cpnPmt;
    }

    /**
     * Sets the value of the cpnPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCpnPmt(XMLGregorianCalendar value) {
        this.cpnPmt = value;
    }

    /**
     * Gets the value of the issued property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssued() {
        return issued;
    }

    /**
     * Sets the value of the issued property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssued(XMLGregorianCalendar value) {
        this.issued = value;
    }

    /**
     * Gets the value of the repoCollSecTyp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepoCollSecTyp() {
        return repoCollSecTyp;
    }

    /**
     * Sets the value of the repoCollSecTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepoCollSecTyp(Integer value) {
        this.repoCollSecTyp = value;
    }

    /**
     * Gets the value of the repoTrm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepoTrm() {
        return repoTrm;
    }

    /**
     * Sets the value of the repoTrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepoTrm(Integer value) {
        this.repoTrm = value;
    }

    /**
     * Gets the value of the repoRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepoRt() {
        return repoRt;
    }

    /**
     * Sets the value of the repoRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepoRt(BigDecimal value) {
        this.repoRt = value;
    }

    /**
     * Gets the value of the fctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFctr() {
        return fctr;
    }

    /**
     * Sets the value of the fctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFctr(BigDecimal value) {
        this.fctr = value;
    }

    /**
     * Gets the value of the crdRtg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdRtg() {
        return crdRtg;
    }

    /**
     * Sets the value of the crdRtg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdRtg(String value) {
        this.crdRtg = value;
    }

    /**
     * Gets the value of the rgstry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgstry() {
        return rgstry;
    }

    /**
     * Sets the value of the rgstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgstry(String value) {
        this.rgstry = value;
    }

    /**
     * Gets the value of the issuCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuCtry() {
        return issuCtry;
    }

    /**
     * Sets the value of the issuCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuCtry(String value) {
        this.issuCtry = value;
    }

    /**
     * Gets the value of the stPrv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStPrv() {
        return stPrv;
    }

    /**
     * Sets the value of the stPrv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStPrv(String value) {
        this.stPrv = value;
    }

    /**
     * Gets the value of the lcl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLcl() {
        return lcl;
    }

    /**
     * Sets the value of the lcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLcl(String value) {
        this.lcl = value;
    }

    /**
     * Gets the value of the redeem property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRedeem() {
        return redeem;
    }

    /**
     * Sets the value of the redeem property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRedeem(XMLGregorianCalendar value) {
        this.redeem = value;
    }

    /**
     * Gets the value of the strkPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrkPx() {
        return strkPx;
    }

    /**
     * Sets the value of the strkPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStrkPx(BigDecimal value) {
        this.strkPx = value;
    }

    /**
     * Gets the value of the strkCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrkCcy() {
        return strkCcy;
    }

    /**
     * Sets the value of the strkCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrkCcy(String value) {
        this.strkCcy = value;
    }

    /**
     * Gets the value of the strkMult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrkMult() {
        return strkMult;
    }

    /**
     * Sets the value of the strkMult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStrkMult(BigDecimal value) {
        this.strkMult = value;
    }

    /**
     * Gets the value of the strkValu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrkValu() {
        return strkValu;
    }

    /**
     * Sets the value of the strkValu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStrkValu(BigDecimal value) {
        this.strkValu = value;
    }

    /**
     * Gets the value of the optAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptAt() {
        return optAt;
    }

    /**
     * Sets the value of the optAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptAt(String value) {
        this.optAt = value;
    }

    /**
     * Gets the value of the mult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMult() {
        return mult;
    }

    /**
     * Sets the value of the mult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMult(BigDecimal value) {
        this.mult = value;
    }

    /**
     * Gets the value of the minPxIncr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinPxIncr() {
        return minPxIncr;
    }

    /**
     * Sets the value of the minPxIncr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinPxIncr(BigDecimal value) {
        this.minPxIncr = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link UnitofMeasureEnumT }
     *     
     */
    public UnitofMeasureEnumT getUOM() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitofMeasureEnumT }
     *     
     */
    public void setUOM(UnitofMeasureEnumT value) {
        this.uom = value;
    }

    /**
     * Gets the value of the tmUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnitEnumT }
     *     
     */
    public TimeUnitEnumT getTmUnit() {
        return tmUnit;
    }

    /**
     * Sets the value of the tmUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnitEnumT }
     *     
     */
    public void setTmUnit(TimeUnitEnumT value) {
        this.tmUnit = value;
    }

    /**
     * Gets the value of the cpnRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCpnRt() {
        return cpnRt;
    }

    /**
     * Sets the value of the cpnRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCpnRt(BigDecimal value) {
        this.cpnRt = value;
    }

    /**
     * Gets the value of the exch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExch() {
        return exch;
    }

    /**
     * Sets the value of the exch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExch(String value) {
        this.exch = value;
    }

    /**
     * Gets the value of the posLmt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosLmt() {
        return posLmt;
    }

    /**
     * Sets the value of the posLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosLmt(Integer value) {
        this.posLmt = value;
    }

    /**
     * Gets the value of the ntPosLmt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNTPosLmt() {
        return ntPosLmt;
    }

    /**
     * Sets the value of the ntPosLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNTPosLmt(Integer value) {
        this.ntPosLmt = value;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssr(String value) {
        this.issr = value;
    }

    /**
     * Gets the value of the encIssrLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncIssrLen() {
        return encIssrLen;
    }

    /**
     * Sets the value of the encIssrLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncIssrLen(BigInteger value) {
        this.encIssrLen = value;
    }

    /**
     * Gets the value of the encIssr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncIssr() {
        return encIssr;
    }

    /**
     * Sets the value of the encIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncIssr(String value) {
        this.encIssr = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the encSecDescLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncSecDescLen() {
        return encSecDescLen;
    }

    /**
     * Sets the value of the encSecDescLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncSecDescLen(BigInteger value) {
        this.encSecDescLen = value;
    }

    /**
     * Gets the value of the encSecDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncSecDesc() {
        return encSecDesc;
    }

    /**
     * Sets the value of the encSecDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncSecDesc(String value) {
        this.encSecDesc = value;
    }

    /**
     * Gets the value of the pool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPool() {
        return pool;
    }

    /**
     * Sets the value of the pool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPool(String value) {
        this.pool = value;
    }

    /**
     * Gets the value of the cSetMo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSetMo() {
        return cSetMo;
    }

    /**
     * Sets the value of the cSetMo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSetMo(String value) {
        this.cSetMo = value;
    }

    /**
     * Gets the value of the cpPgm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPPgm() {
        return cpPgm;
    }

    /**
     * Sets the value of the cpPgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPPgm(String value) {
        this.cpPgm = value;
    }

    /**
     * Gets the value of the cpRegT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPRegT() {
        return cpRegT;
    }

    /**
     * Sets the value of the cpRegT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPRegT(String value) {
        this.cpRegT = value;
    }

    /**
     * Gets the value of the dated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDated() {
        return dated;
    }

    /**
     * Sets the value of the dated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDated(XMLGregorianCalendar value) {
        this.dated = value;
    }

    /**
     * Gets the value of the intAcrl property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntAcrl() {
        return intAcrl;
    }

    /**
     * Sets the value of the intAcrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntAcrl(XMLGregorianCalendar value) {
        this.intAcrl = value;
    }

}
