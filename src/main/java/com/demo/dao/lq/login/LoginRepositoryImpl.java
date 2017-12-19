package com.demo.dao.lq.login;

import java.math.BigDecimal;
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

	@Override
	public List<Object[]> fxjAll(Integer subjectId) {
		String sql ="select rownum,a.* from  (select sbpr.serial_number,m.mobile_phone,m.member_name,m.member_identity,sbpr.amount,sbpr.interest,sbpr.update_date,sbpr.ispayment from subject_bbin_purchase_record sbpr left join members m  on sbpr.member_id=m.member_id where sbpr.subject_id="+subjectId+") a";
		List<Object[]> list = entityManager.createNativeQuery(sql).getResultList();
		return list;
	}

	@Override
	public List<Object[]> fxAll(Integer subjectId) {
		String sql ="select rownum,a.* from  (select sbpr.serial_number,m.mobile_phone,m.member_name,m.member_identity,ma.invest_amount,sbpr.interest,ma.create_date,sbpr.update_date,sbpr.ispayment from subject_bbin_purchase_record sbpr left join members m  on sbpr.member_id=m.member_id inner join member_account ma on ma.member_id=m.member_id where sbpr.subject_id="+subjectId+") a";
		List<Object[]> list = entityManager.createNativeQuery(sql).getResultList();
		return list;
	}

	@Override
	public List<Object[]> txAll() {
		String sql ="select rownum,a.* from (select m.mobile_phone,m.member_name,m.member_identity,mw.amount,mw.bank_name,mw.bank_card,mw.cardaddress,mw.status,mw.create_date from member_withdraw_record mw left join members m  on mw.member_id=m.member_id)a";
		List<Object[]> list = entityManager.createNativeQuery(sql).getResultList();
		return list;
	}

	@Override
	public Integer m(String mobilePhone) {
		String sql="select m.member_id from members m  where m.mobile_phone="+mobilePhone;
		BigDecimal m = (BigDecimal) entityManager.createNativeQuery(sql).getSingleResult();
		return m.intValue();
	}
}
