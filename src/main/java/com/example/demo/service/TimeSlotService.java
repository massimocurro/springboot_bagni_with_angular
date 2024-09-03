package com.example.demo.service;

import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TimeSlot;
import com.example.demo.model.Umbrella;
import com.example.demo.model.UmbrellaBooking;
import com.example.demo.model.User;
import com.example.demo.repository.ITimeSlotRepository;
import com.example.demo.repository.IUmbrellaBookingRepository;
import com.example.demo.repository.IUmbrellaRepository;



@Service("TimeSlotService")
public class TimeSlotService implements IServiceEntity <TimeSlot>{
	
	@Autowired
	ITimeSlotRepository iRepository;
	
	@Override
	public void add(TimeSlot timeSlot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(TimeSlot timeSlot) {
		// TODO Auto-generated method stub
		iRepository.save(timeSlot);
	}

	@Override
	public Iterable<TimeSlot> getAll() {
		// TODO Auto-generated method stub
		return iRepository.findAll();
	}

	@Override
	public Iterable<TimeSlot> getById(int id) {
		// TODO Auto-generated method stub
		return iRepository.findById(id).map(Collections::singleton)
	            .orElseGet(Collections::emptySet);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		this.iRepository.deleteById(id);
	}

	@Override
	public Iterable<User> getByUserNameAndPassord(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
