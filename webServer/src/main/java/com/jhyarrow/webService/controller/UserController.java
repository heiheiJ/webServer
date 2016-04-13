package com.jhyarrow.webService.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jhyarrow.webService.UserTest;
import com.jhyarrow.webService.entity.FileEntity;
import com.jhyarrow.webService.entity.PicEntity;
import com.jhyarrow.webService.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	private static Logger logger = Logger.getLogger(UserController.class);
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
		logger.info(map);
		return map;
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public Map<String,String> login(HttpServletRequest request,HttpServletResponse response) throws Exception{
		Map<String,String> map = new HashMap<String,String>();
		if(this.userService.getUserByName(request.getParameter("username")) == null){
			map.put("username", "false");
			return map;
		}else{
			map.put("username", "true");
		}
		String pass = this.userService.getUserByName(
				request.getParameter("username")).getPassword();
		System.out.println("pass:" + pass);
		System.out.println("password:" + request.getParameter("password"));
		if(pass.equals(request.getParameter("password"))){
			map.put("result", "true");
		}else{
			map.put("result", "false");
		}
		logger.info(map);
		return map;
	}
	
	@RequestMapping("/getFiles")
	@ResponseBody
	public Map<String,List<FileEntity>> getFiles(HttpServletRequest request,HttpServletResponse response) throws Exception{
		List<FileEntity> files = this.userService.getUserByName(request.getParameter("username")).getFileList();
		Map<String,List<FileEntity>> map = new HashMap<String,List<FileEntity>>();
		map.put("files", files);
		logger.info(map);
		return map;
	}
	
	@RequestMapping("/getPics")
	@ResponseBody
	public Map<String,List<PicEntity>> getPics(HttpServletRequest request,HttpServletResponse response) throws Exception{
		List<PicEntity> pics = this.userService.getUserByName(request.getParameter("username"))
				.getFileList().get(Integer.parseInt(request.getParameter("position"))).getPicList(); 
		Map<String,List<PicEntity>> map = new HashMap<String,List<PicEntity>>();
		map.put("pics", pics);
		return map;
	}
}
