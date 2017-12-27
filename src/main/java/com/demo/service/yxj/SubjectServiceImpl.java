package com.demo.service.yxj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.demo.dao.lq.members.MemberTradeRecordRepository;
import com.demo.dao.yxj.MemberAccountsRepository;
import com.demo.dao.yxj.MemberBankcardssRepository;
import com.demo.dao.yxj.MemberTradeRecordsRepository;
import com.demo.dao.yxj.SubjectDao;
import com.demo.dao.yxj.SubjectOrderRecordsRepository;
import com.demo.dao.yxj.SubjectPurchaseRecordsRepository;
import com.demo.dao.yxj.SubjectRepository;
import com.demo.model.MemberAccount;
import com.demo.model.MemberBankcards;
import com.demo.model.MemberTradeRecord;
import com.demo.model.Members;
import com.demo.model.Subject;
import com.demo.model.SubjectOrderRecord;
import com.demo.model.SubjectPurchaseRecord;

@Service
public class SubjectServiceImpl implements SubjectService{

	
	@Autowired
	SubjectRepository subjectrepository;
	@Autowired
	MemberAccountsRepository memberAccountsRepository;
	@Autowired
	SubjectOrderRecordsRepository subjectOrderRecordsRepository;
	@Autowired
	SubjectPurchaseRecordsRepository subjectPurchaseRecordsRepository;
	@Autowired
	MemberTradeRecordsRepository memberTradeRecordsRepository;
	@Autowired
	MemberBankcardssRepository memberBankcardsRepository;

	//EntityManager entityManager;
	
	
	//查询显示所有
	@Override
	public List<Object[]> findsubindex(Subject subject, Integer page, Integer rowsize) {
		
		return subjectrepository.findsublist(subject, page, rowsize);
	}
//	
//	
	
	//产品中心分页模糊查询
	@Override
	public Page findpageall(Integer size, Integer page, final Subject subject) {
		Pageable pageable=new PageRequest(page-1, size);
		Specification<Subject> specification=new Specification<Subject>() {

			@Override
			public Predicate toPredicate(Root<Subject> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
				List<Predicate> slist=new ArrayList<>();
				if (subject!=null) {
					//标的类型
					Path subjectType=root.get("subjectType");
					if (subject.getSubjectType()==0) 
						slist.add(builder.equal(subjectType,0));
					if (subject.getSubjectType()==1)
						slist.add(builder.equal(subjectType,1));
					
					//年化收益
					Path year_rate=root.get("yearRate");
					if ( subject.getYearRate()==6)
						slist.add(builder.equal(year_rate, 6));
					if ( subject.getYearRate()==7)
						slist.add(builder.equal(year_rate, 7));
					if (subject.getYearRate()==9)
						slist.add(builder.equal(year_rate, 7.5));
					if (subject.getYearRate()==8)
						slist.add(builder.equal(year_rate, 8));
					if (subject.getYearRate()==10)
						slist.add(builder.gt(year_rate, 8));
					//标的状态
				Path status=root.get("status");
				if (subject.getStatus()==22) 
					slist.add(builder.equal(status,1));
				if (subject.getStatus()==99) 
					slist.add(builder.equal(status,0));
				if (subject.getStatus()==66) 
					slist.add(builder.equal(status,2));
				
				
				
				//项目期限
				Path period=root.get("period");
				
				//List<Subject> plist=new ArrayList<>();
				if (subject.getPeriod()==15) 
					slist.add(builder.le(period, 15));
				if (subject.getPeriod()==30) {
					List<Predicate>  periods=new ArrayList<>();
					periods.add(builder.gt(period, 15));
					periods.add(builder.le(period, 30));
					slist.addAll(periods);
				}
				if (subject.getPeriod()==180) {
					List<Predicate>  periods=new ArrayList<>();
					periods.add(builder.gt(period, 30));
					periods.add(builder.le(period, 180));
					slist.addAll(periods);
				}
				if (subject.getPeriod()==365) {
					List<Predicate>  periods=new ArrayList<>();
					periods.add(builder.gt(period, 180));
					periods.add(builder.le(period, 365));
					slist.addAll(periods);
				}
				if (subject.getPeriod()==366) 
					slist.add(builder.gt(period, 365));
				
				}
				return builder.and(slist.toArray(new Predicate[slist.size()]));
			}
		};
		
		
		return subjectrepository.findAll(specification,pageable);
	}

	
	//根据id查询对象，订单详情页面
	@Override
	public Subject getByid(Integer subjectId) {
	
		return subjectrepository.findOne(subjectId);
	}

	
	//查询余额
	@Override
	public MemberAccount selectmoney(Integer member_id) {
		
		return memberAccountsRepository.selectmoney(member_id);
	}

	//添加订单
	@Transactional
	@Override
	public void add(SubjectOrderRecord subjectOrderRecord) {
		
		 subjectOrderRecordsRepository.save(subjectOrderRecord);
	}

	//添加购买记录
	@org.springframework.transaction.annotation.Transactional
	@Override
	public void insertpurchase(SubjectPurchaseRecord subjectPurchaseRecord) {
		subjectPurchaseRecordsRepository.save(subjectPurchaseRecord);
		
	}

	//修改用户资金
	@org.springframework.transaction.annotation.Transactional
	@Override
	public void updatememberaccount(Float amount, Integer memberId) {
		
		memberAccountsRepository.updatememberaccount(amount, memberId);
	}

	//添加数据到交易记录表
	@Transactional
	@Override
	public void addMemberTradeRecord(MemberTradeRecord memberTradeRecord){
			memberTradeRecordsRepository.save(memberTradeRecord);
	}

	//添加数据到用户资金信息表
	
	@Transactional
	@Override
	public void addMemberAccount(MemberAccount memberAccount) {
		memberAccountsRepository.save(memberAccount);
		
	}

	@Override
	public MemberBankcards findbankcard(Integer members) {
		
		return memberBankcardsRepository.findbankcards(members);
	}

	//查询总条数
	@Override
	public Integer getcount() {
		
		return subjectrepository.getcount();
	}

	
//	@Override
//	public List<Object[]> findsubindex1() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	

}
