package com.demo.dao.lq.login;

import java.util.List;

public interface UserLoginDao {
	
	/**
	 * 后台用户登陆
	 * @param userName
	 * @return
	 */
	Object[] login(String userName);
	
	
	List<Object> inviteRewardsAll();
	
}
