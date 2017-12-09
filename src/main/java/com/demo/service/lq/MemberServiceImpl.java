package com.demo.service.lq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.lq.members.FinancialPlannerRepository;
import com.demo.dao.lq.members.MemberAccountRepository;
import com.demo.dao.lq.members.MemberDepositRecordRepository;
import com.demo.dao.lq.members.MembersRepository;
import com.demo.model.FinancialPlanner;
import com.demo.model.MemberAccount;
import com.demo.model.MemberDepositRecord;
import com.demo.model.Members;

@Service
public class MemberServiceImpl implements MembersService {
	
	@Autowired
	MembersRepository membersRepository;
	
	@Autowired
	MemberAccountRepository memberAccountRepository;
	
	@Autowired
	FinancialPlannerRepository financialPlannerRepository;
	
	@Autowired
	MemberDepositRecordRepository memberDepositRecordRepository;

	@Override
	public List<Members> findMembers() {
		return membersRepository.findAll();
	}

	@Override
	public Members membersInfo(Integer memberId) {
		return membersRepository.findOne(memberId);
	}

	@Override
	public MemberAccount meberAccount(Integer memberId) {
		return memberAccountRepository.findOne(memberId);
	}

	@Override
	public FinancialPlanner financialPlanner(Integer memberId) {
		return financialPlannerRepository.findOne(memberId);
	}

	@Override
	public List<MemberDepositRecord> memberDepositRecord(Integer memberId) {
		List<MemberDepositRecord> dlist= memberDepositRecordRepository.memberDepositRecord(memberId);
		return dlist;
	}
}
