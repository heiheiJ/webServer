package com.jhyarrow.webService;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.jhyarrow.webService.entity.PicEntity;
import com.jhyarrow.webService.service.PicService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class PicTest {
	private static Logger logger = Logger.getLogger(PicTest.class);
	
	@Resource
	private PicService picService = null;
	
	@Test
	public void test(){
		PicEntity pic = picService.getPicById("b3d9a1c9866a49b1b6c78cd1b27bc6fb");
		logger.info(JSON.toJSONString(pic));
		System.out.println(pic.getPicContent());
	}
}
