package com.demo.controller.xx;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.MemberAccount;
import com.demo.model.Members;
import com.demo.service.xx.MAccountService;

@Controller
@RequestMapping("hyzx")
public class HyzxHandler {
	
	@Autowired
	MAccountService mAccountService;
	@RequestMapping(value="logins",method=RequestMethod.GET)
	public String logins(HttpServletRequest request,Map<String, Object> map){
		Members members=(Members) request.getSession().getAttribute("members");
		map.put("members", members);
		MemberAccount memberAccount=mAccountService.findById(members.getMemberId());
		map.put("memberAccount", memberAccount);
		return "front/viplist";
	}
	
//	@RequestMapping(value="main",method=RequestMethod.GET)
//	public String huiyuan(HttpServletRequest request,Map<String, Object> map) {
//		Members members=(Members) request.getSession().getAttribute("members");
//		map.put("members", members);
//		System.out.println(members.getNames());
//		return null;
//		
//	}
}
