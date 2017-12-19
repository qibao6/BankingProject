package com.demo.controller.lq.sysmemberindex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.FinancialPlanner;
import com.demo.model.MemberAccount;
import com.demo.model.MemberBankcards;
import com.demo.model.MemberDepositRecord;
import com.demo.model.MemberTradeRecord;
import com.demo.model.MemberWithdrawRecord;
import com.demo.model.Members;
import com.demo.service.lq.LoginService;
import com.demo.service.lq.MembersService;

@Controller
@RequestMapping("sysmember")
public class SysmemberindexHandler {
	
	@Autowired
	MembersService membersService;
	
	@Autowired
	LoginService loginservice;
	
	@RequestMapping("index")
	public String sysindex(Integer page,Members members,Map<String,Object> map){
		if(page==null){
			page=1;
		}
		Integer size=10;
		
		Page pagemembers=membersService.findMembers(page, size, members);
		
		/*System.out.println("当前页数："+pagemembers.getNumber());
		System.out.println("总页数："+pagemembers.getTotalPages());
		System.out.println("当前页的结果集："+pagemembers.getContent());*/
		
		map.put("pagemembers", pagemembers);
		map.put("members", members);
		return "/Backstage/sysmember/sysmemberindex";
	}
	@RequestMapping("memberInfo")
	public String memberInfo(Integer page,Integer memberId,Map<String,Object> map){
		Members members = membersService.membersInfo(memberId);
		MemberAccount memberAccount = membersService.meberAccount(memberId);
		FinancialPlanner financialPlanner = membersService.financialPlanner(memberId);
		if(page==null){
			page=1;
		}
		Integer size=2;
		//充值记录
		Page memberDepositRecord = membersService.memberDepositRecord(memberId, page, size);
		//钱包记录
		Page memberTradeRecords =membersService.memberTradeRecord(memberId, page, size);
		//提现记录
		Page memberWithdrawRecord=membersService.memberWithdrawRecord(memberId, page, size);
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

	@RequestMapping("inviteRewards")
	public String inviteRewards(Map<String,Object> map){
		List<Object[]> olist= loginservice.inviteRewardsAll();
		map.put("olist", olist);
		return "/Backstage/sysmember/inviteRewards";
	}
	@RequestMapping("awards")
	public String awards(Integer awardRecordsId,Integer memberAccountId,Float amount){
		Integer isaward =1;
		membersService.updateIsaward(isaward,awardRecordsId);
		membersService.updateUseableBalance(amount,memberAccountId);
		return "redirect:/sysmember/inviteRewards";
	}
	@RequestMapping("inviteRewardsRecord")
	public String inviteRewardsRecord(Integer awardRecordsId,Map<String,Object> map){
		Object[] m= loginservice.obj(awardRecordsId);
		List<Object[]> olist =loginservice.olist(awardRecordsId);
		map.put("m", m);
		map.put("olist", olist);
		return "Backstage/sysmember/inviteRewardsRecord";
	}
	@RequestMapping("payment")
	public String payment(Map<String,Object> map){
		List<Object[]> flist =loginservice.flist();
		map.put("flist", flist);
		return "Backstage/sysmember/payment";
	}
	@RequestMapping("paymentBbinContent")
	public String paymentBbinContent(Integer subjectId,Map<String,Object> map){
		Object[] su= loginservice.sub(subjectId);
		List<Object[]> list = loginservice.fxjAll(subjectId);
		map.put("su", su);
		map.put("list",list);
		return "Backstage/sysmember/paymentBninContent";
	}
	@RequestMapping("paymentContent")
	public String paymentContent(Integer subjectId,Map<String,Object> map){
		Object[] su= loginservice.sub(subjectId);
		List<Object[]> list = loginservice.fxAll(subjectId);
		map.put("su", su);
		map.put("list", list);
		return "Backstage/sysmember/paymentContent";
	}
	@RequestMapping("WithdrawManage")
	public String WithdrawManage(Map<String,Object> map){
		List<Object[]> list = loginservice.txAll();
		map.put("list", list);
		return "Backstage/sysmember/withdrawManage";
	}
	@RequestMapping("selectMemberId")
	public String selectMemberId(Integer page,String mobilePhone,Map<String,Object> map){
		Integer memberId = loginservice.m(mobilePhone);
 		Members members = membersService.membersInfo(memberId);
		MemberAccount memberAccount = membersService.meberAccount(memberId);
		FinancialPlanner financialPlanner = membersService.financialPlanner(memberId);
		if(page==null){
			page=1;
		}
		Integer size=2;
		//充值记录
		Page memberDepositRecord = membersService.memberDepositRecord(memberId, page, size);
		//钱包记录
		Page memberTradeRecords =membersService.memberTradeRecord(memberId, page, size);
		//提现记录
		Page memberWithdrawRecord=membersService.memberWithdrawRecord(memberId, page, size);
		map.put("m", members);
		map.put("ma", memberAccount);
		map.put("fp", financialPlanner);
		map.put("md", memberDepositRecord);
		map.put("tr", memberTradeRecords);
		map.put("wr",memberWithdrawRecord);
		return "Backstage/sysmember/MemberInfo";
	}
	
	
	
	@InitBinder    
    public void initBinder(WebDataBinder binder) {    
        binder.registerCustomEditor(Date.class, 
        		new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));    
    }

	
}
  