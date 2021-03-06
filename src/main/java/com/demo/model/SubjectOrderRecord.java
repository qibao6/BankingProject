package com.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * 标的订单			sql_subject_order_record
 * @author LENOVO
 *订单信息表
 */
@Entity
public class SubjectOrderRecord {
	
	   private Integer sorId;//  number primary key,
	   private String serialNumber;//  varchar2(50) ,-- '流水号',
	   private Integer dealType;//  number ,-- '交易类型',
	   private Float amount;//  binary_float,-- '订单金额',
	   private Integer status;//  number,-- '订单状态',
	   private Integer subjectId;//  number,-- '标的id',
	   private Integer memberId;//  number,-- '用户id',
	   private Integer delflag;//  number,-- '是否删除',
	   private Date createDate;//  date,--'创建日期',
	   private Date updateDate;//  date--'更新日期',
	   
	@Id   
	@SequenceGenerator(name="abc",sequenceName="sql_subject_order_record",allocationSize=1)
	@GeneratedValue(generator="abc",strategy=GenerationType.SEQUENCE)
	public Integer getSorId() {
		return sorId;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public Integer getDealType() {
		return dealType;
	}
	public Float getAmount() {
		return amount;
	}
	public Integer getStatus() {
		return status;
	}
	public Integer getSubjectId() {
		return subjectId;
	}
	public Integer getMemberId() {
		return memberId;
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
	public void setSorId(Integer sorId) {
		this.sorId = sorId;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public void setDealType(Integer dealType) {
		this.dealType = dealType;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
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
	public SubjectOrderRecord(String serialNumber, Integer dealType, Float amount, Integer status, Integer subjectId,
			Integer memberId, Integer delflag, Date createDate, Date updateDate) {
	
		this.serialNumber = serialNumber;
		this.dealType = dealType;
		this.amount = amount;
		this.status = status;
		this.subjectId = subjectId;
		this.memberId = memberId;
		this.delflag = delflag;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	public SubjectOrderRecord() {
		
	}
	   
	   
}
