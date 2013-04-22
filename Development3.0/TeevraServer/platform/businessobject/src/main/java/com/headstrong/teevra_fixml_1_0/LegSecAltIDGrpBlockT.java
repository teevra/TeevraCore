
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegSecAltIDGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegSecAltIDGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}LegSecAltIDGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}LegSecAltIDGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegSecAltIDGrp_Block_t")
public class LegSecAltIDGrpBlockT {

    @XmlAttribute(name = "SecAltID")
    protected String secAltID;
    @XmlAttribute(name = "SecAltIDSrc")
    protected String secAltIDSrc;

    /**
     * Gets the value of the secAltID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecAltID() {
        return secAltID;
    }

    /**
     * Sets the value of the secAltID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecAltID(String value) {
        this.secAltID = value;
    }

    /**
     * Gets the value of the secAltIDSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecAltIDSrc() {
        return secAltIDSrc;
    }

    /**
     * Sets the value of the secAltIDSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecAltIDSrc(String value) {
        this.secAltIDSrc = value;
    }

}
