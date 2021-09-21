package com.management.semi.vo;

public class Administrator {
	private int adminId;
	private String id;
	private String password;
	private String name;
	
	Administrator() {}
	
	// 데이터베이스에 저장할 새로운 관리자 생성자
	public Administrator(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
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
}
