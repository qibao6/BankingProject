package com.demo.controller.lq;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.service.lq.LoginService;

@Controller
@RequestMapping("Backstage")
public class LoginHandlers {
	@Autowired
	LoginService loginService;
	
	@RequestMapping("login")
	public String login(){
		return "/Backstage/BackStagelogin";
	}
	
	@RequestMapping("sendcode")
	@ResponseBody
	public Map<String,Object> sendCode(HttpServletRequest request,HttpSession session) throws Exception {
		Map<String,Object> map = new HashMap<>();
		String mobilePhone = request.getParameter("mobilePhone");
		Integer rand=null;//loginService.dxjk(mobilePhone);
		session.setAttribute("rand", rand);
		return map;
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
 