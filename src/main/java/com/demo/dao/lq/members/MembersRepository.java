package com.demo.dao.lq.members;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.dao.lq.login.UserLoginDao;
import com.demo.model.Members;

public interface MembersRepository extends JpaRepository<Members,Integer>{

}
