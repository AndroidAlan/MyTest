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
		Connection conn = null;
		try{
			List<Customer> customerList = new ArrayList<Customer>();
			String sql ="select * from customer";
			conn =DatabaseHelper.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs =stmt.executeQuery();
			while(rs.next()){
				Customer customer = new Customer();
				customer.setId(rs.getLong("id"));
				customer.setName(rs.getString("name"));
				customer.setContact(rs.getString("contact"));
				customer.setTelephone(rs.getString("telephone"));
				customer.setEmail(rs.getString("email"));
				customer.setRemark(rs.getString("remark"));
				customerList.add(customer);
			}
			return customerList;
		}catch(SQLException e){
		//	LOGGER.error("execute sql failure",e);
		}finally{
			DatabaseHelper.closeConnection(conn);
		}
		return null;
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
