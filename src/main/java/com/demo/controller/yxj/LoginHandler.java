package com.demo.controller.yxj;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;import org.springframework.dao.DataAccessResourceFailureException;
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
	
	@RequestMapping("sendTestValSms") 
	@ResponseBody
	public Map<String,Object> sendTestValSms(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("一生热爱不遗憾，愿余生可随遇而安");
		Map<String,Object> map=new HashMap<>();
		String phone=request.getParameter("phone");
		//String vCode=request.getParameter("vCode");
		Integer send=loginService.message(phone);
		request.getSession().setAttribute("send",send);
		if (send!=null) {
			map.put("msg","验证码已发送");
		}
		//System.out.println(send);
		request.getSession().setAttribute("phone", phone);
		map.put("code",0);
		return map;
	}

	@RequestMapping("regis") 
	public String regis(){
		return "front/regis";
	}
	
	@RequestMapping("regissuccess") 
	@ResponseBody
	public Map<String,Object> regissuccess(HttpServletRequest request){
		Map<String,Object> map=new HashMap<>();
		String youname=request.getParameter("youname");
		String phone=request.getParameter("phone");
		String vCode=request.getParameter("vCode");
		String password=request.getParameter("password");
		String password2=request.getParameter("password2");
		String invitationCode=request.getParameter("invitationCode");
		String qq=request.getParameter("qq");
		if (password!=password2) {
			map.put("msg","两次密码不同，请重新输入");
		}
		 request.getAttribute("send");
		if (vCode!=request.getAttribute("send")) {
			map.put("msg", "验证码输入错误");
		}
		Members members=new Members("", youname, password, "", phone, 0, 0, "", new Date(), new Date(), "", "", 0,invitationCode, "", "", "", qq);
		loginService.addmember(members);
		map.put("code",0);
		//System.out.println(request.getAttribute("send"));
		return map;
	}

	@RequestMapping("logout") 
	public String logout(Map<String,Object> map,HttpServletRequest request){
		
		request.getSession().removeAttribute("members");

		return "redirect:/web/login";
	}
}
