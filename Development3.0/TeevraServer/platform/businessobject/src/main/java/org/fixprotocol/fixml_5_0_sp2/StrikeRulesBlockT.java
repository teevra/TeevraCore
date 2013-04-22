
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StrikeRules_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrikeRules_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}StrikeRulesElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}StrikeRulesAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrikeRules_Block_t", propOrder = {
    "matRules"
})
public class StrikeRulesBlockT {

    @XmlElement(name = "MatRules")
    protected List<MaturityRulesBlockT> matRules;
    @XmlAttribute(name = "StrkRule")
    protected String strkRule;
    @XmlAttribute(name = "StartStrkPxRng")
    protected BigDecimal startStrkPxRng;
    @XmlAttribute(name = "EndStrkPxRng")
    protected BigDecimal endStrkPxRng;
    @XmlAttribute(name = "StrkIncr")
    protected BigDecimal strkIncr;
    @XmlAttribute(name = "StrkExrStyle")
    protected BigInteger strkExrStyle;

    /**
     * Gets the value of the matRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaturityRulesBlockT }
     * 
     * 
     */
    public List<MaturityRulesBlockT> getMatRules() {
        if (matRules == null) {
            matRules = new ArrayList<MaturityRulesBlockT>();
        }
        return this.matRules;
    }

    /**
     * Gets the value of the strkRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrkRule() {
        return strkRule;
    }

    /**
     * Sets the value of the strkRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrkRule(String value) {
        this.strkRule = value;
    }

    /**
     * Gets the value of the startStrkPxRng property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStartStrkPxRng() {
        return startStrkPxRng;
    }

    /**
     * Sets the value of the startStrkPxRng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStartStrkPxRng(BigDecimal value) {
        this.startStrkPxRng = value;
    }

    /**
     * Gets the value of the endStrkPxRng property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndStrkPxRng() {
        return endStrkPxRng;
    }

    /**
     * Sets the value of the endStrkPxRng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndStrkPxRng(BigDecimal value) {
        this.endStrkPxRng = value;
    }

    /**
     * Gets the value of the strkIncr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrkIncr() {
        return strkIncr;
    }

    /**
     * Sets the value of the strkIncr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStrkIncr(BigDecimal value) {
        this.strkIncr = value;
    }

    /**
     * Gets the value of the strkExrStyle property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStrkExrStyle() {
        return strkExrStyle;
    }

    /**
     * Sets the value of the strkExrStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStrkExrStyle(BigInteger value) {
        this.strkExrStyle = value;
    }

}
