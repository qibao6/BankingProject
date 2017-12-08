package com.demo.controller.lq.sysmemberindex;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Members;
import com.demo.service.lq.MembersService;

@Controller
@RequestMapping("sysmember")
public class SysmemberindexHandler {
	
	@Autowired
	MembersService membersService;
	
	@RequestMapping("index")
	public String sysindex(Map<String,Object> map){
		List<Members> mlist= membersService.findMembers();
		map.put("mlist", mlist);
		return "/Backstage/sysmember/sysmemberindex";
	}
}
