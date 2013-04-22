//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.08 at 01:47:27 PM IST 
//


package org.fixprotocol.fixml_5_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * TrdRegTimestamps is a component
 * 
 * <p>Java class for TrdRegTimestamps_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrdRegTimestamps_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0}TrdRegTimestampsElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0}TrdRegTimestampsAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrdRegTimestamps_Block_t")
public class TrdRegTimestampsBlockT {

    @XmlAttribute(name = "TS")
    protected XMLGregorianCalendar ts;
    @XmlAttribute(name = "Typ")
    protected Integer typ;
    @XmlAttribute(name = "Src")
    protected String src;
    @XmlAttribute(name = "DskTyp")
    protected DeskTypeEnumT dskTyp;
    @XmlAttribute(name = "DskTypSrc")
    protected Integer dskTypSrc;
    @XmlAttribute(name = "DskOrdHndlInst")
    protected DeskOrderHandlingInstEnumT dskOrdHndlInst;

    /**
     * Gets the value of the ts property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTS() {
        return ts;
    }

    /**
     * Sets the value of the ts property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTS(XMLGregorianCalendar value) {
        this.ts = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTyp(Integer value) {
        this.typ = value;
    }

    /**
     * Gets the value of the src property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrc() {
        return src;
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrc(String value) {
        this.src = value;
    }

    /**
     * Gets the value of the dskTyp property.
     * 
     * @return
     *     possible object is
     *     {@link DeskTypeEnumT }
     *     
     */
    public DeskTypeEnumT getDskTyp() {
        return dskTyp;
    }

    /**
     * Sets the value of the dskTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeskTypeEnumT }
     *     
     */
    public void setDskTyp(DeskTypeEnumT value) {
        this.dskTyp = value;
    }

    /**
     * Gets the value of the dskTypSrc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDskTypSrc() {
        return dskTypSrc;
    }

    /**
     * Sets the value of the dskTypSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDskTypSrc(Integer value) {
        this.dskTypSrc = value;
    }

    /**
     * Gets the value of the dskOrdHndlInst property.
     * 
     * @return
     *     possible object is
     *     {@link DeskOrderHandlingInstEnumT }
     *     
     */
    public DeskOrderHandlingInstEnumT getDskOrdHndlInst() {
        return dskOrdHndlInst;
    }

    /**
     * Sets the value of the dskOrdHndlInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeskOrderHandlingInstEnumT }
     *     
     */
    public void setDskOrdHndlInst(DeskOrderHandlingInstEnumT value) {
        this.dskOrdHndlInst = value;
    }

}
