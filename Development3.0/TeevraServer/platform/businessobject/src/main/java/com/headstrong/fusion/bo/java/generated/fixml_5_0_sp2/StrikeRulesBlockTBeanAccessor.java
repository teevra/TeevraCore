package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.StrikeRulesBlockT;
import java.math.BigInteger;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:41 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:41 IST 2011")
public class StrikeRulesBlockTBeanAccessor implements BeanAccessor<StrikeRulesBlockT> {
	
	private StrikeRulesBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("endStrkPxRng".equalsIgnoreCase(accessPath)){
			return this.bean.getEndStrkPxRng();
		}
		else if("matRules".equalsIgnoreCase(accessPath)){
			return this.bean.getMatRules();
		}
		else if("strkRule".equalsIgnoreCase(accessPath)){
			return this.bean.getStrkRule();
		}
		else if("startStrkPxRng".equalsIgnoreCase(accessPath)){
			return this.bean.getStartStrkPxRng();
		}
		else if("strkIncr".equalsIgnoreCase(accessPath)){
			return this.bean.getStrkIncr();
		}
		else if("strkExrStyle".equalsIgnoreCase(accessPath)){
			return this.bean.getStrkExrStyle();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("endStrkPxRng".equalsIgnoreCase(accessPath)){
			 this.bean.setEndStrkPxRng((BigDecimal) obj);
			return;
		}
		else if("strkRule".equalsIgnoreCase(accessPath)){
			 this.bean.setStrkRule((String) obj);
			return;
		}
		else if("startStrkPxRng".equalsIgnoreCase(accessPath)){
			 this.bean.setStartStrkPxRng((BigDecimal) obj);
			return;
		}
		else if("strkIncr".equalsIgnoreCase(accessPath)){
			 this.bean.setStrkIncr((BigDecimal) obj);
			return;
		}
		else if("strkExrStyle".equalsIgnoreCase(accessPath)){
			 this.bean.setStrkExrStyle((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(StrikeRulesBlockT obj) {
		this.bean = obj; 
	}

}
