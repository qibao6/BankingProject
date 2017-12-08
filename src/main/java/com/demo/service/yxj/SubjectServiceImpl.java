package com.demo.service.yxj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.yxj.SubjectDao;
import com.demo.dao.yxj.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService{

	
	@Autowired
	SubjectRepository subjectrepository;
	@Override
	public List<Object[]> findsubindex() {
		
		return subjectrepository.findsublist();
	}

}
