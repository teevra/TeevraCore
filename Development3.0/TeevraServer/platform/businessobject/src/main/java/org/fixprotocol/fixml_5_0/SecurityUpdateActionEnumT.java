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
 * <p>Java class for SecurityUpdateAction_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityUpdateAction_enum_t">
 *   &lt;restriction base="{http://www.fixprotocol.org/FIXML-5-0}char">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="M"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecurityUpdateAction_enum_t")
@XmlEnum
public enum SecurityUpdateActionEnumT {

    A,
    D,
    M;

    public String value() {
        return name();
    }

    public static SecurityUpdateActionEnumT fromValue(String v) {
        return valueOf(v);
    }

}
