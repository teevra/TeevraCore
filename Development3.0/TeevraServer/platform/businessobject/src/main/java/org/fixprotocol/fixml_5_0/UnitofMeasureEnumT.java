//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.08 at 01:47:27 PM IST 
//


package org.fixprotocol.fixml_5_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitofMeasure_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitofMeasure_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MWh"/>
 *     &lt;enumeration value="MMBtu"/>
 *     &lt;enumeration value="Bbl"/>
 *     &lt;enumeration value="Gal"/>
 *     &lt;enumeration value="t"/>
 *     &lt;enumeration value="tn"/>
 *     &lt;enumeration value="MMbbl"/>
 *     &lt;enumeration value="lbs"/>
 *     &lt;enumeration value="oz_tr"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="Bcf"/>
 *     &lt;enumeration value="Bu"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitofMeasure_enum_t")
@XmlEnum
public enum UnitofMeasureEnumT {

    @XmlEnumValue("MWh")
    M_WH("MWh"),
    @XmlEnumValue("MMBtu")
    MM_BTU("MMBtu"),
    @XmlEnumValue("Bbl")
    BBL("Bbl"),
    @XmlEnumValue("Gal")
    GAL("Gal"),
    @XmlEnumValue("t")
    T("t"),
    @XmlEnumValue("tn")
    TN("tn"),
    @XmlEnumValue("MMbbl")
    M_MBBL("MMbbl"),
    @XmlEnumValue("lbs")
    LBS("lbs"),
    @XmlEnumValue("oz_tr")
    OZ_TR("oz_tr"),
    USD("USD"),
    @XmlEnumValue("Bcf")
    BCF("Bcf"),
    @XmlEnumValue("Bu")
    BU("Bu");
    private final String value;

    UnitofMeasureEnumT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitofMeasureEnumT fromValue(String v) {
        for (UnitofMeasureEnumT c: UnitofMeasureEnumT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
