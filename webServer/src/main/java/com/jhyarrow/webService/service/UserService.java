package com.jhyarrow.webService.service;

import com.jhyarrow.webService.entity.UserEntity;

public interface UserService {
	public UserEntity getUserById(String userId);
	public void addUser(String username,String password,String email,String phone);
}
