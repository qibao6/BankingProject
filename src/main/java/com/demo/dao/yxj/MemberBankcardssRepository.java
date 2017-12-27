package com.demo.dao.yxj;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.model.MemberBankcards;
import com.demo.model.Members;

public interface MemberBankcardssRepository extends JpaRepository<MemberBankcards, Integer> {
	
	@Query(value="select mb.* from member_bankcards mb where mb.member_id=?",nativeQuery=true)
	public MemberBankcards findbankcards(Integer members);

}
