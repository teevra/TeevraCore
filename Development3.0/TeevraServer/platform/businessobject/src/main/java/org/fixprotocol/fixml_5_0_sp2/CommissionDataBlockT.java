
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommissionData_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommissionData_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}CommissionDataElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}CommissionDataAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionData_Block_t")
public class CommissionDataBlockT {

    @XmlAttribute(name = "Comm")
    protected BigDecimal comm;
    @XmlAttribute(name = "CommTyp")
    protected String commTyp;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "FundRenewWaiv")
    protected FundRenewWaivEnumT fundRenewWaiv;

    /**
     * Gets the value of the comm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getComm() {
        return comm;
    }

    /**
     * Sets the value of the comm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setComm(BigDecimal value) {
        this.comm = value;
    }

    /**
     * Gets the value of the commTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommTyp() {
        return commTyp;
    }

    /**
     * Sets the value of the commTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommTyp(String value) {
        this.commTyp = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the fundRenewWaiv property.
     * 
     * @return
     *     possible object is
     *     {@link FundRenewWaivEnumT }
     *     
     */
    public FundRenewWaivEnumT getFundRenewWaiv() {
        return fundRenewWaiv;
    }

    /**
     * Sets the value of the fundRenewWaiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundRenewWaivEnumT }
     *     
     */
    public void setFundRenewWaiv(FundRenewWaivEnumT value) {
        this.fundRenewWaiv = value;
    }

}
