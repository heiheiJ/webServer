package com.jhyarrow.webService.entity;

import java.util.ArrayList;
import java.util.UUID;

public class UserEntity extends BaseEntity{
	private String userId;//用户ID
	private String userName;//用户名
	private	String password;//密码
	private String email;//邮箱
	private String phone;//手机号码
	private boolean state;//用户状态
	private ArrayList<FileEntity> fileList;
	
	public UserEntity(String userName,String password,String email,String phone){
		this.userId = UUID.randomUUID().toString().replaceAll("-", "");
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.state = false;
	}
	public ArrayList<FileEntity> getFileList() {
		return fileList;
	}
	public void setFileList(ArrayList<FileEntity> fileList) {
		this.fileList = fileList;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	
}
