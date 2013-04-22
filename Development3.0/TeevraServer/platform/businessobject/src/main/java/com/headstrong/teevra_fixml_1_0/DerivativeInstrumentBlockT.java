
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DerivativeInstrument_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DerivativeInstrument_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}DerivativeInstrumentElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}DerivativeInstrumentAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeInstrument_Block_t", propOrder = {
    "aid",
    "secXML",
    "evnt",
    "pty"
})
public class DerivativeInstrumentBlockT {

    @XmlElement(name = "AID")
    protected List<DerivativeSecurityAltIDGrpBlockT> aid;
    @XmlElement(name = "SecXML")
    protected DerivativeSecurityXMLBlockT secXML;
    @XmlElement(name = "Evnt")
    protected List<DerivativeEventsGrpBlockT> evnt;
    @XmlElement(name = "Pty")
    protected List<DerivativeInstrumentPartiesBlockT> pty;
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
    @XmlAttribute(name = "ProdCmplx")
    protected String prodCmplx;
    @XmlAttribute(name = "FlexProdElig")
    protected String flexProdElig;
    @XmlAttribute(name = "SecGrp")
    protected String secGrp;
    @XmlAttribute(name = "CFI")
    protected String cfi;
    @XmlAttribute(name = "SecTyp")
    protected String secTyp;
    @XmlAttribute(name = "SecSubTyp")
    protected String secSubTyp;
    @XmlAttribute(name = "MMY")
    protected String mmy;
    @XmlAttribute(name = "MatDt")
    protected XMLGregorianCalendar matDt;
    @XmlAttribute(name = "MatTm")
    protected XMLGregorianCalendar matTm;
    @XmlAttribute(name = "OpenCloseSettlFlag")
    protected String openCloseSettlFlag;
    @XmlAttribute(name = "AsgnMeth")
    protected String asgnMeth;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "IssDt")
    protected XMLGregorianCalendar issDt;
    @XmlAttribute(name = "Rgstry")
    protected String rgstry;
    @XmlAttribute(name = "Ctry")
    protected String ctry;
    @XmlAttribute(name = "StPrv")
    protected String stPrv;
    @XmlAttribute(name = "Lcl")
    protected String lcl;
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
    @XmlAttribute(name = "MultTyp")
    protected BigInteger multTyp;
    @XmlAttribute(name = "FlowSchedTyp")
    protected String flowSchedTyp;
    @XmlAttribute(name = "MinPxIncr")
    protected BigDecimal minPxIncr;
    @XmlAttribute(name = "MinPxIncrAmt")
    protected BigDecimal minPxIncrAmt;
    @XmlAttribute(name = "UOM")
    protected UnitOfMeasureEnumT uom;
    @XmlAttribute(name = "UOMQty")
    protected BigDecimal uomQty;
    @XmlAttribute(name = "PxUOM")
    protected UnitOfMeasureEnumT pxUOM;
    @XmlAttribute(name = "PxUOMQty")
    protected BigDecimal pxUOMQty;
    @XmlAttribute(name = "SettlMeth")
    protected SettlMethodEnumT settlMeth;
    @XmlAttribute(name = "PxQteMeth")
    protected PriceQuoteMethodEnumT pxQteMeth;
    @XmlAttribute(name = "ValMeth")
    protected ValuationMethodEnumT valMeth;
    @XmlAttribute(name = "ListMeth")
    protected BigInteger listMeth;
    @XmlAttribute(name = "CapPx")
    protected BigDecimal capPx;
    @XmlAttribute(name = "FlrPx")
    protected BigDecimal flrPx;
    @XmlAttribute(name = "PutCall")
    protected BigInteger putCall;
    @XmlAttribute(name = "ExerStyle")
    protected BigInteger exerStyle;
    @XmlAttribute(name = "OptPayAmt")
    protected BigDecimal optPayAmt;
    @XmlAttribute(name = "TmUnit")
    protected TimeUnitEnumT tmUnit;
    @XmlAttribute(name = "Exch")
    protected String exch;
    @XmlAttribute(name = "PosLmt")
    protected BigInteger posLmt;
    @XmlAttribute(name = "NTPosLmt")
    protected BigInteger ntPosLmt;
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
    @XmlAttribute(name = "CSetMo")
    protected String cSetMo;

    /**
     * Gets the value of the aid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DerivativeSecurityAltIDGrpBlockT }
     * 
     * 
     */
    public List<DerivativeSecurityAltIDGrpBlockT> getAID() {
        if (aid == null) {
            aid = new ArrayList<DerivativeSecurityAltIDGrpBlockT>();
        }
        return this.aid;
    }

    /**
     * Gets the value of the secXML property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeSecurityXMLBlockT }
     *     
     */
    public DerivativeSecurityXMLBlockT getSecXML() {
        return secXML;
    }

    /**
     * Sets the value of the secXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeSecurityXMLBlockT }
     *     
     */
    public void setSecXML(DerivativeSecurityXMLBlockT value) {
        this.secXML = value;
    }

    /**
     * Gets the value of the evnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DerivativeEventsGrpBlockT }
     * 
     * 
     */
    public List<DerivativeEventsGrpBlockT> getEvnt() {
        if (evnt == null) {
            evnt = new ArrayList<DerivativeEventsGrpBlockT>();
        }
        return this.evnt;
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
     * {@link DerivativeInstrumentPartiesBlockT }
     * 
     * 
     */
    public List<DerivativeInstrumentPartiesBlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<DerivativeInstrumentPartiesBlockT>();
        }
        return this.pty;
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
     * Gets the value of the prodCmplx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdCmplx() {
        return prodCmplx;
    }

    /**
     * Sets the value of the prodCmplx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdCmplx(String value) {
        this.prodCmplx = value;
    }

    /**
     * Gets the value of the flexProdElig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexProdElig() {
        return flexProdElig;
    }

    /**
     * Sets the value of the flexProdElig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexProdElig(String value) {
        this.flexProdElig = value;
    }

    /**
     * Gets the value of the secGrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecGrp() {
        return secGrp;
    }

    /**
     * Sets the value of the secGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecGrp(String value) {
        this.secGrp = value;
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
     * Gets the value of the secSubTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecSubTyp() {
        return secSubTyp;
    }

    /**
     * Sets the value of the secSubTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecSubTyp(String value) {
        this.secSubTyp = value;
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
     * Gets the value of the openCloseSettlFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenCloseSettlFlag() {
        return openCloseSettlFlag;
    }

    /**
     * Sets the value of the openCloseSettlFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenCloseSettlFlag(String value) {
        this.openCloseSettlFlag = value;
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
     * Gets the value of the issDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssDt() {
        return issDt;
    }

    /**
     * Sets the value of the issDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssDt(XMLGregorianCalendar value) {
        this.issDt = value;
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
     * Gets the value of the minPxIncrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinPxIncrAmt() {
        return minPxIncrAmt;
    }

    /**
     * Sets the value of the minPxIncrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinPxIncrAmt(BigDecimal value) {
        this.minPxIncrAmt = value;
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
     * Gets the value of the settlMeth property.
     * 
     * @return
     *     possible object is
     *     {@link SettlMethodEnumT }
     *     
     */
    public SettlMethodEnumT getSettlMeth() {
        return settlMeth;
    }

    /**
     * Sets the value of the settlMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlMethodEnumT }
     *     
     */
    public void setSettlMeth(SettlMethodEnumT value) {
        this.settlMeth = value;
    }

    /**
     * Gets the value of the pxQteMeth property.
     * 
     * @return
     *     possible object is
     *     {@link PriceQuoteMethodEnumT }
     *     
     */
    public PriceQuoteMethodEnumT getPxQteMeth() {
        return pxQteMeth;
    }

    /**
     * Sets the value of the pxQteMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceQuoteMethodEnumT }
     *     
     */
    public void setPxQteMeth(PriceQuoteMethodEnumT value) {
        this.pxQteMeth = value;
    }

    /**
     * Gets the value of the valMeth property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationMethodEnumT }
     *     
     */
    public ValuationMethodEnumT getValMeth() {
        return valMeth;
    }

    /**
     * Sets the value of the valMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationMethodEnumT }
     *     
     */
    public void setValMeth(ValuationMethodEnumT value) {
        this.valMeth = value;
    }

    /**
     * Gets the value of the listMeth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getListMeth() {
        return listMeth;
    }

    /**
     * Sets the value of the listMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setListMeth(BigInteger value) {
        this.listMeth = value;
    }

    /**
     * Gets the value of the capPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapPx() {
        return capPx;
    }

    /**
     * Sets the value of the capPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapPx(BigDecimal value) {
        this.capPx = value;
    }

    /**
     * Gets the value of the flrPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlrPx() {
        return flrPx;
    }

    /**
     * Sets the value of the flrPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlrPx(BigDecimal value) {
        this.flrPx = value;
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
     * Gets the value of the optPayAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOptPayAmt() {
        return optPayAmt;
    }

    /**
     * Sets the value of the optPayAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOptPayAmt(BigDecimal value) {
        this.optPayAmt = value;
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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosLmt() {
        return posLmt;
    }

    /**
     * Sets the value of the posLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosLmt(BigInteger value) {
        this.posLmt = value;
    }

    /**
     * Gets the value of the ntPosLmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNTPosLmt() {
        return ntPosLmt;
    }

    /**
     * Sets the value of the ntPosLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNTPosLmt(BigInteger value) {
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

}
