package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.MDRjctGrpBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:38 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:38 IST 2010")
public class MDRjctGrpBlockTBeanAccessor implements BeanAccessor<MDRjctGrpBlockT> {
	
	private MDRjctGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("altMDSrcID".equalsIgnoreCase(accessPath)){
			return this.bean.getAltMDSrcID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("altMDSrcID".equalsIgnoreCase(accessPath)){
			this.bean.setAltMDSrcID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(MDRjctGrpBlockT obj) {
		this.bean = obj; 
	}

}
