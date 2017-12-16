package com.demo.service.yxj;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.demo.dao.yxj.SubjectDao;
import com.demo.dao.yxj.SubjectRepository;
import com.demo.model.Subject;

@Service
public class SubjectServiceImpl implements SubjectService{

	
	@Autowired
	SubjectRepository subjectrepository;
	
	//查询显示所有
	@Override
	public List<Object[]> findsubindex() {
		
		return subjectrepository.subjectindex();
		
		
		//return subjectrepository.subjectindex();
	}
//	
//	
	
	//产品中心分页模糊查询
	@Override
	public Page findpageall(Integer size, Integer page, final Subject subject) {
		Pageable pageable=new PageRequest(page-1, size);
		Specification<Subject> specification=new Specification<Subject>() {

			@Override
			public Predicate toPredicate(Root<Subject> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
				List<Predicate> slist=new ArrayList<>();
				if (subject!=null) {
					Path subpath=root.get("subjectType");
					if (subject.getSubjectType()!=null&&!"".equals(subject.getSubjectType())) {
						slist.add(builder.like(subpath, "%"+subject.getSubjectType()+"%"));
					}
				}
				if (subject.getYearRate()!=null&&!"".equals(subject.getYearRate())) {
					Path spath=root.get("year_rate");
					slist.add(builder.like(spath, "%"+subject.getYearRate()+"%"));
				}
				if (subject.getStatus()!=null&&subject.getStatus()!=0) {
					Path sbpath=root.get("status");
					slist.add(builder.equal(sbpath, subject.getStatus()));
				}
				if (subject.getPeriod()!=null&&subject.getPeriod()!=0) {
					Path sbjpath=root.get("period");
					slist.add(builder.equal(sbjpath, subject.getPeriod()));
				}
				
				return builder.and(slist.toArray(new Predicate[slist.size()]));
			}
		};
		
		
		return subjectrepository.findAll(specification,pageable);
	}

	
	//根据id查询对象，订单详情页面
	@Override
	public Subject getByid(Integer subjectId) {
	
		return subjectrepository.findOne(subjectId);
	}

//	@Override
//	public List<Object[]> findsubindex1() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	

}
