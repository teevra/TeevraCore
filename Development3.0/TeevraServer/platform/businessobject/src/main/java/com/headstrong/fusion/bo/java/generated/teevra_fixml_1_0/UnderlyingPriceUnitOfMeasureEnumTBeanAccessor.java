package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.UnderlyingPriceUnitOfMeasureEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class UnderlyingPriceUnitOfMeasureEnumTBeanAccessor implements BeanAccessor<UnderlyingPriceUnitOfMeasureEnumT> {
	
	private UnderlyingPriceUnitOfMeasureEnumT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("declaringClass".equalsIgnoreCase(accessPath)){
			return this.bean.getDeclaringClass();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(UnderlyingPriceUnitOfMeasureEnumT obj) {
		this.bean = obj; 
	}

}
