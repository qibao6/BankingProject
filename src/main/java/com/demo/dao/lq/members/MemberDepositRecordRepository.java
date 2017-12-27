package com.demo.dao.lq.members;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.demo.model.MemberDepositRecord;
import com.demo.model.Members;

public interface MemberDepositRecordRepository extends JpaRepository<MemberDepositRecord,Integer>,JpaSpecificationExecutor<MemberDepositRecord>{
	
	/*@Query("select m from MemberDepositRecord m join fecth m.members ms  where ms.memberId = ?1")
	List<MemberDepositRecord> memberDepositRecord(Integer memberId);*/
	Page<MemberDepositRecord> findMemberDepositRecordBymembers(Members members,Pageable pageable);
	
}
