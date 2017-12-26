package com.demo.dao.yxj;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.demo.model.MemberAccount;

public interface MemberAccountsRepository extends JpaRepository<MemberAccount,Integer>{

	//查询用户资金表
	@Query(value="select ma.* from Member_account ma where ma.member_id=?1",nativeQuery=true)
	public MemberAccount selectmoney(Integer member_id);
	
	//购买后修改用户资金信息，可用余额减少，冻结金额增加，投资总额增加
	@Modifying
	@Query(value="update Member_Account ma   set ma.useable_Balance=ma.useable_Balance-?1 , ma.invest_Amount=ma.invest_Amount+?1 ,"
			+ "  ma.imuseale_Balance=ma.imuseale_Balance+?1 where ma.member_Id= ?2",nativeQuery=true)
	public void updatememberaccount(Float amount,Integer memberId);
}
