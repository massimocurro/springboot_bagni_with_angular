package com.example.demo.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserJsonData {
	
	@JsonProperty("id")
	private int id;

	
	@JsonProperty("username")
	private String username;
	
	@JsonProperty("password")
	private String password;
	
	
	
	public UserJsonData() {}
		
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		return this.username;
	}
	
	public void setUserName(String username) {
		this.username = username;
	}
	
	public void setSPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	
}
	
	

