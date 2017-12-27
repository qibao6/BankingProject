package com.demo.dao.lq.members;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.MemberWithdrawRecord;
import com.demo.model.Members;

public interface MemberWithdrawRecordRepository extends JpaRepository<MemberWithdrawRecord,Integer> {
/*	@Query("select wr from MemberWithdrawRecord wr where wr.memberId = ?1")
	List<MemberWithdrawRecord>  memberWithdrawRecord(Integer memberId);*/
	
	Page<MemberWithdrawRecord> findMemberWithdrawRecordBymembers(Members members,Pageable pageable);
}
