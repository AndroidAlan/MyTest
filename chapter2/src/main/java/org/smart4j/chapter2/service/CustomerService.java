package org.smart4j.chapter2.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.helper.*;


/**
 *  �ṩ�ͻ����ݷ���
 * @author Administrator
 *
 */

public class CustomerService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

	/**
	 * ��ȡ�ͻ��б�
	 */
	
	public List<Customer> getCustomerList(){
		try{
			
			String sql ="select * from customer";
			
			return DatabaseHelper.queryEntiryList(Customer.class,sql);
		}finally{
			DatabaseHelper.closeConnection();
		}
		
	}
	
	/**
	 *   ��ȡ�û� 
	 */
	public Customer getCustomer(long id){
		
		return null;
	}
	
	/**
	 * �����ͻ�
	 */
	public boolean createCustomer(Map<String,Object> fieldMap){
		
		return false;
	}
	
	/***
	 * �����û�
	 */
	
	public boolean updateCustomer(long id,Map<String,Object> fieldMap){
		
		return false;
	}
	
	/**
	 * ɾ���ͻ�
	 */
	public boolean deleteCustomer(long id){
		
		return false;
	}
}
