package com.demo.dao.lq.members;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.MemberBankcards;

public interface MemberBankcardsRepository extends JpaRepository<MemberBankcards,Integer> {
}
