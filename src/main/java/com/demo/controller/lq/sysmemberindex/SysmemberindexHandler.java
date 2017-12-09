package com.demo.controller.lq.sysmemberindex;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.FinancialPlanner;
import com.demo.model.MemberAccount;
import com.demo.model.MemberDepositRecord;
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
	@RequestMapping("memberInfo")
	public String memberInfo(Integer memberId,Map<String,Object> map){
		Members members = membersService.membersInfo(memberId);
		MemberAccount memberAccount = membersService.meberAccount(memberId);
		FinancialPlanner financialPlanner = membersService.financialPlanner(memberId);
		List<MemberDepositRecord> memberDepositRecord = membersService.memberDepositRecord(memberId);
		map.put("m", members);
		map.put("ma", memberAccount);
		map.put("fp", financialPlanner);
		map.put("md", memberDepositRecord);
		return "/Backstage/sysmember/MemberInfo";
	}
	
}
