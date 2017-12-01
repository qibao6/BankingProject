package com.demo.model;

import java.sql.Date;

public class Bbin_info {
	
	private Integer bbin_info_id;
	private Integer member_id;
	private Float amont;
	private Integer stauts;
	private Date create_data;
	private Date update_date;
	
	
	public Integer getBbin_info_id() {
		return bbin_info_id;
	}
	public void setBbin_info_id(Integer bbin_info_id) {
		this.bbin_info_id = bbin_info_id;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public Float getAmont() {
		return amont;
	}
	public void setAmont(Float amont) {
		this.amont = amont;
	}
	public Integer getStauts() {
		return stauts;
	}
	public void setStauts(Integer stauts) {
		this.stauts = stauts;
	}
	public Date getCreate_data() {
		return create_data;
	}
	public void setCreate_data(Date create_data) {
		this.create_data = create_data;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	
}
