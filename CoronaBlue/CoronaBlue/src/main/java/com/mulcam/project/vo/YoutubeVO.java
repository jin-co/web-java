package com.mulcam.project.vo;

public class YoutubeVO {
	
	private int id;
	private String title;
	private String url;
	private String key;
	
	public YoutubeVO() {}

	public YoutubeVO(int id, String title, String url, String key) {
		super();
		this.id = id;
		this.title = title;
		this.url = url;
		this.key = key;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	};
		
			
	

}
