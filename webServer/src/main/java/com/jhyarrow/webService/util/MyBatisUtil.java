package com.jhyarrow.webService.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private static SqlSessionFactory sessionFactory = buildSessionFactory();
	private MyBatisUtil(){
		
	}
	
	private static SqlSessionFactory buildSessionFactory(){
		if (null == sessionFactory){
			String resource = "mybatis-config.xml";
			try{
				sessionFactory = new SqlSessionFactoryBuilder().build(Resources
						.getResourceAsReader(resource));
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
	
	public static SqlSessionFactory getSessionFactory(){
		return sessionFactory;
	}
}