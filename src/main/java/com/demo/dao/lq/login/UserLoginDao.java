package com.demo.dao.lq.login;

public interface UserLoginDao {
	
	/**
	 * 后台用户登陆
	 * @param userName
	 * @return
	 */
	Object[] login(String userName);
	
}
