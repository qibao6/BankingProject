package com.demo.model;

import java.sql.Date;

/**
 * 			seq_fpsr
 * @author LENOVO
 *
 */
public class Fp_subscribe_record {
	
	   private Integer fpsrId;
	   private Integer memberId;//会员id
	   private Integer subscribeId;//私募预约记录id
	   private String techUserId;//e签宝个人账号
	   private String techUserSeal;//e签宝个人印章
	   private String orgPath;//原签署文档路径
	   private String newPath;//新签署文档路径
	   private String status;
	   private Date createDate;//创建时间
	   private Date updateDate;//修改时间
	   private String filed;//备用字段
	   
	public Integer getFpsrId() {
		return fpsrId;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public Integer getSubscribeId() {
		return subscribeId;
	}
	public String getTechUserId() {
		return techUserId;
	}
	public String getTechUserSeal() {
		return techUserSeal;
	}
	public String getOrgPath() {
		return orgPath;
	}
	public String getNewPath() {
		return newPath;
	}
	public String getStatus() {
		return status;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public String getFiled() {
		return filed;
	}
	public void setFpsrId(Integer fpsrId) {
		this.fpsrId = fpsrId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public void setSubscribeId(Integer subscribeId) {
		this.subscribeId = subscribeId;
	}
	public void setTechUserId(String techUserId) {
		this.techUserId = techUserId;
	}
	public void setTechUserSeal(String techUserSeal) {
		this.techUserSeal = techUserSeal;
	}
	public void setOrgPath(String orgPath) {
		this.orgPath = orgPath;
	}
	public void setNewPath(String newPath) {
		this.newPath = newPath;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public void setFiled(String filed) {
		this.filed = filed;
	}
}
