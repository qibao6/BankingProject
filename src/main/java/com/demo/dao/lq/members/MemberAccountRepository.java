package com.demo.dao.lq.members;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.MemberAccount;
import com.demo.model.Members;

public interface MemberAccountRepository extends JpaRepository<MemberAccount, Integer> {
	
	MemberAccount findMemberAccountBymembers(Members members);
}
