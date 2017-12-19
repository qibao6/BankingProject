package com.demo.dao.xx;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.demo.model.SubjectPurchaseRecord;
/**
 * 投资记录表
 * @author 肖鑫
 *
 */
public interface SubjectPRRepository extends JpaRepository<SubjectPurchaseRecord, Integer>,JpaSpecificationExecutor<SubjectPurchaseRecord> {

}
