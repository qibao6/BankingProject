package com.demo.dao.xx;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.demo.model.Finance_product_subscribe;

public interface FPSRepository extends JpaRepository<Finance_product_subscribe, Integer>,JpaSpecificationExecutor<Finance_product_subscribe> {

}
