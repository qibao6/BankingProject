package com.demo.model;

import java.sql.Date;
/**
 * 附件归属表			sql_subject_folder
 * @author LENOVO
 *
 */

public class Subject_folder {
	   private Integer subjectFolderId;// number primary key,-- '主键',
	   private Date createDate;//  date ,-- '创建时间',
	   private Date updateDate;//  date -- '修改时间',
	public Integer getSubjectFolderId() {
		return subjectFolderId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setSubjectFolderId(Integer subjectFolderId) {
		this.subjectFolderId = subjectFolderId;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
