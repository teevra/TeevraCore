package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.NestedParties2BlockT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class NestedParties2BlockTBeanAccessor implements BeanAccessor<NestedParties2BlockT> {
	
	private NestedParties2BlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("sub".equalsIgnoreCase(accessPath)){
			return this.bean.getSub();
		}
		else if("r".equalsIgnoreCase(accessPath)){
			return this.bean.getR();
		}
		else if("src".equalsIgnoreCase(accessPath)){
			return this.bean.getSrc();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("r".equalsIgnoreCase(accessPath)){
			 this.bean.setR((BigInteger) obj);
			return;
		}
		else if("src".equalsIgnoreCase(accessPath)){
			 this.bean.setSrc((String) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			 this.bean.setID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(NestedParties2BlockT obj) {
		this.bean = obj; 
	}

}
