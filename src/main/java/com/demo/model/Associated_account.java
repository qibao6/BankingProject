package com.demo.model;

import java.sql.Date;

public class Associated_account {
	
	private Integer id;
	private Integer member_id;
	private String type;
	private String name;
	private String identifying;
	private Integer stauts;
	private Date create_date;
	private Date update_date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIdentifying() {
		return identifying;
	}
	public void setIdentifying(String identifying) {
		this.identifying = identifying;
	}
	public Integer getStauts() {
		return stauts;
	}
	public void setStauts(Integer stauts) {
		this.stauts = stauts;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	
}
