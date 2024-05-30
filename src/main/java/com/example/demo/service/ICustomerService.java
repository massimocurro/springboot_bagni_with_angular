package com.example.demo.service;





import java.util.Optional;

import com.example.demo.model.Customer;


public interface ICustomerService {
	
	Iterable <Customer> getAll();
	
	void add(Customer customer);
	
	Iterable<Customer> getById(int id);
	
	void update(Customer client);

}
