
package com.headstrong.teevra_fixml_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * BusinessMessageReject can be found in Volume1 of the specification 
 * 
 * <p>Java class for Error_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Error_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}ErrorElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}ErrorAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Error_message_t", propOrder = {
    "errorRecord",
    "errorDesc",
    "errorFields"
})
public class ErrorMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "ErrorRecord")
    protected List<String> errorRecord;
    @XmlElement(name = "ErrorDesc")
    protected String errorDesc;
    @XmlElement(name = "ErrorFields")
    protected ErrorFieldsBlockT errorFields;
    @XmlAttribute(name = "ErrorCode")
    protected String errorCode;
    @XmlAttribute(name = "ErrorMessage")
    protected String errorMessage;
    @XmlAttribute(name = "ErrorType")
    protected String errorType;
    @XmlAttribute(name = "TechErrorType")
    protected String techErrorType;
    @XmlAttribute(name = "TechErrorCode")
    protected String techErrorCode;
    @XmlAttribute(name = "TechErrorMessage")
    protected String techErrorMessage;
    @XmlAttribute(name = "TrnID")
    protected String trnID;
    @XmlAttribute(name = "Source")
    protected String source;
    @XmlAttribute(name = "TransTyp")
    protected String transTyp;
    @XmlAttribute(name = "Timestamp")
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "TrdID2")
    protected String trdID2;
    @XmlAttribute(name = "OrigTrdID2")
    protected String origTrdID2;
    @XmlAttribute(name = "OrdID")
    protected String ordID;
    @XmlAttribute(name = "TrdRptStat")
    protected String trdRptStat;

    /**
     * Gets the value of the errorRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getErrorRecord() {
        if (errorRecord == null) {
            errorRecord = new ArrayList<String>();
        }
        return this.errorRecord;
    }

    /**
     * Gets the value of the errorDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDesc() {
        return errorDesc;
    }

    /**
     * Sets the value of the errorDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDesc(String value) {
        this.errorDesc = value;
    }

    /**
     * Gets the value of the errorFields property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorFieldsBlockT }
     *     
     */
    public ErrorFieldsBlockT getErrorFields() {
        return errorFields;
    }

    /**
     * Sets the value of the errorFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorFieldsBlockT }
     *     
     */
    public void setErrorFields(ErrorFieldsBlockT value) {
        this.errorFields = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the errorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorType() {
        return errorType;
    }

    /**
     * Sets the value of the errorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorType(String value) {
        this.errorType = value;
    }

    /**
     * Gets the value of the techErrorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechErrorType() {
        return techErrorType;
    }

    /**
     * Sets the value of the techErrorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechErrorType(String value) {
        this.techErrorType = value;
    }

    /**
     * Gets the value of the techErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechErrorCode() {
        return techErrorCode;
    }

    /**
     * Sets the value of the techErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechErrorCode(String value) {
        this.techErrorCode = value;
    }

    /**
     * Gets the value of the techErrorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechErrorMessage() {
        return techErrorMessage;
    }

    /**
     * Sets the value of the techErrorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechErrorMessage(String value) {
        this.techErrorMessage = value;
    }

    /**
     * Gets the value of the trnID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnID() {
        return trnID;
    }

    /**
     * Sets the value of the trnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnID(String value) {
        this.trnID = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the transTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransTyp() {
        return transTyp;
    }

    /**
     * Sets the value of the transTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransTyp(String value) {
        this.transTyp = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the trdID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdID2() {
        return trdID2;
    }

    /**
     * Sets the value of the trdID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdID2(String value) {
        this.trdID2 = value;
    }

    /**
     * Gets the value of the origTrdID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigTrdID2() {
        return origTrdID2;
    }

    /**
     * Sets the value of the origTrdID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigTrdID2(String value) {
        this.origTrdID2 = value;
    }

    /**
     * Gets the value of the ordID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdID() {
        return ordID;
    }

    /**
     * Sets the value of the ordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdID(String value) {
        this.ordID = value;
    }

    /**
     * Gets the value of the trdRptStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdRptStat() {
        return trdRptStat;
    }

    /**
     * Sets the value of the trdRptStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdRptStat(String value) {
        this.trdRptStat = value;
    }

}
