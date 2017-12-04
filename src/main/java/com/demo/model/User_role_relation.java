package com.demo.model;

import java.sql.Date;
/**
 * 用户角色关联表		sql_user_role_relation
 * @author LENOVO
 *
 */
public class User_role_relation {
	   private Integer userId;//   number primary key,-- '用户id',
	   private Integer roleId;//   number,--'角色id',
	   private Date createDate;//  date-- '创建时间',
	   
	public Integer getUserId() {
		return userId;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
