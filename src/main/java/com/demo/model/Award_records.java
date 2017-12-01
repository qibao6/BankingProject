package com.demo.model;

import java.sql.Date;

public class Award_records {
	
	private Integer award_records_id;
	private Integer invitingid;
	private Integer byinvitingid;
	private Integer type;
	private Double amount;
	private Integer isAward;
	private Date addTime;
	public Integer getAward_records_id() {
		return award_records_id;
	}
	public void setAward_records_id(Integer award_records_id) {
		this.award_records_id = award_records_id;
	}
	public Integer getInvitingid() {
		return invitingid;
	}
	public void setInvitingid(Integer invitingid) {
		this.invitingid = invitingid;
	}
	public Integer getByinvitingid() {
		return byinvitingid;
	}
	public void setByinvitingid(Integer byinvitingid) {
		this.byinvitingid = byinvitingid;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Integer getIsAward() {
		return isAward;
	}
	public void setIsAward(Integer isAward) {
		this.isAward = isAward;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	
}
