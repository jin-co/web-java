package com.mulcam.project.vo;

public class HiraRateVO {
	
	private String name;
	private String rate;
	private String address;
	private double posx;
	private double posy;
	private String comments;
	
	public HiraRateVO() {};
	
	public HiraRateVO(String name, String rate, String address, double posx, double posy, String comments) {
		super();
		this.name = name;
		this.rate = rate;
		this.address = address;
		this.posx = posx;
		this.posy = posy;
		this.comments = comments;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getPosx() {
		return posx;
	}

	public void setPosx(double posx) {
		this.posx = posx;
	}

	public double getPosy() {
		return posy;
	}

	public void setPosy(double posy) {
		this.posy = posy;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	
	
}
