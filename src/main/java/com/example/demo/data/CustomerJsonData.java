package com.example.demo.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerJsonData {
	
	@JsonProperty("id")
	private int id;

	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("surname")
	private String surname;
	
	@JsonProperty("phone")
	private String phone;
	
	@JsonProperty("address")
	private String address;
	
	@JsonProperty("email")
	private String email;
	
	public CustomerJsonData() {}
		
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSurName(String surname) {
		this.surname = surname;
	}
	
	public String getSurName() {
		return this.surname;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
	
	

