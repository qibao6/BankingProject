package com.demo.dao.yxj;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaEntityMetadata;

import com.demo.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer>,Subjectdao {

}
