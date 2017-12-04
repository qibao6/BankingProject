package com.demo.model;

import java.sql.Date;

/**
 * 
 * 意见反馈	seq_feedback
 * @author LENOVO
 *
 */
public class Feedback {
	private Integer feedbackId;
	private Integer memberId;//会员id
	private String feedbackContent;//意见反馈内容
	private Date createDate;//添加时间
		   
	
	public Integer getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public String getFeedbackContent() {
		return feedbackContent;
	}
	public void setFeedbackContent(String feedbackContent) {
		this.feedbackContent = feedbackContent;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
