package com.demo.dao.yxj;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class SubjectRepositoryImpl implements SubjectDao{

	
	@PersistenceContext
	EntityManager entityManager;
	
	
	@Override
	public List<Object[]> findsublist() {
		String sql ="select subject_name,floor_amount,period,year_rate from subject";
		List<Object[]> sublist=entityManager.createNativeQuery(sql).getResultList();
		return sublist;
	}

}
