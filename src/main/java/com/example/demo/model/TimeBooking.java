package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "time_booking")
public class TimeBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date date_booking;

	public Date getDate() {
		return date_booking;
	}

	public void setDate(Date date_booking) {
		this.date_booking = date_booking;
	}

	public int getId() {
		return id;
	}

}
