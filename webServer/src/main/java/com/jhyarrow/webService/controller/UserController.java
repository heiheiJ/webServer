package com.jhyarrow.webService.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jhyarrow.webService.entity.UserEntity;
import com.jhyarrow.webService.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		UserEntity user = this.userService.getUserById(request.getParameter("id"));
		model.addAttribute("user",user);
		return "showUser";
	}
}
