package com.jhyarrow.webService;

import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.jhyarrow.webService.dao.UserMapper;
import com.jhyarrow.webService.entity.UserEntity;
import com.jhyarrow.webService.util.MyBatisUtil;

public class UserTest {
		//@Test
		public void testAddUser(){
			SqlSession session = MyBatisUtil.getSessionFactory().openSession();
			try{
				UserMapper mapper = session.getMapper(UserMapper.class);
				UserEntity user = new UserEntity();
				user.setDelete(false);
				user.setUserId(UUID.randomUUID().toString().replaceAll("-",""));
				user.setEmail("632849309@qq.com");
				user.setPassword("1234567890");
				user.setPhone("13312345678");
				user.setUserName("panpasi2008");
				mapper.add(user);
				session.commit();
				System.out.println("添加成功!");
			}catch(Exception e){
				e.printStackTrace();
				session.rollback();
			}finally{
				session.close();
			}
		}
		
		//@Test
		public void getPasswordByUserName(){
			SqlSession session = MyBatisUtil.getSessionFactory().openSession();
			try{
				UserMapper mapper = session.getMapper(UserMapper.class);
				String password = mapper.getUserPasswordByUserName("panpasi2008");
				System.out.println("password：" + password);
			}catch(Exception e){
				e.printStackTrace();
				session.rollback();
			}finally{
				session.close();
			}
		}
		
		//@Test
		public void getPasswordByPhone(){
			SqlSession session = MyBatisUtil.getSessionFactory().openSession();
			try{
				UserMapper mapper = session.getMapper(UserMapper.class);
				String password = mapper.getUserPasswordByUserPhone("13312345678");
				System.out.println("phone：" + password);
			}catch(Exception e){
				e.printStackTrace();
				session.rollback();
			}finally{
				session.close();
			}
		}
		
		//@Test
		public void getStateByUserName(){
			SqlSession session = MyBatisUtil.getSessionFactory().openSession();
			try{
				UserMapper mapper = session.getMapper(UserMapper.class);
				Boolean state = mapper.getStateByUserName("panpasi2008");
				System.out.println("state：" + state);
			}catch(Exception e){
				e.printStackTrace();
				session.rollback();
			}finally{
				session.close();
			}
		}
		
		@Test
		public void getUserFileList(){
			SqlSession session = MyBatisUtil.getSessionFactory().openSession();
			try{
				UserMapper mapper = session.getMapper(UserMapper.class);
				UserEntity user = mapper.getUserById("46ef754a6e1141cc8895423b0a0d0cb6");
				session.commit();
				System.out.println(user.getFileList().size());
			}catch(Exception e){
				e.printStackTrace();
				session.rollback();
			}finally{
				session.close();
			}
		}
		
}
