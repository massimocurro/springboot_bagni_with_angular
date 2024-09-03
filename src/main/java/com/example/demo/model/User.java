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
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String username;
	
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "id_time_slot",referencedColumnName = "id") //il campo specificato deve esistere nella tabella sul DB nella tabella rappresentata da questa entity
//	private TimeSlot time_slot_ref;
//	
//
//	public TimeSlot getTimeSlotRef() {
//		return time_slot_ref;
//	}
//	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer_ref", cascade = CascadeType.ALL)
//	private TimeSlot time_slot_ref;
	


	

}
