package com.demo.dao.lq.members;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.demo.model.MemberAccount;
import com.demo.model.Members;

public interface MemberAccountRepository extends JpaRepository<MemberAccount, Integer> {
	
	MemberAccount findMemberAccountBymembers(Members members);
	
	@Modifying
	@Query("update MemberAccount am  set am.useableBalance = am.useableBalance + ?1 where am.memberAccountId = ?2")
	void updateUseableBalance(Float useableBalance,Integer memberAccountId);
}
