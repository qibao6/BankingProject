package com.demo.model;

import java.sql.Date;
/**
 * 	附件表		sql_subject_file
 * @author LENOVO
 *
 */
public class Subject_file {
	
	   private Integer subjectFileId;//  number primary key,
	   private Integer folderId;// number,-- '附件主表id',
	   private String subjectFilePath;//  varchar2(4000) ,-- '文件路径',
	   private String fileName;//  varchar2(128) ,-- '文件名',
	   private String originalName;//  varchar2(128) ,-- '原文件名',
	   private Date createDate;//  date,-- '创建时间',
	   private Date updateDate;// date-- '修改时间',
	   
	public Integer getSubjectFileId() {
		return subjectFileId;
	}
	public Integer getFolderId() {
		return folderId;
	}
	public String getSubjectFilePath() {
		return subjectFilePath;
	}
	public String getFileName() {
		return fileName;
	}
	public String getOriginalName() {
		return originalName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setSubjectFileId(Integer subjectFileId) {
		this.subjectFileId = subjectFileId;
	}
	public void setFolderId(Integer folderId) {
		this.folderId = folderId;
	}
	public void setSubjectFilePath(String subjectFilePath) {
		this.subjectFilePath = subjectFilePath;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}	
