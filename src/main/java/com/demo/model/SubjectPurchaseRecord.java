package com.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/**
 * 标的购买		sql_subject_purchase_record
 * @author LENOVO
 *购买记录表
 */
@Entity
public class SubjectPurchaseRecord {
	
	   private Integer sprId;//  number primary key,
	   private String serialNumber;//  varchar2(50) ,-- '流水号',
	   private Float amount;//  binary_float, -- '购买金额',
	   private String dealIp;//  varchar2(25) ,-- '交易ip',
	   private Subject subject;//  number ,-- '标的Id',
	   private Members members;//  number,
	   private Integer delflag;//  number,
	   private Date createDate;//  date,
	   private Date updateDate;//  date,
	   private Float interest;//  decimal(16,4) ,-- '结算利息',
	   private Integer ispayment;//  number,--'是否还款',
	   private Integer payInterestTimes;//  number,  
	   private Integer lastProfitDay;//  number,-- '最后计息日',
	   private String bonusInfo;//  varchar2(200) -- '红包金额信息（app端实际投资额度+红包额度）',
	   private String sStatus;//状态
	   
	@Id
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
	@ManyToOne
	@JoinColumn(name="subject_id")
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	@ManyToOne
	@JoinColumn(name="member_id")
	public Members getMembers() {
		return members;
	}
	public void setMembers(Members members) {
		this.members = members;
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
	
	public void setDelflag(Integer delflag) {
		this.delflag = delflag;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	public Float getInterest() {
		return interest;
	}
	public void setInterest(Float interest) {
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
	public String getsStatus() {
		return sStatus;
	}
	public void setsStatus(String sStatus) {
		this.sStatus = sStatus;
	}
	public SubjectPurchaseRecord(String serialNumber, Float amount, String dealIp, Subject subject, Members members,
			Integer delflag, Date createDate, Date updateDate, Float interest, Integer ispayment,
			Integer payInterestTimes, Integer lastProfitDay, String bonusInfo, String sStatus) {
		this.serialNumber = serialNumber;
		this.amount = amount;
		this.dealIp = dealIp;
		this.subject = subject;
		this.members = members;
		this.delflag = delflag;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.interest = interest;
		this.ispayment = ispayment;
		this.payInterestTimes = payInterestTimes;
		this.lastProfitDay = lastProfitDay;
		this.bonusInfo = bonusInfo;
		this.sStatus = sStatus;
	}
}
