package com.demo.controller.yxj;

import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("web")
public class LoginHandler {
	
	//跳转到登录界面
	@RequestMapping("login")
	public String login(){
		
		return "front/login";
	}
	
	//登录成功后，跳到会员中心界面
	@RequestMapping("success")
	public String success(Request request){
//		String mobilePhone=request.getParameter("name");
//		String password=request.getParameter("password");
		return "";
	}
}
