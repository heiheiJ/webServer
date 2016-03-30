package com.jhyarrow.webService.entity;

import java.util.ArrayList;

public class FileEntity extends BaseEntity{
	private String fileId;//文件ID
	private String fileName;//文件名
	private int fileSize;//文件大小
	private String userId;//用户ID
	private int picCount;//图片数量
	private String fileType;//图片类型
	private UserEntity userEntity;
	private ArrayList<PicEntity> picList;
	public ArrayList<PicEntity> getPicList() {
		return picList;
	}
	public void setPicList(ArrayList<PicEntity> picList) {
		this.picList = picList;
	}
	public UserEntity getUserEntity() {
		return userEntity;
	}
	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public int getFileSize() {
		return fileSize;
	}
	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getPicCount() {
		return picCount;
	}
	public void setPicCount(int i) {
		this.picCount = i;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	
	
}
