package com.demo.dao.yxj;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.demo.model.MemberAccount;
import com.demo.model.Subject;
import com.demo.model.SubjectOrderRecord;

public interface SubjectRepository extends JpaRepository<Subject, Integer>,SubjectDao,JpaSpecificationExecutor<Subject>{

	@Query(value="SELECT s.subject_id,s.subject_name,s.YEAR_RATE,s.floor_amount,s.period,s.bought,s.create_date,s.status "
			+ " FROM SUBJECT s LEFT JOIN subject_purchase_record r ON s.subject_id = r.subject_id where s.status!=0 GROUP BY  s.subject_id,s.subject_name,s.YEAR_RATE,s.floor_amount,s.period,s.bought,s.create_date,s.status order by s.create_date desc,s.status" ,nativeQuery=true)
	public List<Object[]> subjectindex();
	
//	添加记录到交易记录表（订单表）
	@Query(value="insert into subject_order_record values(sor_id,?1,?2,?3,?4,?5,?6,?7,?8,?9)",nativeQuery=true)
	public SubjectOrderRecord add(String serialNumber,Integer dealType,String amount,Integer status,Integer
			subjectId,Integer memberId, Integer delflag,Date createDate,Date updateDate);
//		@Query(value="select * FROM SUBJECT",nativeQuery=true )
	
	//public List<Object[]> findsublist(Subject subject,Integer page,Integer size);
	
}