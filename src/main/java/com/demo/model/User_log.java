package com.demo.model;

import java.sql.Date;
/**
 * 登录日志			sql_user_log
 * @author LENOVO
 *
 */
public class User_log {
	   private Integer user_log_id;// number primary key,
	   private Integer user_id;//  number ,-- '用户id',
	   private Integer action;// number,-- '动作',
	   private Date create_date;//  date ,-- '创建时间',
	   private Date update_date;//  date-- '修改时间',
	   
	   
	public Integer getUser_log_id() {
		return user_log_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public Integer getAction() {
		return action;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUser_log_id(Integer user_log_id) {
		this.user_log_id = user_log_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public void setAction(Integer action) {
		this.action = action;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
}
