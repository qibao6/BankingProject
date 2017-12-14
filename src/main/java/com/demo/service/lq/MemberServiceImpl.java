package com.demo.service.lq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	
	@Override
	public List<Members> findMembers() {
		return membersRepository.findAll();
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
	public List<MemberDepositRecord> memberDepositRecord(Integer memberId) {
		m.setMemberId(memberId);
		List<MemberDepositRecord> dlist= memberDepositRecordRepository.findMemberDepositRecordBymembers(m);
		return dlist;
	}

	@Override
	public List<MemberTradeRecord> memberTradeRecord(Integer memberId) {
		m.setMemberId(memberId);
		List<MemberTradeRecord> trlist = memberTradeRecordRepository.findMemberTradeRecordBymembers(m);
		return trlist;
	}

	@Override
	public List<MemberWithdrawRecord> memberWithdrawRecord(Integer memberId) {
		m.setMemberId(memberId);
		List<MemberWithdrawRecord> wrlist = memberWithdrawRecordRepository.findMemberWithdrawRecordBymembers(m);
		return wrlist;
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
}
