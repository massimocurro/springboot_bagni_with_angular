package com.example.demo.service;

import java.util.Collections;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.demo.model.TimeBooking;
import com.example.demo.model.TimeSlot;
import com.example.demo.model.Umbrella;
import com.example.demo.model.UmbrellaBooking;
import com.example.demo.model.User;
import com.example.demo.repository.ITimeSlotRepository;
import com.example.demo.repository.IUmbrellaBookingRepository;
import com.example.demo.repository.IUmbrellaRepository;
import com.example.demo.repository.IUser;



@Service("UserService")
public class UserService implements IServiceEntity <User>{
	
	@Autowired
	IUser iRepository;
	
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		this.iRepository.deleteById(id);
	}


	@Override
	public Iterable<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void add(User entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Iterable<User> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
	}
	

	public Iterable<User> getByUserNameAndPassord(String username, String password) {
		return this.iRepository.getByUserNameAndPassword(username, password);
	}


	@Override
	public Iterable<TimeBooking> getByDateAndUmbrellaId(String date, int umbrella_id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
