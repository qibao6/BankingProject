package com.demo.service.xx;

import java.util.List;

import org.springframework.data.domain.Page;

import com.demo.model.Finance_product_subscribe;
import com.demo.model.FinancialPlanner;
import com.demo.model.MemberAccount;
import com.demo.model.MemberBankcards;
import com.demo.model.MemberDepositRecord;
import com.demo.model.MemberWithdrawRecord;
import com.demo.model.Member_profit_record;
import com.demo.model.Members;
import com.demo.model.SubjectPurchaseRecord;

public interface MAccountService {
	/**
	 * 账户金额详情
	 * @param id
	 * @return
	 */
	public MemberAccount findById(Members id);
	/**
	 * 充值后修改余额
	 * @param memberAccount
	 */
	public void saveMAccout(MemberAccount memberAccount);
	
	/**
	 * 收益记录表
	 * @return
	 */
	public Page<Member_profit_record> findAllMPR(Integer page,Integer pagesize,Integer memberId);
	/**
	 * 投资记录
	 * @param page
	 * @param pagesize
	 * @param memberId
	 * @return
	 */
	public Page<SubjectPurchaseRecord> findAllSPR(Integer page,Integer pagesize,Integer memberId);
	/**
	 * 预约记录
	 * @return
	 */
	public Page<Finance_product_subscribe> findAllFPS(Integer page,Integer pagesize,Integer memberId);
	/**
	 * 充值记录
	 * @param page
	 * @param pagesize
	 * @param memberId
	 * @return
	 */
	public Page<MemberDepositRecord> findAllMDR(Integer page,Integer pagesize,Integer memberId);
	/**
	 * 保存/修改 充值记录
	 */
	public void saveMDR(MemberDepositRecord mDepositRecord);
	/**
	 * 根据流水号查询充值记录
	 * @return
	 */
	public MemberDepositRecord findOne(String serialNumber);
	/**
	 * 提款记录
	 * @param page
	 * @param pagesize
	 * @param memberId
	 * @return
	 */
	public Page<MemberWithdrawRecord> findAllMWR(Integer page,Integer pagesize,Integer memberId);
	/**
	 * 保存提款记录
	 * @param mWithdrawRecord
	 */
	public void saveMWR(MemberWithdrawRecord mWithdrawRecord);
	/**
	 * 安全信息
	 * @param memberId
	 * @return
	 */
	public Members findMember(Integer memberId);
	
	public List<MemberBankcards> findMemberBank(Members members);
	
	//实名
	public void shiming(Members members);
	
	//绑卡
	public void bangka(MemberBankcards mBankcards);
	/**
	 * 根据ID查询银行信息
	 * @param memberBankcardsId
	 * @return
	 */
	public MemberBankcards findOneMb(Integer memberBankcardsId);
	/**
	 * 查询理财师认证
	 * @param memberId
	 * @return
	 */
	public FinancialPlanner findfPlanner(Integer memberId);
	/**
	 * 添加理财师认证
	 */
	public void savefPlanner(FinancialPlanner fPlanner);
}
