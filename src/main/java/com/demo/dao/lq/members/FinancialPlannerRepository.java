package com.demo.dao.lq.members;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.demo.model.FinancialPlanner;

public interface FinancialPlannerRepository extends JpaRepository<FinancialPlanner,Integer> {
	@Modifying
	@Query("update FinancialPlanner fp  set fp.status = ?1 where fp.financialPlannerId = ?2")
	void updateStatus(Integer status,Integer financialPlannerId);
}
