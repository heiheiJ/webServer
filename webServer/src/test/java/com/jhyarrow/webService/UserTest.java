package com.jhyarrow.webService;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.jhyarrow.webService.entity.UserEntity;
import com.jhyarrow.webService.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})

public class UserTest {
	private static Logger logger = Logger.getLogger(UserTest.class);
	@Resource
	private UserService userService = null;
	
	//@Test
	public void testId(){
		UserEntity user = userService.getUserById("46ef754a6e1141cc8895423b0a0d0cb6");
		logger.info(JSON.toJSONString(user));
	}
	
	@Test
	public void testUsername(){
		UserEntity user = userService.getUserByName("panpasi2007");
		logger.info(JSON.toJSONString(user));
	}
}
