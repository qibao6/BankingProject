package com.demo.dao.yxj;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class SubjectRepositoryImpl implements SubjectDao{

	
	@PersistenceContext
	EntityManager entityManager;
	
	
	//@Override
//	public List<Object[]> findsublist() {
//		String sql ="SELECT s.subject_id,s.subject_name,s.YEAR_RATE,s.floor_amount,s.period,s.bought,s.create_date,s.status,"
//			      +"(COALESCE(SUM(r.amount),0)+ (SELECT COALESCE(SUM(sb.amount),0) FROM subject_bbin_purchase_record sb WHERE s.subject_id=sb.subject_id)) hasSold," 
//			      +"(COUNT(r.spr_id)+s.bought+(SELECT COUNT(sb.sbpr_id) FROM subject_bbin_purchase_record sb WHERE s.subject_id=sb.subject_id) ) hasBought "
//			      +"FROM SUBJECT s LEFT JOIN subject_purchase_record r ON s.subject_id = r.subject_id where s.status!=0 GROUP BY  s.subject_id,s.subject_name"
//			      +",s.YEAR_RATE,s.floor_amount,s.period,s.bought,s.create_date,s.status "
//			      +" order by s.create_date desc,s.status";
//		List<Object[]> sublist=entityManager.createNativeQuery(sql).getResultList();
//		return sublist;
//	}

}
