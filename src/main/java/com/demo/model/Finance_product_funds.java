package com.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 理财类基金产品		seq_finance_product_funds
 * @author LENOVO
 *
 */
@Entity
public class Finance_product_funds {
	
	   private Integer financeProductFundsId;
	   private String financeProductFundsType;//产品类型
	   private String financeProductFundsName;//名称
	   private Integer status;//状态(0:未发布，1:募集中，2:已结束)
	   private Integer period;//周期
	   private Float floorAmount;//起投金额
	   private Float yearRate;//年化率
	   private Integer subscribeCount;//预约人数
	   private String productTopic;//基金专题/关于基金
	   private String productFactor;//产品要素
	   private String productStrategy;//产品策略
	   private String  productManager;//基金经理详细
	   private Date createDate;//创建时间
	   private Date updateDate;//修改时间
	   private String productManagerName;//管理人名称
	   private String productManagerPic;//管理人图片
	   private String productManagerTitle;//管理人头衔
	   private String productManagerDesc;//产品管理人介绍
	   private String investPoints;//投资方向
	   private Float amount;//募集金额
	   private Float soldAmount;//已售金额
	   private Float buyerCount;//购买人数
	   private Date startDate;//开始时间
	   private Date endDate;//结束时间
	   private String financeProductFundsRatio;//返佣比例
	   private String contract;//私募合同
	   private String bankAccount;//银行账户（支行名称|银行账号|户名）
	
	   
	@Id
	public Integer getFinanceProductFundsId() {
		return financeProductFundsId;
	}
	public void setFinanceProductFundsId(Integer financeProductFundsId) {
		this.financeProductFundsId = financeProductFundsId;
	}
	public String getFinanceProductFundsType() {
		return financeProductFundsType;
	}
	public void setFinanceProductFundsType(String financeProductFundsType) {
		this.financeProductFundsType = financeProductFundsType;
	}
	public String getFinanceProductFundsName() {
		return financeProductFundsName;
	}
	public void setFinanceProductFundsName(String financeProductFundsName) {
		this.financeProductFundsName = financeProductFundsName;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getPeriod() {
		return period;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}
	public Float getFloorAmount() {
		return floorAmount;
	}
	public void setFloorAmount(Float floorAmount) {
		this.floorAmount = floorAmount;
	}
	public Float getYearRate() {
		return yearRate;
	}
	public void setYearRate(Float yearRate) {
		this.yearRate = yearRate;
	}
	public Integer getSubscribeCount() {
		return subscribeCount;
	}
	public void setSubscribeCount(Integer subscribeCount) {
		this.subscribeCount = subscribeCount;
	}
	public String getProductTopic() {
		return productTopic;
	}
	public void setProductTopic(String productTopic) {
		this.productTopic = productTopic;
	}
	public String getProductFactor() {
		return productFactor;
	}
	public void setProductFactor(String productFactor) {
		this.productFactor = productFactor;
	}
	public String getProductStrategy() {
		return productStrategy;
	}
	public void setProductStrategy(String productStrategy) {
		this.productStrategy = productStrategy;
	}
	public String getProductManager() {
		return productManager;
	}
	public void setProductManager(String productManager) {
		this.productManager = productManager;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getProductManagerName() {
		return productManagerName;
	}
	public void setProductManagerName(String productManagerName) {
		this.productManagerName = productManagerName;
	}
	public String getProductManagerPic() {
		return productManagerPic;
	}
	public void setProductManagerPic(String productManagerPic) {
		this.productManagerPic = productManagerPic;
	}
	public String getProductManagerTitle() {
		return productManagerTitle;
	}
	public void setProductManagerTitle(String productManagerTitle) {
		this.productManagerTitle = productManagerTitle;
	}
	public String getProductManagerDesc() {
		return productManagerDesc;
	}
	public void setProductManagerDesc(String productManagerDesc) {
		this.productManagerDesc = productManagerDesc;
	}
	public String getInvestPoints() {
		return investPoints;
	}
	public void setInvestPoints(String investPoints) {
		this.investPoints = investPoints;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public Float getSoldAmount() {
		return soldAmount;
	}
	public void setSoldAmount(Float soldAmount) {
		this.soldAmount = soldAmount;
	}
	public Float getBuyerCount() {
		return buyerCount;
	}
	public void setBuyerCount(Float buyerCount) {
		this.buyerCount = buyerCount;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getFinanceProductFundsRatio() {
		return financeProductFundsRatio;
	}
	public void setFinanceProductFundsRatio(String financeProductFundsRatio) {
		this.financeProductFundsRatio = financeProductFundsRatio;
	}
	public String getContract() {
		return contract;
	}
	public void setContract(String contract) {
		this.contract = contract;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
}
