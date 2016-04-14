package com.jhyarrow.webService.dao;

import java.util.List;

import com.jhyarrow.webService.entity.FileEntity;


public interface FileMapper extends BaseMapper{
	void addFile(FileEntity file);
	FileEntity getFileById(String id);
	List<FileEntity> getFiles(String id);
	void editFileName(String fileId, String fileName);
}
