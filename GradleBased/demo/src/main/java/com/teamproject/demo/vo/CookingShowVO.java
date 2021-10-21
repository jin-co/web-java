package com.teamproject.demo.vo;

import java.util.ArrayList;
import java.util.Date;

public class CookingShowVO {
	
	
	private int idx;
	private String authorid;
	private String categoryid;
	private String title;
	private String contents;
	private String imageurl;
	private int recommendation;
	private Date postdate;
	private Date modifydate;
	
	private ArrayList<CookingShowReasonsVO> reasonsVOList = new ArrayList<CookingShowReasonsVO>();
	
	public CookingShowVO() {}

	public CookingShowVO(int idx, String authorid, String categoryid, String title, String contents, String imageurl,
			int recommendation, Date postdate, Date modifydate, ArrayList<CookingShowReasonsVO> reasonsVOList) {
		super();
		this.idx = idx;
		this.authorid = authorid;
		this.categoryid = categoryid;
		this.title = title;
		this.contents = contents;
		this.imageurl = imageurl;
		this.recommendation = recommendation;
		this.postdate = postdate;
		this.modifydate = modifydate;
		this.reasonsVOList = reasonsVOList;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getAuthorid() {
		return authorid;
	}

	public void setAuthorid(String authorid) {
		this.authorid = authorid;
	}

	public String getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public int getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(int recommendation) {
		this.recommendation = recommendation;
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

	public ArrayList<CookingShowReasonsVO> getReasonsVOList() {
		return reasonsVOList;
	}

	public void setReasonsVOList(ArrayList<CookingShowReasonsVO> reasonsVOList) {
		this.reasonsVOList = reasonsVOList;
	}

	
	
	
	
	


}
