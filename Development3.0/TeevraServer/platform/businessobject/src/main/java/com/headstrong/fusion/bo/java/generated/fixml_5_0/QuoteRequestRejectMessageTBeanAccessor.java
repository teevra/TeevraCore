package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.QuoteRequestRejectMessageT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:37 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:37 IST 2010")
public class QuoteRequestRejectMessageTBeanAccessor implements BeanAccessor<QuoteRequestRejectMessageT> {
	
	private QuoteRequestRejectMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("rFQReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getRFQReqID();
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
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("reqRejRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getReqRejRsn();
		}
		else if("quotReqRej".equalsIgnoreCase(accessPath)){
			return this.bean.getQuotReqRej();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("rFQReqID".equalsIgnoreCase(accessPath)){
			this.bean.setRFQReqID((String) obj);
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
		else if("reqID".equalsIgnoreCase(accessPath)){
			this.bean.setReqID((String) obj);
			return;
		}
		else if("reqRejRsn".equalsIgnoreCase(accessPath)){
			this.bean.setReqRejRsn((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			this.bean.setTxt((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(QuoteRequestRejectMessageT obj) {
		this.bean = obj; 
	}

}