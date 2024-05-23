package com.example.demo.model;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name = "time_booking")
public class TimeBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date date_booking;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "umbrella_id") //il campo specificato deve esistere nella tabella sul DB nella tabella rappresentata da questa entity
	private Umbrella umbrella_ref;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "time_booking_ref", cascade = CascadeType.ALL)
	private Set <TimeSlot> time_slot_ref;
	    
	public Set <TimeSlot> getTimeSlotRef() {
	    	return time_slot_ref;
	}

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
