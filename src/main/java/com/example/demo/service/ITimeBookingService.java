package com.example.demo.service;




import com.example.demo.model.TimeBooking;

public interface ITimeBookingService {
	
	Iterable <TimeBooking> getAll();
	
	void add(TimeBooking timeBooking);
	
	Iterable<TimeBooking> getById(int id);
	
	void update(TimeBooking timeBooking);
	
	Iterable<TimeBooking> getById(int id);
}
