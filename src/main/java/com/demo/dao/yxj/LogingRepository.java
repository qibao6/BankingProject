package com.demo.dao.yxj;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaEntityMetadata;
import org.springframework.data.repository.query.Param;

import com.demo.model.Members;

public interface LogingRepository extends JpaRepository<Members, Integer>,LogingDao{
	
	
	@Query("select m from Members m where m.mobilePhone=?1 and m.passwords=?2")
	public Members Loginfront( String mobilePhone, String passwords);
}
