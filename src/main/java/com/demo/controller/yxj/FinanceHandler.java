package com.demo.controller.yxj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("finance")
public class FinanceHandler {

	//私募基金，股权基金显示
	@RequestMapping("financelist")
	public String financelist(){

		return "front/finance";
	}

	//私募基金，股权基金购买显示
	@RequestMapping("financeview")
	public String financeview(){

		return "front/Financeview";
	}
}
