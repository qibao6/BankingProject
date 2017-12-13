package com.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 用户基本表 		seq_members
 * @author LENOVO
 *
 */
@Entity
public class Members {
	
	   private Integer memberId;//用户id
	   private String memberName;//真实姓名
	   private String names;//用户名
	   private String passwords;//密码
	   private String salts;//密码盐
	   private String mobilePhone;//手机号
	   private Integer status;//账号状态（正常，锁定，删除）
	   private Integer delFlag;//删除标志
	   private String memberIdentity;//身份
	   private Date createDate;//创建时间
	   private Date updateDate;//修改时间
	   private String weiBoAccount;//微博账号关联
	   private String weixinAccount;//微信账号关联
	   private Integer headid;//头像图片
	   private String invitationcode;//邀请码
	   private String withdrawPassword;//提款密码
	   private String qqAccount;//QQ账号关联
	   private String invitedCode;//被邀请码
	   private String qqNumber;//QQ号码
	   
	   
	@Id
	public Integer getMemberId() {
		return memberId;
	}
	public String getInvitationcode() {
		return invitationcode;
	}
	public void setInvitationcode(String invitationcode) {
		this.invitationcode = invitationcode;
	}
	public String getMemberName() {
		return memberName;
	}
	public String getNames() {
		return names;
	}
	public String getPasswords() {
		return passwords;
	}
	public String getSalts() {
		return salts;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public Integer getStatus() {
		return status;
	}
	public Integer getDelFlag() {
		return delFlag;
	}
	public String getMemberIdentity() {
		return memberIdentity;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public String getWeiBoAccount() {
		return weiBoAccount;
	}
	public String getWeixinAccount() {
		return weixinAccount;
	}
	public Integer getHeadid() {
		return headid;
	}
	
	public String getWithdrawPassword() {
		return withdrawPassword;
	}
	public String getQqAccount() {
		return qqAccount;
	}
	public String getInvitedCode() {
		return invitedCode;
	}
	public String getQqNumber() {
		return qqNumber;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}
	public void setSalts(String salts) {
		this.salts = salts;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}
	public void setMemberIdentity(String memberIdentity) {
		this.memberIdentity = memberIdentity;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public void setWeiBoAccount(String weiBoAccount) {
		this.weiBoAccount = weiBoAccount;
	}
	public void setWeixinAccount(String weixinAccount) {
		this.weixinAccount = weixinAccount;
	}
	public void setHeadid(Integer headid) {
		this.headid = headid;
	}
	
	public void setWithdrawPassword(String withdrawPassword) {
		this.withdrawPassword = withdrawPassword;
	}
	public void setQqAccount(String qqAccount) {
		this.qqAccount = qqAccount;
	}
	public void setInvitedCode(String invitedCode) {
		this.invitedCode = invitedCode;
	}
	public void setQqNumber(String qqNumber) {
		this.qqNumber = qqNumber;
	}
}
