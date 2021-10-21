package com.mulcam.semiproject.vo;

public class MemberVO {
	
	private String id;
	private String password;
	private String name;
	private String email;
	
	private boolean rememberId;
	private String section;
	
	private String sMailTitle;
	private String sMailName;
	private String sMailEmail;
	private String sMailContent;
	
	
	
	public MemberVO() {}

	public MemberVO(String id, String password, String name, String email, boolean rememberId, String section,
			String sMailTitle, String sMailName, String sMailEmail, String sMailContent) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.rememberId = rememberId;
		this.section = section;
		this.sMailTitle = sMailTitle;
		this.sMailName = sMailName;
		this.sMailEmail = sMailEmail;
		this.sMailContent = sMailContent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isRememberId() {
		return rememberId;
	}

	public void setRememberId(boolean rememberId) {
		this.rememberId = rememberId;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getsMailTitle() {
		return sMailTitle;
	}

	public void setsMailTitle(String sMailTitle) {
		this.sMailTitle = sMailTitle;
	}

	public String getsMailName() {
		return sMailName;
	}

	public void setsMailName(String sMailName) {
		this.sMailName = sMailName;
	}

	public String getsMailEmail() {
		return sMailEmail;
	}

	public void setsMailEmail(String sMailEmail) {
		this.sMailEmail = sMailEmail;
	}

	public String getsMailContent() {
		return sMailContent;
	}

	public void setsMailContent(String sMailContent) {
		this.sMailContent = sMailContent;
	}

	
	
	

}
