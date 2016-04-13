package com.jhyarrow.webService.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jhyarrow.webService.entity.FileEntity;
import com.jhyarrow.webService.entity.UserEntity;
import com.jhyarrow.webService.service.FileService;
import com.jhyarrow.webService.service.UserService;

@Controller
@RequestMapping("/file")
public class FileController {
	private static Logger logger = Logger.getLogger(UserController.class);
	@Resource
	private UserService userService;
	@Resource
	private FileService fileService;
	
	@RequestMapping("/addFile")
	@ResponseBody
	public FileEntity addFile(HttpServletRequest request,HttpServletResponse response)throws Exception{
		UserEntity user = this.userService.getUserByName(request.getParameter("username"));
		logger.info(user);
		System.out.println("fileName" + request.getParameter("fileName"));
		return this.fileService.addFile(user,request.getParameter("fileName"));
	}
}
