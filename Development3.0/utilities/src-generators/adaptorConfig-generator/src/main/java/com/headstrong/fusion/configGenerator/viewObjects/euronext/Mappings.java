//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.08 at 03:02:25 PM IST 
//


package com.headstrong.fusion.configGenerator.viewObjects.euronext;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.headstrong.fusion.configGenerator.viewObjects.euronext.Maps;
import com.headstrong.fusion.configGenerator.viewObjects.euronext.Switch;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}map"/>
 *         &lt;element ref="{}switch"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "map",
    "_switch"
})
@XmlRootElement(name = "mappings")
public class Mappings {

	protected List<Maps> map = new ArrayList<Maps>();
    @XmlElement(name = "switch")
    protected List<Switch> _switch = new ArrayList<Switch>();


    /**
     * Gets the value of the map property.
     * 
     * @return
     *     possible object is
     *     {@link Maps }
     *     
     */
    public List<Maps> getMap() {
    	if (map == null) {
    		map = new ArrayList<Maps>();
        }
        return this.map;
    }

    /**
     * Sets the value of the map property.
     * 
     * @param value
     *     allowed object is
     *     {@link Maps }
     *     
     */
    public void setMap(List<Maps> value) {
        this.map = value;
    }

    /**
     * Gets the value of the switch property.
     * 
     * @return
     *     possible object is
     *     {@link Switch }
     *     
     */
    public List<Switch> getSwitch() {
    	if (_switch == null) {
    		_switch = new ArrayList<Switch>();
        }
        return this._switch;
    }

    /**
     * Sets the value of the switch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Switch }
     *     
     */
    public void setSwitch(List<Switch> value) {
        this._switch = value;
    }

}