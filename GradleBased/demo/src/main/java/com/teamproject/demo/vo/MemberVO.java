package com.teamproject.demo.vo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MemberVO {
	
	
	private String name;
	private String email;
	private String id;
	private String password;
	private String signupdate;
	
	public MemberVO() {};
	
	public MemberVO(String id, String password) {
		super();
	
		this.id = id;
		this.password = password;
	
	}
	
	public MemberVO(String name, String email, String id, String password, String signupdate) {
		super();
		this.name = name;
		this.email = email;
		this.id = id;
		this.password = password;
		this.signupdate = signupdate;
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

	public String getSignupdate() {
		return signupdate;
	}

	public void setSignupdate(String signupdate) {
		this.signupdate = signupdate;
	}
	
	
	
	
	
	
	

}
