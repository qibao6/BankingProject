package com.demo.dao.lq.login;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.demo.model.Subject;


public class LoginRepositoryImpl implements UserLoginDao {
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<Object[]> inviteRewardsAll(Integer page,Integer size,final String memberName,final String mobilePhone,final String invitationcode,final String invitedcode) {
		String sql="select * from (select rownum rid,a.* from (select m.member_id,"
				+ "m.mobile_phone,m.member_name,m.invitationcode,m.invitedcode,"
				+ "b.invest_amount,a.award_records_type,a.isaward,a.addtime,"
				+ "a.award_records_id,b.member_account_id,a.amount from  members  m "
				+ " inner join  member_account b   on m.member_id=b.member_id "
				+ " left join award_records a " 
					+" on a.byinvitingid=m.member_id order by  m.member_id  ) a ) aa where 1=1 ";
		if (memberName!=null&&!"".equals(memberName)) {
			sql+=" and aa.member_name like '%"+memberName+"%'";
		}
		if (mobilePhone!=null&&!"".equals(mobilePhone)) {
			sql+=" and aa.mobile_phone like '%"+mobilePhone+"%'";
		}
		if (invitationcode!=null&&!"".equals(invitationcode)) {
			sql+=" and aa.invitationcode = '"+invitationcode+"' ";
		}
		if (invitedcode!=null&&!"".equals(invitedcode)) {
			sql+=" and aa.invitedcode = '"+invitedcode+"'";
		}
		sql+=" and aa.rid<=("+page+"*"+size+") and aa.rid >("+page+"-1)*"+size;
		List<Object[]> olist = entityManager.createNativeQuery(sql).getResultList();
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
	public List<Object[]> flist(Subject sub) {
		String sql ="select m.subject_id,m.serial_no,m.subject_type,m.subject_name,m.amount,a.sums,"+
					" m.bought,m.period,m.year_rate,m.status,m.exper_status"+
					" from subject m left join (select sum(s.amount+t.amount) sums,s.subject_id from  SUBJECT_BBIN_PURCHASE_RECORD s left join  SUBJECT_PURCHASE_RECORD t on t.subject_id=s.subject_id group by s.subject_id) a"+
					" on m.subject_id=a.subject_id where 1=1 ";
		if (sub.getSubjectName()!=null&&!"".equals(sub.getSubjectName())) {
			sql+=" and m.subject_name like '%"+sub.getSubjectName()+"%'";
		}
		if (sub.getStatus()!=null&&sub.getStatus()>-1) {
			sql+=" and m.STATUS = "+sub.getStatus()+"";
		}
		if (sub.getSubjectType()!=null&&sub.getSubjectType()>-1) {
			sql+=" and m.SUBJECT_TYPE = "+sub.getSubjectType()+"";
		}
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
	public List<Object[]> fxjAll(Integer subjectId,Integer page,Integer size) {
		String sql ="select * from (select rownum rid ,a.* from  (select sbpr.serial_number,m.mobile_phone,m.member_name,"+
				"m.member_identity,sbpr.amount,sbpr.interest,sbpr.update_date,sbpr.ispayment from "+
				"subject_bbin_purchase_record sbpr left join members m  on sbpr.member_id=m.member_id "+
				"where sbpr.subject_id="+subjectId+") a ) aa where 1=1 and aa.rid<=("+page+"*"+size+") and aa.rid >("+page+"-1)*"+size+"";
		List<Object[]> list = entityManager.createNativeQuery(sql).getResultList();
		return list;
	}

	@Override
	public List<Object[]> fxAll(Integer subjectId,Integer page,Integer size) {
		String sql ="select * from (select rownum rid,a.* from  (select sbpr.serial_number,m.mobile_phone,m.member_name,m.member_identity,"+
				" ma.invest_amount,sbpr.interest,ma.create_date,sbpr.update_date,sbpr.ispayment from"+
				" subject_bbin_purchase_record sbpr left join members m  on sbpr.member_id=m.member_id inner join "+
				" member_account ma on ma.member_id=m.member_id where sbpr.subject_id=2) a)aa where aa.rid<=("+page+"*"+size+") and aa.rid >("+page+"-1)*"+size+"";
		List<Object[]> list = entityManager.createNativeQuery(sql).getResultList();
		return list;
	}
	@Override
	public Integer m(String mobilePhone) {
		String sql="select m.member_id from members m  where m.mobile_phone="+mobilePhone;
		BigDecimal m = (BigDecimal) entityManager.createNativeQuery(sql).getSingleResult();
		return m.intValue();
	}

	@Override
	public Integer getCount(final String memberName,final String mobilePhone,final String invitationcode,final String invitedcode) {
		String sql="select count(*) from (select rownum rid,a.* from (select m.member_id,m.mobile_phone,m.member_name,"
					+" m.invitationcode,m.invitedcode,b.invest_amount,a.award_records_type,a.isaward,a.addtime,"
					+" a.award_records_id,b.member_account_id,a.amount from  members  m  inner join  member_account b "
					+" on m.member_id=b.member_id  left join award_records a"
					+" on a.byinvitingid=m.member_id order by m.member_id ) a ) aa where 1=1";
		if (memberName!=null&&!"".equals(memberName)) {
			sql+=" and aa.member_name like '%"+memberName+"%'";
		}
		if (mobilePhone!=null&&!"".equals(mobilePhone)) {
			sql+=" and aa.mobile_phone like '%"+mobilePhone+"%'";
		}
		if (invitationcode!=null&&!"".equals(invitationcode)) {
			sql+=" and aa.invitationcode = '"+invitationcode+"' ";
		}
		if (invitedcode!=null&&!"".equals(invitedcode)) {
			sql+=" and aa.invitedcode = '"+invitedcode+"' ";
		}
		Object o= entityManager.createNativeQuery(sql).getSingleResult();
		Integer count = Integer.parseInt(o.toString());
		return count ;
	}

	@Override
	public Integer getCount(Integer subjectId){
		String sql ="select count(*)  from  (select sbpr.serial_number,m.mobile_phone,m.member_name,m.member_identity,sbpr.amount,sbpr.interest,sbpr.update_date,sbpr.ispayment from subject_bbin_purchase_record sbpr left join members m  on sbpr.member_id=m.member_id where sbpr.subject_id="+subjectId+") a";
		Object o = entityManager.createNativeQuery(sql).getSingleResult();
		Integer count = Integer.parseInt(o.toString());
		return count;
	}

	@Override
	public Integer getCount() {
		String sql ="select count(*) from  (select sbpr.serial_number,m.mobile_phone,m.member_name,m.member_identity,"+
				" ma.invest_amount,sbpr.interest,ma.create_date,sbpr.update_date,sbpr.ispayment from"+
				" subject_bbin_purchase_record sbpr left join members m  on sbpr.member_id=m.member_id inner join "+
				" member_account ma on ma.member_id=m.member_id where sbpr.subject_id=2) a";
		Object o = entityManager.createNativeQuery(sql).getSingleResult();
		Integer count = Integer.parseInt(o.toString());
		return count;
	}

	@Override
	public List<Object[]> login(String userName) {
		String sql="select * from users u where u.user_name ='"+userName+"'";
		List<Object[]> o =entityManager.createNativeQuery(sql).getResultList();
		return o;
	}

	@Override
	@Transactional
	public void updateJd(Float useableBalance, Integer memberId) {
		String sql ="update member_account ma set ma.imuseale_balance=(ma.imuseale_balance-"+useableBalance+") where ma.member_id= "+memberId+"";
		entityManager.createNativeQuery(sql).executeUpdate();
	}

	@Override
	@Transactional
	public void updatedk(Float sum, Integer memberId) {
		String sql ="update member_account ma set ma.useable_balance=(ma.useable_balance+"+sum+") where ma.member_id= "+memberId+"";
		entityManager.createNativeQuery(sql).executeUpdate();
	}
}
