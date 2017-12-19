package com.demo.controller.xx;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.Finance_product_subscribe;
import com.demo.model.MemberAccount;
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
		System.out.println(members.getMemberId());
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
}
