
package org.fixprotocol.fixml_5_0_sp2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DerivativeSecurityDefinition_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DerivativeSecurityDefinition_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DerivativeSecurityDefinitionElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DerivativeSecurityDefinitionAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeSecurityDefinition_Block_t", propOrder = {
    "derivInstrmt",
    "attrb",
    "mktSegGrp"
})
public class DerivativeSecurityDefinitionBlockT {

    @XmlElement(name = "DerivInstrmt")
    protected DerivativeInstrumentBlockT derivInstrmt;
    @XmlElement(name = "Attrb")
    protected List<DerivativeInstrumentAttributeBlockT> attrb;
    @XmlElement(name = "MktSegGrp")
    protected List<MarketSegmentGrpBlockT> mktSegGrp;

    /**
     * Gets the value of the derivInstrmt property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeInstrumentBlockT }
     *     
     */
    public DerivativeInstrumentBlockT getDerivInstrmt() {
        return derivInstrmt;
    }

    /**
     * Sets the value of the derivInstrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeInstrumentBlockT }
     *     
     */
    public void setDerivInstrmt(DerivativeInstrumentBlockT value) {
        this.derivInstrmt = value;
    }

    /**
     * Gets the value of the attrb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attrb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttrb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DerivativeInstrumentAttributeBlockT }
     * 
     * 
     */
    public List<DerivativeInstrumentAttributeBlockT> getAttrb() {
        if (attrb == null) {
            attrb = new ArrayList<DerivativeInstrumentAttributeBlockT>();
        }
        return this.attrb;
    }

    /**
     * Gets the value of the mktSegGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mktSegGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMktSegGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketSegmentGrpBlockT }
     * 
     * 
     */
    public List<MarketSegmentGrpBlockT> getMktSegGrp() {
        if (mktSegGrp == null) {
            mktSegGrp = new ArrayList<MarketSegmentGrpBlockT>();
        }
        return this.mktSegGrp;
    }

}
