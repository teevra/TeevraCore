//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.08 at 03:02:25 PM IST 
//


package com.headstrong.fusion.configGenerator.viewObjects.euronext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}formatterConfig"/>
 *         &lt;element ref="{}binding"/>
 *         &lt;element ref="{}mappings"/>
 *         &lt;element ref="{}parserConfig"/>
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
    "formatterConfig",
    "parserConfig",
    "binding",
    "mappings"    
})
@XmlRootElement(name = "configuration")
public class Configuration {

    @XmlElement(required = true)
    protected FormatterConfig formatterConfig;
    @XmlElement(required = true)
    protected ParserConfig parserConfig;
    @XmlElement(required = true)
    protected Binding binding;
    @XmlElement(required = true)
    protected Mappings mappings;
    

    /**
     * Gets the value of the formatterConfig property.
     * 
     * @return
     *     possible object is
     *     {@link FormatterConfig }
     *     
     */
    public FormatterConfig getFormatterConfig() {
        return formatterConfig;
    }

    /**
     * Sets the value of the formatterConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatterConfig }
     *     
     */
    public void setFormatterConfig(FormatterConfig value) {
        this.formatterConfig = value;
    }
    
    /**
     * Gets the value of the parserConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ParserConfig }
     *     
     */
    public ParserConfig getParserConfig() {
        return parserConfig;
    }

    /**
     * Sets the value of the parserConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParserConfig }
     *     
     */
    public void setParserConfig(ParserConfig value) {
        this.parserConfig = value;
    }


    /**
     * Gets the value of the binding property.
     * 
     * @return
     *     possible object is
     *     {@link Binding }
     *     
     */
    public Binding getBinding() {
        return binding;
    }

    /**
     * Sets the value of the binding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Binding }
     *     
     */
    public void setBinding(Binding value) {
        this.binding = value;
    }

    /**
     * Gets the value of the mappings property.
     * 
     * @return
     *     possible object is
     *     {@link Mappings }
     *     
     */
    public Mappings getMappings() {
        return mappings;
    }

    /**
     * Sets the value of the mappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mappings }
     *     
     */
    public void setMappings(Mappings value) {
        this.mappings = value;
    }

}
