package com.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 奖励记录表 seq_award_records
 * @author LENOVO
 *
 */
@Entity
public class AwardRecords {
	private Integer awardRecordsId;
	private Integer invitingid;//邀请人id
	private Integer byinvitingid;//被邀请人id
	private Integer awardRecordsType;//奖励类型（0：注册奖励，1：投资奖励）
	private Float amount;//奖励金额
	private Integer isaward;//奖励状态 0:未奖励  1：已奖励
	private Date addtime;//添加时间
	
	
	@Id
	public Integer getAwardRecordsId() {
		return awardRecordsId;
	}
	public void setAwardRecordsId(Integer awardRecordsId) {
		this.awardRecordsId = awardRecordsId;
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
