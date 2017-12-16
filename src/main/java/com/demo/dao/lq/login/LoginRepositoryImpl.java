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
	public List<Object[]> inviteRewardsAll() {
		String jpql="select m.member_id,m.mobile_phone,m.member_name,m.invitationcode,m.invitedcode,b.invest_amount,a.award_records_type,a.isaward,a.addtime,a.award_records_id,b.member_account_id,a.amount"
					+" from  members  m  inner join  member_account b   on m.member_id=b.member_id  left join award_records a"+
					" on a.byinvitingid=m.member_id";
		List<Object[]> olist = entityManager.createNativeQuery(jpql).getResultList();
		return olist;
	}

	@Override
	public Object[] obj(Integer awardRecordsId) {
		String sql="select m.mobile_phone,m.invitationcode from award_records ar,members m where "
				+ "m.member_id=ar.invitingid and ar.award_records_id="+awardRecordsId;
		Object[] obj = (Object[]) entityManager.createNativeQuery(sql).getSingleResult();
		return obj;
	}

	@Override
	public List<Object[]> olist(Integer awardRecordsId) {
		String sql ="select a.award_records_id,m.mobile_phone,b.mobile_phone phone,a.award_records_type,"+
					" a.amount,a.addtime from award_records a,members m,members b where"+
					" a.byinvitingid=m.member_id "+
					" and a.invitingid=b.member_id and a.award_records_id="+awardRecordsId;
		List<Object[]> olist = entityManager.createNativeQuery(sql).getResultList();
		return olist;
	}

	@Override
	public List<Object[]> flist() {
		String sql ="select m.subject_id,m.serial_no,m.subject_type,m.subject_name,m.amount,a.sums,"+
					" m.bought,m.period,m.year_rate,m.status,m.exper_status"+
					" from subject m left join (select sum(s.amount+t.amount) sums,s.subject_id from  SUBJECT_BBIN_PURCHASE_RECORD s left join  SUBJECT_PURCHASE_RECORD t on t.subject_id=s.subject_id group by s.subject_id) a"+
					" on m.subject_id=a.subject_id";
		List<Object[]> flist = entityManager.createNativeQuery(sql).getResultList();
		return flist;
	}

	@Override
	public Object[] sub(Integer subjectId) {
		String sql ="select s.subject_name,s.period,s.year_rate from subject s where s.subject_id="+subjectId;
		Object[] sub = (Object[]) entityManager.createNativeQuery(sql).getSingleResult();
		return sub;
	}
}
