package org.smart4j.chapter2.util;

/**
 * 
 * @author Administrator
 * 转型操作工具类
 */
public class CastUtil {
	
	/**
	 * 转为String型
	 */
	public static String castString(Object object){
		return CastUtil.castString(object,"");
	}
	
	/**
	 * 转为String型（提供默认值）
	 */
	public static String castString(Object object,String defaultValue){
		return object !=null ? String.valueOf(object):defaultValue;
	}
	
	/**
	 * 转为double型
	 */
	public static double castDouble(Object object){
		return CastUtil.castDouble(object, 0);
	}
	
	/**
	 * 转为double型(提供默认值)
	 * 
	 */
	public static double castDouble(Object object, double defaultValue){
		double doubleValue = defaultValue;
		if(object != null){
			String strValue = castString(object);
			if(StringUtil.isNotEmpty(strValue)){
				try{
					doubleValue=Double.parseDouble(strValue);
				}catch(NumberFormatException e){
					doubleValue = defaultValue;
				}
			}
		}
		return doubleValue;
	}
	
	/**
	 * 转换为long型
	 */
	public static long castLong(Object object) {
		return CastUtil.castLong(object, 0);
	}
	
	/**
	 * 转换为long型（提供默认值）
	 */
	public static long castLong(Object object, long defaultValue){
		long longValue = defaultValue;
		if(object != null){
			String strValue = castString(object);
			if(StringUtil.isNotEmpty(strValue)){
				try{
					longValue = Long.parseLong(strValue);
				}catch(NumberFormatException e){
					longValue = defaultValue;
				}
			}
		}
		return longValue;
	}
	
	/**
	 * 转为Int型
	 */
	public static int castInt(Object object){
		return CastUtil.castInt(object, 0);
	}
	
	/**
	 * 转为int型（提供默认值）
	 */
	public static int castInt(Object object, int defaultValue){
		int intValue = defaultValue;
		if(object != null){
			String strValue = castString(object);
			if(StringUtil.isNotEmpty(strValue)){
				intValue = Integer.parseInt(strValue);
			}
		}
		return intValue;
	}
	
	/**
	 * 转为boolean型
	 */
	public static boolean castBoolean(Object object){
		return CastUtil.castBoolean(object, false);
	}
	
	/**
	 * 转为boolean型（提供默认值）
	 */
	public static boolean castBoolean(Object object, boolean defaultValue){
		boolean booleanValue = defaultValue;
		if(object != null){
			String strValue = castString(object);
			if(StringUtil.isNotEmpty(strValue)){
				booleanValue = Boolean.parseBoolean(strValue);
			}
		}
		return booleanValue;
	}
}
