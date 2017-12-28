package com.demo.dao.yxj;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.demo.model.Subject;

public interface SubjectDao {
	//显示 产品列表
		public List<Object[]> findsublist(Subject subject,Integer page,Integer rowsize);

		public Object[] getGushouGouMai(Integer subjectId);
	
//	    @Query(value="select * from member_account",nativeQuery=true)
//		public List<Object[]> querymoney();
	
}
