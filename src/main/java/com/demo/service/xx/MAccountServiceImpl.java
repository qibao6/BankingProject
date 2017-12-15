package com.demo.service.xx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.demo.dao.xx.MAccountRepository;
import com.demo.dao.xx.MemberPRRepository;
import com.demo.model.MemberAccount;
import com.demo.model.Member_profit_record;

@Service
public class MAccountServiceImpl implements MAccountService {

	@Autowired
	MAccountRepository mAccountRepository;
	@Autowired
	MemberPRRepository mprRepository;
	@Override
	public MemberAccount findById(Integer id) {
		
		return mAccountRepository.findOne(id);
	}
	@Override
	public Page<Member_profit_record> findAllMPR(Integer page,Integer pagesize) {
		Pageable pageable=new PageRequest(page-1, pagesize);
		
		return mprRepository.findAll(pageable);
	}

}
