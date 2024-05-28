package com.example.demo.service;



import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TimeBooking;
import com.example.demo.repository.ITimeBookingRepository;


@Service("TimeBookingService")
public class TimeBookingService implements ITimeBookingService{
	
	@Autowired
	ITimeBookingRepository iRepository;

	@Override
	public Iterable<TimeBooking> getAll() {
		// TODO Auto-generated method stub
		return iRepository.findAll();
	}

	@Override
	public void add(TimeBooking timeBooking) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<TimeBooking> getById(int id) {
		// TODO Auto-generated method stub
		
		return iRepository.findById(id).map(Collections::singleton)
	            .orElseGet(Collections::emptySet);
	}

	@Override
	public void update(TimeBooking timeBooking) {
		iRepository.save(timeBooking);
		// TODO Auto-generated method stub
		
	}
	
	
	

}
