package com.demo.controller.lq;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginHandler {
	
	@RequestMapping("/login")
	public String login(){
		return "/Backstage/BackStagelogin";
	}
}
