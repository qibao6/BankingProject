package com.demo.service.lq;

import java.util.List;

import com.demo.model.AwardRecords;
import com.demo.model.FinancialPlanner;
import com.demo.model.MemberAccount;
import com.demo.model.MemberBankcards;
import com.demo.model.MemberDepositRecord;
import com.demo.model.MemberTradeRecord;
import com.demo.model.MemberWithdrawRecord;
import com.demo.model.Members;
import com.demo.model.Subject;

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
	/**
	 * 钱包记录
	 * @param memberId
	 * @return
	 */
	List<MemberTradeRecord>  memberTradeRecord(Integer memberId);
	/**
	 * 提现记录
	 * @param memberId
	 * @return
	 */
	List<MemberWithdrawRecord>  memberWithdrawRecord(Integer memberId);
	
	/**
	 * 理财师审核查询
	 * @return
	 */
	List<FinancialPlanner> fplist();
	/**
	 * 理财师审核
	 * @param financialPlannerId
	 */
	void updateStatus(Integer status,Integer financialPlannerId);
	/**
	 * 绑卡管理
	 * @return
	 */
	List<MemberBankcards> memberBankcards();
	/**
	 * 充值管理
	 * @return
	 */
	List<MemberDepositRecord>  findAllMDR();
	/**
	 * 解绑银行卡
	 * @param delflag
	 * @param memberBankcardsId
	 */
	void updateDelflag(Integer delflag,Integer memberBankcardsId);
	
	/**
	 * 注册奖励(修改奖励状态)
	 * @param isaward
	 * @param awardRecordsId
	 */
	void updateIsaward(Integer isaward,Integer awardRecordsId);
	/**
	 * 注册奖励(修改奖金)
	 * @param useableBalance
	 * @param memberAccountId
	 */
	void updateUseableBalance(Float useableBalance,Integer memberAccountId);
	
}
