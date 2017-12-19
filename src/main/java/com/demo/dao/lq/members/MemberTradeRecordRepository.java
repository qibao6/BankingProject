package com.demo.dao.lq.members;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.MemberTradeRecord;
import com.demo.model.Members;

public interface MemberTradeRecordRepository extends JpaRepository<MemberTradeRecord,Integer> {
	
	/*@Query("select tr from MemberTradeRecord tr where tr.memberId = ?1")
	List<MemberTradeRecord>  memberTradeRecord(Integer memberId);*/
	
	Page<MemberTradeRecord> findMemberTradeRecordBymembers(Members members,Pageable pageable);
}
