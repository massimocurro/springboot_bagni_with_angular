package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import com.example.demo.model.Umbrella;
import com.example.demo.model.UmbrellaBooking;


@Repository
public interface IUmbrellaBookingRepository extends CrudRepository<UmbrellaBooking, Integer> {
	
 
}
