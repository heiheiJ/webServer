package com.jhyarrow.webService.entity;


public class PicEntity extends BaseEntity{
	private String picId;//图片ID
	private int picNo;//图片编号
	private String fileId;//文件ID
	private int picSize;//文件大小
	private byte[] picContent;//文件内容
	private FileEntity fileEntity;//文件
	public FileEntity getFileEntity() {
		return fileEntity;
	}
	public void setFileEntity(FileEntity fileEntity) {
		this.fileEntity = fileEntity;
	}
	public String getPicId() {
		return picId;
	}
	public byte[] getPicContent() {
		return picContent;
	}
	public void setPicContent(byte[] picContent) {
		this.picContent = picContent;
	}
	public void setPicId(String picId) {
		this.picId = picId;
	}
	public int getPicNo() {
		return picNo;
	}
	public void setPicNo(int picNo) {
		this.picNo = picNo;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public int getPicSize() {
		return picSize;
	}
	public void setPicSize(int picSize) {
		this.picSize = picSize;
	}
}
