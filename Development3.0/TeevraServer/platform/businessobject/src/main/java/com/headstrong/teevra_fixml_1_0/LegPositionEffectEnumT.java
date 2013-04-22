
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegPositionEffect_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LegPositionEffect_enum_t">
 *   &lt;restriction base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}char">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="D"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LegPositionEffect_enum_t")
@XmlEnum
public enum LegPositionEffectEnumT {

    C,
    F,
    O,
    R,
    N,
    D;

    public String value() {
        return name();
    }

    public static LegPositionEffectEnumT fromValue(String v) {
        return valueOf(v);
    }

}
