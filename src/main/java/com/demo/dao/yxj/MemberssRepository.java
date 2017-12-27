package com.demo.dao.yxj;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.demo.model.Members;

public interface MemberssRepository extends JpaRepository<Members, Integer>{
	
	//忘记密码，重置
	@Modifying
	@Query(value="update Members m set m.passwords=?1 where m.mobile_phone=?2",nativeQuery=true)
	public void updatememberspwd(String passwords,String phone);

}
