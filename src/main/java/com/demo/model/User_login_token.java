package com.demo.model;

import java.sql.Date;
/**
 * 			sql_user_login_token    userId是seq自增
 * @author LENOVO
 *
 */
public class User_login_token {
	   
	   private String token;//  varchar2(64),-- '令牌号',
	   private Integer userId;//   number primary key,-- '用户id',
	   private String userName;//  varchar2(128) ,-- '登录时的用户名，可以是用户名，手机号等',
	   private String ultPassword;//  varchar2(128) ,--'密码',
	   private Date expireTime;//  date,--'有效时间',
	   private Date createDate;//  date,
	   private Date updateDate;//  date
	   
	public String getToken() {
		return token;
	}
	public Integer getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public String getUltPassword() {
		return ultPassword;
	}
	public Date getExpireTime() {
		return expireTime;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUltPassword(String ultPassword) {
		this.ultPassword = ultPassword;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
