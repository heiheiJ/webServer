package com.jhyarrow.webService.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jhyarrow.webService.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping("/register")
	@ResponseBody
	public Map<String,String> register(HttpServletRequest request,HttpServletResponse response)throws Exception{
		Map<String,String> map = new HashMap<String,String>();
		boolean flag = true;
		if (this.userService.getUserByEmail(request.getParameter("email")) != null){
			map.put("email", "false");
			flag = false;
		}else{
			map.put("email", "true");
		}
		if(this.userService.getUserByPhone(request.getParameter("phone")) != null){
			map.put("phone", "false");
			flag = false;
		}else{
			map.put("phone", "true");
		}
		if(this.userService.getUserByName(request.getParameter("username")) != null){
			map.put("username", "false");
			flag = false;
		}else{
			map.put("username", "true");
		}
		if (!flag){
			return map;
		}
		this.userService.addUser(request.getParameter("username"),
				request.getParameter("password"),
				request.getParameter("email"),
				request.getParameter("phone"));
		return null;
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public Map<String,String> login(HttpServletRequest request,HttpServletResponse response) throws Exception{
		String pass = this.userService.getUserByName(
				request.getParameter("username")).getUserName();
		Map<String,String> map = new HashMap<String,String>();
		if(pass.equals(request.getParameter("password"))){
			map.put("result", "true");
		}else{
			map.put("result", "false");
		}
		System.out.println("login");
		return map;
	}
}
