package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.ApplicationMessageReportMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:43 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:43 IST 2011")
public class ApplicationMessageReportMessageTBeanAccessor implements BeanAccessor<ApplicationMessageReportMessageT> {
	
	private ApplicationMessageReportMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("applRptTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getApplRptTyp();
		}
		else if("applIDRptGrp".equalsIgnoreCase(accessPath)){
			return this.bean.getApplIDRptGrp();
		}
		else if("applRptID".equalsIgnoreCase(accessPath)){
			return this.bean.getApplRptID();
		}
		else if("applReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getApplReqID();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("encTxtLen".equalsIgnoreCase(accessPath)){
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
		else if("applRptTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setApplRptTyp((BigInteger) obj);
			return;
		}
		else if("applRptID".equalsIgnoreCase(accessPath)){
			 this.bean.setApplRptID((String) obj);
			return;
		}
		else if("applReqID".equalsIgnoreCase(accessPath)){
			 this.bean.setApplReqID((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ApplicationMessageReportMessageT obj) {
		this.bean = obj; 
	}

}
