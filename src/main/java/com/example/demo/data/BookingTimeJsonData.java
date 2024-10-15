package com.example.demo.data;



import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookingTimeJsonData {
	
	@JsonProperty("date")
	private Date date;
	
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("umbrella_id")
	private int umbrella_id;
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getUmbrellaId() {
		return this.umbrella_id;
	}
	
	public void setUmbrellaId(int id) {
		this.umbrella_id = id;
	}
}
	
	

