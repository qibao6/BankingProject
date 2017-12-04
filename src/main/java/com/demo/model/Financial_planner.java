package com.demo.model;

import java.sql.Date;

/**
 * seq_financial_planner
 * @author LENOVO
 *
 */
public class Financial_planner {
	
	   private Integer financial_planner_id;
	   private Integer member_id;//会员id
	   private String financial_planner_name;//真实姓名
	   private String orgname;//机构名称
	   private String  mycard;//我的名片
	   private String address;//邮寄地址
	   private Integer status;
	   private Date create_date;//添加时间
	   private Date update_date;//修改时间
	   
	public Integer getFinancial_planner_id() {
		return financial_planner_id;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public String getFinancial_planner_name() {
		return financial_planner_name;
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
	public Date getCreate_date() {
		return create_date;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setFinancial_planner_id(Integer financial_planner_id) {
		this.financial_planner_id = financial_planner_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public void setFinancial_planner_name(String financial_planner_name) {
		this.financial_planner_name = financial_planner_name;
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
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
}
