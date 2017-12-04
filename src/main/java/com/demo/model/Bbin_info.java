package com.demo.model;

import java.sql.Date;

/**
 * 体验金信息	seq_bbin_info
 * @author LENOVO
 *
 */
public class Bbin_info {
	  private Integer bbinInfo_id;
	  private Integer memberId;//会员id
	  private Float amont;//金额
	  private Integer status;//状态(0：是)
	  private Date createDate;//添加时间
	  private Date updateDate;//修改时间
	  
	  
	public Integer getBbinInfo_id() {
		return bbinInfo_id;
	}
	public void setBbinInfo_id(Integer bbinInfo_id) {
		this.bbinInfo_id = bbinInfo_id;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public Float getAmont() {
		return amont;
	}
	public void setAmont(Float amont) {
		this.amont = amont;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	  
	  
	
}
