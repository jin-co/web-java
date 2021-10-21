package com.mulcam.project.vo;

import java.util.Date;

public class HealthyDietVO {
	
	private int idx;
	private String categoryid;
	private String categoryname;
	private String title;
	private String description;
	private int contentno;
	private String compisition;
	private String imageurl;
	private Date postdate;
	private Date modifydate;

	
	public HealthyDietVO() {}


	public HealthyDietVO(int idx, String categoryid, String categoryname, String title, String description,
			int contentno, String compisition, String imageurl, Date postdate, Date modifydate) {
		super();
		this.idx = idx;
		this.categoryid = categoryid;
		this.categoryname = categoryname;
		this.title = title;
		this.description = description;
		this.contentno = contentno;
		this.compisition = compisition;
		this.imageurl = imageurl;
		this.postdate = postdate;
		this.modifydate = modifydate;
	}


	public int getIdx() {
		return idx;
	}


	public void setIdx(int idx) {
		this.idx = idx;
	}


	public String getCategoryid() {
		return categoryid;
	}


	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}


	public String getCategoryname() {
		return categoryname;
	}


	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getContentno() {
		return contentno;
	}


	public void setContentno(int contentno) {
		this.contentno = contentno;
	}


	public String getCompisition() {
		return compisition;
	}


	public void setCompisition(String compisition) {
		this.compisition = compisition;
	}


	public String getImageurl() {
		return imageurl;
	}


	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}


	public Date getPostdate() {
		return postdate;
	}


	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}


	public Date getModifydate() {
		return modifydate;
	}


	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}

	
}
