package com.demo.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
/**
 * 用户基本表			sql_users
 * @author LENOVO
 *
 */
@Entity(name="users")
public class Users {
	   private Integer usersId;// number primary key,--'用户id',
	   private String userName;//  varchar2(32) ,-- '用户名',
	   private String usersName;//  varchar2(32) ,-- '名称',
	   private String usersPassword;//  varchar2(256) ,-- '密码',
	   private String usersSalt;//  varchar2(32) ,-- '密码盐',
	   private String mobilePhone;//  varchar2(32) ,-- '手机号',
	   private Integer status;//  number ,-- '账号状态（正常，锁定，删除）',
	   private Integer delFlag;//  number ,-- '删除标志',
	   private Integer usersIdentity;//  number ,-- '身份',
	   private Date createDate;//  date,-- '创建时间',
	   private Date updateDate;//  date-- '修改时间',
	   
	   private Set<UserRole> userRole = new HashSet<>();
	
	   
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="TEACHER_student",
		       joinColumns=@JoinColumn(name="users_id"),
		       inverseJoinColumns=@JoinColumn(name="user_role_id"))
	public Set<UserRole> getUserRole() {
		return userRole;
	}
	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}
	@Id
	@SequenceGenerator(name="users",sequenceName="sql_users",allocationSize=1)
	@GeneratedValue(generator="users",strategy=GenerationType.SEQUENCE)
	public Integer getUsersId() {
		return usersId;
	}
	public String getUserName() {
		return userName;
	}
	public String getUsersName() {
		return usersName;
	}
	public String getUsersPassword() {
		return usersPassword;
	}
	public String getUsersSalt() {
		return usersSalt;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public Integer getStatus() {
		return status;
	}
	public Integer getDelFlag() {
		return delFlag;
	}
	public Integer getUsersIdentity() {
		return usersIdentity;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUsersId(Integer usersId) {
		this.usersId = usersId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}
	public void setUsersPassword(String usersPassword) {
		this.usersPassword = usersPassword;
	}
	public void setUsersSalt(String usersSalt) {
		this.usersSalt = usersSalt;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}
	public void setUsersIdentity(Integer usersIdentity) {
		this.usersIdentity = usersIdentity;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
