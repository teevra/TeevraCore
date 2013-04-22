
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for YieldData_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YieldData_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}YieldDataElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}YieldDataAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YieldData_Block_t")
public class YieldDataBlockT {

    @XmlAttribute(name = "Typ")
    protected YieldTypeEnumT typ;
    @XmlAttribute(name = "Yld")
    protected BigDecimal yld;
    @XmlAttribute(name = "CalcDt")
    protected XMLGregorianCalendar calcDt;
    @XmlAttribute(name = "RedDt")
    protected XMLGregorianCalendar redDt;
    @XmlAttribute(name = "RedPx")
    protected BigDecimal redPx;
    @XmlAttribute(name = "RedPxTyp")
    protected BigInteger redPxTyp;

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link YieldTypeEnumT }
     *     
     */
    public YieldTypeEnumT getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldTypeEnumT }
     *     
     */
    public void setTyp(YieldTypeEnumT value) {
        this.typ = value;
    }

    /**
     * Gets the value of the yld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYld() {
        return yld;
    }

    /**
     * Sets the value of the yld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYld(BigDecimal value) {
        this.yld = value;
    }

    /**
     * Gets the value of the calcDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalcDt() {
        return calcDt;
    }

    /**
     * Sets the value of the calcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalcDt(XMLGregorianCalendar value) {
        this.calcDt = value;
    }

    /**
     * Gets the value of the redDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRedDt() {
        return redDt;
    }

    /**
     * Sets the value of the redDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRedDt(XMLGregorianCalendar value) {
        this.redDt = value;
    }

    /**
     * Gets the value of the redPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRedPx() {
        return redPx;
    }

    /**
     * Sets the value of the redPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRedPx(BigDecimal value) {
        this.redPx = value;
    }

    /**
     * Gets the value of the redPxTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRedPxTyp() {
        return redPxTyp;
    }

    /**
     * Sets the value of the redPxTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRedPxTyp(BigInteger value) {
        this.redPxTyp = value;
    }

}
