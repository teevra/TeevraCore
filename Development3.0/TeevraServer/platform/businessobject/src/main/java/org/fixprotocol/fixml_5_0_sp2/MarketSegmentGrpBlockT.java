
package org.fixprotocol.fixml_5_0_sp2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketSegmentGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketSegmentGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MarketSegmentGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MarketSegmentGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketSegmentGrp_Block_t", propOrder = {
    "secTrdgRules",
    "strkRules"
})
public class MarketSegmentGrpBlockT {

    @XmlElement(name = "SecTrdgRules")
    protected SecurityTradingRulesBlockT secTrdgRules;
    @XmlElement(name = "StrkRules")
    protected List<StrikeRulesBlockT> strkRules;
    @XmlAttribute(name = "MktID")
    protected String mktID;
    @XmlAttribute(name = "MktSegID")
    protected String mktSegID;

    /**
     * Gets the value of the secTrdgRules property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityTradingRulesBlockT }
     *     
     */
    public SecurityTradingRulesBlockT getSecTrdgRules() {
        return secTrdgRules;
    }

    /**
     * Sets the value of the secTrdgRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityTradingRulesBlockT }
     *     
     */
    public void setSecTrdgRules(SecurityTradingRulesBlockT value) {
        this.secTrdgRules = value;
    }

    /**
     * Gets the value of the strkRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strkRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrkRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrikeRulesBlockT }
     * 
     * 
     */
    public List<StrikeRulesBlockT> getStrkRules() {
        if (strkRules == null) {
            strkRules = new ArrayList<StrikeRulesBlockT>();
        }
        return this.strkRules;
    }

    /**
     * Gets the value of the mktID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktID() {
        return mktID;
    }

    /**
     * Sets the value of the mktID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktID(String value) {
        this.mktID = value;
    }

    /**
     * Gets the value of the mktSegID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktSegID() {
        return mktSegID;
    }

    /**
     * Sets the value of the mktSegID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktSegID(String value) {
        this.mktSegID = value;
    }

}
