package com.jhyarrow.webService.service.impl;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jhyarrow.webService.dao.FileMapper;
import com.jhyarrow.webService.entity.FileEntity;
import com.jhyarrow.webService.entity.UserEntity;
import com.jhyarrow.webService.service.FileService;

@Service("fileService")
public class FileServiceImpl implements FileService{

	@Resource
	private FileMapper fileMapper;
	
	public FileEntity getFileById(String id) {
		return this.fileMapper.getFileById(id);
	}

	public FileEntity addFile(UserEntity user, String fileName) {
		FileEntity file = new FileEntity();
		file.setFileId(UUID.randomUUID().toString().replaceAll("-", ""));
		file.setDelete(false);
		file.setFileName(fileName);
		file.setFileSize(0);
		file.setFileType("pic");
		file.setPicCount(0);
		file.setUserId(user.getUserId());
		this.fileMapper.addFile(file);
		return this.fileMapper.getFileById(file.getFileId());
	}


}
