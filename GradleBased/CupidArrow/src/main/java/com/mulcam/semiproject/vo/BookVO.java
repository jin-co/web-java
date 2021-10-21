package com.mulcam.semiproject.vo;

public class BookVO {
	
	private String id;
	private String rname;
	private String remail;
	
	public BookVO() {};
	
	public BookVO(String id, String rname, String remail) {
		super();
		this.id = id;
		this.rname = rname;
		this.remail = remail;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRemail() {
		return remail;
	}

	public void setRemail(String remail) {
		this.remail = remail;
	}
	
	
	
	

}
