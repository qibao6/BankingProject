package com.demo.model;

import java.sql.Date;

/**
 * 奖励记录表 seq_award_records
 * @author LENOVO
 *
 */
public class Award_records {
	private Integer awardRecords_id;
	private Integer invitingid;//邀请人id
	private Integer byinvitingid;//被邀请人id
	private Integer awardRecordsType;//奖励类型（0：注册奖励，1：投资奖励）
	private Float amount;//奖励金额
	private Integer isaward;//奖励状态 0:未奖励  1：已奖励
	private Date addtime;//添加时间
	public Integer getAwardRecords_id() {
		return awardRecords_id;
	}
	public void setAwardRecords_id(Integer awardRecords_id) {
		this.awardRecords_id = awardRecords_id;
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
	public Integer getAwardRecordsType() {
		return awardRecordsType;
	}
	public void setAwardRecordsType(Integer awardRecordsType) {
		this.awardRecordsType = awardRecordsType;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public Integer getIsaward() {
		return isaward;
	}
	public void setIsaward(Integer isaward) {
		this.isaward = isaward;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	
	
}
