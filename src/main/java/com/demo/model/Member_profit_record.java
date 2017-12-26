package com.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 收益记录表
 * 		sql_member_profit_record
 * @author LENOVO
 *
 */
@Entity
public class Member_profit_record {
	   private Integer mprId;
	   private String serialNumber;//流水号
	   private Integer mprType;
	   private Float amount;//金额
	   private Members memberId;//用户id
	   private Integer delflag;
	   private Date createDate;
	   private Date updateDate;
	   private String mprComment;//备注
	   private Integer purchaseId;//标的id
	   private Integer profitYear;//计息年
	   private Integer profitMonth;//计息月
	   private Integer profitDay;//计息日
	   
	@Id
	public Integer getMprId() {
		return mprId;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public Integer getMprType() {
		return mprType;
	}
	public Float getAmount() {
		return amount;
	}
	@ManyToOne
	@JoinColumn(name="member_id")
	public Members getMemberId() {
		return memberId;
	}
	public void setMemberId(Members memberId) {
		this.memberId = memberId;
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
	public String getMprComment() {
		return mprComment;
	}
	public Integer getPurchaseId() {
		return purchaseId;
	}
	public Integer getProfitYear() {
		return profitYear;
	}
	public Integer getProfitMonth() {
		return profitMonth;
	}
	public Integer getProfitDay() {
		return profitDay;
	}
	public void setMprId(Integer mprId) {
		this.mprId = mprId;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public void setMprType(Integer mprType) {
		this.mprType = mprType;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
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
	public void setMprComment(String mprComment) {
		this.mprComment = mprComment;
	}
	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}
	public void setProfitYear(Integer profitYear) {
		this.profitYear = profitYear;
	}
	public void setProfitMonth(Integer profitMonth) {
		this.profitMonth = profitMonth;
	}
	public void setProfitDay(Integer profitDay) {
		this.profitDay = profitDay;
	}
}
