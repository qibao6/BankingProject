package com.demo.dao.lq.login;

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
	
	@Override
	public List<Object> inviteRewardsAll() {
		String jpql="select ar.award_records_id,m.member_name,m.invitationcode,m.invitedcode,ma.invest_amount,ma.delflag,ar.isaward,m.create_date from award_records ar,members m,member_account ma where ar.invitingid=m.member_id and m.member_id=ma.member_id";
		return null;
	}
}
