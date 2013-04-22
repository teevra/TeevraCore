package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.MDFullGrpBlockT;
import com.headstrong.teevra_fixml_1_0.OrderCapacityEnumT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.DealingCapacityEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import com.headstrong.teevra_fixml_1_0.SpreadOrBenchmarkCurveDataBlockT;
import com.headstrong.teevra_fixml_1_0.YieldDataBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class MDFullGrpBlockTBeanAccessor implements BeanAccessor<MDFullGrpBlockT> {
	
	private MDFullGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("ordID2".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID2();
		}
		else if("tm".equalsIgnoreCase(accessPath)){
			return this.bean.getTm();
		}
		else if("cpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getCpcty();
		}
		else if("yield".equalsIgnoreCase(accessPath)){
			return this.bean.getYield();
		}
		else if("lotTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getLotTyp();
		}
		else if("orig".equalsIgnoreCase(accessPath)){
			return this.bean.getOrig();
		}
		else if("sprdBnchmkCurve".equalsIgnoreCase(accessPath)){
			return this.bean.getSprdBnchmkCurve();
		}
		else if("numOfOrds".equalsIgnoreCase(accessPath)){
			return this.bean.getNumOfOrds();
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDt();
		}
		else if("tmInForce".equalsIgnoreCase(accessPath)){
			return this.bean.getTmInForce();
		}
		else if("pxDelta".equalsIgnoreCase(accessPath)){
			return this.bean.getPxDelta();
		}
		else if("buyer".equalsIgnoreCase(accessPath)){
			return this.bean.getBuyer();
		}
		else if("mDEntryFwdPnts".equalsIgnoreCase(accessPath)){
			return this.bean.getMDEntryFwdPnts();
		}
		else if("sz".equalsIgnoreCase(accessPath)){
			return this.bean.getSz();
		}
		else if("trdgStat".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdgStat();
		}
		else if("dealingCpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getDealingCpcty();
		}
		else if("rtSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getRtSrc();
		}
		else if("ordTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdTyp();
		}
		else if("mDEntrySpotRt".equalsIgnoreCase(accessPath)){
			return this.bean.getMDEntrySpotRt();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("minQty".equalsIgnoreCase(accessPath)){
			return this.bean.getMinQty();
		}
		else if("mkt".equalsIgnoreCase(accessPath)){
			return this.bean.getMkt();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("expireDt".equalsIgnoreCase(accessPath)){
			return this.bean.getExpireDt();
		}
		else if("entryID".equalsIgnoreCase(accessPath)){
			return this.bean.getEntryID();
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlTyp();
		}
		else if("firstPx".equalsIgnoreCase(accessPath)){
			return this.bean.getFirstPx();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSesID();
		}
		else if("mDPxLvl".equalsIgnoreCase(accessPath)){
			return this.bean.getMDPxLvl();
		}
		else if("posNo".equalsIgnoreCase(accessPath)){
			return this.bean.getPosNo();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		else if("rptSeq".equalsIgnoreCase(accessPath)){
			return this.bean.getRptSeq();
		}
		else if("mDOrigTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMDOrigTyp();
		}
		else if("dt".equalsIgnoreCase(accessPath)){
			return this.bean.getDt();
		}
		else if("lastPx".equalsIgnoreCase(accessPath)){
			return this.bean.getLastPx();
		}
		else if("scope".equalsIgnoreCase(accessPath)){
			return this.bean.getScope();
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getPxTyp();
		}
		else if("expireTm".equalsIgnoreCase(accessPath)){
			return this.bean.getExpireTm();
		}
		else if("trdTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdTyp();
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCcy();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("lowPx".equalsIgnoreCase(accessPath)){
			return this.bean.getLowPx();
		}
		else if("tickDirctn".equalsIgnoreCase(accessPath)){
			return this.bean.getTickDirctn();
		}
		else if("trdCond".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdCond();
		}
		else if("trdVol".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdVol();
		}
		else if("openClsSettlFlag".equalsIgnoreCase(accessPath)){
			return this.bean.getOpenClsSettlFlag();
		}
		else if("ordID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID();
		}
		else if("execInst".equalsIgnoreCase(accessPath)){
			return this.bean.getExecInst();
		}
		else if("secSizesGrp".equalsIgnoreCase(accessPath)){
			return this.bean.getSecSizesGrp();
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSesSub();
		}
		else if("seller".equalsIgnoreCase(accessPath)){
			return this.bean.getSeller();
		}
		else if("sellerDays".equalsIgnoreCase(accessPath)){
			return this.bean.getSellerDays();
		}
		else if("deskID".equalsIgnoreCase(accessPath)){
			return this.bean.getDeskID();
		}
		else if("mDQteTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMDQteTyp();
		}
		else if("px".equalsIgnoreCase(accessPath)){
			return this.bean.getPx();
		}
		else if("highPx".equalsIgnoreCase(accessPath)){
			return this.bean.getHighPx();
		}
		else if("lctnID".equalsIgnoreCase(accessPath)){
			return this.bean.getLctnID();
		}
		else if("haltRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getHaltRsn();
		}
		else if("qCond".equalsIgnoreCase(accessPath)){
			return this.bean.getQCond();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			 this.bean.setCcy((String) obj);
			return;
		}
		else if("ordID2".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdID2((String) obj);
			return;
		}
		else if("tm".equalsIgnoreCase(accessPath)){
			 this.bean.setTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("cpcty".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setCpcty(OrderCapacityEnumT.valueOf(obj.toString()));
			return;
		}
		else if("yield".equalsIgnoreCase(accessPath)){
			 this.bean.setYield((YieldDataBlockT) obj);
			return;
		}
		else if("lotTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setLotTyp((String) obj);
			return;
		}
		else if("orig".equalsIgnoreCase(accessPath)){
			 this.bean.setOrig((String) obj);
			return;
		}
		else if("sprdBnchmkCurve".equalsIgnoreCase(accessPath)){
			 this.bean.setSprdBnchmkCurve((SpreadOrBenchmarkCurveDataBlockT) obj);
			return;
		}
		else if("numOfOrds".equalsIgnoreCase(accessPath)){
			 this.bean.setNumOfOrds((BigInteger) obj);
			return;
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("tmInForce".equalsIgnoreCase(accessPath)){
			 this.bean.setTmInForce((String) obj);
			return;
		}
		else if("pxDelta".equalsIgnoreCase(accessPath)){
			 this.bean.setPxDelta((BigDecimal) obj);
			return;
		}
		else if("buyer".equalsIgnoreCase(accessPath)){
			 this.bean.setBuyer((String) obj);
			return;
		}
		else if("mDEntryFwdPnts".equalsIgnoreCase(accessPath)){
			 this.bean.setMDEntryFwdPnts((BigDecimal) obj);
			return;
		}
		else if("sz".equalsIgnoreCase(accessPath)){
			 this.bean.setSz((BigDecimal) obj);
			return;
		}
		else if("trdgStat".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdgStat((String) obj);
			return;
		}
		else if("dealingCpcty".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setDealingCpcty(DealingCapacityEnumT.valueOf(obj.toString()));
			return;
		}
		else if("ordTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdTyp((String) obj);
			return;
		}
		else if("mDEntrySpotRt".equalsIgnoreCase(accessPath)){
			 this.bean.setMDEntrySpotRt((BigDecimal) obj);
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
		else if("mkt".equalsIgnoreCase(accessPath)){
			 this.bean.setMkt((String) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			 this.bean.setID((String) obj);
			return;
		}
		else if("expireDt".equalsIgnoreCase(accessPath)){
			 this.bean.setExpireDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("entryID".equalsIgnoreCase(accessPath)){
			 this.bean.setEntryID((String) obj);
			return;
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlTyp((String) obj);
			return;
		}
		else if("firstPx".equalsIgnoreCase(accessPath)){
			 this.bean.setFirstPx((BigDecimal) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			 this.bean.setSesID((String) obj);
			return;
		}
		else if("mDPxLvl".equalsIgnoreCase(accessPath)){
			 this.bean.setMDPxLvl((BigInteger) obj);
			return;
		}
		else if("posNo".equalsIgnoreCase(accessPath)){
			 this.bean.setPosNo((BigInteger) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			 this.bean.setTyp((String) obj);
			return;
		}
		else if("rptSeq".equalsIgnoreCase(accessPath)){
			 this.bean.setRptSeq((BigInteger) obj);
			return;
		}
		else if("mDOrigTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setMDOrigTyp((BigInteger) obj);
			return;
		}
		else if("dt".equalsIgnoreCase(accessPath)){
			 this.bean.setDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("lastPx".equalsIgnoreCase(accessPath)){
			 this.bean.setLastPx((BigDecimal) obj);
			return;
		}
		else if("scope".equalsIgnoreCase(accessPath)){
			 this.bean.setScope((String) obj);
			return;
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setPxTyp((BigInteger) obj);
			return;
		}
		else if("expireTm".equalsIgnoreCase(accessPath)){
			 this.bean.setExpireTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("trdTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdTyp((String) obj);
			return;
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCcy((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("lowPx".equalsIgnoreCase(accessPath)){
			 this.bean.setLowPx((BigDecimal) obj);
			return;
		}
		else if("tickDirctn".equalsIgnoreCase(accessPath)){
			 this.bean.setTickDirctn((String) obj);
			return;
		}
		else if("trdCond".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdCond((String) obj);
			return;
		}
		else if("trdVol".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdVol((BigDecimal) obj);
			return;
		}
		else if("openClsSettlFlag".equalsIgnoreCase(accessPath)){
			 this.bean.setOpenClsSettlFlag((String) obj);
			return;
		}
		else if("execInst".equalsIgnoreCase(accessPath)){
			 this.bean.setExecInst((String) obj);
			return;
		}
		else if("ordID".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdID((String) obj);
			return;
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			 this.bean.setSesSub((String) obj);
			return;
		}
		else if("seller".equalsIgnoreCase(accessPath)){
			 this.bean.setSeller((String) obj);
			return;
		}
		else if("sellerDays".equalsIgnoreCase(accessPath)){
			 this.bean.setSellerDays((BigInteger) obj);
			return;
		}
		else if("deskID".equalsIgnoreCase(accessPath)){
			 this.bean.setDeskID((String) obj);
			return;
		}
		else if("mDQteTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setMDQteTyp((BigInteger) obj);
			return;
		}
		else if("px".equalsIgnoreCase(accessPath)){
			 this.bean.setPx((BigDecimal) obj);
			return;
		}
		else if("highPx".equalsIgnoreCase(accessPath)){
			 this.bean.setHighPx((BigDecimal) obj);
			return;
		}
		else if("lctnID".equalsIgnoreCase(accessPath)){
			 this.bean.setLctnID((String) obj);
			return;
		}
		else if("haltRsn".equalsIgnoreCase(accessPath)){
			 this.bean.setHaltRsn((String) obj);
			return;
		}
		else if("qCond".equalsIgnoreCase(accessPath)){
			 this.bean.setQCond((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(MDFullGrpBlockT obj) {
		this.bean = obj; 
	}

}
