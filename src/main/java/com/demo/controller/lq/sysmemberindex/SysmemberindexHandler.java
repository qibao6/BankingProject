package com.demo.controller.lq.sysmemberindex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.FinancialPlanner;
import com.demo.model.MemberAccount;
import com.demo.model.MemberBankcards;
import com.demo.model.MemberDepositRecord;
import com.demo.model.Member_profit_record;
import com.demo.model.Members;
import com.demo.model.Subject;
import com.demo.model.SubjectPurchaseRecord;
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
	public String memberInfo(Integer page,Integer page1,Integer page2,Integer memberId,Map<String,Object> map){
		Members members = membersService.membersInfo(memberId);
		MemberAccount memberAccount = membersService.meberAccount(memberId);
		FinancialPlanner financialPlanner = membersService.financialPlanner(memberId);
		if(page==null){
			page=1;
		}
		if(page1==null){
			page1=1;
		}
		if(page2==null){
			page2=1;
		}
		Integer size=5;
		//充值记录
		Page memberDepositRecord = membersService.memberDepositRecord(memberId, page, size);
		//钱包记录
		Page memberTradeRecords =membersService.memberTradeRecord(memberId, page1, size);
		//提现记录
		Page memberWithdrawRecord=membersService.memberWithdrawRecord(memberId, page2, size);
		map.put("m", members);
		map.put("ma", memberAccount);
		map.put("fp", financialPlanner);
		map.put("md", memberDepositRecord);
		map.put("tr", memberTradeRecords);
		map.put("wr",memberWithdrawRecord);
		return "/Backstage/sysmember/MemberInfo";
	}
	
	@RequestMapping("financia")
	public String financia(Integer page,FinancialPlanner financialPlanner,Map<String,Object> map){
		if(page==null){
			page=1;
		}
		Integer size=10;
		Page<FinancialPlanner> fplist = membersService.fplist(page, size,financialPlanner);
		map.put("fplist", fplist);
		map.put("financialPlanner",financialPlanner);
		return "/Backstage/sysmember/financia";
	}
	@RequestMapping("financiaAudit")
	public String financiaAudit(Integer financialPlannerId,Map<String,Object> map){
		Integer status = 0;
		membersService.updateStatus(status,financialPlannerId);
		return "redirect:/sysmember/financia";
	}
	@RequestMapping("dahua")
	public String dahua(Integer page,MemberBankcards memberBankcards,Map<String,Object> map){
		if(page==null){
			page=1;
		}
		Integer size=10;
		Page<MemberBankcards> mblist = membersService.memberBankcards(page, size, memberBankcards);
		map.put("mb", mblist);
		map.put("mbk", memberBankcards);
		return "/Backstage/sysmember/dahua";
	}
	
	@RequestMapping("rechargeManage")
	public String rechargeManage(Integer page,MemberDepositRecord memberDepositRecord,Map<String,Object> map){
		if(page==null){
			page=1;
		}
		Integer size=3;
		Page<MemberDepositRecord> listd = membersService.findAllMDR(page, size, memberDepositRecord);
		map.put("listd", listd);
		map.put("mdr", memberDepositRecord);
		return "/Backstage/sysmember/rechargeManage";
	}
	
	@RequestMapping("unBankCard")
	public String unBankCard(Integer memberBankcardsId){
		Integer delflag = 1;
		membersService.updateDelflag(delflag, memberBankcardsId);
		return "redirect:/sysmember/dahua";
	}

	@RequestMapping("inviteRewards")
	public String inviteRewards(Integer page, String memberName, String mobilePhone,String invitationcode, String invitedcode ,Map<String,Object> map){
		if(page==null){
			page=1;
		}
		Integer size=3;
		Integer count =loginservice.getCount(memberName, mobilePhone,invitationcode, invitedcode);
		Integer pages = count%size==0?count/size:count/size+1;
		List<Object[]> olist= loginservice.inviteRewardsAll(page, size, memberName, mobilePhone, invitationcode, invitedcode);
		map.put("olist", olist);
		map.put("memberName", memberName);
		map.put("mobilePhone", mobilePhone);
		map.put("invitationcode", invitationcode);
		map.put("invitedcode", invitedcode);
		map.put("pages", pages);
		map.put("page", page);
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
	public String payment(Subject sub,Map<String,Object> map){
		List<Object[]> flist =loginservice.flist(sub);
		map.put("flist", flist);
		map.put("sub", sub);
		return "Backstage/sysmember/payment";
	}
	@RequestMapping("paymentBbinContent")
	public String paymentBbinContent(Integer subjectId,Integer page,Map<String,Object> map){
		Object[] su= loginservice.sub(subjectId);
		if(page==null){
			page=1;
		}
		Integer size=2;
		Integer count = loginservice.getCount(subjectId);
		Integer pages = count%size==0?count/size:count/size+1;
		List<Object[]> list = loginservice.fxjAll(subjectId, page, size);
		map.put("su", su);
		map.put("list",list);
		map.put("subjectId", subjectId);
		map.put("pages", pages);
		map.put("page", page);
		return "Backstage/sysmember/paymentBninContent";
	}
	@RequestMapping("paymentContent")
	public String paymentContent(Integer page,Integer subjectId,Map<String,Object> map){
		if(page==null){
			page=1;
		}
		Integer size=2;
		Integer count = loginservice.getCount();
		Integer pages = count%size==0?count/size:count/size+1;
		Object[] su= loginservice.sub(subjectId);
		List<Object[]> list = loginservice.fxAll(subjectId,page,size);
		map.put("su", su);
		map.put("list", list);
		map.put("pages", pages);
		map.put("page",page);
		map.put("subjectId", subjectId);
		return "Backstage/sysmember/paymentContent";
	}
	@RequestMapping("WithdrawManage")
	public String WithdrawManage(Integer page,SubjectPurchaseRecord subjectPurchaseRecord,Map<String,Object> map){
		if(page==null){
			page=1;
		}
		Integer size=5;
		Page list= membersService.txAll(page, size, subjectPurchaseRecord);
		map.put("list",list);
		map.put("subjectPurchaseRecord",subjectPurchaseRecord);
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
	@RequestMapping("editSubject/{sprid}/{flag}")
	public @ResponseBody Map<String, String> editSubject(@PathVariable("sprid") Integer sprid,@PathVariable("flag") String flag){
		Map<String, String> map = new HashMap<String, String>();
		String code = "";
			//根据ID查询当前的这条购买记录
			SubjectPurchaseRecord  spr = membersService.selectAllSPR(sprid);
			//购买金额
			Float amount = spr.getAmount();
			//利息
			Float lx = null;
			//计算收益
			Subject subject = spr.getSubject();
			
			Integer day = this.getDay(spr.getCreateDate());
			lx = spr.getAmount()*subject.getYearRate()/365*day;
		try{
			if(flag.equals("sh")){
				//得到收益后首先修改SUBJECT_PURCHASE_RECORD表中的interest(利息)，然后往MEMBER_PROFIT_RECORD中保存一条记录
				String sStatus="2";
				membersService.updateInterest(lx, sStatus,sprid);
				//时间搓
				SimpleDateFormat sim = new SimpleDateFormat("yyyyMMddHHmmSSSSSS");
				String lsh = sim.format(new Date());
				//赋值添加
				Member_profit_record mpr = new Member_profit_record();
				mpr.setSerialNumber(lsh);
				mpr.setAmount(lx);
				mpr.setMemberId(spr.getMembers());
				mpr.setCreateDate(new Date());
				mpr.setMprComment(spr.getSubject().getSubjectName()+"收益");
				mpr.setPurchaseId(spr.getSubject().getSubjectId());
				mpr.setProfitDay(spr.getPayInterestTimes());
				//保存记录
				membersService.saveMPR(mpr);
			}
			if(flag.equals("jd")){
				Integer memberId = spr.getMembers().getMemberId();
				//根据memberid去修改MEMBER_ACCOUNT里的imuseale_balance（冻结资金）
				loginservice.updateJd(amount, memberId);
				String sStatus="3";
				membersService.updateInterest(lx, sStatus,sprid);
			}
			if(flag.equals("dk")){
				Integer memberId = spr.getMembers().getMemberId();
				Float sy= amount+lx;
				System.out.println(sy);
				//根据memberid去修改MEMBER_ACCOUNT里的useable_balance
				loginservice.updatedk(sy, memberId);
				String sStatus="4";
				membersService.updateInterest(lx, sStatus,sprid);
			}
			code="success";
			
		}catch(Exception e){
			code="error";
		}
		map.put("code", code);
		return map;
	}
	private Integer getDay(Date cdate){
		Long day = new Date().getTime();
		Long cday = cdate.getTime();
		Long d = (day-cday)/(1000*60*60*24);
		return Integer.parseInt(d.toString());
		
	}
	
	@InitBinder    
    public void initBinder(WebDataBinder binder) {    
        binder.registerCustomEditor(Date.class, 
        		new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));    
    }

	
}
  