package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.PartyDetailsListReportMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.ApplicationSequenceControlBlockT;
import org.fixprotocol.fixml_5_0_sp2.LastFragmentEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:46 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:46 IST 2011")
public class PartyDetailsListReportMessageTBeanAccessor implements BeanAccessor<PartyDetailsListReportMessageT> {
	
	private PartyDetailsListReportMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ptyLst".equalsIgnoreCase(accessPath)){
			return this.bean.getPtyLst();
		}
		else if("applSeqCtrl".equalsIgnoreCase(accessPath)){
			return this.bean.getApplSeqCtrl();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("rslt".equalsIgnoreCase(accessPath)){
			return this.bean.getRslt();
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptID();
		}
		else if("totNoPtyList".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNoPtyList();
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			return this.bean.getLastFragment();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("applSeqCtrl".equalsIgnoreCase(accessPath)){
			 this.bean.setApplSeqCtrl((ApplicationSequenceControlBlockT) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxt((String) obj);
			return;
		}
		else if("rslt".equalsIgnoreCase(accessPath)){
			 this.bean.setRslt((String) obj);
			return;
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			 this.bean.setReqID((String) obj);
			return;
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			 this.bean.setRptID((String) obj);
			return;
		}
		else if("totNoPtyList".equalsIgnoreCase(accessPath)){
			 this.bean.setTotNoPtyList((BigInteger) obj);
			return;
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setLastFragment(LastFragmentEnumT.valueOf(obj.toString()));
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(PartyDetailsListReportMessageT obj) {
		this.bean = obj; 
	}

}
