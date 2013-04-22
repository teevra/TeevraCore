
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TriggerPriceDirection_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TriggerPriceDirection_enum_t">
 *   &lt;restriction base="{http://www.fixprotocol.org/FIXML-5-0-SP2}char">
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="D"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TriggerPriceDirection_enum_t")
@XmlEnum
public enum TriggerPriceDirectionEnumT {

    U,
    D;

    public String value() {
        return name();
    }

    public static TriggerPriceDirectionEnumT fromValue(String v) {
        return valueOf(v);
    }

}
