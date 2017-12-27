package com.demo.dao.lq.members;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.demo.model.MemberBankcards;
										//Integer这个传的id只能是MemberBankcards自己对象中的id来查
public interface MemberBankcardsRepository extends JpaRepository<MemberBankcards,Integer>,JpaSpecificationExecutor<MemberBankcards> {
	@Modifying
	@Query("update MemberBankcards mb  set mb.delflag = ?1 where mb.memberBankcardsId = ?2")
	void updateDelflag(Integer delflag,Integer memberBankcardsId);
}
