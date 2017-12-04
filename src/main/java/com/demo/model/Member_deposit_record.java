package com.demo.model;

import java.sql.Date;

/**
 * 充值记录表		seq_member_deposit_record
 * @author LENOVO
 *
 */
public class Member_deposit_record {
	   private Integer memberDepositRecordId;
	   private String serialNumber;//流水号
	   private Integer memberId;//用户id
	   private Float amount;//金额
	   private Integer status;//状态(0:待付款;1:完成)
	   private String payChannelName;//充值渠道名称
	   private String payChannelOrderNo;//充值渠道订单号
	   private Integer delFlag;
	   private Date createDate;
	   private Date updateDate;
	   
	public Integer getMemberDepositRecordId() {
		return memberDepositRecordId;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public Float getAmount() {
		return amount;
	}
	public Integer getStatus() {
		return status;
	}
	public String getPayChannelName() {
		return payChannelName;
	}
	public String getPayChannelOrderNo() {
		return payChannelOrderNo;
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
	public void setMemberDepositRecordId(Integer memberDepositRecordId) {
		this.memberDepositRecordId = memberDepositRecordId;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public void setPayChannelName(String payChannelName) {
		this.payChannelName = payChannelName;
	}
	public void setPayChannelOrderNo(String payChannelOrderNo) {
		this.payChannelOrderNo = payChannelOrderNo;
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
