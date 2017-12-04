package com.demo.model;

import java.sql.Date;
/**
 * 标的购买		sql_subject_purchase_record
 * @author LENOVO
 *
 */
public class Subject_purchase_record {
	
	   private Integer sprId;//  number primary key,
	   private String serialNumber;//  varchar2(50) ,-- '流水号',
	   private Float amount;//  binary_float, -- '购买金额',
	   private String dealIp;//  varchar2(25) ,-- '交易ip',
	   private Integer subjectId;//  number ,-- '标的Id',
	   private Integer memberId;//  number,
	   private Integer delflag;//  number,
	   private Date createDate;//  date,
	   private Date updateDate;//  date,
	   private Integer interest;//  decimal(16,4) ,-- '结算利息',
	   private Integer ispayment;//  number,--'是否还款',
	   private Integer payInterestTimes;//  number,
	   private Integer lastProfitDay;//  number,-- '最后计息日',
	   private String bonusInfo;//  varchar2(200) -- '红包金额信息（app端实际投资额度+红包额度）',
	
	   
	public Integer getSprId() {
		return sprId;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public Float getAmount() {
		return amount;
	}
	public String getDealIp() {
		return dealIp;
	}
	public Integer getSubjectId() {
		return subjectId;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public Integer getDelflag() {
		return delflag;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public Integer getInterest() {
		return interest;
	}
	public Integer getIspayment() {
		return ispayment;
	}
	public Integer getPayInterestTimes() {
		return payInterestTimes;
	}
	public Integer getLastProfitDay() {
		return lastProfitDay;
	}
	public String getBonusInfo() {
		return bonusInfo;
	}
	public void setSprId(Integer sprId) {
		this.sprId = sprId;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public void setDealIp(String dealIp) {
		this.dealIp = dealIp;
	}
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public void setDelflag(Integer delflag) {
		this.delflag = delflag;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public void setInterest(Integer interest) {
		this.interest = interest;
	}
	public void setIspayment(Integer ispayment) {
		this.ispayment = ispayment;
	}
	public void setPayInterestTimes(Integer payInterestTimes) {
		this.payInterestTimes = payInterestTimes;
	}
	public void setLastProfitDay(Integer lastProfitDay) {
		this.lastProfitDay = lastProfitDay;
	}
	public void setBonusInfo(String bonusInfo) {
		this.bonusInfo = bonusInfo;
	}
}
