package com.demo.model;

import java.sql.Date;
/**
 * 充值面额管理			sql_sys_recharge_price_config
 * @author LENOVO
 *
 */
public class Sys_recharge_price_config {
	   private Integer srpcId;//   number primary key,
	   private String srpcType;//  varchar2(32),-- '类型',
	   private Float marketPrice;//  binary_float, --'金额',
	   private Float sellPrice;// binary_float,--'金额',
	   private Date createDate;//  date,
	   private Date updateDate;//  date
	   
	public Integer getSrpcId() {
		return srpcId;
	}
	public String getSrpcType() {
		return srpcType;
	}
	public Float getMarketPrice() {
		return marketPrice;
	}
	public Float getSellPrice() {
		return sellPrice;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setSrpcId(Integer srpcId) {
		this.srpcId = srpcId;
	}
	public void setSrpcType(String srpcType) {
		this.srpcType = srpcType;
	}
	public void setMarketPrice(Float marketPrice) {
		this.marketPrice = marketPrice;
	}
	public void setSellPrice(Float sellPrice) {
		this.sellPrice = sellPrice;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
