package com.demo.model;

import java.sql.Date;
/**
 * 体验金购买标的		sql_sbpr
 * @author LENOVO
 *
 */
public class Subject_bbin_purchase_record {
	   private Integer sbpr_id;// number primary key,
	   private String serial_number;//  varchar2(50) ,-- '流水号',
	   private Float amount;//   binary_float,-- '购买金额',
	   private String deal_ip;//  varchar2(25) ,-- '交易ip',
	   private Integer subject_id;//  number ,-- '标的Id',
	   private Integer member_id;//  number ,
	   private Integer delflag;//  number,
	   private Date create_date;//  date,
	   private Date update_date;//  date,
	   private Integer interest;//  decimal(16,4) ,-- '结算利息',
	   private Integer ispayment;//  number,--'是否还款',
	   private Integer pay_interest_times;//  number,
	   private Integer last_profit_day;//  number--'最后计息日',
	   
	   
	public Integer getSbpr_id() {
		return sbpr_id;
	}
	public String getSerial_number() {
		return serial_number;
	}
	public Float getAmount() {
		return amount;
	}
	public String getDeal_ip() {
		return deal_ip;
	}
	public Integer getSubject_id() {
		return subject_id;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public Integer getDelflag() {
		return delflag;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public Integer getInterest() {
		return interest;
	}
	public Integer getIspayment() {
		return ispayment;
	}
	public Integer getPay_interest_times() {
		return pay_interest_times;
	}
	public Integer getLast_profit_day() {
		return last_profit_day;
	}
	public void setSbpr_id(Integer sbpr_id) {
		this.sbpr_id = sbpr_id;
	}
	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public void setDeal_ip(String deal_ip) {
		this.deal_ip = deal_ip;
	}
	public void setSubject_id(Integer subject_id) {
		this.subject_id = subject_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public void setDelflag(Integer delflag) {
		this.delflag = delflag;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	public void setInterest(Integer interest) {
		this.interest = interest;
	}
	public void setIspayment(Integer ispayment) {
		this.ispayment = ispayment;
	}
	public void setPay_interest_times(Integer pay_interest_times) {
		this.pay_interest_times = pay_interest_times;
	}
	public void setLast_profit_day(Integer last_profit_day) {
		this.last_profit_day = last_profit_day;
	}
}
