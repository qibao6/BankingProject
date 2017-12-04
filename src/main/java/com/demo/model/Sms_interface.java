package com.demo.model;

import java.sql.Date;
/**
 * 短信接口模板			 sql_sms_interface
 * @author LENOVO
 *
 */
public class Sms_interface {
	
	   private Integer siId;//  number primary key,
	   private String siName;//  varchar2(20) ,-- '短信模板名称',
	   private Integer siType;//  number,-- '担心模板类型',
	   private String address;//  varchar2(200) ,-- '短信模板地址',
	   private String siParam;//  varchar2(200) ,-- '短信模板参数',
	   private String siContent;//  varchar2(2000) ,-- '短信模板内容',
	   private Date createdate;//  date-- '添加时间',
	   
	public Integer getSiId() {
		return siId;
	}
	public String getSiName() {
		return siName;
	}
	public Integer getSiType() {
		return siType;
	}
	public String getAddress() {
		return address;
	}
	public String getSiParam() {
		return siParam;
	}
	public String getSiContent() {
		return siContent;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setSiId(Integer siId) {
		this.siId = siId;
	}
	public void setSiName(String siName) {
		this.siName = siName;
	}
	public void setSiType(Integer siType) {
		this.siType = siType;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setSiParam(String siParam) {
		this.siParam = siParam;
	}
	public void setSiContent(String siContent) {
		this.siContent = siContent;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
}
