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
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String surname;
	
	private String address;
	
	private String phone;
	
	private String email;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "id_time_slot",referencedColumnName = "id") //il campo specificato deve esistere nella tabella sul DB nella tabella rappresentata da questa entity
//	private TimeSlot time_slot_ref;
//	
//
//	public TimeSlot getTimeSlotRef() {
//		return time_slot_ref;
//	}
//	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "customer_ref", cascade = CascadeType.ALL)
	private TimeSlot time_slot_ref;
	
//	public TimeSlot getTimeSlotRef() {
//		return time_slot_ref;
//	}
//	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
