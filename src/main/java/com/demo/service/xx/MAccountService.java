package com.demo.service.xx;

import org.springframework.data.domain.Page;

import com.demo.model.MemberAccount;
import com.demo.model.Member_profit_record;

public interface MAccountService {
	/**
	 * 账户金额详情
	 * @param id
	 * @return
	 */
	public MemberAccount findById(Integer id);
	
	/**
	 * 收益记录表
	 * @return
	 */
	public Page<Member_profit_record> findAllMPR(Integer page,Integer pagesize);
}
