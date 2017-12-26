package com.demo.service.yxj;

import java.util.List;

import com.demo.model.Members;

public interface LoginServices {
	public Members llist(String mobilePhone,String passwords);
	//短信验证
	public Integer message(String phone) throws Exception;
	
	//注册，添加用户到member表
		public void addmember(Members members);
}
