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
import com.demo.dao.lq.members.Member_profit_recordJpaRepository;
import com.demo.dao.lq.members.MembersRepository;
import com.demo.dao.lq.members.SubjectPurchaseRecordJpaRepository;
import com.demo.model.FinancialPlanner;
import com.demo.model.MemberAccount;
import com.demo.model.MemberBankcards;
import com.demo.model.MemberDepositRecord;
import com.demo.model.MemberTradeRecord;
import com.demo.model.MemberWithdrawRecord;
import com.demo.model.Member_profit_record;
import com.demo.model.Members;
import com.demo.model.SubjectPurchaseRecord;

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
	
	@Autowired
	SubjectPurchaseRecordJpaRepository subjectPurchaseRecordJpaRepository;
	
	@Autowired
	Member_profit_recordJpaRepository member_profit_recordJpaRepository;
	
	
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
	public Page<FinancialPlanner> fplist(Integer page,Integer size,final FinancialPlanner financialPlanner) {
		Pageable pageable = new PageRequest(page-1,size);
		
		Specification<FinancialPlanner> specification = new Specification<FinancialPlanner>() {
			
			@Override
			public Predicate toPredicate(Root<FinancialPlanner> root, CriteriaQuery<?> query,
					CriteriaBuilder builder) {
			List<Predicate> plist = new ArrayList<>();
				if (financialPlanner!=null) {
				 if(financialPlanner.getMembers()!=null){
					if(financialPlanner.getMembers().getMobilePhone()!=null&&!"".equals(financialPlanner.getMembers().getMobilePhone())){
						Path mppath = root.get("members").get("mobilePhone");
						plist.add(builder.like(mppath, "%"+financialPlanner.getMembers().getMobilePhone()+"%"));
					}
					if(financialPlanner.getFinancialPlannerName()!=null&&!"".equals(financialPlanner.getFinancialPlannerName())){
						Path mnpath = root.get("financialPlannerName");
						plist.add(builder.like(mnpath,"%"+financialPlanner.getFinancialPlannerName()+"%"));
					}
				  }
					if(financialPlanner.getStatus()!=null&&financialPlanner.getStatus()>0){
						Path spath = root.get("status");
						plist.add(builder.equal(spath,financialPlanner.getStatus()));
					}
				}
				return builder.and(plist.toArray(new Predicate[plist.size()]));
			}
		};
		return financialPlannerRepository.findAll(specification, pageable);
	}

	@Override
	@Transactional
	public void updateStatus(Integer status,Integer financialPlannerId) {
		financialPlannerRepository.updateStatus(status, financialPlannerId);
	}

	@Override
	public Page<MemberBankcards> memberBankcards(Integer page,Integer size,final MemberBankcards memberBankcards) {
		
		Pageable pageable = new PageRequest(page-1,size);
		
		Specification<MemberBankcards> specification = new Specification<MemberBankcards>() {
			
			@Override
			public Predicate toPredicate(Root<MemberBankcards> root, CriteriaQuery<?> query,
					CriteriaBuilder builder) {
			List<Predicate> plist = new ArrayList<>();
				if (memberBankcards!=null) {
				 if(memberBankcards.getMembers()!=null){
					if(memberBankcards.getMembers().getMobilePhone()!=null&&!"".equals(memberBankcards.getMembers().getMobilePhone())){
						Path mppath = root.get("members").get("mobilePhone");
						plist.add(builder.like(mppath, "%"+memberBankcards.getMembers().getMobilePhone()+"%"));
					}
					if(memberBankcards.getMembers().getMemberName()!=null&&!"".equals(memberBankcards.getMembers().getMemberName())){
						Path mnpath = root.get("members").get("memberName");
						plist.add(builder.like(mnpath,"%"+memberBankcards.getMembers().getMemberName()+"%"));
					}
				  }
					if(memberBankcards.getCardNo()!=null&&!"".equals(memberBankcards.getCardNo())){
						Path spath = root.get("cardNo");
						plist.add(builder.equal(spath,memberBankcards.getCardNo()));
					}
				}
				return builder.and(plist.toArray(new Predicate[plist.size()]));
			}
		};
		return memberBankcardsRepository.findAll(specification, pageable);
	}

	@Override
	public Page<MemberDepositRecord> findAllMDR(Integer page,Integer size,final MemberDepositRecord memberDepositRecord) {
		Pageable pageable = new PageRequest(page-1,size);
		
		Specification<MemberDepositRecord> specification = new Specification<MemberDepositRecord>() {
			
			@Override
			public Predicate toPredicate(Root<MemberDepositRecord> root, CriteriaQuery<?> query,
					CriteriaBuilder builder) {
			List<Predicate> plist = new ArrayList<>();
				if (memberDepositRecord!=null) {
					 if(memberDepositRecord.getSerialNumber()!=null&&!"".equals(memberDepositRecord.getSerialNumber())){
							Path mppath = root.get("serialNumber");
							plist.add(builder.equal(mppath,memberDepositRecord.getSerialNumber()));
						}
				if(memberDepositRecord.getMembers()!=null){
					if(memberDepositRecord.getMembers().getMobilePhone()!=null&&!"".equals(memberDepositRecord.getMembers().getMobilePhone())){
						Path mppath = root.get("members").get("mobilePhone");
						plist.add(builder.like(mppath, "%"+memberDepositRecord.getMembers().getMobilePhone()+"%"));
					}
				}
					if(memberDepositRecord.getStatus()!=null&&memberDepositRecord.getStatus()>0){
						Path mnpath = root.get("status");
						plist.add(builder.equal(mnpath,memberDepositRecord.getStatus()));
					}
				  }
					if(memberDepositRecord.getPayChannelOrderNo()!=null&&!"".equals(memberDepositRecord.getPayChannelOrderNo())){
						Path spath = root.get("payChannelOrderNo");
						plist.add(builder.equal(spath,memberDepositRecord.getPayChannelOrderNo()));
					}
				return builder.and(plist.toArray(new Predicate[plist.size()]));
			}
		};
		return memberDepositRecordRepository.findAll(specification, pageable);
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

	@Override
	@Transactional
	public void updatesubject_purchase_record() {
		subjectPurchaseRecordJpaRepository.updatesubject_purchase_record();
	}

	@Override
	public Page<SubjectPurchaseRecord> txAll(Integer page,Integer size,final SubjectPurchaseRecord subjectPurchaseRecord) {
		
		Pageable pageable = new PageRequest(page-1,size);
		
		Specification<SubjectPurchaseRecord> specification = new Specification<SubjectPurchaseRecord>() {
			
			@Override
			public Predicate toPredicate(Root<SubjectPurchaseRecord> root, CriteriaQuery<?> query,
					CriteriaBuilder builder) {
			List<Predicate> plist = new ArrayList<>();
				if (subjectPurchaseRecord!=null) {
					 if(subjectPurchaseRecord.getSerialNumber()!=null&&!"".equals(subjectPurchaseRecord.getSerialNumber())){
							Path mppath = root.get("serialNumber");
							plist.add(builder.like(mppath,"%"+subjectPurchaseRecord.getSerialNumber()+"%"));
						}
				if(subjectPurchaseRecord.getMembers()!=null){
					if(subjectPurchaseRecord.getMembers().getMemberName()!=null&&!"".equals(subjectPurchaseRecord.getMembers().getMemberName())){
						Path mppath = root.get("members").get("memberName");
						plist.add(builder.like(mppath, "%"+subjectPurchaseRecord.getMembers().getMemberName()+"%"));
					}
				}
				if(subjectPurchaseRecord.getSubject()!=null){
					if(subjectPurchaseRecord.getSubject().getSubjectId()!=null&&subjectPurchaseRecord.getSubject().getSubjectId()>0){
						Path mnpath = root.get("subject").get("subjectId");
						plist.add(builder.equal(mnpath,subjectPurchaseRecord.getSubject().getSubjectId()));
					}
				  }
				if (subjectPurchaseRecord.getIspayment()!=null&&subjectPurchaseRecord.getIspayment()>-1) {
					Path mnpath = root.get("ispayment");
					plist.add(builder.equal(mnpath,subjectPurchaseRecord.getIspayment()));
				}
			}
				return builder.and(plist.toArray(new Predicate[plist.size()]));
		}
	};
		return subjectPurchaseRecordJpaRepository.findAll(specification, pageable);
 }

	@Override
	public SubjectPurchaseRecord selectAllSPR(Integer sprId) {
		return subjectPurchaseRecordJpaRepository.findOne(sprId);
	}

	@Override
	@Transactional
	public void updateInterest(Float interest,String sStatus,Integer sprId) {
		subjectPurchaseRecordJpaRepository.updateInterest(interest, sStatus, sprId);;
	}

	@Override
	@Transactional
	public void saveMPR(Member_profit_record member_profit_record) {
		member_profit_recordJpaRepository.save(member_profit_record);
	}
}
