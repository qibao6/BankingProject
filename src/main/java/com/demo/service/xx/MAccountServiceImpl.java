package com.demo.service.xx;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.demo.dao.xx.FPSRepository;
import com.demo.dao.xx.MAccountRepository;
import com.demo.dao.xx.MemberDRRepository;
import com.demo.dao.xx.MemberPRRepository;
import com.demo.dao.xx.MemberWRRepository;
import com.demo.dao.xx.SubjectPRRepository;
import com.demo.model.Finance_product_subscribe;
import com.demo.model.MemberAccount;
import com.demo.model.MemberDepositRecord;
import com.demo.model.MemberWithdrawRecord;
import com.demo.model.Member_profit_record;
import com.demo.model.Members;
import com.demo.model.SubjectPurchaseRecord;

@Service
public class MAccountServiceImpl implements MAccountService {

	@Autowired
	MAccountRepository mAccountRepository;
	@Autowired
	MemberPRRepository mprRepository;
	@Autowired
	SubjectPRRepository sprRepository;
	@Autowired
	FPSRepository fpsRepository;
	@Autowired
	MemberDRRepository mdrRepository;
	@Autowired
	MemberWRRepository mwrRepository;
	
	@Override
	public MemberAccount findById(Members id) {
		
		return mAccountRepository.findByMembers(id);
	}
	@Override
	public Page<Member_profit_record> findAllMPR(Integer page,Integer pagesize,final Integer memberId) {
		Pageable pageable=new PageRequest(page-1, pagesize);
		Specification<Member_profit_record> specification=new Specification<Member_profit_record>() {

			@Override
			public Predicate toPredicate(Root<Member_profit_record> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
				List<Predicate> pList=new ArrayList<>();
				if (memberId!=null) {
					Path tPath=root.get("memberId").get("memberId");
					pList.add(builder.equal(tPath, memberId));
				}
			return builder.and(pList.toArray(new Predicate[pList.size()]));
			}
		};
		return mprRepository.findAll(specification,pageable);
	}
	@Override
	public Page<SubjectPurchaseRecord> findAllSPR(Integer page, Integer pagesize,final Integer memberId) {
		Pageable pageable=new PageRequest(page-1, pagesize);
		Specification<SubjectPurchaseRecord> specification=new Specification<SubjectPurchaseRecord>() {

			@Override
			public Predicate toPredicate(Root<SubjectPurchaseRecord> root, CriteriaQuery<?> query,CriteriaBuilder builder) {
				List<Predicate> pList=new ArrayList<>();
				if (memberId!=null) {
					Path tPath=root.get("memberId");
					pList.add(builder.equal(tPath, memberId));
				}
				return builder.and(pList.toArray(new Predicate[pList.size()]));
			}
		};
		return sprRepository.findAll(specification,pageable);
	}
	@Override
	public Page<Finance_product_subscribe> findAllFPS(Integer page, Integer pagesize,final Integer memberId) {
		Pageable pageable=new PageRequest(page-1, pagesize);
		Specification<Finance_product_subscribe> specification=new Specification<Finance_product_subscribe>() {

			@Override
			public Predicate toPredicate(Root<Finance_product_subscribe> root, CriteriaQuery<?> query,
					CriteriaBuilder builder) {
				List<Predicate> pList=new ArrayList<>();
				if (memberId!=null) {
					Path tPath=root.get("memberId");
					pList.add(builder.equal(tPath, memberId));
				}
				return builder.and(pList.toArray(new Predicate[pList.size()]));
			}
		};
		return fpsRepository.findAll(specification,pageable);
	}
	@Override
	public Page<MemberDepositRecord> findAllMDR(Integer page, Integer pagesize,final Integer memberId) {
		Pageable pageable=new PageRequest(page-1, pagesize);
		Specification<MemberDepositRecord> specification=new Specification<MemberDepositRecord>() {

			@Override
			public Predicate toPredicate(Root<MemberDepositRecord> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
				List<Predicate> pList=new ArrayList<>();
				if (memberId!=null) {
					Path tPath=root.get("members").get("memberId");
					pList.add(builder.equal(tPath, memberId));
				}
				return builder.and(pList.toArray(new Predicate[pList.size()]));
			}
		};
		return mdrRepository.findAll(specification,pageable);
	}
	@Override
	public Page<MemberWithdrawRecord> findAllMWR(Integer page, Integer pagesize,final Integer memberId) {
		Pageable pageable=new PageRequest(page-1, pagesize);
		Specification<MemberWithdrawRecord> specification=new Specification<MemberWithdrawRecord>() {

			@Override
			public Predicate toPredicate(Root<MemberWithdrawRecord> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
				List<Predicate> pList=new ArrayList<>();
				if (memberId!=null) {
					Path tPath=root.get("members").get("memberId");
					pList.add(builder.equal(tPath, memberId));
				}
				return builder.and(pList.toArray(new Predicate[pList.size()]));
			}
		};
		return mwrRepository.findAll(specification,pageable);
	}

}
