package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "umbrella_booking")
public class UmbrellaBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int id_umbrella;
	
	private int id_time_booking;
	
	

	
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

}
