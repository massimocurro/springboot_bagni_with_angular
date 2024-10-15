package com.example.demo.model;

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
import jakarta.persistence.OneToOne;

@Entity(name = "time_slot")
public class TimeSlot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String time_slot;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_time_booking") //il campo specificato deve esistere nella tabella sul DB nella tabella rappresentata da questa entity
	private TimeBooking time_booking_ref; 
	
	
//	@OneToOne(fetch = FetchType.LAZY, mappedBy = "time_slot_ref", cascade = CascadeType.ALL)
//	private Customer customer_ref;
//	
//	public Customer getCustomerRef() {
//		return customer_ref;
//	}
	
	
	
	@ManyToOne
	@JoinColumn(name = "id_customer",referencedColumnName = "id") //il campo specificato deve esistere nella tabella sul DB nella tabella rappresentata da questa entity
	private Customer customer_ref;
	
	
	

	public Customer getCustomerRef() {
		return customer_ref;
	}
	
	
	public void setTimeBookingRef(TimeBooking element) {
		this.time_booking_ref = element;
	}

	
	public int getId() {
		return id;
	}


	public String getTime_slot() {
		return time_slot;
	}

	public void setTime_slot(String time_slot) {
		this.time_slot = time_slot;
	}
}
