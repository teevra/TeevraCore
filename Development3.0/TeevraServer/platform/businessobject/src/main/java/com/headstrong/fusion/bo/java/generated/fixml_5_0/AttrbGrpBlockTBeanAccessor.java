package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.AttrbGrpBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:41 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:41 IST 2010")
public class AttrbGrpBlockTBeanAccessor implements BeanAccessor<AttrbGrpBlockT> {
	
	private AttrbGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("val".equalsIgnoreCase(accessPath)){
			return this.bean.getVal();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("val".equalsIgnoreCase(accessPath)){
			this.bean.setVal((String) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			this.bean.setTyp((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(AttrbGrpBlockT obj) {
		this.bean = obj; 
	}

}