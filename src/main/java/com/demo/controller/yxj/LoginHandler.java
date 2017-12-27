package com.demo.controller.yxj;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.MemberAccount;
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
		System.out.println(request.getParameter("cur"));
		Map<String,Object> map=new HashMap<>();
		String phone=request.getParameter("phone");
		//String vCode=request.getParameter("vCode");
		Integer send=loginService.message(phone);
		request.getSession().setAttribute("send",send);
		if (send!=null) {
			Integer regismsg=loginService.message(phone);
			HttpSession session=request.getSession();
			session.setAttribute("regismsg", regismsg);
			session.setMaxInactiveInterval(60);
			map.put("msg","短信验证码已发送");
		}
		System.out.println(send);
		request.getSession().setAttribute("phone", phone);
		map.put("code",0);
		return map;
	}

	@RequestMapping("regis") 
	public String regis(){
		return "front/regis";
	}
	
	//点击注册
	@RequestMapping("regissuccess") 
	@ResponseBody
	public Map<String,Object> regissuccess(HttpServletRequest request){
		Map<String,Object> map=new HashMap<>();
		List<Members> mlist=loginService.getmembers();
		map.put("mlist", mlist);
		String youname=request.getParameter("name");
		String phone=request.getParameter("mobilePhone");
		//System.out.println(member.getNames());
		//查询数据库中用户表，判断用户名和手机号是否已存在，如果数据库中有则不能注册
		for (Members members : mlist) {
			
			if (youname.equals(members.getNames())) {
				
				map.put("msg","该用户已存在，请重新输入用户名");
				return map;
			}
			if (phone.equals(members.getMobilePhone())) {
				map.put("msg","该手机号已被注册");
				return map;
			}
		}
		String vCode=request.getParameter("code").trim();
		String password=request.getParameter("password");
		String password2=request.getParameter("password2");
		String invitationCode=request.getParameter("invitedcode");
		String qq=request.getParameter("qqnumber");
		if (password!=password2) {
			map.put("msg","两次密码不同，请重新输入");
		}
         request.getSession().getAttribute("send");
        // System.out.println(vCode);
		// System.out.println(request.getSession().getAttribute("send"));
		if (request.getSession().getAttribute("send")==null) {
			map.put("msg", "验证码已失效");
			return map;
		}
		if (!vCode.equals(request.getSession().getAttribute("send").toString().trim())){
			map.put("msg", "验证码输入错误");
			return map;
		}
		Members members=new Members(youname, youname, password, "", phone, 0, 0, "", new Date(), new Date(), "", "", 0,invitationCode, "", "", "", qq);
		loginService.addmember(members);
		MemberAccount memberAccount=new  MemberAccount(members, (float)0, (float)0, (float)0,new Date(), new Date(), (float)0, (float)0, 0, (float)0);
		subjectService.addMemberAccount(memberAccount);
		map.put("code",0);
		//System.out.println(request.getAttribute("send"));
		return map;
	}

	//退出
	@RequestMapping("logout") 
	public String logout(Map<String,Object> map,HttpServletRequest request){
		
		request.getSession().removeAttribute("members");

		return "redirect:/web/login";
	}
	
	//忘记密码
	@RequestMapping("forget") 
	public String forget(Map<String,Object> map,HttpServletRequest request){
		String phone=request.getParameter("mobilephone");
		map.put("phone",phone);
		return "front/forget";
	}
	
	@RequestMapping("forgetsuccess") 
	@ResponseBody
	public Map<String,Object> forgetsuccess(HttpServletRequest request){
		Map<String,Object> map=new HashMap<>();
		List<Members> mlist=loginService.getmembers();
		map.put("mlist", mlist);
		String phone=request.getParameter("mobilePhone");
	
		for (Members members : mlist) {
			
		}
		String password=request.getParameter("password");
		String password2=request.getParameter("password2");
		if (password2!=null&&password!=password2) {
			map.put("msg","两次密码不同，请重新输入");
			return map;
		}
		String code=request.getParameter("code");
		if (request.getSession().getAttribute("send")==null) {
			map.put("msg", "验证码已失效");
			return map;
		}
		if ("".equals(code)) {
			map.put("msg", "请填写验证码");
			return map;
		}
		if (!code.equals(request.getSession().getAttribute("send").toString().trim())){
			map.put("msg", "验证码输入错误");
			return map;
		}
		
		map.put("code",0);
		
		//通过手机号修改密码
		loginService.updatepwd(password, phone);
		
		return map;
	}
	
	
}
