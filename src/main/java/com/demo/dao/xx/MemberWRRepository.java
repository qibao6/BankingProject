package com.demo.dao.xx;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.demo.model.MemberWithdrawRecord;
/**
 * 提款记录
 * @author 肖鑫
 *
 */
public interface MemberWRRepository extends JpaRepository<MemberWithdrawRecord, Integer>,JpaSpecificationExecutor<MemberWithdrawRecord> {

}
