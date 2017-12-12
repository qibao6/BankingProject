package com.demo.service.yxj;

import java.util.List;

import org.springframework.data.domain.Page;

import com.demo.model.Subject;

public interface SubjectService {
	
	//显示产品列表
	public List<Object[]> findsubindex();
	
	public Page findpageall(Integer size,Integer page,Subject subject);
	
	public Subject getByid(Integer subjectId);

	//List<Object[]> findsubindex1();
}
