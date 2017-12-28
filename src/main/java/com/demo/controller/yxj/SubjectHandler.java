package com.demo.controller.yxj;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.MemberAccount;
import com.demo.model.MemberBankcards;
import com.demo.model.MemberTradeRecord;
import com.demo.model.Members;
import com.demo.model.Subject;
import com.demo.model.SubjectOrderRecord;
import com.demo.model.SubjectPurchaseRecord;
import com.demo.service.yxj.SubjectService;

@Controller
@RequestMapping("subject")
public class SubjectHandler {

	@Autowired
	SubjectService subjectService;
	
	@RequestMapping("init")
	public String init(HttpServletRequest request,Map<String,Object> map){
		Members members=(Members) request.getSession().getAttribute("members");
		map.put("members", members);
		return "front/main";
	}

	//固收类理财
	@RequestMapping("subindex")
	public String findsublist(Map<String,Object> map,HttpServletRequest request,Integer page){
		Subject subject=new Subject();
		//System.out.println("==============================");
		if (page==null) {
			page=1;
		}
		Integer size=2;
		Members members=(Members) request.getSession().getAttribute("members");
		map.put("members", members);
				//List<Object[]> sublist=subjectService.findsubindex(subject,page,size);
				//map.put("sublist", sublist);
				
				
		return "front/subjectlist";
	}

	@RequestMapping("like/{subjectType}/{year_rate}/{period}/{status}")
	public String like(Map<String,Object> map, Integer  page,@PathVariable("subjectType")Integer subjectType,@PathVariable("year_rate")Float year_rate,
			@PathVariable("period")Integer period,@PathVariable("status")Integer status
			){
		//System.out.println("今年我不要再喜欢裴尚轩");
		if (subjectType==null)subjectType=10;
		if (year_rate==null) year_rate=(float) -1;
		if(period==null)period=-1;
		if(status==null)status=-1; 
		Subject subject=new Subject(subjectType,status,period,year_rate);
		if (page==null) {
			page=1;
		}
		map.put("page", page);
		Integer size=2;
		Integer count=subjectService.getcount();
		Integer pages=count%size==0?count/size:count/size+1;
		map.put("pages", pages);
		List<Object[]> sublist=subjectService.findsubindex(subject, page,size);
		//Page page1 =subjectService.findpageall(size, page,subject);
//		System.out.println("当前页"+page1.getNumber());
//		System.out.println("总页数"+page1.getTotalPages());
//		System.out.println("结果集"+page1.getContent());
		//map.put("page1", page1);
		map.put("subjectType", subjectType);
		map.put("year_rate", year_rate);
		map.put("period", period);
     	map.put("status", status);
		//List<Object[]> sublist=subjectService.findsubindex();
		map.put("sublist", sublist);
		
		return "front/subjectindex";
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

	//固收类理财购买>>在界面上先判断是否登录，登录后才可购买，购买时要先判断是否绑卡，如果没绑卡要先绑定银行卡，跳到会员中心页面，
	//判断可用余额与购买金额大小，如果余额不足，需要充值，到会员中心，调用支付宝接口进行充值
	@RequestMapping("purchase/{subjectId}")
	public String purchase(Map<String,Object> map,@PathVariable Integer subjectId,HttpServletRequest request){
		//System.out.println("再见面时，谈笑风生不动情");
		Subject subject=subjectService.getByid(subjectId);
		map.put("subject",subject);
		Members members=(Members) request.getSession().getAttribute("members");
		map.put("members", members);
		Object[] goumai=subjectService.goshugoumai(subjectId);
		map.put("goumai",goumai);
		//System.out.println(goumai[12]);
		//得到会员ID
//		;Integer member_id=members.getMemberId();
//		System.out.println(member_id)
		//通过会员ID查询用户资金信息
		if (members!=null) {
			MemberAccount memberaccount=subjectService.selectmoney(members.getMemberId());	
			map.put("memberaccount",memberaccount);
		}
		
	//	System.out.println(memberaccount.getInvestAmount());
		//存入作用域，供页面取值
		
//		List<Object[]> sublist=subjectService.findsubindex();
//		map.put("sublist", sublist);
		return "front/subjectcontent";
	}
	
	
	@RequestMapping("buy/{subjectId}")
	
	public String buy(Map<String,Object> map,HttpServletRequest request,HttpServletResponse reponse,@PathVariable Integer subjectId){
		
		MemberBankcards memberBankcards=(MemberBankcards) request.getSession().getAttribute("memberBankcards");
		Integer amount=Integer.parseInt(request.getParameter("totalFee"));
		Subject subject=subjectService.getByid(subjectId);
		
		map.put("subject",subject);
		Members members=(Members) request.getSession().getAttribute("members");
		
		
		//MemberBankcards memberBankcards=subjectService.findbankcard(members.getMemberId());
		//map.put("memberBankcards",memberBankcards);
		
		SubjectOrderRecord subjectOrderRecord=new SubjectOrderRecord(subject.getSerialNumber(), subject.getSubjectType(),Float.parseFloat(amount.toString()) , subject.getStatus(), subjectId, members.getMemberId(), subject.getDelflag(), new Date(),  new Date());
	//	subjectService.add(subjectOrderRecord);
		map.put("subjectOrderRecord",subjectOrderRecord);
		//System.out.println("三里清风三里路，步步风里步步你");
		//System.out.println(members.getMemberId());
		
		//System.out.println(memberBankcards);
		//System.out.println("谈笑风生不动情");
		map.put("members", members);
		String stime=getDateFormat();
		map.put("stime",stime);
		//System.out.println(getDateFormat());
		return "front/order";
	}
	
	//确认购买》》添加一条订单到订单表（subject_order_record），购买记录表(subject_purchase_record)添加一条购买记录，已购金额要增加
	//用户资金表(member_account)冻结资金增加，余额减少
	//添加数据到交易表
	@RequestMapping("orderensure/{dealIp}")
	public String successbuy(Map<String,Object> map,HttpServletRequest request,@PathVariable String dealIp,Float amount){
//		String amount=request.getParameter("amount");
	    Integer subjectIds=Integer.parseInt(request.getParameter("subjectId"));
		//System.out.println(subjectIds);
		Subject subject=subjectService.getByid(subjectIds);
		map.put("subject",subject);
		Members members=(Members) request.getSession().getAttribute("members");
		map.put("members", members);
		SubjectOrderRecord subjectOrderRecord=new SubjectOrderRecord(subject.getSerialNumber(), subject.getSubjectType(),amount, subject.getStatus(), subjectIds, members.getMemberId(), subject.getDelflag(), new Date(),  new Date());
		//添加订单到订单表
		subjectService.add(subjectOrderRecord);
		map.put("subjectOrderRecord",subjectOrderRecord);
		SubjectPurchaseRecord subjectPurchaseRecord=new SubjectPurchaseRecord(subject.getSerialNumber(), amount, dealIp, subject, members, subject.getDelflag(), new Date(), new Date(), amount*subject.getYearRate()/365*subject.getPeriod(), 1, subject.getPeriod(), 0, "", "0");
		subjectService.insertpurchase(subjectPurchaseRecord);
		
		MemberTradeRecord memberTradeRecord=new MemberTradeRecord(members, dealIp, subject.getSubjectName(), "", amount, subject.getSubjectType().toString(), 0, 0, "", "", "", new Date(), new Date());
		//添加到交易记录表
		subjectService.addMemberTradeRecord(memberTradeRecord);
		//System.out.println(amount*subject.getYearRate()/365*subject.getPeriod());
//		System.out.println(Float.parseFloat(amount));
		//System.out.println(amount);
		//购买记录表中添加一条购买记录
		//SubjectPurchaseRecord subjectPurchaseRecord1=new SubjectPurchaseRecord(subject.getSerialNumber(),amount, dealIp,subject, members, subject.getDelflag(), new Date(), new Date(),(amount*subject.getYearRate()/365*subject.getPeriod()), 1, subject.getPeriod(), 0,"","0");
		
		
		//修改用户资金，可用余额减少，冻结资金增加，投资金额增加
		//System.out.println(Integer.parseInt(amount));
		
		subjectService.updatememberaccount(amount, members.getMemberId());
		//System.out.println(amount);
		//System.out.println( members.getMemberId());
	
		return "redirect:/subject/purchase/"+subject.getSubjectId();
	}
	
		//订单时间
		@InitBinder    
	    public void initBinder(WebDataBinder binder) {    
	        binder.registerCustomEditor(Date.class, 
	        		new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));    
	    }
		
		//订单编号
		public String getDateFormat(){
			SimpleDateFormat sim = new SimpleDateFormat("yyyyMMddHHmmSSSSSS");
			return sim.format(new Date());
		}
		

		
//
//		public Integer getday(Date cdate){
//			Long day=new Date().getTime();
//			Long cday=cdate.getTime();
//			Long tday=(day-cday)/(1000/60/60/24);
//			return Integer.parseInt(tday.toString());
//		}

}
