package com.demo.model;

import java.sql.Date;
/**
 * 记账	sql_member_tally
 * @author LENOVO
 *
 */
public class Member_tally {
	   private Integer memberTallyId;// number  primary key,
	   private Integer memberId;//  number,-- '用户id',
	   private Integer typeId;//  number,-- '消费类型id',
	   private String typeName;//  varchar2(32) ,--'消费类型名称',
	   private Float amount;//  binary_float ,--T '金额',
	   private Date payDate;//  date ,
	   private Date createDate;//  date
	   
	public Integer getMemberTallyId() {
		return memberTallyId;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public Float getAmount() {
		return amount;
	}
	public Date getPayDate() {
		return payDate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setMemberTallyId(Integer memberTallyId) {
		this.memberTallyId = memberTallyId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
