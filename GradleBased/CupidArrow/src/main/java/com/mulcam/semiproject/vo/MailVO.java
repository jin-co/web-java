package com.mulcam.semiproject.vo;

public class MailVO {
	
	private String mailTitle;
	private String mailName;
	private String mailEmail;
	private String mailContent;
	
	public MailVO() {}

	public MailVO(String mailTitle, String mailName, String mailEmail, String mailContent) {
		super();
		this.mailTitle = mailTitle;
		this.mailName = mailName;
		this.mailEmail = mailEmail;
		this.mailContent = mailContent;
	}

	public String getMailTitle() {
		return mailTitle;
	}

	public void setMailTitle(String mailTitle) {
		this.mailTitle = mailTitle;
	}

	public String getMailName() {
		return mailName;
	}

	public void setMailName(String mailName) {
		this.mailName = mailName;
	}

	public String getMailEmail() {
		return mailEmail;
	}

	public void setMailEmail(String mailEmail) {
		this.mailEmail = mailEmail;
	}

	public String getMailContent() {
		return mailContent;
	}

	public void setMailContent(String mailContent) {
		this.mailContent = mailContent;
	};
	
	

}
