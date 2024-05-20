package com.example.demo.service;

import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Umbrella;
import com.example.demo.model.UmbrellaBooking;
import com.example.demo.repository.IUmbrellaBookingRepository;
import com.example.demo.repository.IUmbrellaRepository;



@Service("UmbrellaBookingService")
public class UmbrellaBookingService implements IUmbrellaBookingService{
	
	@Autowired
	IUmbrellaBookingRepository iRepository;
	

	@Override
	public void add(UmbrellaBooking umbrellaBooking) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UmbrellaBooking umbrellaBooking) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<UmbrellaBooking> getAll() {
		// TODO Auto-generated method stub
		return iRepository.findAll();
	}

	@Override
	public Iterable<UmbrellaBooking> getById(int id) {
		// TODO Auto-generated method stub
		return iRepository.findById(id).map(Collections::singleton)
	            .orElseGet(Collections::emptySet);
	}
	

}
