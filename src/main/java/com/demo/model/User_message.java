package com.demo.model;

import java.sql.Date;
/**
 * 用户消息表		sql_user_message
 * @author LENOVO
 *
 */
public class User_message {
	   private Integer umId;// number primary key,-- '主键',
	   private Integer userId;//  number ,-- '用户id',
	   private String title;//  varchar2(128) ,-- '消息标题',
	   private Integer businessType;// number ,-- '业务类别',
	   private Integer ownerId;//  number ,-- '业务id',
	   private String umContent;//  CLOB,--  '消息内容',
	   private Integer msgStatus;// number ,-- '状态,(已读未读)',
	   private Integer delFlag;//  number ,-- '删除标志',
	   private Date createDate;//  date ,-- '创建时间',
	   private Date updateDate;//  date -- 'PRIMARY KEY ( id )
	   
	public Integer getUmId() {
		return umId;
	}
	public Integer getUserId() {
		return userId;
	}
	public String getTitle() {
		return title;
	}
	public Integer getBusinessType() {
		return businessType;
	}
	public Integer getOwnerId() {
		return ownerId;
	}
	public String getUmContent() {
		return umContent;
	}
	public Integer getMsgStatus() {
		return msgStatus;
	}
	public Integer getDelFlag() {
		return delFlag;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUmId(Integer umId) {
		this.umId = umId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setBusinessType(Integer businessType) {
		this.businessType = businessType;
	}
	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}
	public void setUmContent(String umContent) {
		this.umContent = umContent;
	}
	public void setMsgStatus(Integer msgStatus) {
		this.msgStatus = msgStatus;
	}
	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
