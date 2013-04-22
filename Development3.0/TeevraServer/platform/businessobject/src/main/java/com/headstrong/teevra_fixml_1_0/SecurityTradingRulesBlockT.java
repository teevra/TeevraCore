
package com.headstrong.teevra_fixml_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityTradingRules_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityTradingRules_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}SecurityTradingRulesElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}SecurityTradingRulesAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityTradingRules_Block_t", propOrder = {
    "baseTrdgRules",
    "trdgSesRulesGrp",
    "attrb"
})
public class SecurityTradingRulesBlockT {

    @XmlElement(name = "BaseTrdgRules")
    protected BaseTradingRulesBlockT baseTrdgRules;
    @XmlElement(name = "TrdgSesRulesGrp")
    protected List<TradingSessionRulesGrpBlockT> trdgSesRulesGrp;
    @XmlElement(name = "Attrb")
    protected List<NestedInstrumentAttributeBlockT> attrb;

    /**
     * Gets the value of the baseTrdgRules property.
     * 
     * @return
     *     possible object is
     *     {@link BaseTradingRulesBlockT }
     *     
     */
    public BaseTradingRulesBlockT getBaseTrdgRules() {
        return baseTrdgRules;
    }

    /**
     * Sets the value of the baseTrdgRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseTradingRulesBlockT }
     *     
     */
    public void setBaseTrdgRules(BaseTradingRulesBlockT value) {
        this.baseTrdgRules = value;
    }

    /**
     * Gets the value of the trdgSesRulesGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trdgSesRulesGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrdgSesRulesGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingSessionRulesGrpBlockT }
     * 
     * 
     */
    public List<TradingSessionRulesGrpBlockT> getTrdgSesRulesGrp() {
        if (trdgSesRulesGrp == null) {
            trdgSesRulesGrp = new ArrayList<TradingSessionRulesGrpBlockT>();
        }
        return this.trdgSesRulesGrp;
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
     * {@link NestedInstrumentAttributeBlockT }
     * 
     * 
     */
    public List<NestedInstrumentAttributeBlockT> getAttrb() {
        if (attrb == null) {
            attrb = new ArrayList<NestedInstrumentAttributeBlockT>();
        }
        return this.attrb;
    }

}
