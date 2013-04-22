
package com.headstrong.teevra_fixml_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingSessionRules_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradingSessionRules_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}TradingSessionRulesElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}TradingSessionRulesAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingSessionRules_Block_t", propOrder = {
    "ordTypRules",
    "tmInForceRules",
    "execInstRules",
    "mtchRules",
    "mdFeedTyps"
})
public class TradingSessionRulesBlockT {

    @XmlElement(name = "OrdTypRules")
    protected List<OrdTypeRulesBlockT> ordTypRules;
    @XmlElement(name = "TmInForceRules")
    protected List<TimeInForceRulesBlockT> tmInForceRules;
    @XmlElement(name = "ExecInstRules")
    protected List<ExecInstRulesBlockT> execInstRules;
    @XmlElement(name = "MtchRules")
    protected List<MatchRulesBlockT> mtchRules;
    @XmlElement(name = "MDFeedTyps")
    protected List<MarketDataFeedTypesBlockT> mdFeedTyps;

    /**
     * Gets the value of the ordTypRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordTypRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdTypRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrdTypeRulesBlockT }
     * 
     * 
     */
    public List<OrdTypeRulesBlockT> getOrdTypRules() {
        if (ordTypRules == null) {
            ordTypRules = new ArrayList<OrdTypeRulesBlockT>();
        }
        return this.ordTypRules;
    }

    /**
     * Gets the value of the tmInForceRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tmInForceRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTmInForceRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeInForceRulesBlockT }
     * 
     * 
     */
    public List<TimeInForceRulesBlockT> getTmInForceRules() {
        if (tmInForceRules == null) {
            tmInForceRules = new ArrayList<TimeInForceRulesBlockT>();
        }
        return this.tmInForceRules;
    }

    /**
     * Gets the value of the execInstRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the execInstRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExecInstRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExecInstRulesBlockT }
     * 
     * 
     */
    public List<ExecInstRulesBlockT> getExecInstRules() {
        if (execInstRules == null) {
            execInstRules = new ArrayList<ExecInstRulesBlockT>();
        }
        return this.execInstRules;
    }

    /**
     * Gets the value of the mtchRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mtchRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMtchRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchRulesBlockT }
     * 
     * 
     */
    public List<MatchRulesBlockT> getMtchRules() {
        if (mtchRules == null) {
            mtchRules = new ArrayList<MatchRulesBlockT>();
        }
        return this.mtchRules;
    }

    /**
     * Gets the value of the mdFeedTyps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mdFeedTyps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMDFeedTyps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketDataFeedTypesBlockT }
     * 
     * 
     */
    public List<MarketDataFeedTypesBlockT> getMDFeedTyps() {
        if (mdFeedTyps == null) {
            mdFeedTyps = new ArrayList<MarketDataFeedTypesBlockT>();
        }
        return this.mdFeedTyps;
    }

}
