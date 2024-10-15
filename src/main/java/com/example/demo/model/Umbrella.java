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

@Entity
public class Umbrella {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String comments;
	
	private String details;
	
	private int booking_status;
	
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "umbrella_ref")
    private Set <TimeBooking> time_booking_ref;
    
    
    
	public Umbrella() {
		setComments("");
		setDetails("");
		setBooking_status(0);
	}
    
    public Set <TimeBooking> getTimeBooking() {
    	return time_booking_ref;
    }
    
    
	public int getId() {
		return id;
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
	

 
	
}
