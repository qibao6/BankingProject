package com.demo.dao.lq;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Users;

public interface LoginRepository extends JpaRepository<Users,Integer>,UserLoginDao{

}
