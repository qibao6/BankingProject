package com.demo.controller.lq.sysmemberindex;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.FinancialPlanner;
import com.demo.model.MemberAccount;
import com.demo.model.MemberBankcards;
import com.demo.model.MemberDepositRecord;
import com.demo.model.MemberTradeRecord;
import com.demo.model.MemberWithdrawRecord;
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
		List<MemberTradeRecord> memberTradeRecords =membersService.memberTradeRecord(memberId);
		List<MemberWithdrawRecord> memberWithdrawRecord=membersService.memberWithdrawRecord(memberId);
		map.put("m", members);
		map.put("ma", memberAccount);
		map.put("fp", financialPlanner);
		map.put("md", memberDepositRecord);
		map.put("tr", memberTradeRecords);
		map.put("wr",memberWithdrawRecord);
		return "/Backstage/sysmember/MemberInfo";
	}
	
	@RequestMapping("financia")
	public String financia(Map<String,Object> map){
		List<FinancialPlanner> fplist = membersService.fplist();
		map.put("fplist", fplist);
		return "/Backstage/sysmember/financia";
	}
	@RequestMapping("financiaAudit")
	public String financiaAudit(Integer financialPlannerId,Map<String,Object> map){
		Integer status = 0;
		membersService.updateStatus(status,financialPlannerId);
		return "redirect:/sysmember/financia";
	}
	@RequestMapping("dahua")
	public String dahua(Map<String,Object> map){
		List<MemberBankcards> mblist = membersService.memberBankcards();
		map.put("mb", mblist);
		return "/Backstage/sysmember/dahua";
	}
	
	@RequestMapping("rechargeManage")
	public String rechargeManage(Map<String,Object> map){
		List<MemberDepositRecord> listd = membersService.findAllMDR();
		map.put("listd", listd);
		return "/Backstage/sysmember/rechargeManage";
	}
	
	@RequestMapping("unBankCard")
	public String unBankCard(Integer memberBankcardsId){
		Integer delflag = 1;
		membersService.updateDelflag(delflag, memberBankcardsId);
		return "redirect:/sysmember/dahua";
	}
	
}
