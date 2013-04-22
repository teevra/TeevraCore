
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateSource_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateSource_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RateSourceElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RateSourceAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateSource_Block_t")
public class RateSourceBlockT {

    @XmlAttribute(name = "RtSrc")
    protected BigInteger rtSrc;
    @XmlAttribute(name = "RtSrcTyp")
    protected BigInteger rtSrcTyp;
    @XmlAttribute(name = "RefPg")
    protected String refPg;

    /**
     * Gets the value of the rtSrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRtSrc() {
        return rtSrc;
    }

    /**
     * Sets the value of the rtSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRtSrc(BigInteger value) {
        this.rtSrc = value;
    }

    /**
     * Gets the value of the rtSrcTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRtSrcTyp() {
        return rtSrcTyp;
    }

    /**
     * Sets the value of the rtSrcTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRtSrcTyp(BigInteger value) {
        this.rtSrcTyp = value;
    }

    /**
     * Gets the value of the refPg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefPg() {
        return refPg;
    }

    /**
     * Sets the value of the refPg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefPg(String value) {
        this.refPg = value;
    }

}