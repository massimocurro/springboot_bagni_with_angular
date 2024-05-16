package com.example.demo.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhotoData {
	
	@JsonProperty("url")
	private String url;
	
	@JsonProperty("id")
	private int id;
	
	public PhotoData() {}
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
