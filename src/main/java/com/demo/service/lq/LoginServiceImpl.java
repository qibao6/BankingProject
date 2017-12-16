package com.demo.service.lq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.lq.login.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginRepository loginRepository;

	@Override
	public List<Object[]> inviteRewardsAll() {
		return loginRepository.inviteRewardsAll();
	}

	@Override
	public Object[]  obj(Integer awardRecordsId) {
		return loginRepository.obj(awardRecordsId);
	}

	@Override
	public List<Object[]> olist(Integer awardRecordsId) {
		return loginRepository.olist(awardRecordsId);
	}

	@Override
	public List<Object[]> flist() {
		return loginRepository.flist();
	}

	@Override
	public Object[] sub(Integer subjectId) {
		return loginRepository.sub(subjectId);
	}

}
