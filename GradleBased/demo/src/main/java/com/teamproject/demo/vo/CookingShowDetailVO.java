package com.teamproject.demo.vo;

public class CookingShowDetailVO {
	
	private int idx;
	private int ridx;
	private String reasons;
	
	public CookingShowDetailVO() {};
	
	public CookingShowDetailVO(int idx, int ridx, String reasons) {
		super();
		this.idx = idx;
		this.ridx = ridx;
		this.reasons = reasons;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getRidx() {
		return ridx;
	}

	public void setRidx(int ridx) {
		this.ridx = ridx;
	}

	public String getReasons() {
		return reasons;
	}

	public void setReasons(String reasons) {
		this.reasons = reasons;
	}
	
	
	


}
