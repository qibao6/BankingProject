package com.demo.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * 		sql_subject
 * @author LENOVO
 *
 */

@Entity
public class Subject {
	   private Integer subjectId;// number primary key,
	   private String serialNumber;//  varchar2(50) ,-- '流水号',
	   private String serialNo;//  varchar2(50) ,-- '合同号',
	   private String subjectName;//  varchar2(500) ,-- '标的名称',
	   private Integer subjectType;//   CLOB,-- '标的类型',
	   private Integer status;// number,-- '标的状态',
	   private Float floorAmount;//   binary_float,-- '起投金额',
	   private Float amount;// binary_float,-- '标的金额',
	   private Integer firstId;//  number ,-- '始标id',
	   private Integer parentId;//  number ,-- '父标id',
	   private Integer period;//  number,-- '标的周期',
	   private String purpose;//  varchar2(500) ,-- '借款目的',
	   private Date raiseStart;//  date ,-- '募集开始',
	   private Date raiseEnd;//  date,-- '募集结束',
	   private Integer refundWay;//  number,-- '还款方式',
	   private Integer safeguardWay;// number ,-- '保障方式',
	   private Date startDate;//  date,-- '标的开始日期',
	   private Date endDate;//  date,-- '标的结束日期',
	   private String year_rate;//  decimal(16,4) ,-- '年化率',NUMBER(16,4):7.0000
	   private String subjectComment;//   CLOB, --'产品速览',
	   private Integer folderId;//  number,-- '文件夹Id',
	   private Integer delflag;//  number,-- '是否删除',
	   private Date updateDate;//  date,-- '更新日期',
	   private Date createDate;//  date,-- '创建日期',
	   private String borrowername;//  varchar2(100) ,-- '借款人姓名',
	   private Integer borrowerid;//  number,--'借款人id',
	   private Integer bought;//  number,--'已购人数',
	   private String projectdetails;//  CLOB,-- '项目详情',
	   private String safetycontrol;//  CLOB,--'安全保障',
	   private Integer experStatus;//  number-- '体验金是否可以购买（0：否，1：是）',
	
	   
	@Id
	
	public Integer getSubjectId() {
		return subjectId;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public Integer getSubjectType() {
		return subjectType;
	}
	public void setSubjectType(Integer subjectType) {
		this.subjectType = subjectType;
	}
	public Integer getStatus() {
		return status;
	}
	public Float getFloorAmount() {
		return floorAmount;
	}
	public Float getAmount() {
		return amount;
	}
	public Integer getFirstId() {
		return firstId;
	}
	public Integer getParentId() {
		return parentId;
	}
	public Integer getPeriod() {
		return period;
	}
	public String getPurpose() {
		return purpose;
	}
	public Date getRaiseStart() {
		return raiseStart;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public String getYear_rate() {
		return year_rate;
	}
	public String getSubjectComment() {
		return subjectComment;
	}
	public Integer getFolderId() {
		return folderId;
	}
	public Integer getDelflag() {
		return delflag;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public String getBorrowername() {
		return borrowername;
	}
	public Integer getBorrowerid() {
		return borrowerid;
	}
	public Integer getBought() {
		return bought;
	}
	
	
	public Integer getExperStatus() {
		return experStatus;
	}
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public void setFloorAmount(Float floorAmount) {
		this.floorAmount = floorAmount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public void setFirstId(Integer firstId) {
		this.firstId = firstId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public void setRaiseStart(Date raiseStart) {
		this.raiseStart = raiseStart;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public void setYear_rate(String year_rate) {
		this.year_rate = year_rate;
	}
	public void setSubjectComment(String subjectComment) {
		this.subjectComment = subjectComment;
	}
	public void setFolderId(Integer folderId) {
		this.folderId = folderId;
	}
	public void setDelflag(Integer delflag) {
		this.delflag = delflag;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setBorrowername(String borrowername) {
		this.borrowername = borrowername;
	}
	public void setBorrowerid(Integer borrowerid) {
		this.borrowerid = borrowerid;
	}
	public void setBought(Integer bought) {
		this.bought = bought;
	}
	
	
	public String getProjectdetails() {
		return projectdetails;
	}
	public void setProjectdetails(String projectdetails) {
		this.projectdetails = projectdetails;
	}
	public void setExperStatus(Integer experStatus) {
		this.experStatus = experStatus;
	}
	public Date getRaiseEnd() {
		return raiseEnd;
	}
	public void setRaiseEnd(Date raiseEnd) {
		this.raiseEnd = raiseEnd;
	}
	public Integer getRefundWay() {
		return refundWay;
	}
	public void setRefundWay(Integer refundWay) {
		this.refundWay = refundWay;
	}
	public Integer getSafeguardWay() {
		return safeguardWay;
	}
	public void setSafeguardWay(Integer safeguardWay) {
		this.safeguardWay = safeguardWay;
	}
	public String getSafetycontrol() {
		return safetycontrol;
	}
	public void setSafetycontrol(String safetycontrol) {
		this.safetycontrol = safetycontrol;
	}
	
	
	
}
