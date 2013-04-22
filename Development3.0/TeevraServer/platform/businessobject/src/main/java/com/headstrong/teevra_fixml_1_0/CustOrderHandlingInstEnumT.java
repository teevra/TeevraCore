
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustOrderHandlingInst_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustOrderHandlingInst_enum_t">
 *   &lt;restriction base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}MultipleStringValue">
 *     &lt;enumeration value="ADD"/>
 *     &lt;enumeration value="AON"/>
 *     &lt;enumeration value="CNH"/>
 *     &lt;enumeration value="DIR"/>
 *     &lt;enumeration value="E.W"/>
 *     &lt;enumeration value="FOK"/>
 *     &lt;enumeration value="IO"/>
 *     &lt;enumeration value="IOC"/>
 *     &lt;enumeration value="LOO"/>
 *     &lt;enumeration value="LOC"/>
 *     &lt;enumeration value="MAO"/>
 *     &lt;enumeration value="MAC"/>
 *     &lt;enumeration value="MOO"/>
 *     &lt;enumeration value="MOC"/>
 *     &lt;enumeration value="MQT"/>
 *     &lt;enumeration value="NH"/>
 *     &lt;enumeration value="OVD"/>
 *     &lt;enumeration value="PEG"/>
 *     &lt;enumeration value="RSV"/>
 *     &lt;enumeration value="S.W"/>
 *     &lt;enumeration value="SCL"/>
 *     &lt;enumeration value="TMO"/>
 *     &lt;enumeration value="TS"/>
 *     &lt;enumeration value="WRK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustOrderHandlingInst_enum_t")
@XmlEnum
public enum CustOrderHandlingInstEnumT {

    ADD("ADD"),
    AON("AON"),
    CNH("CNH"),
    DIR("DIR"),
    @XmlEnumValue("E.W")
    E_W("E.W"),
    FOK("FOK"),
    IO("IO"),
    IOC("IOC"),
    LOO("LOO"),
    LOC("LOC"),
    MAO("MAO"),
    MAC("MAC"),
    MOO("MOO"),
    MOC("MOC"),
    MQT("MQT"),
    NH("NH"),
    OVD("OVD"),
    PEG("PEG"),
    RSV("RSV"),
    @XmlEnumValue("S.W")
    S_W("S.W"),
    SCL("SCL"),
    TMO("TMO"),
    TS("TS"),
    WRK("WRK");
    private final String value;

    CustOrderHandlingInstEnumT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustOrderHandlingInstEnumT fromValue(String v) {
        for (CustOrderHandlingInstEnumT c: CustOrderHandlingInstEnumT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
