package com.demo.dao.xx;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.demo.model.MemberDepositRecord;
/**
 * 充值记录
 * @author 肖鑫
 *
 */
public interface MemberDRRepository extends JpaRepository<MemberDepositRecord, Integer>,JpaSpecificationExecutor<MemberDepositRecord> {
	
	public MemberDepositRecord findBySerialNumber(String serialNumber);
}
