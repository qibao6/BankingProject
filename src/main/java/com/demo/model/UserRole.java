package com.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * 角色表			sql_user_role
 * @author LENOVO
 *
 */
@Entity(name="user_role")
public class UserRole {
	   private Integer userRoleId;// number primary key,--'主键',
	   private String cname;//  varchar2(32) ,-- '中文名',
	   private String ename;//  varchar2(32) ,-- '英文名',
	   private Integer available;//  number ,-- '是否可用',
	   private String remark;//  varchar2(256) ,-- '备注',
	   private Date createDate;//  date,-- '创建时间',
	   private Date updateDate;//  date ,-- '修改时间',
	   private String userRoleCategory;//  varchar2(32) ,
	   private Integer sourceType;//  number,
	   private Integer sourceId;//  number,
	   private Integer delFlag;//  number
	   
	@Id
	public Integer getUserRoleId() {
		return userRoleId;
	}
	public String getCname() {
		return cname;
	}
	public String getEname() {
		return ename;
	}
	public Integer getAvailable() {
		return available;
	}
	public String getRemark() {
		return remark;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public String getUserRoleCategory() {
		return userRoleCategory;
	}
	public Integer getSourceType() {
		return sourceType;
	}
	public Integer getSourceId() {
		return sourceId;
	}
	public Integer getDelFlag() {
		return delFlag;
	}
	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setAvailable(Integer available) {
		this.available = available;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public void setUserRoleCategory(String userRoleCategory) {
		this.userRoleCategory = userRoleCategory;
	}
	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
	}
	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}
	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}
}
