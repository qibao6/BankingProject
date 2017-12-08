package com.demo.service.lq;

import java.util.List;

import com.demo.model.Members;

public interface MembersService {
	
	/**
	 * 会员管理
	 * 账号管理
	 * @return
	 */
	List<Members> findMembers();
}
