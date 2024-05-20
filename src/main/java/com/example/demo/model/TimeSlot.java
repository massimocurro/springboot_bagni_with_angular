package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "time_slot")
public class TimeSlot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String time_slot;
	
	
	private int id_time_booking;
	
	private int id_umbrella;

	
	public int getId() {
		return id;
	}



	public int getId_umbrella() {
		return id_umbrella;
	}



	public void setId_umbrella(int id_umbrella) {
		this.id_umbrella = id_umbrella;
	}



	public int getId_time_booking() {
		return id_time_booking;
	}



	public void setId_time_booking(int id_time_booking) {
		this.id_time_booking = id_time_booking;
	}



	public String getTime_slot() {
		return time_slot;
	}



	public void setTime_slot(String time_slot) {
		this.time_slot = time_slot;
	}

}
