package com.jhyarrow.webService.service.impl;

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
	
}
