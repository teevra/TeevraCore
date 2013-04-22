
package com.headstrong.teevra_fixml_1_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Batch_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Batch_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}BatchElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}BatchAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Batch_t", propOrder = {
    "hdr",
    "message"
})
public class BatchT {

    @XmlElement(name = "Hdr")
    protected BatchHeaderT hdr;
    @XmlElementRef(name = "Message", namespace = "http://www.headstrong.com/TEEVRA-FIXML-1-0", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractMessageT>> message;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "TotMsg")
    protected BigInteger totMsg;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link BatchHeaderT }
     *     
     */
    public BatchHeaderT getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchHeaderT }
     *     
     */
    public void setHdr(BatchHeaderT value) {
        this.hdr = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ListCancelRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link SecurityTypeRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link AllocationInstructionMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link AllocationInstructionAckMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link ListStrikePriceMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link IOIMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link DerivativeSecurityListRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link SettlementInstructionRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link TradingSessionListMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link StreamAssignmentReportACKMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link PositionReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link PositionMaintenanceRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link QuoteRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link ErrorMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link MarketDataRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link UserRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link SecurityListMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link BusinessMessageRejectMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link AdvertisementMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link PositionMaintenanceReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link RegistrationInstructionsMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link SecurityStatusMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link ListStatusMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link ApplicationMessageRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link StreamAssignmentRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link QuoteResponseMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link DerivativeSecurityListUpdateReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link AdjustedPositionReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link OrderCancelRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link CrossOrderCancelReplaceRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link AllocationReportAckMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link AllocationInstructionAlertMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link MarketDataIncrementalRefreshMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link SecurityStatusRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link QuoteRequestRejectMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link QuoteCancelMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link MassQuoteMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link EmailMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link NewOrderMultilegMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link OrderMassActionRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link CollateralReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link TradingSessionStatusRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link PartyDetailsListRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link SettlementObligationReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link NewsMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link CollateralResponseMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link SettlementInstructionsMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link RFQRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link CollateralInquiryMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link ExecutionReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link RegistrationInstructionsResponseMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link ApplicationMessageReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link QuoteMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link TradingSessionListUpdateReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link TradeCaptureReportAckMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link OrderMassStatusRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link OrderMassCancelReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link ConfirmationAckMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link OrderCancelRejectMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link CrossOrderCancelRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link ListStatusRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link NewOrderSingleMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link OrderStatusRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link NewOrderListMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link BidResponseMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link DerivativeSecurityListMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link StreamAssignmentReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link MarketDataSnapshotFullRefreshMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link SecurityListRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link PartyDetailsListReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link OrderMassActionReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link SecurityListUpdateReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link SecurityDefinitionUpdateReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link CollateralRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link OrderMassCancelRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link RequestForPositionsAckMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link DontKnowTradeDKMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link TradeCaptureReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link CollateralInquiryAckMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link ContraryIntentionReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link UserResponseMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link BidRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link AssignmentReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link NetworkCounterpartySystemStatusRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link MarketDefinitionMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link SecurityTypesMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link QuoteStatusRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link TradeCaptureReportRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link NetworkCounterpartySystemStatusResponseMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link NewOrderCrossMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link TradingSessionStatusMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link SecurityDefinitionRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link ListExecuteMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link QuoteStatusReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link MassQuoteAcknowledgementMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link TradingSessionListRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link AllocationReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link MarketDefinitionUpdateReportMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link ConfirmationMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link SecurityDefinitionMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link RequestForPositionsMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link OrderCancelReplaceRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link MarketDefinitionRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link TradeCaptureReportRequestAckMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link MultilegOrderCancelReplaceMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link ConfirmationRequestMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link MarketDataRequestRejectMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link ApplicationMessageRequestAckMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link CollateralAssignmentMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link UserNotificationMessageT }{@code >}
     * {@link JAXBElement }{@code <}{@link ExecutionAcknowledgementMessageT }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractMessageT>> getMessage() {
        if (message == null) {
            message = new ArrayList<JAXBElement<? extends AbstractMessageT>>();
        }
        return this.message;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the totMsg property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotMsg() {
        return totMsg;
    }

    /**
     * Sets the value of the totMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotMsg(BigInteger value) {
        this.totMsg = value;
    }

}
