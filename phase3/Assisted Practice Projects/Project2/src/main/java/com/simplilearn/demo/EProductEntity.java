package com.simplilearn.demo;

import java.util.Date;

public class EProductEntity {
	
	private long ID;
    private String feedbacke;
    private String user_email ;
    private Date time ;
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getFeedbacke() {
		return feedbacke;
	}
	public void setFeedbacke(String feedbacke) {
		this.feedbacke = feedbacke;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}
