package com.demo.dao.xx;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.FinancialPlanner;
/**
 * 理财师认证
 * @author 肖鑫
 *
 */
public interface FPlannerRepository extends JpaRepository<FinancialPlanner, Integer> {

}
