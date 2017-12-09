package com.demo.dao.lq.members;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.MemberAccount;

public interface MemberAccountRepository extends JpaRepository<MemberAccount, Integer> {

}
