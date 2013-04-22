//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.09 at 04:04:26 PM GMT+05:30 
//


package com.headstrong.fusion.configGenerator.viewObjects.eurex;

import javax.xml.bind.annotation.XmlRegistry;

import com.headstrong.fusion.configGenerator.commObjs.FixMLConfigurationElement;
import com.headstrong.fusion.configGenerator.core.eurex.MappingsGenerator;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.headstrong.fusion.configGenerator.viewObjects.eurex package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.headstrong.fusion.configGenerator.viewObjects.eurex
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConfigHeader }
     * 
     */
    public ConfigHeader createConfigHeader() {
        return new ConfigHeader();
    }

    /**
     * Create an instance of {@link Case }
     * 
     */
    public Case createCase() {
        return new Case();
    }

    /**
     * Create an instance of {@link TargetObj }
     * 
     */
    public TargetObj createTargetObj() {
        return new TargetObj();
    }

    /**
     * Create an instance of {@link Selector }
     * 
     */
    public Selector createSelector() {
        return new Selector();
    }

    /**
     * Create an instance of {@link Predicate }
     * 
     */
    public Predicate createPredicate() {
        return new Predicate();
    }

    /**
     * Create an instance of {@link Configuration }
     * 
     */
    public Configuration createConfiguration() {
        return new Configuration();
    }

    /**
     * Create an instance of {@link Mappings }
     * 
     */
    public Mappings createMappings() {
        return new Mappings();
    }

    /**
     * Create an instance of {@link Map }
     * 
     */
    public Maps createMaps() {
        return new Maps();
    }

    /**
     * Create an instance of {@link Binding }
     * 
     */
    public Binding createBinding() {
        return new Binding();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link ArrayMapping }
     * 
     */
    public ArrayMapping createArrayMapping() {
        return new ArrayMapping();
    }

    /**
     * Create an instance of {@link StructField }
     * 
     */
    public StructField createStructField() {
        return new StructField();
    }

    /**
     * Create an instance of {@link ArrayMappings }
     * 
     */
    public ArrayMappings createArrayMappings() {
        return new ArrayMappings();
    }

    /**
     * Create an instance of {@link Switch }
     * 
     */
    public Switch createSwitch() {
        return new Switch();
    }

    /**
     * Create an instance of {@link Selectors }
     * 
     */
    public Selectors createSelectors() {
        return new Selectors();
    }

	/**
	 * @param arrayMappings
	 * @param structNavPath - nullable Path containing the bracket part of arrayMapping String
	 * @param repeatingStructPath
	 * @return
	 */
	public ArrayMapping createArrayMapping(String structNavPath, String repeatingStructPath) {
		ArrayMapping arrayMapping;
		arrayMapping = createArrayMapping();
		String arraySize = null;
		if (structNavPath != null) {
			arraySize = structNavPath.substring(structNavPath.indexOf("{=") + 2, structNavPath.indexOf("}"));
		}
		arrayMapping.setSize(arraySize);
		arrayMapping.setSrc(repeatingStructPath);
		return arrayMapping;
	}

	/**
	 *  Populate the target object with data containing class name, a target
	 * path.
	 * @param fixmlClassName
	 * @param fixmlTargetPath
	 * @return
	 */
	public TargetObj createTargetObj(String  fixmlClassName, String fixmlTargetPath) {
		TargetObj targetObj;
		targetObj = createTargetObj();
		targetObj.setName(fixmlTargetPath);
		targetObj.setClassName(fixmlClassName);
		if (fixmlTargetPath.matches(".*\\[.*=.*")) {//matches asd[x=y]sdffa pattern
			/*extractConstantMap(fixmlTargetPath, targetObj);*/
		}
		return targetObj;
	}

	/**
	 * @param fixmlTargetPath
	 * @param targetObj
	 */
	private void extractConstantMap(String fixmlTargetPath, TargetObj targetObj) {
		Maps constMaps = new Maps();
		String[] targetValueArr = fixmlTargetPath.substring(fixmlTargetPath.indexOf("[") + 1,
				fixmlTargetPath.indexOf("]")).split("=");
		constMaps.setTarget(targetValueArr[0]);
		constMaps.setTargetValue(targetValueArr[1]);
		constMaps.setType(MappingsGenerator.SET_CONSTANT);
		targetObj.getMap().add(constMaps);
	}

	/**
	 * @param fixMLConfigurationElement TODO
	 * @param switchExpression
	 * @param requestType
	 * @param switchExpression
	 * @return
	 */
	public Switch createSwitch(String switchCaseEmbeddedString, String switchExpression, String requestType) {
		Switch switchType = createSwitch();
		String delimitedSwitchCases = switchCaseEmbeddedString.substring(switchCaseEmbeddedString.indexOf("|") + 1, switchCaseEmbeddedString
				.length());
		String[] switchCases = delimitedSwitchCases.split("\\|");
		switchType.setExpr(switchExpression);
		
		for (String eachSwitchCase: switchCases) {
			switchType.getCase().add(createCase(requestType,eachSwitchCase));
		}
		return switchType;
	}

	/**
	 * Creates the Case object if the type is switch-case
	 * 
	 * @param fixMLConfigurationElement TODO
	 * @param messageType 
	 * @param delimitedCaseStr
	 * @return
	 */
	public Case createCase( String messageType, String delimitedCaseStr) {
		Case caseType = createCase();
		String[] caseValueAndTargetArr = delimitedCaseStr.split("\\!");
		
		if (caseValueAndTargetArr[1].contains(")")) {
			caseValueAndTargetArr[1] = caseValueAndTargetArr[1].substring(0, caseValueAndTargetArr[1]
					.length() - 1);
		}
		caseValueAndTargetArr[1]=replaceBlankWithSpace(caseValueAndTargetArr[1]);
		caseValueAndTargetArr[0] =replaceBlankWithSpace(caseValueAndTargetArr[0]);
		if(FixMLConfigurationElement.RESPONSE.equals(messageType)){
			caseType.setValue(caseValueAndTargetArr[0]);
			caseType.setTargetValue(caseValueAndTargetArr[1]);
		}else if(FixMLConfigurationElement.REQUEST.equals(messageType)){
			caseType.setTargetValue(caseValueAndTargetArr[0]);
			caseType.setValue(caseValueAndTargetArr[1]);
		}
		return caseType;
	}
	
	/**
	 * @param valueTarget
	 */
	private String replaceBlankWithSpace(String valueTarget) {
		if(valueTarget.trim().equals(FixMLConfigurationElement.STR_BLANK)) {
			valueTarget = FixMLConfigurationElement.STR_SPACE;
		}
		return valueTarget;
	}

	/**
	 * @param arrayMappings
	 * @param structNavPath - nullable Path containing the bracket part of arrayMapping String, used to extract the size.
	 * @param repeatingStructPath - String containing the part which contains the repeating string.
	 * @return
	 */
	public ArrayMapping findOrCreateArrayMappings(ArrayMappings arrayMappings, String structNavPath, String repeatingStructPath) {
		ArrayMapping arrayMapping = arrayMappings.mappingExists(repeatingStructPath);
		if (null == arrayMapping) {
			arrayMapping = createArrayMapping(structNavPath, repeatingStructPath);
			arrayMappings.getArrayMapping().add(arrayMapping);
		}
		return arrayMapping;
	}

	/**
	 * @param structNavPath
	 * @param fixmlConfig
	 * @param fixmlRepeatObj
	 * @param arrayMapping
	 * @param fixmlClassName TODO
	 * @param fixmlTargetPath TODO
	 * @return
	 */
	public TargetObj findOrCreateTargetObj(ArrayMapping arrayMapping, String fixmlClassName, String fixmlTargetPath) throws NullPointerException {
		TargetObj targetObj = arrayMapping.targetObjExists(fixmlTargetPath);
		if (targetObj == null) {
			targetObj = createTargetObj(fixmlClassName, fixmlTargetPath);
			arrayMapping.getTargetObj().add(targetObj);
		}
		return targetObj;
	}

}
