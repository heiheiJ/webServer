package com.jhyarrow.webService.dao;

import com.jhyarrow.webService.entity.UserEntity;

public interface UserMapper extends BaseMapper{
	void add(UserEntity user);
	String getUserPasswordByUserName(String userName);
	String getUserPasswordByUserPhone(String phone);
	String getUserPasswordByUserEmail(String email);
	boolean getStateByUserName(String userName);
	UserEntity getUserById(String userId);
	UserEntity getUserByName(String username);
	UserEntity getUserByPhone(String phone);
	UserEntity getUserByEmail(String email);
}
