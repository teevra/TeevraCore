package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.MultilegOrderCancelReplaceMessageT;
import com.headstrong.teevra_fixml_1_0.OrderQtyDataBlockT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;
import com.headstrong.teevra_fixml_1_0.PositionEffectEnumT;
import com.headstrong.teevra_fixml_1_0.CommissionDataBlockT;
import com.headstrong.teevra_fixml_1_0.ForexReqEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import com.headstrong.teevra_fixml_1_0.LocateReqdEnumT;
import com.headstrong.teevra_fixml_1_0.ExDestinationIDSourceEnumT;
import com.headstrong.teevra_fixml_1_0.DiscretionInstructionsBlockT;
import com.headstrong.teevra_fixml_1_0.PegInstructionsBlockT;
import com.headstrong.teevra_fixml_1_0.OrderCapacityEnumT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.TriggeringInstructionBlockT;
import com.headstrong.teevra_fixml_1_0.InstrumentBlockT;
import com.headstrong.teevra_fixml_1_0.DisplayInstructionBlockT;
import com.headstrong.teevra_fixml_1_0.CancellationRightsEnumT;
import com.headstrong.teevra_fixml_1_0.SolicitedFlagEnumT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class MultilegOrderCancelReplaceMessageTBeanAccessor implements BeanAccessor<MultilegOrderCancelReplaceMessageT> {
	
	private MultilegOrderCancelReplaceMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("maxShow".equalsIgnoreCase(accessPath)){
			return this.bean.getMaxShow();
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("cpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getCpcty();
		}
		else if("discInstr".equalsIgnoreCase(accessPath)){
			return this.bean.getDiscInstr();
		}
		else if("rFR".equalsIgnoreCase(accessPath)){
			return this.bean.getRFR();
		}
		else if("designation".equalsIgnoreCase(accessPath)){
			return this.bean.getDesignation();
		}
		else if("origOrdModTm".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigOrdModTm();
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctTyp();
		}
		else if("solFlag".equalsIgnoreCase(accessPath)){
			return this.bean.getSolFlag();
		}
		else if("trgrInstr".equalsIgnoreCase(accessPath)){
			return this.bean.getTrgrInstr();
		}
		else if("registID".equalsIgnoreCase(accessPath)){
			return this.bean.getRegistID();
		}
		else if("mtchInc".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchInc();
		}
		else if("tmInForce".equalsIgnoreCase(accessPath)){
			return this.bean.getTmInForce();
		}
		else if("posEfct".equalsIgnoreCase(accessPath)){
			return this.bean.getPosEfct();
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDt();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdQty();
		}
		else if("dayBkngInst".equalsIgnoreCase(accessPath)){
			return this.bean.getDayBkngInst();
		}
		else if("mLEGRptTypReq".equalsIgnoreCase(accessPath)){
			return this.bean.getMLEGRptTypReq();
		}
		else if("complianceID".equalsIgnoreCase(accessPath)){
			return this.bean.getComplianceID();
		}
		else if("mxPxLvls".equalsIgnoreCase(accessPath)){
			return this.bean.getMxPxLvls();
		}
		else if("qID".equalsIgnoreCase(accessPath)){
			return this.bean.getQID();
		}
		else if("swapPnts".equalsIgnoreCase(accessPath)){
			return this.bean.getSwapPnts();
		}
		else if("ordTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdTyp();
		}
		else if("efctvTm".equalsIgnoreCase(accessPath)){
			return this.bean.getEfctvTm();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("preAllocMleg".equalsIgnoreCase(accessPath)){
			return this.bean.getPreAllocMleg();
		}
		else if("minQty".equalsIgnoreCase(accessPath)){
			return this.bean.getMinQty();
		}
		else if("mlegPxMeth".equalsIgnoreCase(accessPath)){
			return this.bean.getMlegPxMeth();
		}
		else if("pxPrtScp".equalsIgnoreCase(accessPath)){
			return this.bean.getPxPrtScp();
		}
		else if("tgtStrategyParameters".equalsIgnoreCase(accessPath)){
			return this.bean.getTgtStrategyParameters();
		}
		else if("expireDt".equalsIgnoreCase(accessPath)){
			return this.bean.getExpireDt();
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlTyp();
		}
		else if("orignDt".equalsIgnoreCase(accessPath)){
			return this.bean.getOrignDt();
		}
		else if("gTBkngInst".equalsIgnoreCase(accessPath)){
			return this.bean.getGTBkngInst();
		}
		else if("stopPx".equalsIgnoreCase(accessPath)){
			return this.bean.getStopPx();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("clrFeeInd".equalsIgnoreCase(accessPath)){
			return this.bean.getClrFeeInd();
		}
		else if("prevClsPx".equalsIgnoreCase(accessPath)){
			return this.bean.getPrevClsPx();
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getCustCpcty();
		}
		else if("clOrdLinkID".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdLinkID();
		}
		else if("cxllationRights".equalsIgnoreCase(accessPath)){
			return this.bean.getCxllationRights();
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getPxTyp();
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID();
		}
		else if("expireTm".equalsIgnoreCase(accessPath)){
			return this.bean.getExpireTm();
		}
		else if("dsplyInstr".equalsIgnoreCase(accessPath)){
			return this.bean.getDsplyInstr();
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCcy();
		}
		else if("ord".equalsIgnoreCase(accessPath)){
			return this.bean.getOrd();
		}
		else if("mnyLaunderingStat".equalsIgnoreCase(accessPath)){
			return this.bean.getMnyLaunderingStat();
		}
		else if("iOIID".equalsIgnoreCase(accessPath)){
			return this.bean.getIOIID();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("allocID".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocID();
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			return this.bean.getAcct();
		}
		else if("locReqd".equalsIgnoreCase(accessPath)){
			return this.bean.getLocReqd();
		}
		else if("side".equalsIgnoreCase(accessPath)){
			return this.bean.getSide();
		}
		else if("exDestIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getExDestIDSrc();
		}
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getQtyTyp();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("tgtStrategy".equalsIgnoreCase(accessPath)){
			return this.bean.getTgtStrategy();
		}
		else if("exDest".equalsIgnoreCase(accessPath)){
			return this.bean.getExDest();
		}
		else if("prTrdAnon".equalsIgnoreCase(accessPath)){
			return this.bean.getPrTrdAnon();
		}
		else if("clOrdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID2();
		}
		else if("covered".equalsIgnoreCase(accessPath)){
			return this.bean.getCovered();
		}
		else if("participationRt".equalsIgnoreCase(accessPath)){
			return this.bean.getParticipationRt();
		}
		else if("preallocMeth".equalsIgnoreCase(accessPath)){
			return this.bean.getPreallocMeth();
		}
		else if("ordID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID();
		}
		else if("execInst".equalsIgnoreCase(accessPath)){
			return this.bean.getExecInst();
		}
		else if("handlInst".equalsIgnoreCase(accessPath)){
			return this.bean.getHandlInst();
		}
		else if("comm".equalsIgnoreCase(accessPath)){
			return this.bean.getComm();
		}
		else if("origClOrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigClOrdID();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("mlegModel".equalsIgnoreCase(accessPath)){
			return this.bean.getMlegModel();
		}
		else if("rstctions".equalsIgnoreCase(accessPath)){
			return this.bean.getRstctions();
		}
		else if("trdSes".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdSes();
		}
		else if("pegInstr".equalsIgnoreCase(accessPath)){
			return this.bean.getPegInstr();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("bkngTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getBkngTyp();
		}
		else if("px".equalsIgnoreCase(accessPath)){
			return this.bean.getPx();
		}
		else if("procCode".equalsIgnoreCase(accessPath)){
			return this.bean.getProcCode();
		}
		else if("cshMgn".equalsIgnoreCase(accessPath)){
			return this.bean.getCshMgn();
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctIDSrc();
		}
		else if("strtPrmGrp".equalsIgnoreCase(accessPath)){
			return this.bean.getStrtPrmGrp();
		}
		else if("forexReq".equalsIgnoreCase(accessPath)){
			return this.bean.getForexReq();
		}
		else if("bkngUnit".equalsIgnoreCase(accessPath)){
			return this.bean.getBkngUnit();
		}
		else if("maxFloor".equalsIgnoreCase(accessPath)){
			return this.bean.getMaxFloor();
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdDt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("maxShow".equalsIgnoreCase(accessPath)){
			 this.bean.setMaxShow((BigDecimal) obj);
			return;
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			 this.bean.setCcy((String) obj);
			return;
		}
		else if("cpcty".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setCpcty(OrderCapacityEnumT.valueOf(obj.toString()));
			return;
		}
		else if("discInstr".equalsIgnoreCase(accessPath)){
			 this.bean.setDiscInstr((DiscretionInstructionsBlockT) obj);
			return;
		}
		else if("rFR".equalsIgnoreCase(accessPath)){
			 this.bean.setRFR((BigDecimal) obj);
			return;
		}
		else if("designation".equalsIgnoreCase(accessPath)){
			 this.bean.setDesignation((String) obj);
			return;
		}
		else if("origOrdModTm".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigOrdModTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setAcctTyp((BigInteger) obj);
			return;
		}
		else if("solFlag".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setSolFlag(SolicitedFlagEnumT.valueOf(obj.toString()));
			return;
		}
		else if("trgrInstr".equalsIgnoreCase(accessPath)){
			 this.bean.setTrgrInstr((TriggeringInstructionBlockT) obj);
			return;
		}
		else if("registID".equalsIgnoreCase(accessPath)){
			 this.bean.setRegistID((String) obj);
			return;
		}
		else if("mtchInc".equalsIgnoreCase(accessPath)){
			 this.bean.setMtchInc((BigDecimal) obj);
			return;
		}
		else if("tmInForce".equalsIgnoreCase(accessPath)){
			 this.bean.setTmInForce((String) obj);
			return;
		}
		else if("posEfct".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setPosEfct(PositionEffectEnumT.valueOf(obj.toString()));
			return;
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdQty((OrderQtyDataBlockT) obj);
			return;
		}
		else if("dayBkngInst".equalsIgnoreCase(accessPath)){
			 this.bean.setDayBkngInst((String) obj);
			return;
		}
		else if("mLEGRptTypReq".equalsIgnoreCase(accessPath)){
			 this.bean.setMLEGRptTypReq((BigInteger) obj);
			return;
		}
		else if("complianceID".equalsIgnoreCase(accessPath)){
			 this.bean.setComplianceID((String) obj);
			return;
		}
		else if("mxPxLvls".equalsIgnoreCase(accessPath)){
			 this.bean.setMxPxLvls((BigInteger) obj);
			return;
		}
		else if("qID".equalsIgnoreCase(accessPath)){
			 this.bean.setQID((String) obj);
			return;
		}
		else if("swapPnts".equalsIgnoreCase(accessPath)){
			 this.bean.setSwapPnts((BigDecimal) obj);
			return;
		}
		else if("ordTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdTyp((String) obj);
			return;
		}
		else if("efctvTm".equalsIgnoreCase(accessPath)){
			 this.bean.setEfctvTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxt((String) obj);
			return;
		}
		else if("minQty".equalsIgnoreCase(accessPath)){
			 this.bean.setMinQty((BigDecimal) obj);
			return;
		}
		else if("mlegPxMeth".equalsIgnoreCase(accessPath)){
			 this.bean.setMlegPxMeth((BigInteger) obj);
			return;
		}
		else if("pxPrtScp".equalsIgnoreCase(accessPath)){
			 this.bean.setPxPrtScp((String) obj);
			return;
		}
		else if("tgtStrategyParameters".equalsIgnoreCase(accessPath)){
			 this.bean.setTgtStrategyParameters((String) obj);
			return;
		}
		else if("expireDt".equalsIgnoreCase(accessPath)){
			 this.bean.setExpireDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlTyp((String) obj);
			return;
		}
		else if("orignDt".equalsIgnoreCase(accessPath)){
			 this.bean.setOrignDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("gTBkngInst".equalsIgnoreCase(accessPath)){
			 this.bean.setGTBkngInst((BigInteger) obj);
			return;
		}
		else if("stopPx".equalsIgnoreCase(accessPath)){
			 this.bean.setStopPx((BigDecimal) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("clrFeeInd".equalsIgnoreCase(accessPath)){
			 this.bean.setClrFeeInd((String) obj);
			return;
		}
		else if("prevClsPx".equalsIgnoreCase(accessPath)){
			 this.bean.setPrevClsPx((BigDecimal) obj);
			return;
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			 this.bean.setCustCpcty((BigInteger) obj);
			return;
		}
		else if("clOrdLinkID".equalsIgnoreCase(accessPath)){
			 this.bean.setClOrdLinkID((String) obj);
			return;
		}
		else if("cxllationRights".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setCxllationRights(CancellationRightsEnumT.valueOf(obj.toString()));
			return;
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setPxTyp((BigInteger) obj);
			return;
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			 this.bean.setClOrdID((String) obj);
			return;
		}
		else if("expireTm".equalsIgnoreCase(accessPath)){
			 this.bean.setExpireTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("dsplyInstr".equalsIgnoreCase(accessPath)){
			 this.bean.setDsplyInstr((DisplayInstructionBlockT) obj);
			return;
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCcy((String) obj);
			return;
		}
		else if("mnyLaunderingStat".equalsIgnoreCase(accessPath)){
			 this.bean.setMnyLaunderingStat((String) obj);
			return;
		}
		else if("iOIID".equalsIgnoreCase(accessPath)){
			 this.bean.setIOIID((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("allocID".equalsIgnoreCase(accessPath)){
			 this.bean.setAllocID((String) obj);
			return;
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			 this.bean.setAcct((String) obj);
			return;
		}
		else if("locReqd".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setLocReqd(LocateReqdEnumT.valueOf(obj.toString()));
			return;
		}
		else if("side".equalsIgnoreCase(accessPath)){
			 this.bean.setSide((String) obj);
			return;
		}
		else if("exDestIDSrc".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setExDestIDSrc(ExDestinationIDSourceEnumT.valueOf(obj.toString()));
			return;
		}
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setQtyTyp((BigInteger) obj);
			return;
		}
		else if("tgtStrategy".equalsIgnoreCase(accessPath)){
			 this.bean.setTgtStrategy((String) obj);
			return;
		}
		else if("exDest".equalsIgnoreCase(accessPath)){
			 this.bean.setExDest((String) obj);
			return;
		}
		else if("prTrdAnon".equalsIgnoreCase(accessPath)){
			 this.bean.setPrTrdAnon((String) obj);
			return;
		}
		else if("clOrdID2".equalsIgnoreCase(accessPath)){
			 this.bean.setClOrdID2((String) obj);
			return;
		}
		else if("covered".equalsIgnoreCase(accessPath)){
			 this.bean.setCovered((BigInteger) obj);
			return;
		}
		else if("participationRt".equalsIgnoreCase(accessPath)){
			 this.bean.setParticipationRt((BigDecimal) obj);
			return;
		}
		else if("preallocMeth".equalsIgnoreCase(accessPath)){
			 this.bean.setPreallocMeth((String) obj);
			return;
		}
		else if("ordID".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdID((String) obj);
			return;
		}
		else if("execInst".equalsIgnoreCase(accessPath)){
			 this.bean.setExecInst((String) obj);
			return;
		}
		else if("handlInst".equalsIgnoreCase(accessPath)){
			 this.bean.setHandlInst((String) obj);
			return;
		}
		else if("comm".equalsIgnoreCase(accessPath)){
			 this.bean.setComm((CommissionDataBlockT) obj);
			return;
		}
		else if("origClOrdID".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigClOrdID((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("mlegModel".equalsIgnoreCase(accessPath)){
			 this.bean.setMlegModel((BigInteger) obj);
			return;
		}
		else if("rstctions".equalsIgnoreCase(accessPath)){
			 this.bean.setRstctions((String) obj);
			return;
		}
		else if("pegInstr".equalsIgnoreCase(accessPath)){
			 this.bean.setPegInstr((PegInstructionsBlockT) obj);
			return;
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			 this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		else if("bkngTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setBkngTyp((BigInteger) obj);
			return;
		}
		else if("px".equalsIgnoreCase(accessPath)){
			 this.bean.setPx((BigDecimal) obj);
			return;
		}
		else if("procCode".equalsIgnoreCase(accessPath)){
			 this.bean.setProcCode((String) obj);
			return;
		}
		else if("cshMgn".equalsIgnoreCase(accessPath)){
			 this.bean.setCshMgn((String) obj);
			return;
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setAcctIDSrc((String) obj);
			return;
		}
		else if("forexReq".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setForexReq(ForexReqEnumT.valueOf(obj.toString()));
			return;
		}
		else if("bkngUnit".equalsIgnoreCase(accessPath)){
			 this.bean.setBkngUnit((String) obj);
			return;
		}
		else if("maxFloor".equalsIgnoreCase(accessPath)){
			 this.bean.setMaxFloor((BigDecimal) obj);
			return;
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdDt((XMLGregorianCalendar) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(MultilegOrderCancelReplaceMessageT obj) {
		this.bean = obj; 
	}

}
