package com.demo.model;

import java.sql.Date;
/**
 * 			sql_oversea_config_subscribe
 * @author LENOVO
 *
 */
public class Oversea_config_subscribe {
	
	   private Integer ocsId;//  number primary key,
	   private Integer memberId;//  number,-- '会员id',
	   private Integer overseaId;//  number ,-- '海外配置id',
	   private String ocsName;//  varchar2(200) ,-- '姓名',
	   private String phone;//  varchar2(200) ,-- '电话',
	   private String addr;//  varchar2(200) ,-- '地址',
	   private Integer status;//  number,
	   private Date createDate;//  date,
	   private Date updateDate;//  date
	   
	   
	public Integer getOcsId() {
		return ocsId;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public Integer getOverseaId() {
		return overseaId;
	}
	public String getOcsName() {
		return ocsName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddr() {
		return addr;
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
	public void setOcsId(Integer ocsId) {
		this.ocsId = ocsId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public void setOverseaId(Integer overseaId) {
		this.overseaId = overseaId;
	}
	public void setOcsName(String ocsName) {
		this.ocsName = ocsName;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddr(String addr) {
		this.addr = addr;
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
