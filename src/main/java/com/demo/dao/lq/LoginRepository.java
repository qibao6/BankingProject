package com.demo.dao.lq;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.User_role;

public interface LoginRepository extends JpaRepository<User_role,Integer> {

}
