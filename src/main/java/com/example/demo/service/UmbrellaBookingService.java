package com.example.demo.service;

import java.util.Collections;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TimeBooking;
import com.example.demo.model.Umbrella;
import com.example.demo.model.UmbrellaBooking;
import com.example.demo.model.User;
import com.example.demo.repository.IUmbrellaBookingRepository;
import com.example.demo.repository.IUmbrellaRepository;



@Service("UmbrellaBookingService")
public class UmbrellaBookingService implements IServiceEntity <UmbrellaBooking>{
	
	@Autowired
	IUmbrellaBookingRepository iRepository;
	

	@Override
	public void add(UmbrellaBooking umbrellaBooking) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UmbrellaBooking umbrellaBooking) {
		iRepository.save(umbrellaBooking);
		
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

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<User> getByUserNameAndPassord(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<TimeBooking> getByDateAndUmbrellaId(String date, int umbrella_id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
