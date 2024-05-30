package com.example.demo.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerJsonData {
	
	@JsonProperty("id")
	private int id;

	
	@JsonProperty("time_slot")
	private String time_slot;
	
	public CustomerJsonData() {}
		
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTimeSlot() {
		return this.time_slot;
	}
	
	public void setTimeSlot(String timeSlot) {
		this.time_slot = timeSlot;
	}
	
	
	
}
	
	

