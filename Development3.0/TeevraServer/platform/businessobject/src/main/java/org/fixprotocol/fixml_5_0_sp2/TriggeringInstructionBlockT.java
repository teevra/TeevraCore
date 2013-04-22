
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggeringInstruction_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriggeringInstruction_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TriggeringInstructionElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TriggeringInstructionAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggeringInstruction_Block_t")
public class TriggeringInstructionBlockT {

    @XmlAttribute(name = "TrgrTyp")
    protected String trgrTyp;
    @XmlAttribute(name = "TrgrActn")
    protected String trgrActn;
    @XmlAttribute(name = "TrgrPx")
    protected BigDecimal trgrPx;
    @XmlAttribute(name = "TrgrSym")
    protected String trgrSym;
    @XmlAttribute(name = "TrgrSecID")
    protected String trgrSecID;
    @XmlAttribute(name = "TrgrSecIDSrc")
    protected String trgrSecIDSrc;
    @XmlAttribute(name = "TrgrSecDesc")
    protected String trgrSecDesc;
    @XmlAttribute(name = "TrgrPxTyp")
    protected String trgrPxTyp;
    @XmlAttribute(name = "TrgrPxTypScp")
    protected String trgrPxTypScp;
    @XmlAttribute(name = "TrgrPxDir")
    protected TriggerPriceDirectionEnumT trgrPxDir;
    @XmlAttribute(name = "TrgrNewPx")
    protected BigDecimal trgrNewPx;
    @XmlAttribute(name = "TrgrOrdTyp")
    protected String trgrOrdTyp;
    @XmlAttribute(name = "TrgrNewQty")
    protected BigDecimal trgrNewQty;
    @XmlAttribute(name = "TrgrTrdSessID")
    protected String trgrTrdSessID;
    @XmlAttribute(name = "TrgrTrdSessSubID")
    protected String trgrTrdSessSubID;

    /**
     * Gets the value of the trgrTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgrTyp() {
        return trgrTyp;
    }

    /**
     * Sets the value of the trgrTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrgrTyp(String value) {
        this.trgrTyp = value;
    }

    /**
     * Gets the value of the trgrActn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgrActn() {
        return trgrActn;
    }

    /**
     * Sets the value of the trgrActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrgrActn(String value) {
        this.trgrActn = value;
    }

    /**
     * Gets the value of the trgrPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrgrPx() {
        return trgrPx;
    }

    /**
     * Sets the value of the trgrPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrgrPx(BigDecimal value) {
        this.trgrPx = value;
    }

    /**
     * Gets the value of the trgrSym property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgrSym() {
        return trgrSym;
    }

    /**
     * Sets the value of the trgrSym property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrgrSym(String value) {
        this.trgrSym = value;
    }

    /**
     * Gets the value of the trgrSecID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgrSecID() {
        return trgrSecID;
    }

    /**
     * Sets the value of the trgrSecID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrgrSecID(String value) {
        this.trgrSecID = value;
    }

    /**
     * Gets the value of the trgrSecIDSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgrSecIDSrc() {
        return trgrSecIDSrc;
    }

    /**
     * Sets the value of the trgrSecIDSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrgrSecIDSrc(String value) {
        this.trgrSecIDSrc = value;
    }

    /**
     * Gets the value of the trgrSecDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgrSecDesc() {
        return trgrSecDesc;
    }

    /**
     * Sets the value of the trgrSecDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrgrSecDesc(String value) {
        this.trgrSecDesc = value;
    }

    /**
     * Gets the value of the trgrPxTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgrPxTyp() {
        return trgrPxTyp;
    }

    /**
     * Sets the value of the trgrPxTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrgrPxTyp(String value) {
        this.trgrPxTyp = value;
    }

    /**
     * Gets the value of the trgrPxTypScp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgrPxTypScp() {
        return trgrPxTypScp;
    }

    /**
     * Sets the value of the trgrPxTypScp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrgrPxTypScp(String value) {
        this.trgrPxTypScp = value;
    }

    /**
     * Gets the value of the trgrPxDir property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerPriceDirectionEnumT }
     *     
     */
    public TriggerPriceDirectionEnumT getTrgrPxDir() {
        return trgrPxDir;
    }

    /**
     * Sets the value of the trgrPxDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerPriceDirectionEnumT }
     *     
     */
    public void setTrgrPxDir(TriggerPriceDirectionEnumT value) {
        this.trgrPxDir = value;
    }

    /**
     * Gets the value of the trgrNewPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrgrNewPx() {
        return trgrNewPx;
    }

    /**
     * Sets the value of the trgrNewPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrgrNewPx(BigDecimal value) {
        this.trgrNewPx = value;
    }

    /**
     * Gets the value of the trgrOrdTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgrOrdTyp() {
        return trgrOrdTyp;
    }

    /**
     * Sets the value of the trgrOrdTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrgrOrdTyp(String value) {
        this.trgrOrdTyp = value;
    }

    /**
     * Gets the value of the trgrNewQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrgrNewQty() {
        return trgrNewQty;
    }

    /**
     * Sets the value of the trgrNewQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrgrNewQty(BigDecimal value) {
        this.trgrNewQty = value;
    }

    /**
     * Gets the value of the trgrTrdSessID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgrTrdSessID() {
        return trgrTrdSessID;
    }

    /**
     * Sets the value of the trgrTrdSessID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrgrTrdSessID(String value) {
        this.trgrTrdSessID = value;
    }

    /**
     * Gets the value of the trgrTrdSessSubID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgrTrdSessSubID() {
        return trgrTrdSessSubID;
    }

    /**
     * Sets the value of the trgrTrdSessSubID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrgrTrdSessSubID(String value) {
        this.trgrTrdSessSubID = value;
    }

}
