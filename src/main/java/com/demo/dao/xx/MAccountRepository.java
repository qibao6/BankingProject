package com.demo.dao.xx;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.MemberAccount;
import com.demo.model.Members;

/**
 * 账户金额详情
 * @author 肖鑫
 *
 */
public interface MAccountRepository extends JpaRepository<MemberAccount, Integer> {
	public MemberAccount findByMembers(Members id);
}
