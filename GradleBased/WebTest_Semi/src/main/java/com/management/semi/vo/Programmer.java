package com.management.semi.vo;

import org.springframework.stereotype.Component;

@Component("programmer")
public class Programmer {
	private String id;
	private String name;
	private String address;
	private String contact;
	private String email;
	private int experience;
	private String specification;
	private int rate;
	
	Programmer() {}

	// 데이터베이스에 저장할 새로운 프로그래머 생성자
	public Programmer(String id, String name, String address, String contact, String email, int experience,
			String specification, int rate) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.experience = experience;
		this.specification = specification;
		this.rate = rate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}	
}
