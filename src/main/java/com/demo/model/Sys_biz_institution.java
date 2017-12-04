package com.demo.model;
/**
 * 商业机构			sql_sys_biz_institution
 * @author LENOVO
 *
 */
public class Sys_biz_institution {
	
	   private Integer sbiId;//  number primary key,
	   private String province;//  varchar2(20),-- '省',
	   private String city;//  varchar2(20),--'城市',
	   private String bizType;//  varchar2(10) ,-- '机构类别如缴费JF',
	   private String bizSubType;//  varchar2(10),--'机构子类别如缴费水费WATER',
	   private String institutionName;//  varchar2(50),--'机构名称',
	   private String institutionCode;//  varchar2(50) -- '机构编码',
	   
	public Integer getSbiId() {
		return sbiId;
	}
	public String getProvince() {
		return province;
	}
	public String getCity() {
		return city;
	}
	public String getBizType() {
		return bizType;
	}
	public String getBizSubType() {
		return bizSubType;
	}
	public String getInstitutionName() {
		return institutionName;
	}
	public String getInstitutionCode() {
		return institutionCode;
	}
	public void setSbiId(Integer sbiId) {
		this.sbiId = sbiId;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public void setBizSubType(String bizSubType) {
		this.bizSubType = bizSubType;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}
	   
}
