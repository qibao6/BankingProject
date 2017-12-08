package com.demo.controller.yxj;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.service.yxj.SubjectService;

@Controller
@RequestMapping("subject")
public class SubjectHandler {

	@Autowired
	SubjectService subjectService;

	//固收类理财
	@RequestMapping("subindex")
	public String findsublist(Map<String,Object> map){
		System.out.println("==============================");
//				List<Object[]> sublist=subjectService.findsubindex();
//				map.put("sublist", sublist);
		return "front/subjectlist";
	}

	

	//海外配置
	@RequestMapping("oversea")
	public String showoversea(){

		return "front/oversea";
	}

	//股权基金
	@RequestMapping("finance")
	public String showfinance(){

		return "front/finance";
	}

	//固收类理财购买
	@RequestMapping("purchase")
	public String purchase(){

		return "front/subjectcontent";
	}

}
