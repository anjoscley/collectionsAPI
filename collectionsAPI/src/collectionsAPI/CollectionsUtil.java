package collectionsAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsUtil {
	
	public static List<?> sortByMethodName(List<?> list,final String methodName) {
		Collections.sort(list, new Comparator() {			
			@Override public int compare(Object objOne, Object objTwo) {
				try {
					Method methodComparable = objOne.getClass().getMethod(methodName, null);
					
					Object returnOne = methodComparable.invoke(objOne, null);
					Object returnTwo = methodComparable.invoke(objTwo, null);
					
					if(returnOne instanceof String && returnTwo instanceof String) {
						String retorno1Castado = (String) returnOne;
						String retorno2Castado = (String) returnTwo;
						
						retorno1Castado.compareTo(retorno2Castado);
					}
				} catch (NoSuchMethodException | SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return 0;
			}
		});
	 return list;	
	 
	}

}
