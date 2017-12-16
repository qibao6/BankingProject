package com.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 理财类基金产品预约记录表		seq_finance_product_subscribe
 * @author LENOVO
 *
 */
@Entity
public class Finance_product_subscribe {
	
	   private Integer financeProductSubscribeId;
	   private String financeProductSubscribeName;//名称
	   private Integer memberId;//会员id
	   private String phone;//联系电话
	   private Finance_product_funds productId;//理财产品id
	   private String addr;//所在地区
	   private Integer status;//是否处理(0:签署拍照|1:已签约|2:审核中|3:签署失败)
	   private String fpsComment;//电子签署文档信息
	   private String riskReveal;//风险揭示书
	   private Date createDate;//创建时间
	   private Date updateDate;//修改时间
	   private Float amount;//私募购买金额
	   private Float interest;//私募结算收益
	   private Date startDate;//开始时间
	   private Date endDate;//结束时间
	   private String signedPhotos;//签署拍照
	   
	@Id
	public Integer getFinanceProductSubscribeId() {
		return financeProductSubscribeId;
	}
	public String getFinanceProductSubscribeName() {
		return financeProductSubscribeName;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public String getPhone() {
		return phone;
	}
	@ManyToOne
	@JoinColumn(name="product_id")
	public Finance_product_funds getProductId() {
		return productId;
	}
	public void setProductId(Finance_product_funds productId) {
		this.productId = productId;
	}
	public String getAddr() {
		return addr;
	}
	public Integer getStatus() {
		return status;
	}
	public String getFpsComment() {
		return fpsComment;
	}
	public String getRiskReveal() {
		return riskReveal;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public Float getAmount() {
		return amount;
	}
	public Float getInterest() {
		return interest;
	}
	public Date getStartDate() {
		return startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public String getSignedPhotos() {
		return signedPhotos;
	}
	public void setFinanceProductSubscribeId(Integer financeProductSubscribeId) {
		this.financeProductSubscribeId = financeProductSubscribeId;
	}
	public void setFinanceProductSubscribeName(String financeProductSubscribeName) {
		this.financeProductSubscribeName = financeProductSubscribeName;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
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
	public void setFpsComment(String fpsComment) {
		this.fpsComment = fpsComment;
	}
	public void setRiskReveal(String riskReveal) {
		this.riskReveal = riskReveal;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public void setInterest(Float interest) {
		this.interest = interest;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public void setSignedPhotos(String signedPhotos) {
		this.signedPhotos = signedPhotos;
	}
}
