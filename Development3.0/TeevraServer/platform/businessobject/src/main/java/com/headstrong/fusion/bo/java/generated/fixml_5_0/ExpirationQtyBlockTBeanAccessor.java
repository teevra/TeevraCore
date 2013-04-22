package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.ExpirationQtyBlockT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:35 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:35 IST 2010")
public class ExpirationQtyBlockTBeanAccessor implements BeanAccessor<ExpirationQtyBlockT> {
	
	private ExpirationQtyBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("expQty".equalsIgnoreCase(accessPath)){
			return this.bean.getExpQty();
		}
		else if("expType".equalsIgnoreCase(accessPath)){
			return this.bean.getExpType();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("expQty".equalsIgnoreCase(accessPath)){
			this.bean.setExpQty((BigDecimal) obj);
			return;
		}
		else if("expType".equalsIgnoreCase(accessPath)){
			this.bean.setExpType((Integer) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ExpirationQtyBlockT obj) {
		this.bean = obj; 
	}

}