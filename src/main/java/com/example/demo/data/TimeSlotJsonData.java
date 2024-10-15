package com.example.demo.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TimeSlotJsonData {
	
	@JsonProperty("id")
	private int id;

	
	@JsonProperty("time_slot")
	private String time_slot;
	
	@JsonProperty("time_booking_id")
	private int time_booking_id;
	
	
	public TimeSlotJsonData() {}
		
	
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
	
	public int getTimeBookingId() {
		return this.time_booking_id;
	}
	
	public void setTimeBookingId(int id) {
		this.time_booking_id = id;
	}
	
	
	
}
	
	

