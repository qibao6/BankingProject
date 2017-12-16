package com.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 		seq_member_account
 * @author LENOVO
 *
 */
@Entity
public class MemberAccount {
	
	
	   private Integer memberAccountId;
	   private Members members;//用户id
	   private Float useableBalance;//可用余额
	   private Float imusealeBalance;//冻结余额
	   private Float totalProfit;//累计收益
	   private Date createDate;//创建时间
	   private Date updateDate;//修改时间
	   private Float bonusAmount;//红包金额
	   private Float investAmount;//投资总额
	   private Integer delflag;//注册奖励状态（1：注册未奖励  0：注册已奖励）
	   private Float bbinAmount;//体验金
	
	   @ManyToOne
	   @JoinColumn(name="member_id")
		public Members getMembers() {
			return members;
		}

		public void setMembers(Members members) {
			this.members = members;
		}
	   
	@Id
	public Integer getMemberAccountId() {
		return memberAccountId;
	}
	public Float getUseableBalance() {
		return useableBalance;
	}
	public Float getImusealeBalance() {
		return imusealeBalance;
	}
	public Float getTotalProfit() {
		return totalProfit;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public Float getBonusAmount() {
		return bonusAmount;
	}
	public Float getInvestAmount() {
		return investAmount;
	}
	public Integer getDelflag() {
		return delflag;
	}
	public Float getBbinAmount() {
		return bbinAmount;
	}
	public void setMemberAccountId(Integer memberAccountId) {
		this.memberAccountId = memberAccountId;
	}
	public void setUseableBalance(Float useableBalance) {
		this.useableBalance = useableBalance;
	}
	public void setImusealeBalance(Float imusealeBalance) {
		this.imusealeBalance = imusealeBalance;
	}
	public void setTotalProfit(Float totalProfit) {
		this.totalProfit = totalProfit;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public void setBonusAmount(Float bonusAmount) {
		this.bonusAmount = bonusAmount;
	}
	public void setInvestAmount(Float investAmount) {
		this.investAmount = investAmount;
	}
	public void setDelflag(Integer delflag) {
		this.delflag = delflag;
	}
	public void setBbinAmount(Float bbinAmount) {
		this.bbinAmount = bbinAmount;
	}
}
