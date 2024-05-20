package com.example.demo.service;



import java.util.Optional;

import com.example.demo.model.Umbrella;
import com.example.demo.model.UmbrellaBooking;

public interface IUmbrellaBookingService {
	
	Iterable <UmbrellaBooking> getAll();
	
	
	void add(UmbrellaBooking umbrellaBooking);
	
	Iterable<UmbrellaBooking> getById(int id);
	
	void update(UmbrellaBooking umbrellaBooking);
}
