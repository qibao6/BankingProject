package com.demo.controller.yxj;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Members;
import com.demo.service.yxj.LoginServices;
import com.demo.service.yxj.SubjectService;

@Controller
@RequestMapping("web")
public class LoginHandler {

	@Autowired
	SubjectService subjectService;
	@Autowired
	LoginServices loginService;

	//跳转到登录界面
	@RequestMapping("login")
	public String login(){

		return "front/login";
	}


	//登录成功后
	@RequestMapping("success") 
	@ResponseBody
	public Map<String,Object> success(HttpServletRequest request,HttpServletResponse response){
		Map<String,Object> map=new HashMap<>();
		String phone=request.getParameter("phone");
		String password=request.getParameter("password");
		System.out.println(phone);
		System.out.println(password);
		//String code=request.getParameter("code");
		Members members=loginService.llist(phone, password);
		if (members==null) {
			map.put("msg","用户名或密码错误");
			//map.put("islogin", 1);
			return map;
		}
		request.getSession().setAttribute("members", members);
		map.put("code", 0);

		return map;
	}

	@RequestMapping("regis") 
	public String regis(){
		return "front/regis";
	}

	@RequestMapping("logout") 
	public String logout(Map<String,Object> map){
		


		return "redirect:/subject/subindex";
	}
}
