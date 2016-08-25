package org.smart4j.chapter2.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.util.PropsUtil;

import com.mysql.fabric.xmlrpc.base.Params;


public class DatabaseHelper {
	private static final Logger  LOGGER = LoggerFactory.getLogger(DatabaseHelper.class);
	private static final QueryRunner QUERY_RUNNER = new QueryRunner();
	private static final ThreadLocal<Connection> CONNECTION_HOLDER = new ThreadLocal<Connection>();
	
	private static final String DRIVER;
	private static final String URL;
	private static final String USERNAME;
	private static final String PASSWORD;
	static {
		Properties props = PropsUtil.loadProps("config.properties");
		DRIVER = props.getProperty("jdbc.driver");
		URL = props.getProperty("jdbc.url");
		USERNAME = props.getProperty("jdbc.username");
		PASSWORD = props.getProperty("jdbc.password");
		try{
			Class.forName(DRIVER);
		}catch(ClassNotFoundException e){
			LOGGER.error("class not found",e);
		}
	}
	
	public static Connection getConnection(){
		Connection conn =CONNECTION_HOLDER.get();
		try{
			conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		}catch(SQLException e){
			LOGGER.error("fail to connection mysql",e);
		}finally{
			CONNECTION_HOLDER.set(conn);
		}
		return conn;
		
	}
	
	public static void closeConnection(){
		Connection conn = CONNECTION_HOLDER.get();
		if(conn != null){
			try{
				conn.close();
			}catch(SQLException e){
				LOGGER.error("sql close fail",e);
			}finally{
				CONNECTION_HOLDER.set(conn);
			}
		}
	}
	/**
	 * 查询实体列表
	 */
	public static<T> List<T> queryEntiryList(Class<T> entityClass,String sql,Object... params ){
		List<T> entityList;
<<<<<<< HEAD
		
		try{
			Connection conn  = getConnection();
			entityList = QUERY_RUNNER.query(conn, sql, new BeanListHandler<T>(entityClass),params);
=======
		Connection conn = null;
		try{
			entityList = QUERY_RUNNER.query(conn = getConnection(), sql, new BeanListHandler<T>(entityClass),params);
>>>>>>> origin/master
		}catch(SQLException e){
			LOGGER.error("query entity list failure",e);
			throw new RuntimeException(e);
		}finally{
			closeConnection(conn);
		}
		return entityList;
	}
	
	/**
	 * 
	 * @param entityClass  ��ѯʵ��
	 * @param sql
	 * @param params
	 * @return
	 */
	public static <T> T queryEntry(Class<T> entityClass,String sql,Object... params){
		T entity;
		try{
			Connection conn = getConnection();
			entity = QUERY_RUNNER.query(conn, sql, new BeanHandler<T> (entityClass), params);
		}catch(SQLException e){
			LOGGER.error("query entity failure",e);
			throw new RuntimeException(e);
		}finally{
			closeConnection();
		}
		return entity;
	}
}
