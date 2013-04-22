
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UnderlyingAmount_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnderlyingAmount_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UnderlyingAmountElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UnderlyingAmountAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingAmount_Block_t")
public class UnderlyingAmountBlockT {

    @XmlAttribute(name = "PayAmt")
    protected BigDecimal payAmt;
    @XmlAttribute(name = "ColAmt")
    protected BigDecimal colAmt;
    @XmlAttribute(name = "StlDt")
    protected XMLGregorianCalendar stlDt;
    @XmlAttribute(name = "SetStat")
    protected String setStat;

    /**
     * Gets the value of the payAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayAmt() {
        return payAmt;
    }

    /**
     * Sets the value of the payAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayAmt(BigDecimal value) {
        this.payAmt = value;
    }

    /**
     * Gets the value of the colAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getColAmt() {
        return colAmt;
    }

    /**
     * Sets the value of the colAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setColAmt(BigDecimal value) {
        this.colAmt = value;
    }

    /**
     * Gets the value of the stlDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStlDt() {
        return stlDt;
    }

    /**
     * Sets the value of the stlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStlDt(XMLGregorianCalendar value) {
        this.stlDt = value;
    }

    /**
     * Gets the value of the setStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetStat() {
        return setStat;
    }

    /**
     * Sets the value of the setStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetStat(String value) {
        this.setStat = value;
    }

}
