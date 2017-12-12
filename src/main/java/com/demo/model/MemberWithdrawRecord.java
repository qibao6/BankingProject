package com.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 提现记录表 		sql_member_withdraw_record
 * @author LENOVO
 *
 */
@Entity
public class MemberWithdrawRecord {
	
	   private Integer mwrId;// number primary key,
	   private String serialNumber;//  varchar2(50) ,-- '流水号',
	   private Integer memberId;//  number,--'用户id',
	   private Float amount;//  binary_float ,-- '提现金额',
	   private String bankName;//  varchar2(20) ,-- '银行名称',
	   private String bankCard;//  varchar2(50) ,-- '卡号',
	   private Integer status;//  number,-- '提现状态(0:待审核;1:已打款;2打款中;3:打款失败)',
	   private Integer delFlag;//  number,
	   private String cardaddress;//  varchar2(200) ,-- '开户银行所在地',
	   private String channelName;//  varchar2(200) ,-- '打款通道（富友,贝付）',
	   private Date createDate;//  date,
	   private Date updateDate;//  date
	   
	@Id
	public Integer getMwrId() {
		return mwrId;
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
	public String getBankName() {
		return bankName;
	}
	public String getBankCard() {
		return bankCard;
	}
	public Integer getStatus() {
		return status;
	}
	public Integer getDelFlag() {
		return delFlag;
	}
	public String getCardaddress() {
		return cardaddress;
	}
	public String getChannelName() {
		return channelName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setMwrId(Integer mwrId) {
		this.mwrId = mwrId;
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
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}
	public void setCardaddress(String cardaddress) {
		this.cardaddress = cardaddress;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
