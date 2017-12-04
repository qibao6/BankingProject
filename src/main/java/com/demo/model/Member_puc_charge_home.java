package com.demo.model;

import java.sql.Date;
/**
 * 缴费家庭 	
 * @author LENOVO
 *
 */
public class Member_puc_charge_home {
	   private Integer mpchId;// number  primary key,
	   private Integer memberId;//  number ,--'用户id',
	   private String name;//  varchar2(50),--'家庭名称',
	   private Integer isDefault;// number,--'是否默认(0:n1:y)',
	   private Date createDate;//  date,
	   private Date updateDate;//  date
	   
	public Integer getMpchId() {
		return mpchId;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public String getName() {
		return name;
	}
	public Integer getIsDefault() {
		return isDefault;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setMpchId(Integer mpchId) {
		this.mpchId = mpchId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
