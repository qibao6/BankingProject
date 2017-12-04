package com.demo.model;

import java.sql.Date;
/**
 * 				sql_push_notice
 * @author LENOVO
 *
 */
public class Push_notice {
	   private Integer pnID;// number primary key,
	   private String title;//  varchar2(256),
	   private String pnContent;//  CLOB ,
	   private Integer status;//  number ,-- '公告状态',
	   private Date createDate;//  date,
	   private Date updateDate;//  date
	   
	public Integer getPnID() {
		return pnID;
	}
	public String getTitle() {
		return title;
	}
	public String getPnContent() {
		return pnContent;
	}
	public Integer getStatus() {
		return status;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setPnID(Integer pnID) {
		this.pnID = pnID;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPnContent(String pnContent) {
		this.pnContent = pnContent;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
