package com.demo.controller.lq;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("Backstage")
public class LoginHandlers {
	
	@RequestMapping("login")
	public String login(){
		return "/Backstage/BackStagelogin";
	}
	
	@RequestMapping("logins")
	@ResponseBody   //返回json格式（字符串）
	public Map<String,Object> toIndex(HttpServletRequest request,HttpSession session){
		Map<String,Object> map = new HashMap<>(); 
		
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		String mobilePhone=request.getParameter("mobilePhone");
		String rand=request.getParameter("rand");
		
//		session.setAttribute(arg0, arg1);
		map.put("code",0);
		map.put("msg", 123);
		return map;
	}
	
	/**
	 * 后台主界面
	 * @return
	 */
	
	@RequestMapping("index")
	public String indexs(){
		return "/Backstage/main";
	}
	/**
	 * 后台主界面iframe图片
	 * @return
	 */
	@RequestMapping("indexIframe")
	public String indexIframe(){
		return "/Backstage/indexIframe";
		
	}
}
 