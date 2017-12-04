package com.demo.model;

import java.sql.Date;

/**
 * 用户基本表 		seq_members
 * @author LENOVO
 *
 */
public class Members {
	
	   private Integer member_id;//用户id
	   private String member_name;//真实姓名
	   private String names;//用户名
	   private String passwords;//密码
	   private String salts;//密码盐
	   private String mobile_Phone;//手机号
	   private Integer status;//账号状态（正常，锁定，删除）
	   private Integer del_flag;//删除标志
	   private String member_identity;//身份
	   private Date create_date;//创建时间
	   private Date update_date;//修改时间
	   private String weiBoAccount;//微博账号关联
	   private String weixinAccount;//微信账号关联
	   private Integer headid;//头像图片
	   private String invitationCode;//邀请码
	   private String withdraw_password;//提款密码
	   private String qqAccount;//QQ账号关联
	   private String invitedCode;//被邀请码
	   private String qqNumber;//QQ号码
	public Integer getMember_id() {
		return member_id;
	}
	public String getMember_name() {
		return member_name;
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
	public String getMobile_Phone() {
		return mobile_Phone;
	}
	public Integer getStatus() {
		return status;
	}
	public Integer getDel_flag() {
		return del_flag;
	}
	public String getMember_identity() {
		return member_identity;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public Date getUpdate_date() {
		return update_date;
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
	public String getInvitationCode() {
		return invitationCode;
	}
	public String getWithdraw_password() {
		return withdraw_password;
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
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
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
	public void setMobile_Phone(String mobile_Phone) {
		this.mobile_Phone = mobile_Phone;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public void setDel_flag(Integer del_flag) {
		this.del_flag = del_flag;
	}
	public void setMember_identity(String member_identity) {
		this.member_identity = member_identity;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
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
	public void setInvitationCode(String invitationCode) {
		this.invitationCode = invitationCode;
	}
	public void setWithdraw_password(String withdraw_password) {
		this.withdraw_password = withdraw_password;
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
