package com.demo.service.lq;

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
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.lq.members.AwardRecordsRepository;
import com.demo.dao.lq.members.FinancialPlannerRepository;
import com.demo.dao.lq.members.MemberAccountRepository;
import com.demo.dao.lq.members.MemberBankcardsRepository;
import com.demo.dao.lq.members.MemberDepositRecordRepository;
import com.demo.dao.lq.members.MemberTradeRecordRepository;
import com.demo.dao.lq.members.MemberWithdrawRecordRepository;
import com.demo.dao.lq.members.MembersRepository;
import com.demo.model.FinancialPlanner;
import com.demo.model.MemberAccount;
import com.demo.model.MemberBankcards;
import com.demo.model.MemberDepositRecord;
import com.demo.model.MemberTradeRecord;
import com.demo.model.MemberWithdrawRecord;
import com.demo.model.Members;

@Service
public class MemberServiceImpl implements MembersService {
	
	Members m = new Members();
	
	@Autowired
	MembersRepository membersRepository;
	
	@Autowired
	MemberAccountRepository memberAccountRepository;
	
	@Autowired
	FinancialPlannerRepository financialPlannerRepository;
	
	@Autowired
	MemberDepositRecordRepository memberDepositRecordRepository;
	
	@Autowired
	MemberTradeRecordRepository memberTradeRecordRepository;
	
	@Autowired
	MemberWithdrawRecordRepository memberWithdrawRecordRepository;

	@Autowired
	MemberBankcardsRepository memberBankcardsRepository;
	
	@Autowired
	AwardRecordsRepository awardRecordsRepository;
	
	
	@Override
	public Page<Members> findMembers(Integer page,Integer size,final Members members) {
		
		Pageable pageable = new PageRequest(page-1,size);
		
		Specification<Members> specification = new Specification<Members>() {
			
			@Override
			public Predicate toPredicate(Root<Members> root, CriteriaQuery<?> query,
					CriteriaBuilder builder) {
				List<Predicate> plist = new ArrayList<>();
				if(members!=null){
					if(members.getNames()!=null&&!"".equals(members.getNames())){
						Path namespath = root.get("names");
						plist.add(builder.like(namespath, "%"+members.getNames()+"%"));
					}
					
					if(members.getMobilePhone()!=null&&!"".equals(members.getMobilePhone())){
						Path phonepath = root.get("mobilePhone");
						plist.add(builder.like(phonepath, "%"+members.getMobilePhone()+"%"));
					}
					if(members.getMemberName()!=null&&!"".equals(members.getMemberName())){
						Path mnpath = root.get("memberName");
						plist.add(builder.like(mnpath,"%"+members.getMemberName()+"%"));
					}
					if(members.getInvitationcode()!=null&&!"".equals(members.getInvitationcode())){
						Path inpath = root.get("invitationcode");
						plist.add(builder.like(inpath,"%"+members.getInvitationcode()+"%"));
					}
				}
				return builder.and(plist.toArray(new Predicate[plist.size()]));
			}
		};
		
		return membersRepository.findAll(specification, pageable);
	}

	@Override
	public Members membersInfo(Integer memberId) {
		return membersRepository.findOne(memberId);
	}

	@Override
	public FinancialPlanner financialPlanner(Integer memberId) {
		m.setMemberId(memberId);
		return financialPlannerRepository.findFinancialPlannerBymembers(m);
	}

	@Override
	public Page<MemberDepositRecord> memberDepositRecord(final Integer memberId,Integer page,Integer size) {
		m.setMemberId(memberId);
		Pageable pageable = new PageRequest(page-1,size);
		
		return memberDepositRecordRepository.findMemberDepositRecordBymembers(m, pageable);
	}

	@Override
	public Page<MemberTradeRecord> memberTradeRecord(final Integer memberId,Integer page,Integer size) {
		m.setMemberId(memberId);
		Pageable pageable = new PageRequest(page-1,size);
		return memberTradeRecordRepository.findMemberTradeRecordBymembers(m, pageable);
	}

	@Override
	public Page<MemberWithdrawRecord> memberWithdrawRecord(final Integer memberId,Integer page,Integer size) {
		m.setMemberId(memberId);
		Pageable pageable = new PageRequest(page-1,size);
		return memberWithdrawRecordRepository.findMemberWithdrawRecordBymembers(m, pageable);
	}

	@Override
	public List<FinancialPlanner> fplist() {
		return financialPlannerRepository.findAll();
	}

	@Override
	@Transactional
	public void updateStatus(Integer status,Integer financialPlannerId) {
		financialPlannerRepository.updateStatus(status, financialPlannerId);
	}

	@Override
	public List<MemberBankcards> memberBankcards() {
		return memberBankcardsRepository.findAll();
	}

	@Override
	public List<MemberDepositRecord> findAllMDR() {
		List<MemberDepositRecord> dlist = memberDepositRecordRepository.findAll();
		return dlist;
	}

	@Override
	public MemberAccount meberAccount(Integer memberId) {
		m.setMemberId(memberId);
		return memberAccountRepository.findMemberAccountBymembers(m);
	}

	@Override
	@Transactional
	public void updateDelflag(Integer delflag, Integer memberBankcardsId) {
		memberBankcardsRepository.updateDelflag(delflag, memberBankcardsId);
	}

	@Override
	@Transactional
	public void updateIsaward(Integer isaward, Integer awardRecordsId) {
		awardRecordsRepository.updateIsaward(isaward, awardRecordsId);
	}

	@Override
	@Transactional
	public void updateUseableBalance(Float useableBalance, Integer memberAccountId) {
		memberAccountRepository.updateUseableBalance(useableBalance, memberAccountId);
	}
}
