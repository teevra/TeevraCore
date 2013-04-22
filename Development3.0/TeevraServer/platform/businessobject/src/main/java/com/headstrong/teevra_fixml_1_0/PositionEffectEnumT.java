
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionEffect_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PositionEffect_enum_t">
 *   &lt;restriction base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}char">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="P"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PositionEffect_enum_t")
@XmlEnum
public enum PositionEffectEnumT {

    C,
    F,
    O,
    R,
    N,
    D,
    P;

    public String value() {
        return name();
    }

    public static PositionEffectEnumT fromValue(String v) {
        return valueOf(v);
    }

}
