//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.08 at 01:47:27 PM IST 
//


package org.fixprotocol.fixml_5_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * AffectedOrdGrp is a component
 * 
 * <p>Java class for AffectedOrdGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedOrdGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0}AffectedOrdGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0}AffectedOrdGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedOrdGrp_Block_t")
public class AffectedOrdGrpBlockT {

    @XmlAttribute(name = "OrigID")
    protected String origID;
    @XmlAttribute(name = "AffctdOrdID")
    protected String affctdOrdID;
    @XmlAttribute(name = "AffctdScndOrdID")
    protected String affctdScndOrdID;

    /**
     * Gets the value of the origID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigID() {
        return origID;
    }

    /**
     * Sets the value of the origID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigID(String value) {
        this.origID = value;
    }

    /**
     * Gets the value of the affctdOrdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffctdOrdID() {
        return affctdOrdID;
    }

    /**
     * Sets the value of the affctdOrdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffctdOrdID(String value) {
        this.affctdOrdID = value;
    }

    /**
     * Gets the value of the affctdScndOrdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffctdScndOrdID() {
        return affctdScndOrdID;
    }

    /**
     * Sets the value of the affctdScndOrdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffctdScndOrdID(String value) {
        this.affctdScndOrdID = value;
    }

}
