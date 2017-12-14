package com.demo.service.xx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.xx.MAccountRepository;
import com.demo.model.MemberAccount;

@Service
public class MAccountServiceImpl implements MAccountService {

	@Autowired
	MAccountRepository mAccountRepository;
	@Override
	public MemberAccount findById(Integer id) {
		
		return mAccountRepository.findOne(id);
	}

}
