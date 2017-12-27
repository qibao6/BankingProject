package com.demo.dao.lq.members;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.demo.model.Members;

public interface MembersRepository extends JpaRepository<Members,Integer>,JpaSpecificationExecutor<Members>{
	/**
	 * 查询被邀请人id
	 * @param memberId
	 * @return
	 */
	@Query("select m from Members m where m.memberId= ?1")
	List<Members> mlist(Integer memberId);
}
