package collectionsAPI;

import java.math.BigDecimal;
import java.math.BigInteger;

public enum WrapperTypes {
	
	STRING(String.class),
	INTEGER(Integer.class),
	LONG(Long.class),
	FLOAT(Float.class),
	DOUBLE(Double.class),
	BIGDECIMAL(BigDecimal.class),
	BIGINTEGER(BigInteger.class),
	CHARACTER(Character.class),
	BOOLEAN(Boolean.class);
	
	public Class<?> classValue;
	
	WrapperTypes(Class<?> value) {
		classValue = value;
	}
	
	public Class<?> getClassValue(){
		return classValue;
	}

}
