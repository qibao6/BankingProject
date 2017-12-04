package com.demo.model;

import java.sql.Date;
/**
 * 					sql_subject_field_record
 * @author LENOVO
 *
 */
public class Subject_field_record {
	   private Integer sfrId;//  number primary key,
	   private Integer subjectId;// number,-- '标的Id',
	   private Integer fieldId;//  number,-- '字段id',
	   private String fieldValue;//  varchar2(20) ,-- '字段值',
	   private Integer delflag;//  number,-- '删除标记',
	   private Date createDate;//  date,--'创建日期',
	   private Date updateDate;//  date-- '更新日期',
	   
	public Integer getSfrId() {
		return sfrId;
	}
	public Integer getSubjectId() {
		return subjectId;
	}
	public Integer getFieldId() {
		return fieldId;
	}
	public String getFieldValue() {
		return fieldValue;
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
	public void setSfrId(Integer sfrId) {
		this.sfrId = sfrId;
	}
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	public void setFieldId(Integer fieldId) {
		this.fieldId = fieldId;
	}
	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
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
}
