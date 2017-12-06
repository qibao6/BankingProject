package com.demo.controller.lq;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Backstage")
public class LoginHandler {
	
	@RequestMapping("login")
	public String login(){
		return "/Backstage/BackStagelogin";
	}
	
	@RequestMapping("logins")
	public String toIndex(HttpServletRequest request){
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		String mobilePhone=request.getParameter("mobilePhone");
		String code=request.getParameter("code");
		
		System.out.println(userName);
		System.out.println(password);
		System.out.println(mobilePhone);
		System.out.println(code);
		
		return "main";
	}
}
