package com.demo.controller.yxj;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.service.yxj.Subjectservice;

@Controller
@RequestMapping("subject")
public class SubjectHandler {

	@Autowired
	Subjectservice subjectservice;
	@RequestMapping("subindex")
	public String findsublist(Map<String,Object> map){
		System.out.println("==============================");
		List<Object[]> sublist=subjectservice.findsubindex();
		map.put("sublist", sublist);
		return "subjectlist";
	}
}
