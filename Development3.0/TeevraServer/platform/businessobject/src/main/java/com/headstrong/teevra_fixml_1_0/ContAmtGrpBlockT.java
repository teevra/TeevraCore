
package com.headstrong.teevra_fixml_1_0;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContAmtGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContAmtGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}ContAmtGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}ContAmtGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContAmtGrp_Block_t")
public class ContAmtGrpBlockT {

    @XmlAttribute(name = "ContAmtTyp")
    protected BigInteger contAmtTyp;
    @XmlAttribute(name = "ContAmtValu")
    protected BigDecimal contAmtValu;
    @XmlAttribute(name = "ContAmtCurr")
    protected String contAmtCurr;

    /**
     * Gets the value of the contAmtTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContAmtTyp() {
        return contAmtTyp;
    }

    /**
     * Sets the value of the contAmtTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContAmtTyp(BigInteger value) {
        this.contAmtTyp = value;
    }

    /**
     * Gets the value of the contAmtValu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContAmtValu() {
        return contAmtValu;
    }

    /**
     * Sets the value of the contAmtValu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContAmtValu(BigDecimal value) {
        this.contAmtValu = value;
    }

    /**
     * Gets the value of the contAmtCurr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContAmtCurr() {
        return contAmtCurr;
    }

    /**
     * Sets the value of the contAmtCurr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContAmtCurr(String value) {
        this.contAmtCurr = value;
    }

}
