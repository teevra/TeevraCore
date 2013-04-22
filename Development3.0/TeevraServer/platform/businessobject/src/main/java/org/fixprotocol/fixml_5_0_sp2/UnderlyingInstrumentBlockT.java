
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 * <p>Java class for UnderlyingInstrument_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnderlyingInstrument_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UnderlyingInstrumentElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UnderlyingInstrumentAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingInstrument_Block_t", propOrder = {
    "undAID",
    "stip",
    "pty"
})
@XmlSeeAlso({
    UndInstrmtGrpBlockT.class
})
public class UnderlyingInstrumentBlockT {

    @XmlElement(name = "UndAID")
    protected List<UndSecAltIDGrpBlockT> undAID;
    @XmlElement(name = "Stip")
    protected List<UnderlyingStipulationsBlockT> stip;
    @XmlElement(name = "Pty")
    protected List<UndlyInstrumentPartiesBlockT> pty;
    @XmlAttribute(name = "PxInd")
    protected BigInteger pxInd;
    @XmlAttribute(name = "Sym")
    protected String sym;
    @XmlAttribute(name = "Sfx")
    protected SymbolSfxEnumT sfx;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Src")
    protected String src;
    @XmlAttribute(name = "Prod")
    protected BigInteger prod;
    @XmlAttribute(name = "CFI")
    protected String cfi;
    @XmlAttribute(name = "SecTyp")
    protected String secTyp;
    @XmlAttribute(name = "SubTyp")
    protected String subTyp;
    @XmlAttribute(name = "MMY")
    protected String mmy;
    @XmlAttribute(name = "Mat")
    protected XMLGregorianCalendar mat;
    @XmlAttribute(name = "MatTm")
    protected XMLGregorianCalendar matTm;
    @XmlAttribute(name = "CpnPmt")
    protected XMLGregorianCalendar cpnPmt;
    @XmlAttribute(name = "RestrctTyp")
    protected RestructuringTypeEnumT restrctTyp;
    @XmlAttribute(name = "Snrty")
    protected SeniorityEnumT snrty;
    @XmlAttribute(name = "NotlPctOut")
    protected BigDecimal notlPctOut;
    @XmlAttribute(name = "OrigNotlPctOut")
    protected BigDecimal origNotlPctOut;
    @XmlAttribute(name = "AttchPnt")
    protected BigDecimal attchPnt;
    @XmlAttribute(name = "DetchPnt")
    protected BigDecimal detchPnt;
    @XmlAttribute(name = "Issued")
    protected XMLGregorianCalendar issued;
    @XmlAttribute(name = "RepoCollSecTyp")
    protected BigInteger repoCollSecTyp;
    @XmlAttribute(name = "RepoTrm")
    protected BigInteger repoTrm;
    @XmlAttribute(name = "RepoRt")
    protected BigDecimal repoRt;
    @XmlAttribute(name = "Fctr")
    protected BigDecimal fctr;
    @XmlAttribute(name = "CrdRtg")
    protected String crdRtg;
    @XmlAttribute(name = "Rgstry")
    protected String rgstry;
    @XmlAttribute(name = "Ctry")
    protected String ctry;
    @XmlAttribute(name = "StOrProvnc")
    protected String stOrProvnc;
    @XmlAttribute(name = "Lcl")
    protected String lcl;
    @XmlAttribute(name = "Redeem")
    protected XMLGregorianCalendar redeem;
    @XmlAttribute(name = "StrkPx")
    protected BigDecimal strkPx;
    @XmlAttribute(name = "StrkCcy")
    protected String strkCcy;
    @XmlAttribute(name = "OptA")
    protected String optA;
    @XmlAttribute(name = "Mult")
    protected BigDecimal mult;
    @XmlAttribute(name = "MultTyp")
    protected BigInteger multTyp;
    @XmlAttribute(name = "FlowSchedTyp")
    protected String flowSchedTyp;
    @XmlAttribute(name = "UOM")
    protected UnitOfMeasureEnumT uom;
    @XmlAttribute(name = "UOMQty")
    protected BigDecimal uomQty;
    @XmlAttribute(name = "PxUOM")
    protected UnitOfMeasureEnumT pxUOM;
    @XmlAttribute(name = "PxUOMQty")
    protected BigDecimal pxUOMQty;
    @XmlAttribute(name = "TmUnit")
    protected TimeUnitEnumT tmUnit;
    @XmlAttribute(name = "ExerStyle")
    protected BigInteger exerStyle;
    @XmlAttribute(name = "CpnRt")
    protected BigDecimal cpnRt;
    @XmlAttribute(name = "Exch")
    protected String exch;
    @XmlAttribute(name = "Issr")
    protected String issr;
    @XmlAttribute(name = "EncUndIssrLen")
    protected BigInteger encUndIssrLen;
    @XmlAttribute(name = "EncUndIssr")
    protected String encUndIssr;
    @XmlAttribute(name = "Desc")
    protected String desc;
    @XmlAttribute(name = "EncUndSecDescLen")
    protected BigInteger encUndSecDescLen;
    @XmlAttribute(name = "EncUndSecDesc")
    protected String encUndSecDesc;
    @XmlAttribute(name = "CPPgm")
    protected String cpPgm;
    @XmlAttribute(name = "CPRegTyp")
    protected String cpRegTyp;
    @XmlAttribute(name = "AllocPct")
    protected BigDecimal allocPct;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "Qty")
    protected BigDecimal qty;
    @XmlAttribute(name = "SettlTyp")
    protected BigInteger settlTyp;
    @XmlAttribute(name = "CashAmt")
    protected BigDecimal cashAmt;
    @XmlAttribute(name = "CashTyp")
    protected UnderlyingCashTypeEnumT cashTyp;
    @XmlAttribute(name = "Px")
    protected BigDecimal px;
    @XmlAttribute(name = "DirtPx")
    protected BigDecimal dirtPx;
    @XmlAttribute(name = "EndPx")
    protected BigDecimal endPx;
    @XmlAttribute(name = "StartVal")
    protected BigDecimal startVal;
    @XmlAttribute(name = "CurVal")
    protected BigDecimal curVal;
    @XmlAttribute(name = "EndVal")
    protected BigDecimal endVal;
    @XmlAttribute(name = "AdjQty")
    protected BigDecimal adjQty;
    @XmlAttribute(name = "FxRate")
    protected BigDecimal fxRate;
    @XmlAttribute(name = "FxRateCalc")
    protected UnderlyingFXRateCalcEnumT fxRateCalc;
    @XmlAttribute(name = "CapValu")
    protected BigDecimal capValu;
    @XmlAttribute(name = "SetMeth")
    protected String setMeth;
    @XmlAttribute(name = "PutCall")
    protected BigInteger putCall;

    /**
     * Gets the value of the undAID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undAID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndAID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UndSecAltIDGrpBlockT }
     * 
     * 
     */
    public List<UndSecAltIDGrpBlockT> getUndAID() {
        if (undAID == null) {
            undAID = new ArrayList<UndSecAltIDGrpBlockT>();
        }
        return this.undAID;
    }

    /**
     * Gets the value of the stip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingStipulationsBlockT }
     * 
     * 
     */
    public List<UnderlyingStipulationsBlockT> getStip() {
        if (stip == null) {
            stip = new ArrayList<UnderlyingStipulationsBlockT>();
        }
        return this.stip;
    }

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
     * {@link UndlyInstrumentPartiesBlockT }
     * 
     * 
     */
    public List<UndlyInstrumentPartiesBlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<UndlyInstrumentPartiesBlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the pxInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPxInd() {
        return pxInd;
    }

    /**
     * Sets the value of the pxInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPxInd(BigInteger value) {
        this.pxInd = value;
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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProd() {
        return prod;
    }

    /**
     * Sets the value of the prod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProd(BigInteger value) {
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
     * Gets the value of the mat property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMat() {
        return mat;
    }

    /**
     * Sets the value of the mat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMat(XMLGregorianCalendar value) {
        this.mat = value;
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
     * Gets the value of the restrctTyp property.
     * 
     * @return
     *     possible object is
     *     {@link RestructuringTypeEnumT }
     *     
     */
    public RestructuringTypeEnumT getRestrctTyp() {
        return restrctTyp;
    }

    /**
     * Sets the value of the restrctTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestructuringTypeEnumT }
     *     
     */
    public void setRestrctTyp(RestructuringTypeEnumT value) {
        this.restrctTyp = value;
    }

    /**
     * Gets the value of the snrty property.
     * 
     * @return
     *     possible object is
     *     {@link SeniorityEnumT }
     *     
     */
    public SeniorityEnumT getSnrty() {
        return snrty;
    }

    /**
     * Sets the value of the snrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeniorityEnumT }
     *     
     */
    public void setSnrty(SeniorityEnumT value) {
        this.snrty = value;
    }

    /**
     * Gets the value of the notlPctOut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNotlPctOut() {
        return notlPctOut;
    }

    /**
     * Sets the value of the notlPctOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNotlPctOut(BigDecimal value) {
        this.notlPctOut = value;
    }

    /**
     * Gets the value of the origNotlPctOut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrigNotlPctOut() {
        return origNotlPctOut;
    }

    /**
     * Sets the value of the origNotlPctOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrigNotlPctOut(BigDecimal value) {
        this.origNotlPctOut = value;
    }

    /**
     * Gets the value of the attchPnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAttchPnt() {
        return attchPnt;
    }

    /**
     * Sets the value of the attchPnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAttchPnt(BigDecimal value) {
        this.attchPnt = value;
    }

    /**
     * Gets the value of the detchPnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDetchPnt() {
        return detchPnt;
    }

    /**
     * Sets the value of the detchPnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDetchPnt(BigDecimal value) {
        this.detchPnt = value;
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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRepoCollSecTyp() {
        return repoCollSecTyp;
    }

    /**
     * Sets the value of the repoCollSecTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRepoCollSecTyp(BigInteger value) {
        this.repoCollSecTyp = value;
    }

    /**
     * Gets the value of the repoTrm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRepoTrm() {
        return repoTrm;
    }

    /**
     * Sets the value of the repoTrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRepoTrm(BigInteger value) {
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
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the stOrProvnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStOrProvnc() {
        return stOrProvnc;
    }

    /**
     * Sets the value of the stOrProvnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStOrProvnc(String value) {
        this.stOrProvnc = value;
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
     * Gets the value of the optA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptA() {
        return optA;
    }

    /**
     * Sets the value of the optA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptA(String value) {
        this.optA = value;
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
     * Gets the value of the multTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMultTyp() {
        return multTyp;
    }

    /**
     * Sets the value of the multTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMultTyp(BigInteger value) {
        this.multTyp = value;
    }

    /**
     * Gets the value of the flowSchedTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowSchedTyp() {
        return flowSchedTyp;
    }

    /**
     * Sets the value of the flowSchedTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowSchedTyp(String value) {
        this.flowSchedTyp = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureEnumT }
     *     
     */
    public UnitOfMeasureEnumT getUOM() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureEnumT }
     *     
     */
    public void setUOM(UnitOfMeasureEnumT value) {
        this.uom = value;
    }

    /**
     * Gets the value of the uomQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUOMQty() {
        return uomQty;
    }

    /**
     * Sets the value of the uomQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUOMQty(BigDecimal value) {
        this.uomQty = value;
    }

    /**
     * Gets the value of the pxUOM property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureEnumT }
     *     
     */
    public UnitOfMeasureEnumT getPxUOM() {
        return pxUOM;
    }

    /**
     * Sets the value of the pxUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureEnumT }
     *     
     */
    public void setPxUOM(UnitOfMeasureEnumT value) {
        this.pxUOM = value;
    }

    /**
     * Gets the value of the pxUOMQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPxUOMQty() {
        return pxUOMQty;
    }

    /**
     * Sets the value of the pxUOMQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPxUOMQty(BigDecimal value) {
        this.pxUOMQty = value;
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
     * Gets the value of the exerStyle property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExerStyle() {
        return exerStyle;
    }

    /**
     * Sets the value of the exerStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExerStyle(BigInteger value) {
        this.exerStyle = value;
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
     * Gets the value of the encUndIssrLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncUndIssrLen() {
        return encUndIssrLen;
    }

    /**
     * Sets the value of the encUndIssrLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncUndIssrLen(BigInteger value) {
        this.encUndIssrLen = value;
    }

    /**
     * Gets the value of the encUndIssr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncUndIssr() {
        return encUndIssr;
    }

    /**
     * Sets the value of the encUndIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncUndIssr(String value) {
        this.encUndIssr = value;
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
     * Gets the value of the encUndSecDescLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncUndSecDescLen() {
        return encUndSecDescLen;
    }

    /**
     * Sets the value of the encUndSecDescLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncUndSecDescLen(BigInteger value) {
        this.encUndSecDescLen = value;
    }

    /**
     * Gets the value of the encUndSecDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncUndSecDesc() {
        return encUndSecDesc;
    }

    /**
     * Sets the value of the encUndSecDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncUndSecDesc(String value) {
        this.encUndSecDesc = value;
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
     * Gets the value of the cpRegTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPRegTyp() {
        return cpRegTyp;
    }

    /**
     * Sets the value of the cpRegTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPRegTyp(String value) {
        this.cpRegTyp = value;
    }

    /**
     * Gets the value of the allocPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAllocPct() {
        return allocPct;
    }

    /**
     * Sets the value of the allocPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAllocPct(BigDecimal value) {
        this.allocPct = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
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
     * Gets the value of the settlTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSettlTyp() {
        return settlTyp;
    }

    /**
     * Sets the value of the settlTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSettlTyp(BigInteger value) {
        this.settlTyp = value;
    }

    /**
     * Gets the value of the cashAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashAmt() {
        return cashAmt;
    }

    /**
     * Sets the value of the cashAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashAmt(BigDecimal value) {
        this.cashAmt = value;
    }

    /**
     * Gets the value of the cashTyp property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingCashTypeEnumT }
     *     
     */
    public UnderlyingCashTypeEnumT getCashTyp() {
        return cashTyp;
    }

    /**
     * Sets the value of the cashTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingCashTypeEnumT }
     *     
     */
    public void setCashTyp(UnderlyingCashTypeEnumT value) {
        this.cashTyp = value;
    }

    /**
     * Gets the value of the px property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPx() {
        return px;
    }

    /**
     * Sets the value of the px property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPx(BigDecimal value) {
        this.px = value;
    }

    /**
     * Gets the value of the dirtPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDirtPx() {
        return dirtPx;
    }

    /**
     * Sets the value of the dirtPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDirtPx(BigDecimal value) {
        this.dirtPx = value;
    }

    /**
     * Gets the value of the endPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndPx() {
        return endPx;
    }

    /**
     * Sets the value of the endPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndPx(BigDecimal value) {
        this.endPx = value;
    }

    /**
     * Gets the value of the startVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStartVal() {
        return startVal;
    }

    /**
     * Sets the value of the startVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStartVal(BigDecimal value) {
        this.startVal = value;
    }

    /**
     * Gets the value of the curVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurVal() {
        return curVal;
    }

    /**
     * Sets the value of the curVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurVal(BigDecimal value) {
        this.curVal = value;
    }

    /**
     * Gets the value of the endVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndVal() {
        return endVal;
    }

    /**
     * Sets the value of the endVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndVal(BigDecimal value) {
        this.endVal = value;
    }

    /**
     * Gets the value of the adjQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjQty() {
        return adjQty;
    }

    /**
     * Sets the value of the adjQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjQty(BigDecimal value) {
        this.adjQty = value;
    }

    /**
     * Gets the value of the fxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFxRate() {
        return fxRate;
    }

    /**
     * Sets the value of the fxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFxRate(BigDecimal value) {
        this.fxRate = value;
    }

    /**
     * Gets the value of the fxRateCalc property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingFXRateCalcEnumT }
     *     
     */
    public UnderlyingFXRateCalcEnumT getFxRateCalc() {
        return fxRateCalc;
    }

    /**
     * Sets the value of the fxRateCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingFXRateCalcEnumT }
     *     
     */
    public void setFxRateCalc(UnderlyingFXRateCalcEnumT value) {
        this.fxRateCalc = value;
    }

    /**
     * Gets the value of the capValu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapValu() {
        return capValu;
    }

    /**
     * Sets the value of the capValu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapValu(BigDecimal value) {
        this.capValu = value;
    }

    /**
     * Gets the value of the setMeth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetMeth() {
        return setMeth;
    }

    /**
     * Sets the value of the setMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetMeth(String value) {
        this.setMeth = value;
    }

    /**
     * Gets the value of the putCall property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPutCall() {
        return putCall;
    }

    /**
     * Sets the value of the putCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPutCall(BigInteger value) {
        this.putCall = value;
    }

}
