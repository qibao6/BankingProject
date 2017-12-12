package com.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * seq_financial_planner
 * @author LENOVO
 *
 */
@Entity
public class FinancialPlanner {
	
	   private Integer financialPlannerId;
	   private Members members;
	   //private Integer memberId;//会员id
	   private String financialPlannerName;//真实姓名
	   private String orgname;//机构名称
	   private String  mycard;//我的名片
	   private String address;//邮寄地址
	   private Integer status;
	   private Date createDate;//添加时间
	   private Date updateDate;//修改时间
	   
	  
	
	   
	@ManyToOne
	@JoinColumn(name="member_id")
	public Members getMembers() {
		return members;
	}

	public void setMembers(Members members) {
		this.members = members;
	}

	@Id
	public Integer getFinancialPlannerId() {
		return financialPlannerId;
	}
	
	public String getFinancialPlannerName() {
		return financialPlannerName;
	}
	public String getOrgname() {
		return orgname;
	}
	public String getMycard() {
		return mycard;
	}
	public String getAddress() {
		return address;
	}
	public Integer getStatus() {
		return status;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setFinancialPlannerId(Integer financialPlannerId) {
		this.financialPlannerId = financialPlannerId;
	}
	
	public void setFinancialPlannerName(String financialPlannerName) {
		this.financialPlannerName = financialPlannerName;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public void setMycard(String mycard) {
		this.mycard = mycard;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
