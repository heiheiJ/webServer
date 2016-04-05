package com.jhyarrow.webService;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.jhyarrow.webService.entity.FileEntity;
import com.jhyarrow.webService.service.FileService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class FileTest {
	private static Logger logger = Logger.getLogger(FileTest.class);
	
	@Resource
	private FileService fileService = null;
	
	@Test
	public void test(){
		FileEntity file = fileService.getFileById("11257efab0994269af97d1452c45c218");
		logger.info(JSON.toJSONString(file));
	}

}
