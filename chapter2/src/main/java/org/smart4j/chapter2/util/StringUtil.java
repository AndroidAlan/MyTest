package org.smart4j.chapter2.util;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author Administrator
 * �ַ���������
 */
public class StringUtil {
	/**
	 * �ж��ַ����Ƿ�Ϊ��
	 */
	public static boolean isEmpty(String str){
		if(str != null){
			str = str.trim() ;
		}
		return StringUtils.isEmpty(str);
	}
	
	
	/**
	 * �ж��ַ����Ƿ�ǿ�
	 */
	public static boolean isNotEmpty(String str){
		return !isEmpty(str);
	}

}
