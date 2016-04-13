package com.jhyarrow.webService.service;

import com.jhyarrow.webService.entity.FileEntity;
import com.jhyarrow.webService.entity.UserEntity;

public interface FileService {
	public FileEntity getFileById(String id);
	public FileEntity addFile(UserEntity user,String fileName);
}
