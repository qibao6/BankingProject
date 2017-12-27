package com.demo.dao.lq.members;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.demo.model.SubjectPurchaseRecord;

public interface SubjectPurchaseRecordJpaRepository extends JpaRepository<SubjectPurchaseRecord,Integer>,JpaSpecificationExecutor<SubjectPurchaseRecord>{
	@Modifying
	@Query(value="update  subject_purchase_record t  set t.s_status='1' where t.create_date+t.pay_interest_times<sysdate and t.s_status='0'",nativeQuery=true)
	public void updatesubject_purchase_record();
	
	@Modifying
	@Query("update SubjectPurchaseRecord t  set t.interest = ?1,t.sStatus=?2 where t.sprId = ?3")
	void updateInterest(Float interest,String sStatus,Integer sprId);

}
