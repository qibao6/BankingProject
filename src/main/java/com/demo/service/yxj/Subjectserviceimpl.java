package com.demo.service.yxj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.yxj.Subjectdao;

@Service
public class Subjectserviceimpl implements Subjectservice{

	
	@Autowired
	Subjectdao subjectdao;
	@Override
	public List<Object[]> findsubindex() {
		
		return subjectdao.findsubindex();
	}

}
