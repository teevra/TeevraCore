package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.ContraGrpBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:40 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:40 IST 2010")
public class ContraGrpBlockTBeanAccessor implements BeanAccessor<ContraGrpBlockT> {
	
	private ContraGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("cntraTrdTm".equalsIgnoreCase(accessPath)){
			return this.bean.getCntraTrdTm();
		}
		else if("cntraTrdQty".equalsIgnoreCase(accessPath)){
			return this.bean.getCntraTrdQty();
		}
		else if("cntraTrdr".equalsIgnoreCase(accessPath)){
			return this.bean.getCntraTrdr();
		}
		else if("cntraBrkr".equalsIgnoreCase(accessPath)){
			return this.bean.getCntraBrkr();
		}
		else if("cntraLegRefID".equalsIgnoreCase(accessPath)){
			return this.bean.getCntraLegRefID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("cntraTrdTm".equalsIgnoreCase(accessPath)){
			this.bean.setCntraTrdTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("cntraTrdQty".equalsIgnoreCase(accessPath)){
			this.bean.setCntraTrdQty((BigDecimal) obj);
			return;
		}
		else if("cntraTrdr".equalsIgnoreCase(accessPath)){
			this.bean.setCntraTrdr((String) obj);
			return;
		}
		else if("cntraBrkr".equalsIgnoreCase(accessPath)){
			this.bean.setCntraBrkr((String) obj);
			return;
		}
		else if("cntraLegRefID".equalsIgnoreCase(accessPath)){
			this.bean.setCntraLegRefID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ContraGrpBlockT obj) {
		this.bean = obj; 
	}

}