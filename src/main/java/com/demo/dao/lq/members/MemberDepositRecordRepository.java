package com.demo.dao.lq.members;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.MemberDepositRecord;
import com.demo.model.Members;

public interface MemberDepositRecordRepository extends JpaRepository<MemberDepositRecord,Integer> {
	
	/*@Query("select m from MemberDepositRecord m join fecth m.members ms  where ms.memberId = ?1")
	List<MemberDepositRecord> memberDepositRecord(Integer memberId);*/
	List<MemberDepositRecord> findMemberDepositRecordBymembers(Members members);
	
}
