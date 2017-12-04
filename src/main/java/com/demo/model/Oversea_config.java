package com.demo.model;

import java.sql.Date;
/**
 * 				sql_oversea_config
 * @author LENOVO
 *
 */
public class Oversea_config {
	   private Integer ocId;//  number primary key,
	   private String title;//  varchar2(255) ,-- '标题',
	   private String ocContent;//   CLOB,--'内容',大数据
	   private Integer sortcolum;//  number ,-- '排序值',
	   private String childTitle;//  varchar2(128) ,-- '子标题',
	   private String ocDescription;//  varchar2(255) ,-- '描述',
	   private String userType;//  varchar2(128) ,-- '用户群体',
	   private Date updtime;//  date,-- '修改时间',
	   private Date addtime;//  date ,-- '添加时间',
	   private String overseaIcon;//  varchar2(200) ,-- '图标',
	   private Date startDate;//  date ,-- '开始时间',
	   private Date endDate;//  date ,-- '结束时间',
	   private Integer status;//  number -- '状态',
	   
	   
	public Integer getOcId() {
		return ocId;
	}
	public String getTitle() {
		return title;
	}
	public String getOcContent() {
		return ocContent;
	}
	public Integer getSortcolum() {
		return sortcolum;
	}
	public String getChildTitle() {
		return childTitle;
	}
	public String getOcDescription() {
		return ocDescription;
	}
	public String getUserType() {
		return userType;
	}
	public Date getUpdtime() {
		return updtime;
	}
	public Date getAddtime() {
		return addtime;
	}
	public String getOverseaIcon() {
		return overseaIcon;
	}
	public Date getStartDate() {
		return startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setOcId(Integer ocId) {
		this.ocId = ocId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setOcContent(String ocContent) {
		this.ocContent = ocContent;
	}
	public void setSortcolum(Integer sortcolum) {
		this.sortcolum = sortcolum;
	}
	public void setChildTitle(String childTitle) {
		this.childTitle = childTitle;
	}
	public void setOcDescription(String ocDescription) {
		this.ocDescription = ocDescription;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public void setUpdtime(Date updtime) {
		this.updtime = updtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	public void setOverseaIcon(String overseaIcon) {
		this.overseaIcon = overseaIcon;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	   
	   
}
