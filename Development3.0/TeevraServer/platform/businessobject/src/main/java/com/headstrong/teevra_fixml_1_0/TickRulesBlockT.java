
package com.headstrong.teevra_fixml_1_0;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TickRules_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TickRules_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}TickRulesElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}TickRulesAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TickRules_Block_t")
public class TickRulesBlockT {

    @XmlAttribute(name = "StartTickPxRng")
    protected BigDecimal startTickPxRng;
    @XmlAttribute(name = "EndTickPxRng")
    protected BigDecimal endTickPxRng;
    @XmlAttribute(name = "TickIncr")
    protected BigDecimal tickIncr;
    @XmlAttribute(name = "TickRuleTyp")
    protected BigInteger tickRuleTyp;

    /**
     * Gets the value of the startTickPxRng property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStartTickPxRng() {
        return startTickPxRng;
    }

    /**
     * Sets the value of the startTickPxRng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStartTickPxRng(BigDecimal value) {
        this.startTickPxRng = value;
    }

    /**
     * Gets the value of the endTickPxRng property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndTickPxRng() {
        return endTickPxRng;
    }

    /**
     * Sets the value of the endTickPxRng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndTickPxRng(BigDecimal value) {
        this.endTickPxRng = value;
    }

    /**
     * Gets the value of the tickIncr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTickIncr() {
        return tickIncr;
    }

    /**
     * Sets the value of the tickIncr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTickIncr(BigDecimal value) {
        this.tickIncr = value;
    }

    /**
     * Gets the value of the tickRuleTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTickRuleTyp() {
        return tickRuleTyp;
    }

    /**
     * Sets the value of the tickRuleTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTickRuleTyp(BigInteger value) {
        this.tickRuleTyp = value;
    }

}
