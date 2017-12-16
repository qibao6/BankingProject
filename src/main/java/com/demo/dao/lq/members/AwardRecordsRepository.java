package com.demo.dao.lq.members;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.demo.model.AwardRecords;

public interface AwardRecordsRepository extends JpaRepository<AwardRecords,Integer> {
	@Modifying
	@Query("update AwardRecords ar  set ar.isaward = ?1 where ar.awardRecordsId = ?2")
	void updateIsaward(Integer isaward,Integer awardRecordsId);
	/**
	 * 奖励记录
	 * @return
	 */
	@Query("select ar from AwardRecords ar where ar.awardRecordsId= ?1")
	List<AwardRecords> arlist(Integer awardRecordsId);
}
