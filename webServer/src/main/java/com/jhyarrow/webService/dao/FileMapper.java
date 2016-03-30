package com.jhyarrow.webService.dao;

import com.jhyarrow.webService.entity.FileEntity;


public interface FileMapper {
	public void addFile(FileEntity file);
	public FileEntity getFileById(String id);
}
