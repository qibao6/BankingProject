package com.demo.dao.yxj;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Subjectdaoimpl implements Subjectdao{

	@PersistenceContext
	EntityManager entityManager;
	@Override
	public List<Object[]> findsubindex() {
		String sql=" SELECT s.subject_name,s.floor_amount,s.period,s.year_rate,s.bought, (COALESCE (SUM(r.amount), 0))+ (SELECT COALESCE(SUM(sb.amount),0) FROM subject_bbin_purchase_record sb WHERE s.id=sb.subject_id) 'hasSold',"
				+ " COUNT(r.id) + (SELECT COUNT(sb.id) FROM subject_bbin_purchase_record sb "
				+ "WHERE s.id=sb.subject_id) + s.bought 'hasBought' "
				+ "FROM SUBJECT s LEFT JOIN subject_purchase_record r ON s.id = r.subject_id "
				+ "where s.status!=0 GROUP BY s.id order by s.create_date desc,s.status asc ";
		List<Object[]> subject=entityManager.createNativeQuery(sql).getResultList();
		return null;
	}

}
