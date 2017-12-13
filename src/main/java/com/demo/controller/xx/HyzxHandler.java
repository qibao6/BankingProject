package com.demo.controller.xx;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.Members;

@Controller
@RequestMapping("hyzx")
public class HyzxHandler {
	
	@RequestMapping(value="logins",method=RequestMethod.GET)
	public String logins(HttpServletRequest request,Map<String, Object> map){
		Members members=(Members) request.getSession().getAttribute("members");
		map.put("members", members);
		System.out.println(members.getMobilePhone());
		return "front/viplist";
	}
	
}
