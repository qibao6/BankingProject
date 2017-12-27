package com.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 * 		seq_member_bankcards
 * @author LENOVO
 *
 */
@Entity
public class MemberBankcards {
	
	   private Integer memberBankcardsId;
	   private String memberBankcardsType;//银行卡类型
	   private Members members;//用户id
	 //  private Integer memberId;
	   private String cardNo;//卡号
	   private Integer delflag;//是否删除（0：正常使用，2：被删除）
	   private Date createDate;
	   private Date updateDate;
	   private String cardaddress;//开户银行所在地
	
	
	@ManyToOne
	@JoinColumn(name="member_id")
	public Members getMembers() {
		return members;
	}
	public void setMembers(Members members) {
		this.members = members;
	}
	
	@Id
	@SequenceGenerator(name="abc",sequenceName="seq_member_bankcards",allocationSize=1)
	@GeneratedValue(generator="abc",strategy=GenerationType.SEQUENCE)
	public Integer getMemberBankcardsId() {
		return memberBankcardsId;
	}
	public String getMemberBankcardsType() {
		return memberBankcardsType;
	}
	public String getCardNo() {
		return cardNo;
	}
	public Integer getDelflag() {
		return delflag;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public String getCardaddress() {
		return cardaddress;
	}
	public void setMemberBankcardsId(Integer memberBankcardsId) {
		this.memberBankcardsId = memberBankcardsId;
	}
	public void setMemberBankcardsType(String memberBankcardsType) {
		this.memberBankcardsType = memberBankcardsType;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public void setDelflag(Integer delflag) {
		this.delflag = delflag;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public void setCardaddress(String cardaddress) {
		this.cardaddress = cardaddress;
	}
}
