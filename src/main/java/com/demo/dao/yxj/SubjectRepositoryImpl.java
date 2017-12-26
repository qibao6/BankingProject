package com.demo.dao.yxj;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.model.Subject;


public class SubjectRepositoryImpl implements SubjectDao{

	
	@PersistenceContext
	EntityManager entityManager;

	public List<Object[]> findsublist(Subject subject, Integer page, Integer rowsize) {
		String sql = "SELECT s.subject_id,s.subject_name,s.YEAR_RATE,s.floor_amount,s.period,s.bought,s.create_date,s.status, s.amount,s.SUBJECT_TYPE,"
				+"(COALESCE(SUM(r.amount),0)+ (SELECT COALESCE(SUM(sb.amount),0) FROM subject_bbin_purchase_record sb WHERE s.subject_id=sb.subject_id)) hasSold," 
				+"(COUNT(r.spr_id)+s.bought+(SELECT COUNT(sb.sbpr_id) FROM subject_bbin_purchase_record sb WHERE s.subject_id=sb.subject_id) ) hasBought "
				+"FROM SUBJECT s LEFT JOIN subject_purchase_record r ON s.subject_id = r.subject_id where s.status!=0 ";
		
		
		//标的类型
		if(subject.getSubjectType() == 0) sql=sql+" and s.subject_type = 0";
		if(subject.getSubjectType() == 1) sql=sql+" and s.subject_type = 1";
		
		//年化收益
		if(subject.getYearRate() == 6) sql=sql+" and s.Year_Rate = 6";
		if(subject.getYearRate() == 7) sql=sql+" and s.Year_Rate = 7";
		if(subject.getYearRate() == 7.5) sql=sql+" and s.Year_Rate = 7.5";
		if(subject.getYearRate() == 8) sql=sql+" and s.Year_Rate = 8";
		if(subject.getYearRate() == 9) sql=sql+" and s.Year_Rate >8";
		
		//项目期限
		if(subject.getPeriod() == 15) sql=sql+" and s.period =15";
		if(subject.getPeriod() == 30) sql=sql+" and s.period >15 and s.period<=30";
		if(subject.getPeriod() == 180) sql=sql+" and s.period >30 and s.period<=180";
		if(subject.getPeriod() == 365) sql=sql+" and s.period >180 and s.period<=365";
		if(subject.getPeriod() == 366) sql=sql+" and s.period >365 ";
		
		//标的状态：
		if(subject.getStatus() == 1) sql=sql+" and s.status =1";
		if(subject.getStatus() == 2) sql=sql+" and s.status =2";
		if(subject.getStatus() == 3) sql=sql+" and s.status =3";
		
		sql = sql+"GROUP BY  s.subject_id,s.subject_name,s.YEAR_RATE,s.floor_amount,"
				+ "s.period,s.bought,s.create_date,s.status, s.amount,s.SUBJECT_TYPE order by s.subject_id";
		
		
		Query query=entityManager.createNativeQuery(sql);
		query.setFirstResult((page-1)*rowsize);
		query.setMaxResults(rowsize);
		
		return query.getResultList();
}

	
	}
