package com.example.demo.service;

import com.example.demo.model.TimeSlot;


public interface ITimeSlotService {
	
	Iterable <TimeSlot> getAll();
	
	
	void add(TimeSlot TimeSlot);
	
	Iterable<TimeSlot> getById(int id);
	
	void update(TimeSlot timeSlot);
	
	void delete(int id);
	
	
}
