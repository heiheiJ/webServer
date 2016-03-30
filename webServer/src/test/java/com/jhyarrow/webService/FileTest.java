package com.jhyarrow.webService;

import java.util.Date;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.jhyarrow.webService.dao.FileMapper;
import com.jhyarrow.webService.entity.FileEntity;
import com.jhyarrow.webService.util.MyBatisUtil;

public class FileTest {
	//@Test
	public void testAddFile(){
		SqlSession session = MyBatisUtil.getSessionFactory().openSession();
		try{
			FileMapper mapper = session.getMapper(FileMapper.class);
			FileEntity file = new FileEntity();
			file.setDelete(false);
			file.setFileId(UUID.randomUUID().toString().replaceAll("-", ""));
			file.setFileName("heihei");
			file.setFileSize(128);
			file.setFileType("pdf");
			file.setPicCount(8);
			file.setUserId("46ef754a6e1141cc8895423b0a0d0cb6");
			mapper.addFile(file);
			session.commit();
			System.out.println("添加成功!");
		}catch(Exception e){
			e.printStackTrace();
			session.rollback();
		}finally{
			session.close();
		}
	}
	
	@Test
	public void testGetFile(){
		SqlSession session = MyBatisUtil.getSessionFactory().openSession();
		try{
			FileMapper mapper = session.getMapper(FileMapper.class);
			FileEntity file = mapper.getFileById("11257efab0994269af97d1452c45c218");
			System.out.println(file.getPicList());
		}catch(Exception e){
			e.printStackTrace();
			session.rollback();
		}finally{
			
			session.close();
		}
	}

}
