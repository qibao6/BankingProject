package com.demo.dao.xx;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.demo.model.Member_profit_record;
/**
 * 收益记录表
 * @author 肖鑫
 *
 */
public interface MemberPRRepository extends JpaRepository<Member_profit_record, Integer>,JpaSpecificationExecutor<Member_profit_record> {

}
