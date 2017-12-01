package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("a")
public class AAHandled {
	
	@RequestMapping("a1")
	public String aa(){
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		return null;
	}
}
