package com.demo.dao.lq.members;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.FinancialPlanner;

public interface FinancialPlannerRepository extends JpaRepository<FinancialPlanner,Integer> {

}
