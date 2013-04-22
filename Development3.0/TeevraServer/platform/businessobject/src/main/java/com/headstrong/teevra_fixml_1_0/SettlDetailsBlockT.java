
package com.headstrong.teevra_fixml_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlDetails_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlDetails_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}SettlDetailsElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}SettlDetailsAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlDetails_Block_t", propOrder = {
    "pty"
})
public class SettlDetailsBlockT {

    @XmlElement(name = "Pty")
    protected List<SettlPartiesBlockT> pty;
    @XmlAttribute(name = "SettlSrc")
    protected String settlSrc;

    /**
     * Gets the value of the pty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlPartiesBlockT }
     * 
     * 
     */
    public List<SettlPartiesBlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<SettlPartiesBlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the settlSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlSrc() {
        return settlSrc;
    }

    /**
     * Sets the value of the settlSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlSrc(String value) {
        this.settlSrc = value;
    }

}
