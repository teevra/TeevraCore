
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValuationMethod_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValuationMethod_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQTY"/>
 *     &lt;enumeration value="FUT"/>
 *     &lt;enumeration value="FUTDA"/>
 *     &lt;enumeration value="CDS"/>
 *     &lt;enumeration value="CDSD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValuationMethod_enum_t")
@XmlEnum
public enum ValuationMethodEnumT {

    EQTY,
    FUT,
    FUTDA,
    CDS,
    CDSD;

    public String value() {
        return name();
    }

    public static ValuationMethodEnumT fromValue(String v) {
        return valueOf(v);
    }

}
