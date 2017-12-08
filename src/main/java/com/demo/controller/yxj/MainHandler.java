package com.demo.controller.yxj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("first")
public class MainHandler {

	@RequestMapping("firstlist")
	public String firstlist(){
		return "front/firstiframe";
	}
}
