package com.jhyarrow.webService.service.impl;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jhyarrow.webService.dao.UserMapper;
import com.jhyarrow.webService.entity.UserEntity;
import com.jhyarrow.webService.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper userMapper;
	
	public UserEntity getUserById(String userId) {
		return this.userMapper.getUserById(userId);
	}

	public void addUser(String username, String password, String email,String phone) {
		UserEntity user = new UserEntity();
		user.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
		user.setUserName(username);
		user.setPassword(password);
		user.setPhone(phone);
		user.setEmail(email);
		user.setState(true);
		this.userMapper.add(user);
	}
	
	public UserEntity getUserByName(String username){
		return this.userMapper.getUserByName(username);
	}

	public UserEntity getUserByEmail(String email) {
		return this.userMapper.getUserByEmail(email);
	}

	public UserEntity getUserByPhone(String phone) {
		return this.userMapper.getUserByPhone(phone);
	}
	
}
