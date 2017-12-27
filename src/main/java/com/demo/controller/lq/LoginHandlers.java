package com.demo.controller.lq;

import java.util.HashMap;
import java.util.List;
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
		Integer rand=1234;//loginService.dxjk(mobilePhone);
		session.setAttribute("rands", rand);
		session.setMaxInactiveInterval(10);
		return map;
	}
	
	@RequestMapping("logins")
	@ResponseBody   //返回json格式（字符串）
	public Map<String,Object> toIndex(HttpServletRequest request,HttpSession session){
		Map<String,Object> map = new HashMap<>();  
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		String mobilePhone=request.getParameter("mobilePhone");
		String rand=request.getParameter("rand");//输入的验证码
		String rands=null;//随机生成的
		if (session.getAttribute("rands")==null) {
			map.put("msg","验证码失效！");
		}else {
			rands=session.getAttribute("rands").toString();
		}
		List<Object[]> o= loginService.login(userName);
			if(o.size()==0) {
				map.put("msg","用户名错误！");
			}else{
				if (!o.get(0)[3].equals(password)){
					map.put("msg","密码错误！");
				}
				if (!o.get(0)[5].equals(mobilePhone)){
					map.put("msg","手机号错误！");
				} 
			}
			if(rands!=null&&!rand.equals(rands)){
				map.put("msg","验证码错误！");
			}
			if(rands!=null) {
				if(rand.equals(rands)){
					Integer identity = Integer.parseInt(o.get(0)[8].toString());
					session.setAttribute("identity",identity);
					session.setAttribute("name",o.get(0)[1]);
				}
			}
			if (o.get(0)[3].equals(password)&&o.get(0)[5].equals(mobilePhone)&&rand.equals(rands)) {
				map.put("code",0);
			}
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
 