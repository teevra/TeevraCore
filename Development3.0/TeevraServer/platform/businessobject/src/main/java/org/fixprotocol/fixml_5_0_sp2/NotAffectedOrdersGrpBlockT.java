
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotAffectedOrdersGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotAffectedOrdersGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}NotAffectedOrdersGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}NotAffectedOrdersGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotAffectedOrdersGrp_Block_t")
public class NotAffectedOrdersGrpBlockT {

    @XmlAttribute(name = "NotAffOrigClOrdID")
    protected String notAffOrigClOrdID;
    @XmlAttribute(name = "NotAffectedOrderID")
    protected String notAffectedOrderID;

    /**
     * Gets the value of the notAffOrigClOrdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotAffOrigClOrdID() {
        return notAffOrigClOrdID;
    }

    /**
     * Sets the value of the notAffOrigClOrdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotAffOrigClOrdID(String value) {
        this.notAffOrigClOrdID = value;
    }

    /**
     * Gets the value of the notAffectedOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotAffectedOrderID() {
        return notAffectedOrderID;
    }

    /**
     * Sets the value of the notAffectedOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotAffectedOrderID(String value) {
        this.notAffectedOrderID = value;
    }

}
