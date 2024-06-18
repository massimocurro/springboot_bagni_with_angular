package com.example.demo.service;

import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.model.Umbrella;
import com.example.demo.repository.ICustomerRepository;
import com.example.demo.repository.IUmbrellaRepository;





@Service("CustomerService")
public class CustomerService implements IServiceEntity <Customer>{
	
	@Autowired
	ICustomerRepository iRepository;
	

	@Override
	public void add(Customer client) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void update(Customer client) {
		// TODO Auto-generated method stub
		this.iRepository.save(client);
		
	}

	@Override
	public Iterable<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Iterable<Customer> getById(int id) {
		// TODO Auto-generated method stub
		return iRepository.findById(id).map(Collections::singleton)
	            .orElseGet(Collections::emptySet);
	}



	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}





	

}
