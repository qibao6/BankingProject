package com.demo.model;

import java.sql.Date;
/**
 * 角色权限表		sql_role_permission_relation
 * @author LENOVO
 *
 */
public class Role_permission_relation {
	   private String roleId;//  number primary key,-- '角色id',
	   private String permissionEname;//  varchar2(64),-- '权限名称',
	   private Date createDate;//  date ,-- '创建时间',
	   
	public String getRoleId() {
		return roleId;
	}
	public String getPermissionEname() {
		return permissionEname;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public void setPermissionEname(String permissionEname) {
		this.permissionEname = permissionEname;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
