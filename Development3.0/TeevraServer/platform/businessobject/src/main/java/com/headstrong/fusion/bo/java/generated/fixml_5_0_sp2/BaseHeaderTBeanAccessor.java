package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.BaseHeaderT;
import org.fixprotocol.fixml_5_0_sp2.PossDupFlagEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0_sp2.PossResendEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:41 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:41 IST 2011")
public class BaseHeaderTBeanAccessor implements BeanAccessor<BaseHeaderT> {
	
	private BaseHeaderT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("oBID".equalsIgnoreCase(accessPath)){
			return this.bean.getOBID();
		}
		else if("origSnt".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigSnt();
		}
		else if("tID".equalsIgnoreCase(accessPath)){
			return this.bean.getTID();
		}
		else if("msgEncd".equalsIgnoreCase(accessPath)){
			return this.bean.getMsgEncd();
		}
		else if("sID".equalsIgnoreCase(accessPath)){
			return this.bean.getSID();
		}
		else if("tLoc".equalsIgnoreCase(accessPath)){
			return this.bean.getTLoc();
		}
		else if("snt".equalsIgnoreCase(accessPath)){
			return this.bean.getSnt();
		}
		else if("d2ID".equalsIgnoreCase(accessPath)){
			return this.bean.getD2ID();
		}
		else if("tSub".equalsIgnoreCase(accessPath)){
			return this.bean.getTSub();
		}
		else if("sSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSSub();
		}
		else if("oBLoc".equalsIgnoreCase(accessPath)){
			return this.bean.getOBLoc();
		}
		else if("oBSub".equalsIgnoreCase(accessPath)){
			return this.bean.getOBSub();
		}
		else if("sLoc".equalsIgnoreCase(accessPath)){
			return this.bean.getSLoc();
		}
		else if("posRsnd".equalsIgnoreCase(accessPath)){
			return this.bean.getPosRsnd();
		}
		else if("d2Sub".equalsIgnoreCase(accessPath)){
			return this.bean.getD2Sub();
		}
		else if("d2Loc".equalsIgnoreCase(accessPath)){
			return this.bean.getD2Loc();
		}
		else if("posDup".equalsIgnoreCase(accessPath)){
			return this.bean.getPosDup();
		}
		else if("hop".equalsIgnoreCase(accessPath)){
			return this.bean.getHop();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("oBID".equalsIgnoreCase(accessPath)){
			 this.bean.setOBID((String) obj);
			return;
		}
		else if("origSnt".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigSnt((XMLGregorianCalendar) obj);
			return;
		}
		else if("tID".equalsIgnoreCase(accessPath)){
			 this.bean.setTID((String) obj);
			return;
		}
		else if("msgEncd".equalsIgnoreCase(accessPath)){
			 this.bean.setMsgEncd((String) obj);
			return;
		}
		else if("sID".equalsIgnoreCase(accessPath)){
			 this.bean.setSID((String) obj);
			return;
		}
		else if("tLoc".equalsIgnoreCase(accessPath)){
			 this.bean.setTLoc((String) obj);
			return;
		}
		else if("snt".equalsIgnoreCase(accessPath)){
			 this.bean.setSnt((XMLGregorianCalendar) obj);
			return;
		}
		else if("d2ID".equalsIgnoreCase(accessPath)){
			 this.bean.setD2ID((String) obj);
			return;
		}
		else if("tSub".equalsIgnoreCase(accessPath)){
			 this.bean.setTSub((String) obj);
			return;
		}
		else if("sSub".equalsIgnoreCase(accessPath)){
			 this.bean.setSSub((String) obj);
			return;
		}
		else if("oBLoc".equalsIgnoreCase(accessPath)){
			 this.bean.setOBLoc((String) obj);
			return;
		}
		else if("oBSub".equalsIgnoreCase(accessPath)){
			 this.bean.setOBSub((String) obj);
			return;
		}
		else if("sLoc".equalsIgnoreCase(accessPath)){
			 this.bean.setSLoc((String) obj);
			return;
		}
		else if("posRsnd".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setPosRsnd(PossResendEnumT.valueOf(obj.toString()));
			return;
		}
		else if("d2Sub".equalsIgnoreCase(accessPath)){
			 this.bean.setD2Sub((String) obj);
			return;
		}
		else if("d2Loc".equalsIgnoreCase(accessPath)){
			 this.bean.setD2Loc((String) obj);
			return;
		}
		else if("posDup".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setPosDup(PossDupFlagEnumT.valueOf(obj.toString()));
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(BaseHeaderT obj) {
		this.bean = obj; 
	}

}
