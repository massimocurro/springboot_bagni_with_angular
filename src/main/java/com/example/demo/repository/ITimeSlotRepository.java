package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.TimeSlot;
import com.example.demo.model.Umbrella;


@Repository
public interface ITimeSlotRepository extends CrudRepository<TimeSlot, Integer> {
	
 
}
