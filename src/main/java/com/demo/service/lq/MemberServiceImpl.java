package com.demo.service.lq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.lq.members.MembersRepository;
import com.demo.model.Members;

@Service
public class MemberServiceImpl implements MembersService {
	
	@Autowired
	MembersRepository membersRepository;

	@Override
	public List<Members> findMembers() {
		return membersRepository.findAll();
	}
}
