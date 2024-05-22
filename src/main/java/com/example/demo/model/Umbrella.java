package com.example.demo.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
	
	private int id_umbrella;
	
	public Umbrella() {
		setComments("");
		setDetails("");
		setBooking_status(0);
	}
	
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "umbrella_ref", cascade = CascadeType.ALL)
    private Set <TimeBooking> timeBooking;
    
    public Set <TimeBooking> getTimeBooking() {
    	return timeBooking;
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


	public int getId_umbrella() {
		return id_umbrella;
	}


	public void setId_umbrella(int id_umbrella) {
		this.id_umbrella = id_umbrella;
	}
}
