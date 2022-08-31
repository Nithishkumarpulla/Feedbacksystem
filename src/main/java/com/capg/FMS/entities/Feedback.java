/*

package com.capg.FMS.entities;

import javax.persistence.*;

@Entity
@Table(name="Feedback")
public class Feedback {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int feedbackId;
	@OneToOne
	private Employee participant;
	@OneToOne
	private Program program;
	@Column(nullable=false)
	private int feedbackCriteria1;
	@Column(nullable=false)
	private int feedbackCriteria2;
	@Column(nullable=false)
	private int feedbackCriteria3;
	@Column(nullable=false)
	private int feedbackCriteria4;
	@Column(nullable=false)
	private int feedbackCriteria5;
	@Column(name = "Comments")
	private String comments;
	@Column(name = "Employee_Name")
	private String suggestions;
	
	public int getFeedbackCriteria1() {
		return feedbackCriteria1;
	}
	public void setFeedbackCriteria1(int feedbackCriteria1) {
		this.feedbackCriteria1 = feedbackCriteria1;
	}
	public int getFeedbackCriteria2() {
		return feedbackCriteria2;
	}
	public void setFeedbackCriteria2(int feedbackCriteria2) {
		this.feedbackCriteria2 = feedbackCriteria2;
	}
	public int getFeedbackCriteria3() {
		return feedbackCriteria3;
	}
	public void setFeedbackCriteria3(int feedbackCriteria3) {
		this.feedbackCriteria3 = feedbackCriteria3;
	}
	public int getFeedbackCriteria4() {
		return feedbackCriteria4;
	}
	public void setFeedbackCriteria4(int feedbackCriteria4) {
		this.feedbackCriteria4 = feedbackCriteria4;
	}
	public int getFeedbackCriteria5() {
		return feedbackCriteria5;
	}
	public void setFeedbackCriteria5(int feedbackCriteria5) {
		this.feedbackCriteria5 = feedbackCriteria5;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getSuggestions() {
		return suggestions;
	}
	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}
	
}
*/