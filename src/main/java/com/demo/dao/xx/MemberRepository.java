package com.demo.dao.xx;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Members;
/**
 * 用户表
 * @author 肖鑫
 *
 */
public interface MemberRepository extends JpaRepository<Members, Integer> {

}
