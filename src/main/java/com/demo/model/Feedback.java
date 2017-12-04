package com.demo.model;

import java.sql.Date;

/**
 * 
 * 意见反馈	seq_feedback
 * @author LENOVO
 *
 */
public class Feedback {
	private Integer feedback_id;
	private Integer memberId;//会员id
	private String feedbackContent;//意见反馈内容
	private Date createDate;//添加时间
		   
	public Integer getFeedback_id() {
		return feedback_id;
	}
	public void setFeedback_id(Integer feedback_id) {
		this.feedback_id = feedback_id;
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
