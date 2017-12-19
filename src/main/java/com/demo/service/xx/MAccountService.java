package com.demo.service.xx;

import org.springframework.data.domain.Page;

import com.demo.model.Finance_product_subscribe;
import com.demo.model.MemberAccount;
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
	 * 提款记录
	 * @param page
	 * @param pagesize
	 * @param memberId
	 * @return
	 */
	public Page<MemberWithdrawRecord> findAllMWR(Integer page,Integer pagesize,Integer memberId);
}
