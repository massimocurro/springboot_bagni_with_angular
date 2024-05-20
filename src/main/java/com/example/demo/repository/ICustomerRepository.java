package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;
import com.example.demo.model.Umbrella;

import ch.qos.logback.core.net.server.Client;


@Repository
public interface ICustomerRepository extends CrudRepository<Customer, Integer> {
	
 
}
