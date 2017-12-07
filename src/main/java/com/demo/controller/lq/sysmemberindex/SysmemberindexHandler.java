package com.demo.controller.lq.sysmemberindex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sysmember")
public class SysmemberindexHandler {
	
	@RequestMapping("index")
	public String sysindex(){
		
		return "/Backstage/sysmember/sysmemberindex";
	}
}
