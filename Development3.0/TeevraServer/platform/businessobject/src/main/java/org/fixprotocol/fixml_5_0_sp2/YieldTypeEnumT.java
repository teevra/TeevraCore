
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YieldType_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="YieldType_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AFTERTAX"/>
 *     &lt;enumeration value="ANNUAL"/>
 *     &lt;enumeration value="ATISSUE"/>
 *     &lt;enumeration value="AVGMATURITY"/>
 *     &lt;enumeration value="BOOK"/>
 *     &lt;enumeration value="CALL"/>
 *     &lt;enumeration value="CHANGE"/>
 *     &lt;enumeration value="CLOSE"/>
 *     &lt;enumeration value="COMPOUND"/>
 *     &lt;enumeration value="CURRENT"/>
 *     &lt;enumeration value="GOVTEQUIV"/>
 *     &lt;enumeration value="GROSS"/>
 *     &lt;enumeration value="INFLATION"/>
 *     &lt;enumeration value="INVERSEFLOATER"/>
 *     &lt;enumeration value="LASTCLOSE"/>
 *     &lt;enumeration value="LASTMONTH"/>
 *     &lt;enumeration value="LASTQUARTER"/>
 *     &lt;enumeration value="LASTYEAR"/>
 *     &lt;enumeration value="LONGAVGLIFE"/>
 *     &lt;enumeration value="MARK"/>
 *     &lt;enumeration value="MATURITY"/>
 *     &lt;enumeration value="NEXTREFUND"/>
 *     &lt;enumeration value="OPENAVG"/>
 *     &lt;enumeration value="PREVCLOSE"/>
 *     &lt;enumeration value="PROCEEDS"/>
 *     &lt;enumeration value="PUT"/>
 *     &lt;enumeration value="SEMIANNUAL"/>
 *     &lt;enumeration value="SHORTAVGLIFE"/>
 *     &lt;enumeration value="SIMPLE"/>
 *     &lt;enumeration value="TAXEQUIV"/>
 *     &lt;enumeration value="TENDER"/>
 *     &lt;enumeration value="TRUE"/>
 *     &lt;enumeration value="VALUE1_32"/>
 *     &lt;enumeration value="WORST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "YieldType_enum_t")
@XmlEnum
public enum YieldTypeEnumT {

    AFTERTAX("AFTERTAX"),
    ANNUAL("ANNUAL"),
    ATISSUE("ATISSUE"),
    AVGMATURITY("AVGMATURITY"),
    BOOK("BOOK"),
    CALL("CALL"),
    CHANGE("CHANGE"),
    CLOSE("CLOSE"),
    COMPOUND("COMPOUND"),
    CURRENT("CURRENT"),
    GOVTEQUIV("GOVTEQUIV"),
    GROSS("GROSS"),
    INFLATION("INFLATION"),
    INVERSEFLOATER("INVERSEFLOATER"),
    LASTCLOSE("LASTCLOSE"),
    LASTMONTH("LASTMONTH"),
    LASTQUARTER("LASTQUARTER"),
    LASTYEAR("LASTYEAR"),
    LONGAVGLIFE("LONGAVGLIFE"),
    MARK("MARK"),
    MATURITY("MATURITY"),
    NEXTREFUND("NEXTREFUND"),
    OPENAVG("OPENAVG"),
    PREVCLOSE("PREVCLOSE"),
    PROCEEDS("PROCEEDS"),
    PUT("PUT"),
    SEMIANNUAL("SEMIANNUAL"),
    SHORTAVGLIFE("SHORTAVGLIFE"),
    SIMPLE("SIMPLE"),
    TAXEQUIV("TAXEQUIV"),
    TENDER("TENDER"),
    TRUE("TRUE"),
    @XmlEnumValue("VALUE1_32")
    VALUE_1_32("VALUE1_32"),
    WORST("WORST");
    private final String value;

    YieldTypeEnumT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static YieldTypeEnumT fromValue(String v) {
        for (YieldTypeEnumT c: YieldTypeEnumT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
