package com.demo.model;

import java.sql.Date;
/**
 * 短信记录表		sms_record
 * @author LENOVO
 *
 */
public class Sms_record {
	   private Integer smsRecordId;//   number primary key,
	   private Integer smsRecordtype;//  number,-- '短信类型',
	   private String phone;//  varchar2(11) ,-- '手机号码',
	   private String smsRecordCode;//  varchar2(2000) ,-- '验证码',
	   private String smsRecordContent;//  varchar2(200) ,-- '短信内容',
	   private String smsRecordResult;//  varchar2(2000) ,-- '返回结果',
	   private Integer status;//  number ,-- '状态',
	   private Date senddate;//  date ,-- '发送时间',
	   private Date createdate;//  date-- '创建时间',
	   
	public Integer getSmsRecordId() {
		return smsRecordId;
	}
	public Integer getSmsRecordtype() {
		return smsRecordtype;
	}
	public String getPhone() {
		return phone;
	}
	public String getSmsRecordCode() {
		return smsRecordCode;
	}
	public String getSmsRecordContent() {
		return smsRecordContent;
	}
	public String getSmsRecordResult() {
		return smsRecordResult;
	}
	public Integer getStatus() {
		return status;
	}
	public Date getSenddate() {
		return senddate;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setSmsRecordId(Integer smsRecordId) {
		this.smsRecordId = smsRecordId;
	}
	public void setSmsRecordtype(Integer smsRecordtype) {
		this.smsRecordtype = smsRecordtype;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setSmsRecordCode(String smsRecordCode) {
		this.smsRecordCode = smsRecordCode;
	}
	public void setSmsRecordContent(String smsRecordContent) {
		this.smsRecordContent = smsRecordContent;
	}
	public void setSmsRecordResult(String smsRecordResult) {
		this.smsRecordResult = smsRecordResult;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public void setSenddate(Date senddate) {
		this.senddate = senddate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
}
