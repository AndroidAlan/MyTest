package org.smart4j.chapter2.util;

/**
 * 
 * @author Administrator
 * ת�Ͳ���������
 */
public class CastUtil {
	
	/**
	 * תΪString��
	 */
	public static String castString(Object object){
		return CastUtil.castString(object,"");
	}
	
	/**
	 * תΪString�ͣ��ṩĬ��ֵ��
	 */
	public static String castString(Object object,String defaultValue){
		return object !=null ? String.valueOf(object):defaultValue;
	}
	
	/**
	 * תΪdouble��
	 */
	public static double castDouble(Object object){
		return CastUtil.castDouble(object, 0);
	}
	
	/**
	 * תΪdouble��(�ṩĬ��ֵ)
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
	 * ת��Ϊlong��
	 */
	public static long castLong(Object object) {
		return CastUtil.castLong(object, 0);
	}
	
	/**
	 * ת��Ϊlong�ͣ��ṩĬ��ֵ��
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
	 * תΪInt��
	 */
	public static int castInt(Object object){
		return CastUtil.castInt(object, 0);
	}
	
	/**
	 * תΪint�ͣ��ṩĬ��ֵ��
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
	 * תΪboolean��
	 */
	public static boolean castBoolean(Object object){
		return CastUtil.castBoolean(object, false);
	}
	
	/**
	 * תΪboolean�ͣ��ṩĬ��ֵ��
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
