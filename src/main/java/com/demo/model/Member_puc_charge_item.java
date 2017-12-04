package com.demo.model;
/**
 * 缴费项目		sql_member_puc_charge_item
 * @author LENOVO
 *
 */
public class Member_puc_charge_item {
	   private Integer StringmpciId;//  number primary key,
	   private Integer StringmemberId;//  number,--用户id',
	   private Integer StringhomeId;//  number ,
	   private String StringchargeType;//  varchar2(20),--'缴费类别',
	   private Integer StringchargeInstitutionId;//  number ,--'缴费机构id',
	   private String StringchargeInstitutionName;//  varchar2(50) ,--'缴费机构名称',
	   private String StringchargeInstitutionCode;//  varchar2(60) ,--'缴费机构编码',
	   private String StringcustomerCode;//  varchar2(50),-- '客户编码',
	   private String StringmpciComment;//  varchar2(50) --'备注',
	   
	public Integer getStringmpciId() {
		return StringmpciId;
	}
	public Integer getStringmemberId() {
		return StringmemberId;
	}
	public Integer getStringhomeId() {
		return StringhomeId;
	}
	public String getStringchargeType() {
		return StringchargeType;
	}
	public Integer getStringchargeInstitutionId() {
		return StringchargeInstitutionId;
	}
	public String getStringchargeInstitutionName() {
		return StringchargeInstitutionName;
	}
	public String getStringchargeInstitutionCode() {
		return StringchargeInstitutionCode;
	}
	public String getStringcustomerCode() {
		return StringcustomerCode;
	}
	public String getStringmpciComment() {
		return StringmpciComment;
	}
	public void setStringmpciId(Integer stringmpciId) {
		StringmpciId = stringmpciId;
	}
	public void setStringmemberId(Integer stringmemberId) {
		StringmemberId = stringmemberId;
	}
	public void setStringhomeId(Integer stringhomeId) {
		StringhomeId = stringhomeId;
	}
	public void setStringchargeType(String stringchargeType) {
		StringchargeType = stringchargeType;
	}
	public void setStringchargeInstitutionId(Integer stringchargeInstitutionId) {
		StringchargeInstitutionId = stringchargeInstitutionId;
	}
	public void setStringchargeInstitutionName(String stringchargeInstitutionName) {
		StringchargeInstitutionName = stringchargeInstitutionName;
	}
	public void setStringchargeInstitutionCode(String stringchargeInstitutionCode) {
		StringchargeInstitutionCode = stringchargeInstitutionCode;
	}
	public void setStringcustomerCode(String stringcustomerCode) {
		StringcustomerCode = stringcustomerCode;
	}
	public void setStringmpciComment(String stringmpciComment) {
		StringmpciComment = stringmpciComment;
	}
}
