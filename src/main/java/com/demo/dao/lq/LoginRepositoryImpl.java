package com.demo.dao.lq;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


public class LoginRepositoryImpl implements UserLoginDao {
	
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public Object[] login(String userName) {
		
		String hql="select userName,usersPassword,mobilePhone,status from users where userName ="+userName;
		Query query =entityManager.createNamedQuery(hql);
		Object[] lists = (Object[]) query.getSingleResult();
		return lists;
	}

}
