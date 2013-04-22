package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.UnderlyingAmountBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class UnderlyingAmountBlockTBeanAccessor implements BeanAccessor<UnderlyingAmountBlockT> {
	
	private UnderlyingAmountBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("stlDt".equalsIgnoreCase(accessPath)){
			return this.bean.getStlDt();
		}
		else if("setStat".equalsIgnoreCase(accessPath)){
			return this.bean.getSetStat();
		}
		else if("payAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getPayAmt();
		}
		else if("colAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getColAmt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("stlDt".equalsIgnoreCase(accessPath)){
			 this.bean.setStlDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("setStat".equalsIgnoreCase(accessPath)){
			 this.bean.setSetStat((String) obj);
			return;
		}
		else if("payAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setPayAmt((BigDecimal) obj);
			return;
		}
		else if("colAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setColAmt((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(UnderlyingAmountBlockT obj) {
		this.bean = obj; 
	}

}
