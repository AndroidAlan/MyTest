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
 *  提供客户数据服务
 * @author Administrator
 *
 */

public class CustomerService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

	/**
	 * 获取客户列表
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
	 *   获取用户 
	 */
	public Customer getCustomer(long id){
		
		return null;
	}
	
	/**
	 * 创建客户
	 */
	public boolean createCustomer(Map<String,Object> fieldMap){
		
		return false;
	}
	
	/***
	 * 更新用户
	 */
	
	public boolean updateCustomer(long id,Map<String,Object> fieldMap){
		
		return false;
	}
	
	/**
	 * 删除客户
	 */
	public boolean deleteCustomer(long id){
		
		return false;
	}
}
