
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegStipulations_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegStipulations_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegStipulationsElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegStipulationsAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegStipulations_Block_t")
public class LegStipulationsBlockT {

    @XmlAttribute(name = "StipTyp")
    protected StipulationTypeEnumT stipTyp;
    @XmlAttribute(name = "StipVal")
    protected String stipVal;

    /**
     * Gets the value of the stipTyp property.
     * 
     * @return
     *     possible object is
     *     {@link StipulationTypeEnumT }
     *     
     */
    public StipulationTypeEnumT getStipTyp() {
        return stipTyp;
    }

    /**
     * Sets the value of the stipTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StipulationTypeEnumT }
     *     
     */
    public void setStipTyp(StipulationTypeEnumT value) {
        this.stipTyp = value;
    }

    /**
     * Gets the value of the stipVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStipVal() {
        return stipVal;
    }

    /**
     * Sets the value of the stipVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStipVal(String value) {
        this.stipVal = value;
    }

}
