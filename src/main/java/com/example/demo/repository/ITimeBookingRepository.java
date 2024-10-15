package com.example.demo.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TimeBooking;


@Repository
public interface ITimeBookingRepository extends CrudRepository<TimeBooking, Integer> {
	
	@Query( value ="select * from time_booking where date_booking = :date and umbrella_id= :umbrella_id", nativeQuery = true)
	Iterable <TimeBooking> getByDateAndUmbrellaId(@Param("date") String date, @Param("umbrella_id") int umbrella_id);
	
 
}
