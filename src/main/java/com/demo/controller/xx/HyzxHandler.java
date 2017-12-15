package com.demo.controller.xx;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.MemberAccount;
import com.demo.model.Member_profit_record;
import com.demo.model.Members;
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
		MemberAccount memberAccount=mAccountService.findById(members.getMemberId());
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
	@RequestMapping(value="shouyi",method=RequestMethod.GET)
	public String shouyi(Integer page,Map<String, Object> map) {
//		if (page==null) {
//			page=1;
//		}
//		Integer pagesize=10;
//		Page<Member_profit_record> mPage=mAccountService.findAllMPR(page, pagesize);
//		map.put("mPage", mPage);
		
		return "shouyi";
	}
}
