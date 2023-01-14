package collectionsAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsUtil {
	
	public static final String METHOD_NAME_COMPARE_TO = "compareTo";
	
	CollectionsUtil(){
		
	}

	public static <T> List<T> sortByMethodName(List<T> list,final String methodName) {
		Collections.sort(list, new Comparator<T>() {			
			@Override public int compare(T objOne, T objTwo) {
				try {
					Method methodComparable = objOne.getClass().getMethod(methodName, null);
					
					Object returnOne = methodComparable.invoke(objOne, null);
					Object returnTwo = methodComparable.invoke(objTwo, null);
							
					Method methodCompareTo = returnOne.getClass().getMethod(METHOD_NAME_COMPARE_TO, new Class[]{returnTwo.getClass()});
							
					return (int) methodCompareTo.invoke(returnOne, returnTwo);
					
				} catch (NoSuchMethodException | SecurityException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				return 0;
			}
		});
		
	 return list;	
	 
	}
	
	public static <T> List<T> sortReverseByMethodName(List<T> list,final String methodName) {
		Collections.sort(list, new Comparator<T>() {			
			@Override public int compare(T objOne, T objTwo) {
				try {
					Method methodComparable = objOne.getClass().getMethod(methodName, null);
					
					Object returnOne = methodComparable.invoke(objOne, null);
					Object returnTwo = methodComparable.invoke(objTwo, null);
							
					Method methodCompareTo = returnOne.getClass().getMethod(METHOD_NAME_COMPARE_TO, new Class[]{returnTwo.getClass()});
							
					return (int) methodCompareTo.invoke(returnOne, returnTwo);
					
				} catch (NoSuchMethodException | SecurityException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				return 0;
			}
		});
		
	 Collections.reverse(list);
	 
	 return list;
	 
	}
	
	public static <T> T maxByMethodName(List<T> list,final String methodName) {
		T t = Collections.max(list, new Comparator<T>() {			
			@Override public int compare(T objOne, T objTwo) {
				try {
					Method methodComparable = objOne.getClass().getMethod(methodName, null);
					
					Object returnOne = methodComparable.invoke(objOne, null);
					Object returnTwo = methodComparable.invoke(objTwo, null);
							
					Method methodCompareTo = returnOne.getClass().getMethod(METHOD_NAME_COMPARE_TO, new Class[]{returnTwo.getClass()});
							
					return (int) methodCompareTo.invoke(returnOne, returnTwo);
					
				} catch (NoSuchMethodException | SecurityException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				return 0;
			}
		});
		
	 return t;	
	 
	}
	
	public static <T> T minByMethodName(List<T> list,final String methodName) {
		T t = Collections.min(list, new Comparator<T>() {			
			@Override public int compare(T objOne, T objTwo) {
				try {
					Method methodComparable = objOne.getClass().getMethod(methodName, null);
					
					Object returnOne = methodComparable.invoke(objOne, null);
					Object returnTwo = methodComparable.invoke(objTwo, null);
							
					Method methodCompareTo = returnOne.getClass().getMethod(METHOD_NAME_COMPARE_TO, new Class[]{returnTwo.getClass()});
							
					return (int) methodCompareTo.invoke(returnOne, returnTwo);
					
				} catch (NoSuchMethodException | SecurityException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				return 0;
			}
		});
		
	 return t;	
	 
	}
	
	

}
