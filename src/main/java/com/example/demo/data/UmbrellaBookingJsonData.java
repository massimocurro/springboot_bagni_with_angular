package com.example.demo.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UmbrellaBookingJsonData {
	
	@JsonProperty("details")
	private String details;
	
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("id_umbrella")
	private int id_umbrella;
	
	
	@JsonProperty("comments")
	private String comments;
	
	@JsonProperty("booking_status")
	private int bookink_status;
	
	public UmbrellaBookingJsonData() {
		
	}
	public String getDetails() {
		return this.details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	public String getComments() {
		return this.comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getBookingStatus() {
		return this.bookink_status;
	}
	
	public void setBookingStatus(int booking_status) {
		this.bookink_status = booking_status;
	}
	
	public int getIdUmbrella() {
		return id_umbrella;
	}
	
	public void setIdUmbrella(int id_umbrella) {
		this.id_umbrella = id_umbrella;
	}
}
	
	

