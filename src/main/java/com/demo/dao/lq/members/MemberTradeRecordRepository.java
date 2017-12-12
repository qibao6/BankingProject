package com.demo.dao.lq.members;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.model.MemberTradeRecord;

public interface MemberTradeRecordRepository extends JpaRepository<MemberTradeRecord,Integer> {
	
	@Query("select tr from MemberTradeRecord tr where tr.memberId = ?1")
	List<MemberTradeRecord>  memberTradeRecord(Integer memberId);
}
