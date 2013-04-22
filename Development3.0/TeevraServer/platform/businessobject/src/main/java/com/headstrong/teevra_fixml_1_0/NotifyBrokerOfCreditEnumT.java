
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotifyBrokerOfCredit_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotifyBrokerOfCredit_enum_t">
 *   &lt;restriction base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}Boolean">
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="Y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NotifyBrokerOfCredit_enum_t")
@XmlEnum
public enum NotifyBrokerOfCreditEnumT {

    N,
    Y;

    public String value() {
        return name();
    }

    public static NotifyBrokerOfCreditEnumT fromValue(String v) {
        return valueOf(v);
    }

}
