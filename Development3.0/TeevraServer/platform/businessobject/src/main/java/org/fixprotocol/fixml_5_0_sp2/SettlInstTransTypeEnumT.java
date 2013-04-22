
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlInstTransType_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlInstTransType_enum_t">
 *   &lt;restriction base="{http://www.fixprotocol.org/FIXML-5-0-SP2}char">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="T"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SettlInstTransType_enum_t")
@XmlEnum
public enum SettlInstTransTypeEnumT {

    C,
    N,
    R,
    T;

    public String value() {
        return name();
    }

    public static SettlInstTransTypeEnumT fromValue(String v) {
        return valueOf(v);
    }

}