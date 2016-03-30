package com.jhyarrow.webService.dao;

import com.jhyarrow.webService.entity.UserEntity;

public interface UserMapper {
	public void add(UserEntity user);
	public String getUserPasswordByUserName(String userName);
	public String getUserPasswordByUserPhone(String phone);
	public String getUserPasswordByUserEmail(String email);
	public boolean getStateByUserName(String userName);
	public UserEntity getUserById(String userId);
}
