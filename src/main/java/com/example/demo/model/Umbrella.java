package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Umbrella {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String comments;
	
	private String details;
	
	private int booking_status;
	
	private int id_umbrella;
	
	public Umbrella() {
		setComments("");
		setDetails("");
		setBooking_status(0);
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}


	public int getBooking_status() {
		return booking_status;
	}


	public void setBooking_status(int booking_status) {
		this.booking_status = booking_status;
	}


	public int getId_umbrella() {
		return id_umbrella;
	}


	public void setId_umbrella(int id_umbrella) {
		this.id_umbrella = id_umbrella;
	}
}
