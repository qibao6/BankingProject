package com.demo.model;

import java.sql.Date;

/**
 * 		seq_member_account
 * @author LENOVO
 *
 */
public class Member_account {
	
	
	   private Integer memberAccountId;
	   private Integer memberId;//用户id
	   private Float useableBalance;//可用余额
	   private Float imusealeBalance;//冻结余额
	   private Float totalProfit;//累计收益
	   private Date createDate;//创建时间
	   private Date updateDate;//修改时间
	   private Float bonusAmount;//红包金额
	   private Float investAmount;//投资总额
	   private Integer delflag;//
	   private Float bbinAmount;//体验金
	   
	   
	public Integer getMemberAccountId() {
		return memberAccountId;
	}
	public Integer getMemberId() {
		return memberId;
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
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
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
