package com.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * 交易记录表		sql_member_trade_record
 * @author LENOVO
 *
 */
@Entity
public class MemberTradeRecord {
	
	   private Integer mtrId;//  number primary key,
	   private Integer memberId;//  number,--'用户id',
	   private String tradeNo;//  varchar2(50),-- '交易号',
	   private String tradeName;//  varchar2(100),--'交易名称',
	   private String counterpart;//  varchar2(100),-- '交易对方',
	   private Float amount;//  binary_float ,--'交易金额',
	   private String tradeType;//  varchar2(20),--'交易分类',
	   private Integer fundFlow;//  number,--'资金流向(0:流出1:流入)',
	   private Integer tradeStatus;//  number,--'交易状态',
	   private String extFieldA;//  varchar2(50),-- '扩展1',
	   private String extFieldB;//  varchar2(50),--'扩展2',
	   private String extFieldC;//  varchar2(50),--'扩展3',
	   private Date createDate;//  date,
	   private Date updateDate;//  date
	   
	@Id
	public Integer getMtrId() {
		return mtrId;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public String getTradeNo() {
		return tradeNo;
	}
	public String getTradeName() {
		return tradeName;
	}
	public String getCounterpart() {
		return counterpart;
	}
	public Float getAmount() {
		return amount;
	}
	public String getTradeType() {
		return tradeType;
	}
	public Integer getFundFlow() {
		return fundFlow;
	}
	public Integer getTradeStatus() {
		return tradeStatus;
	}
	public String getExtFieldA() {
		return extFieldA;
	}
	public String getExtFieldB() {
		return extFieldB;
	}
	public String getExtFieldC() {
		return extFieldC;
	}
	public void setExtFieldA(String extFieldA) {
		this.extFieldA = extFieldA;
	}
	public void setExtFieldB(String extFieldB) {
		this.extFieldB = extFieldB;
	}
	public void setExtFieldC(String extFieldC) {
		this.extFieldC = extFieldC;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setMtrId(Integer mtrId) {
		this.mtrId = mtrId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	public void setCounterpart(String counterpart) {
		this.counterpart = counterpart;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	public void setFundFlow(Integer fundFlow) {
		this.fundFlow = fundFlow;
	}
	public void setTradeStatus(Integer tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	   
	   
}
