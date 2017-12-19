package com.demo.model;


import java.util.Date;

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
	   private String weiboaccount;//微博账号关联
	   private String weixinaccount;//微信账号关联
	   private Integer headid;//头像图片
	   private String invitationcode;//邀请码
	   private String withdrawPassword;//提款密码
	   private String qqaccount;//QQ账号关联
	   private String invitedcode;//被邀请码
	   private String qqnumber;//QQ号码
	   
	   
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
	
	public Integer getHeadid() {
		return headid;
	}
	
	public String getWithdrawPassword() {
		return withdrawPassword;
	}
	
	public String getInvitedcode() {
		return invitedcode;
	}
	public void setInvitedcode(String invitedcode) {
		this.invitedcode = invitedcode;
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
	public String getWeiboaccount() {
		return weiboaccount;
	}
	public void setWeiboaccount(String weiboaccount) {
		this.weiboaccount = weiboaccount;
	}
	public String getWeixinaccount() {
		return weixinaccount;
	}
	
	public void setWeixinaccount(String weixinaccount) {
		this.weixinaccount = weixinaccount;
	}
	public void setHeadid(Integer headid) {
		this.headid = headid;
	}
	
	public void setWithdrawPassword(String withdrawPassword) {
		this.withdrawPassword = withdrawPassword;
	}
	public String getQqaccount() {
		return qqaccount;
	}
	public void setQqaccount(String qqaccount) {
		this.qqaccount = qqaccount;
	}
	public String getQqnumber() {
		return qqnumber;
	}
	public void setQqnumber(String qqnumber) {
		this.qqnumber = qqnumber;
	}
}
