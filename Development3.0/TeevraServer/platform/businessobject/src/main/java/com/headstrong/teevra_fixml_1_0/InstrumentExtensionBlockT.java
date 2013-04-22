
package com.headstrong.teevra_fixml_1_0;

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
 * <p>Java class for InstrumentExtension_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrumentExtension_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}InstrumentExtensionElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}InstrumentExtensionAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentExtension_Block_t", propOrder = {
    "attrb"
})
public class InstrumentExtensionBlockT {

    @XmlElement(name = "Attrb")
    protected List<AttrbGrpBlockT> attrb;
    @XmlAttribute(name = "DlvryForm")
    protected BigInteger dlvryForm;
    @XmlAttribute(name = "PctAtRisk")
    protected BigDecimal pctAtRisk;

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
     * {@link AttrbGrpBlockT }
     * 
     * 
     */
    public List<AttrbGrpBlockT> getAttrb() {
        if (attrb == null) {
            attrb = new ArrayList<AttrbGrpBlockT>();
        }
        return this.attrb;
    }

    /**
     * Gets the value of the dlvryForm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDlvryForm() {
        return dlvryForm;
    }

    /**
     * Sets the value of the dlvryForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDlvryForm(BigInteger value) {
        this.dlvryForm = value;
    }

    /**
     * Gets the value of the pctAtRisk property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctAtRisk() {
        return pctAtRisk;
    }

    /**
     * Sets the value of the pctAtRisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctAtRisk(BigDecimal value) {
        this.pctAtRisk = value;
    }

}