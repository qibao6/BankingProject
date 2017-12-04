package com.demo.model;

import java.sql.Date;

/**
 * 关联账号表（第三方登录信息表） seq_associated_account
 * @author LENOVO
 *
 */
public class Associated_account {
	
	private Integer  associatedAccountId;
	private Integer memberId;//会员id
	private String associatedAccountType;//账号类型（微信，QQ）
	private String associatedAccountName;//账号名称
	private Integer status;
	private Date createDate;//添加时间
	private Date updateDate;//修改时间
	
	
	public Integer getAssociatedAccountId() {
		return associatedAccountId;
	}
	public void setAssociatedAccountId(Integer associatedAccountId) {
		this.associatedAccountId = associatedAccountId;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public String getAssociatedAccountType() {
		return associatedAccountType;
	}
	public void setAssociatedAccountType(String associatedAccountType) {
		this.associatedAccountType = associatedAccountType;
	}
	public String getAssociatedAccountName() {
		return associatedAccountName;
	}
	public void setAssociatedAccountName(String associatedAccountName) {
		this.associatedAccountName = associatedAccountName;
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
