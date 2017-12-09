package com.demo.dao.lq.members;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.model.MemberDepositRecord;

public interface MemberDepositRecordRepository extends JpaRepository<MemberDepositRecord,Integer> {
	
	@Query("select m from MemberDepositRecord m where m.memberId = ?1")
	List<MemberDepositRecord>  memberDepositRecord(Integer memberId);
}
