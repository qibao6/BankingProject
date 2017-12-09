package com.demo.service.lq;

import java.util.List;

import com.demo.model.FinancialPlanner;
import com.demo.model.MemberAccount;
import com.demo.model.MemberDepositRecord;
import com.demo.model.Members;

public interface MembersService {
	
	/**
	 * 会员管理
	 * 账号管理
	 * @return
	 */
	List<Members> findMembers();
	
	/**
	 * 账号详情
	 * @param memberId
	 * @return
	 */
	Members membersInfo(Integer memberId);
	
	/**
	 * 资金信息
	 * @param memberId
	 * @return
	 */
	MemberAccount meberAccount(Integer memberId);
	
	/**
	 * 
	 * 理财师信息
	 * @param memberId
	 * @return
	 */
	FinancialPlanner financialPlanner(Integer memberId);
	
	/**
	 * 充值记录
	 * @param memberId
	 * @return
	 */
	List<MemberDepositRecord>  memberDepositRecord(Integer memberId);
}
