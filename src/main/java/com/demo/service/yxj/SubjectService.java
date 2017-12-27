package com.demo.service.yxj;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;

import com.demo.model.MemberAccount;
import com.demo.model.MemberTradeRecord;
import com.demo.model.Subject;
import com.demo.model.SubjectOrderRecord;
import com.demo.model.SubjectPurchaseRecord;

public interface SubjectService {
	
	//显示产品列表
	public List<Object[]> findsubindex(Subject subject, Integer page, Integer rowsize);
	
	//添加数据到订单表
	public void add(SubjectOrderRecord subjectOrderRecord);
	
	//添加数据到购买记录表
	public void insertpurchase(SubjectPurchaseRecord subjectPurchaseRecord);
	
	//查询memberaccount余额
	public MemberAccount selectmoney(Integer member_id);
	
	//分页模糊查询
	public Page findpageall(Integer size,Integer page,Subject subject);
	
	
	public Subject getByid(Integer subjectId);
	
	//修改用户资金
	public void updatememberaccount(Float amount,Integer memberId);

	//List<Object[]> findsubindex1();
	//添加记录到交易记录表
	public void addMemberTradeRecord(MemberTradeRecord memberTradeRecord);
	
	//注册时添加用户资金信息到用户资金信息表
	public void addMemberAccount(MemberAccount memberAccount);
	
	
}
