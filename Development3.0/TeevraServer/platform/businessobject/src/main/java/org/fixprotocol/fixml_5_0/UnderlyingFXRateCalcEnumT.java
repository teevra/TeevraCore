//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.08 at 01:47:27 PM IST 
//


package org.fixprotocol.fixml_5_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingFXRateCalc_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnderlyingFXRateCalc_enum_t">
 *   &lt;restriction base="{http://www.fixprotocol.org/FIXML-5-0}char">
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="D"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnderlyingFXRateCalc_enum_t")
@XmlEnum
public enum UnderlyingFXRateCalcEnumT {

    M,
    D;

    public String value() {
        return name();
    }

    public static UnderlyingFXRateCalcEnumT fromValue(String v) {
        return valueOf(v);
    }

}
