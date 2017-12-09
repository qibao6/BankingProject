package com.demo.service.yxj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.demo.dao.yxj.LogingRepository;
import com.demo.model.Members;

@Service
public class LoginServicesImpl implements LoginServices{
	
	@Autowired
	LogingRepository loginRepository;

	@Override
	public Members llist(String mobilePhone, String passwords) {
		
		return loginRepository.Loginfront(mobilePhone, passwords);
	}

}
