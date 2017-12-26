package com.demo.dao.xx;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.MemberBankcards;
import com.demo.model.Members;
/**
 * 银行记录表
 * @author 肖鑫
 *
 */
public interface MemberBankRepository extends JpaRepository<MemberBankcards, Integer> {
	
	public List<MemberBankcards> findByMembers(Members members);
}
