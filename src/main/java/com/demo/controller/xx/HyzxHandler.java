package com.demo.controller.xx;

import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.demo.model.Finance_product_subscribe;
import com.demo.model.FinancialPlanner;
import com.demo.model.MemberAccount;
import com.demo.model.MemberBankcards;
import com.demo.model.MemberDepositRecord;
import com.demo.model.MemberWithdrawRecord;
import com.demo.model.Member_profit_record;
import com.demo.model.Members;
import com.demo.model.SubjectPurchaseRecord;
import com.demo.service.xx.MAccountService;

@Controller
@RequestMapping("hyzx")
public class HyzxHandler {
	
	@Autowired
	MAccountService mAccountService;
	/**
	 * 会员中心主页面
	 * @param request
	 * @param map
	 * @return
	 */
	@RequestMapping(value="logins",method=RequestMethod.GET)
	public String logins(HttpServletRequest request,Map<String, Object> map){
		Members members=(Members) request.getSession().getAttribute("members");
		map.put("members", members);
		MemberAccount memberAccount=mAccountService.findById(members);
		map.put("memberAccount", memberAccount);
		return "front/viplist";
	}
	/**
	 * 收益记录
	 * @param page
	 * @param mpr
	 * @param map
	 * @return
	 */
	@RequestMapping(value="{memberId}/shouyi")
	public String shouyi(@PathVariable(value="memberId") Integer memberId,Integer page,Map<String, Object> map) {
		if (page==null) {
			page=1;
		}
		Integer pagesize=6;
		Page<Member_profit_record> mPage=mAccountService.findAllMPR(page, pagesize,memberId);
		map.put("mPage", mPage);
		map.put("memberId",memberId);
		return "hyzx/shouyi";
	}
	/**
	 * 投资记录
	 * @param memberId
	 * @param page
	 * @param map
	 * @return
	 */
	@RequestMapping(value="{memberId}/tozi")
	public String tozi(@PathVariable(value="memberId") Integer memberId,Integer page,Integer page2,Map<String, Object> map) {
		if (page==null) {
			page=1;
		}
		Integer pagesize=6;
		Page<SubjectPurchaseRecord> sPage= mAccountService.findAllSPR(page, pagesize, memberId);
		map.put("sPage", sPage);
		
		if (page2==null) {
			page2=1;
		}
		Integer pagesize2=2;
		Page<Finance_product_subscribe> fPage=mAccountService.findAllFPS(page2, pagesize2, memberId);
		map.put("fPage", fPage);
		
		map.put("memberId",memberId);
		return "hyzx/tozi";
	}
	/**
	 * 充值记录
	 * @return
	 */
	@RequestMapping(value="{memberId}/chongzhi")
	public String chongzhi(@PathVariable(value="memberId") Integer memberId,Integer page,Map<String, Object> map) {
		if (page==null) {
			page=1;
		}
		Integer pagesize=6;
		Page<MemberDepositRecord> mPage=mAccountService.findAllMDR(page, pagesize, memberId);
		map.put("mPage", mPage);
		map.put("memberId",memberId);
		return "hyzx/chongzhi";
	}
	/**
	 * 提款记录
	 * @return
	 */
	@RequestMapping(value="{memberId}/tikuan")
	public String tikuan(@PathVariable(value="memberId") Integer memberId,Integer page,Map<String, Object> map) {
		if (page==null) {
			page=1;
		}
		Integer pagesize=6;
		Page<MemberWithdrawRecord> mPage=mAccountService.findAllMWR(page, pagesize, memberId);
		map.put("mPage", mPage);
		map.put("memberId",memberId);
		return "hyzx/tikuan";
	}
	/**
	 * 体验金记录
	 * @return
	 */
	@RequestMapping(value="{memberId}/tiyanjin")
	public String tiyanjin(@PathVariable(value="memberId") Integer memberId,Integer page,Map<String, Object> map) {
		
		return "hyzx/tiyanjin";
	}
	/**
	 * 安全信息
	 * @param memberId
	 * @param page
	 * @param map
	 * @return
	 */
	@RequestMapping(value="{memberId}/anquan")
	public String anquan(@PathVariable(value="memberId") Integer memberId,Map<String, Object> map) {
		Members members=mAccountService.findMember(memberId);
		
		List<MemberBankcards> mList=mAccountService.findMemberBank(members);
		if (mList.size()>0) {
			String cardNo=mList.get(0).getCardNo();
			String string1=cardNo.substring(0, 4);
			String string2=cardNo.substring(cardNo.length()-4, cardNo.length());
			mList.get(0).setCardNo(string1+"***"+string2);
			map.put("mb", mList.get(0));
		}
		
		
		if (members.getMemberIdentity()!=null&&!"".equals(members.getMemberIdentity())) {
			String identity=members.getMemberIdentity();
			String s1=identity.substring(0, 3);
			String s2=identity.substring(identity.length()-3, identity.length());
			members.setMemberIdentity(s1+"***"+s2);
		}
		if (members.getMobilePhone()!=null&&!"".equals(members.getMobilePhone())) {
			String phone=members.getMobilePhone();
			String ss=phone.substring(0,phone.length()-4);
			members.setMobilePhone(ss+"****");
		}
		map.put("members", members);
		
		return "hyzx/anquan";
	}
	//实名
	@RequestMapping(value="{memberId}/toshiming")
	public String toshiming(@PathVariable(value="memberId") Integer memberId,Map<String, Object> map) {
		map.put("memberId", memberId);
		return "hyzx/shiming";
	}
	@RequestMapping(value="{memberId}/shiming")
	public String name(@PathVariable(value="memberId") Integer memberId,String memberIdentity) {
		Members members=mAccountService.findMember(memberId);
		members.setMemberIdentity(memberIdentity);
		mAccountService.shiming(members);
		return "redirect:/hyzx/"+memberId+"/anquan";
	}
	//绑卡
	@RequestMapping(value="{memberId}/tobangka")
	public String tobangka(@PathVariable(value="memberId") Integer memberId,Map<String, Object> map) {
		Members members=mAccountService.findMember(memberId);
		map.put("members", members);
		map.put("memberId", memberId);
		return "hyzx/bangka";
	}
	@RequestMapping(value="{memberId}/bangka")
	public String bangka(@PathVariable(value="memberId") Integer memberId,MemberBankcards mBankcards,String username,String identity) {
		Members members=mAccountService.findMember(memberId);
		members.setMemberName(username);
		members.setMemberIdentity(identity);
		mAccountService.shiming(members);
		mBankcards.setDelflag(1);
		mBankcards.setMembers(members);
		mBankcards.setCreateDate(new Date());
		mAccountService.bangka(mBankcards);
		return "redirect:/hyzx/"+memberId+"/anquan";
	}
	//修改登录密码
	@RequestMapping(value="gaimima",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> gaimima(HttpServletRequest request,HttpSession session) {
		String ordpwd=request.getParameter("oriPwd");
		String newpwd=request.getParameter("newPwd");
		Members members=(Members) session.getAttribute("members");
		members.setPasswords(newpwd);
		Map<String, Object> map=new HashMap<>();
		try {
			mAccountService.shiming(members);
			map.put("code", 0);
		} catch (Exception e) {
			map.put("code", 1);
		}
		return map;
	}
	//到充值页面
	@RequestMapping(value="{memberId}/chong")
	public String  chong(@PathVariable(value="memberId") Integer memberId,Integer page,Map<String, Object> map) {
		Members members=mAccountService.findMember(memberId);
		List<MemberBankcards> mList=mAccountService.findMemberBank(members);
		if (mList.size()==0) {
			return "redirect:/hyzx/"+memberId+"/tobangka";
		}else{
			map.put("mb", mList.get(0));
			
			if (page==null) {
				page=1;
			}
			Integer pagesize=6;
			Page<MemberDepositRecord> mPage=mAccountService.findAllMDR(page, pagesize, memberId);
			map.put("mPage", mPage);
			map.put("memberId",memberId);
		}
		return "hyzx/chong";
	}
	//到提款页面
	@RequestMapping(value="{memberId}/ti")
	public String ti(@PathVariable(value="memberId") Integer memberId,Integer page,Map<String, Object> map) {
		Members members=mAccountService.findMember(memberId);
		List<MemberBankcards> mList=mAccountService.findMemberBank(members);
		if (mList.size()==0) {
			return "redirect:/hyzx/"+memberId+"/tobangka";
		}else{
			MemberAccount memberAccount=mAccountService.findById(members);
			map.put("memberAccount", memberAccount);
			map.put("mb", mList.get(0));
			
			if (page==null) {
				page=1;
			}
			Integer pagesize=6;
			Page<MemberWithdrawRecord> mPage=mAccountService.findAllMWR(page, pagesize, memberId);
			map.put("mPage", mPage);
			map.put("memberId",memberId);
		}
		return "hyzx/ti";
	}
	//充值记录
	@RequestMapping(value="{memberId}/tochong")
	public String tochong(@PathVariable(value="memberId") Integer memberId,Map<String, Object> map,MemberDepositRecord mDepositRecord) {
		SimpleDateFormat format=new SimpleDateFormat("yyyyMMddHHmmSSsss");
		mDepositRecord.setSerialNumber(format.format(new Date()));
		mDepositRecord.setMembers(mAccountService.findMember(memberId));
		mDepositRecord.setStatus(0);
		mDepositRecord.setCreateDate(new Date());
		mAccountService.saveMDR(mDepositRecord);
		map.put("serialNumber",mDepositRecord.getSerialNumber() );
		map.put("amount",mDepositRecord.getAmount() );
		map.put("subject","余额充值" );
		return "hyzx/alipay.trade.page.pay";
	}
	//充值记录加增加金额
	@RequestMapping(value="upchong")
	public String  upchong(String out_trade_no,String total_amount) {
		MemberDepositRecord mDepositRecord=mAccountService.findOne(out_trade_no);
		mDepositRecord.setStatus(1);
		mDepositRecord.setUpdateDate(new Date());
		mAccountService.saveMDR(mDepositRecord);
		
		MemberAccount mAccount=mAccountService.findById(mDepositRecord.getMembers());
		mAccount.setUseableBalance(mAccount.getUseableBalance()+mDepositRecord.getAmount());
		mAccountService.saveMAccout(mAccount);
		return "redirect:/hyzx/logins";
		
	}
	//提款判断密码余额
	@RequestMapping(value="{memberId}/toti")
	@ResponseBody
	public Map<String, Object> toti(@PathVariable(value="memberId") Integer memberId,Float amount,String pwd) {
		Map<String, Object> map=new HashMap<>();
		Members members=mAccountService.findMember(memberId);
		MemberAccount mAccount=mAccountService.findById(members);
		if (members.getWithdrawPassword().equals(pwd)) {
			if (amount>0) {
				if (mAccount.getUseableBalance()>=amount) {
					map.put("code", 0);
				}else {
					map.put("msg", "余额不足");
				}
			}else {
				map.put("msg", "金额格式不正确");
			}
		}else {
			map.put("msg", "提款密码错误");
		}
		return map;
	}
	//提款记录加减少余额
	@RequestMapping(value="{memberId}/totikuan")
	public String  totikuan(@PathVariable(value="memberId") Integer memberId,MemberWithdrawRecord mWithdrawRecord,Integer memberBankcardsId,Map<String, Object> map) {
		MemberBankcards mBankcards=mAccountService.findOneMb(memberBankcardsId);
		SimpleDateFormat format=new SimpleDateFormat("yyyyMMddHHmmSSsss");
		mWithdrawRecord.setSerialNumber(format.format(new Date()));
		mWithdrawRecord.setMembers(mAccountService.findMember(memberId));
		mWithdrawRecord.setBankName(mBankcards.getMemberBankcardsType());
		mWithdrawRecord.setBankCard(mBankcards.getCardNo());
		mWithdrawRecord.setStatus(1);
		mWithdrawRecord.setCardaddress(mBankcards.getCardaddress());
		mWithdrawRecord.setCreateDate(new Date());
		mAccountService.saveMWR(mWithdrawRecord);
		
		MemberAccount mAccount=mAccountService.findById(mAccountService.findMember(memberId));
		mAccount.setUseableBalance(mAccount.getUseableBalance()-mWithdrawRecord.getAmount());
		mAccountService.saveMAccout(mAccount);
		
		
		
		map.put("memberAccount", mAccount);
		map.put("mb", mBankcards);
		
		Integer page=1;
		Integer pagesize=6;
		Page<MemberWithdrawRecord> mPage=mAccountService.findAllMWR(page, pagesize, memberId);
		map.put("mPage", mPage);
		map.put("memberId",memberId);
		
		return "hyzx/ti";
		
	}
	//到理财师页面
	@RequestMapping(value="{memberId}/licaishi")
	public String licaishi(@PathVariable(value="memberId") Integer memberId,Map<String, Object> map) {
		FinancialPlanner fPlanner=mAccountService.findfPlanner(memberId);
		map.put("fPlanner", fPlanner);
		map.put("memberId", memberId);
		return "hyzx/licaishi";
	}
	//理财师审核
	@RequestMapping(value="{memberId}/renzhen")
	public String  renzhen(@PathVariable(value="memberId") Integer memberId,FinancialPlanner fPlanner,@RequestParam MultipartFile ufile,HttpServletRequest request) {
		String fileName=ufile.getOriginalFilename();
		InputStream is=null;
		try {
			is=ufile.getInputStream();
			String path=request.getRealPath("upload");
			File file=new File(path+"//"+fileName);
			FileUtils.copyInputStreamToFile(is, file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		fPlanner.setMycard(fileName);
		fPlanner.setStatus(1);
		fPlanner.setCreateDate(new Date());
		mAccountService.savefPlanner(fPlanner);
		return "redirect:/hyzx/"+memberId+"/licaishi";
	}
}