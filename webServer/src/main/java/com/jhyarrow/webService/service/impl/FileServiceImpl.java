package com.jhyarrow.webService.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jhyarrow.webService.dao.FileMapper;
import com.jhyarrow.webService.entity.FileEntity;
import com.jhyarrow.webService.service.FileService;

@Service("fileService")
public class FileServiceImpl implements FileService{

	@Resource
	private FileMapper fileMapper;
	
	public FileEntity getFileById(String id) {
		return this.fileMapper.getFileById(id);
	}

}
