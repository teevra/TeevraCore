package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.CompIDStatGrpBlockT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:39 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:39 IST 2011")
public class CompIDStatGrpBlockTBeanAccessor implements BeanAccessor<CompIDStatGrpBlockT> {
	
	private CompIDStatGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("deskID".equalsIgnoreCase(accessPath)){
			return this.bean.getDeskID();
		}
		else if("statText".equalsIgnoreCase(accessPath)){
			return this.bean.getStatText();
		}
		else if("refSubID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefSubID();
		}
		else if("refCompID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefCompID();
		}
		else if("lctnID".equalsIgnoreCase(accessPath)){
			return this.bean.getLctnID();
		}
		else if("statValu".equalsIgnoreCase(accessPath)){
			return this.bean.getStatValu();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("deskID".equalsIgnoreCase(accessPath)){
			 this.bean.setDeskID((String) obj);
			return;
		}
		else if("statText".equalsIgnoreCase(accessPath)){
			 this.bean.setStatText((String) obj);
			return;
		}
		else if("refSubID".equalsIgnoreCase(accessPath)){
			 this.bean.setRefSubID((String) obj);
			return;
		}
		else if("refCompID".equalsIgnoreCase(accessPath)){
			 this.bean.setRefCompID((String) obj);
			return;
		}
		else if("lctnID".equalsIgnoreCase(accessPath)){
			 this.bean.setLctnID((String) obj);
			return;
		}
		else if("statValu".equalsIgnoreCase(accessPath)){
			 this.bean.setStatValu((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(CompIDStatGrpBlockT obj) {
		this.bean = obj; 
	}

}
