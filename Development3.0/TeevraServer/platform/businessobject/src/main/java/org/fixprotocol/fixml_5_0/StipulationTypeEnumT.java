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
 * <p>Java class for StipulationType_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StipulationType_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABS"/>
 *     &lt;enumeration value="AMT"/>
 *     &lt;enumeration value="AUTOREINV"/>
 *     &lt;enumeration value="BANKQUAL"/>
 *     &lt;enumeration value="BGNCON"/>
 *     &lt;enumeration value="COUPON"/>
 *     &lt;enumeration value="CPP"/>
 *     &lt;enumeration value="CPR"/>
 *     &lt;enumeration value="CPY"/>
 *     &lt;enumeration value="CURRENCY"/>
 *     &lt;enumeration value="CUSTOMDATE"/>
 *     &lt;enumeration value="GEOG"/>
 *     &lt;enumeration value="HAIRCUT"/>
 *     &lt;enumeration value="HEP"/>
 *     &lt;enumeration value="INSURED"/>
 *     &lt;enumeration value="ISSUE"/>
 *     &lt;enumeration value="ISSUER"/>
 *     &lt;enumeration value="ISSUESIZE"/>
 *     &lt;enumeration value="LOOKBACK"/>
 *     &lt;enumeration value="LOT"/>
 *     &lt;enumeration value="LOTVAR"/>
 *     &lt;enumeration value="MAT"/>
 *     &lt;enumeration value="MATURITY"/>
 *     &lt;enumeration value="MAXSUBS"/>
 *     &lt;enumeration value="MHP"/>
 *     &lt;enumeration value="MINDNOM"/>
 *     &lt;enumeration value="MININCR"/>
 *     &lt;enumeration value="MINQTY"/>
 *     &lt;enumeration value="MPR"/>
 *     &lt;enumeration value="PAYFREQ"/>
 *     &lt;enumeration value="PIECES"/>
 *     &lt;enumeration value="PMAX"/>
 *     &lt;enumeration value="PPC"/>
 *     &lt;enumeration value="PPL"/>
 *     &lt;enumeration value="PPM"/>
 *     &lt;enumeration value="PPT"/>
 *     &lt;enumeration value="PRICE"/>
 *     &lt;enumeration value="PRICEFREQ"/>
 *     &lt;enumeration value="PROD"/>
 *     &lt;enumeration value="PROTECT"/>
 *     &lt;enumeration value="PSA"/>
 *     &lt;enumeration value="PURPOSE"/>
 *     &lt;enumeration value="PXSOURCE"/>
 *     &lt;enumeration value="RATING"/>
 *     &lt;enumeration value="REDEMPTION"/>
 *     &lt;enumeration value="RESTRICTED"/>
 *     &lt;enumeration value="SECTOR"/>
 *     &lt;enumeration value="SECTYPE"/>
 *     &lt;enumeration value="SMM"/>
 *     &lt;enumeration value="STRUCT"/>
 *     &lt;enumeration value="SUBSFREQ"/>
 *     &lt;enumeration value="SUBSLEFT"/>
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="TRDVAR"/>
 *     &lt;enumeration value="WAC"/>
 *     &lt;enumeration value="WAL"/>
 *     &lt;enumeration value="WALA"/>
 *     &lt;enumeration value="WAM"/>
 *     &lt;enumeration value="WHOLE"/>
 *     &lt;enumeration value="YIELD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StipulationType_enum_t")
@XmlEnum
public enum StipulationTypeEnumT {

    ABS,
    AMT,
    AUTOREINV,
    BANKQUAL,
    BGNCON,
    COUPON,
    CPP,
    CPR,
    CPY,
    CURRENCY,
    CUSTOMDATE,
    GEOG,
    HAIRCUT,
    HEP,
    INSURED,
    ISSUE,
    ISSUER,
    ISSUESIZE,
    LOOKBACK,
    LOT,
    LOTVAR,
    MAT,
    MATURITY,
    MAXSUBS,
    MHP,
    MINDNOM,
    MININCR,
    MINQTY,
    MPR,
    PAYFREQ,
    PIECES,
    PMAX,
    PPC,
    PPL,
    PPM,
    PPT,
    PRICE,
    PRICEFREQ,
    PROD,
    PROTECT,
    PSA,
    PURPOSE,
    PXSOURCE,
    RATING,
    REDEMPTION,
    RESTRICTED,
    SECTOR,
    SECTYPE,
    SMM,
    STRUCT,
    SUBSFREQ,
    SUBSLEFT,
    TEXT,
    TRDVAR,
    WAC,
    WAL,
    WALA,
    WAM,
    WHOLE,
    YIELD;

    public String value() {
        return name();
    }

    public static StipulationTypeEnumT fromValue(String v) {
        return valueOf(v);
    }

}
