package com.example.demo.controller.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.CustomerJsonData;
import com.example.demo.model.Customer;
import com.example.demo.service.IServiceEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("api/customer")
public class DBCustomerController {

	@Autowired
	//@Qualifier("CustomerService")
	private IServiceEntity<Customer> service;

	@GetMapping("get/all")
	@CrossOrigin
	public Iterable <Customer> getAll() {
		System.out.println("in get: /api/time_slot/get");
		return service.getAll();
	}
	
	@GetMapping("get/{id}")
	@CrossOrigin
	public Iterable <Customer> getById(@PathVariable int id) {
		System.out.println("in get: /api/umbrella/get");
		return service.getById(id);
	}
	

	@PostMapping("add")
	@CrossOrigin
	@ResponseBody
	public void add(@RequestBody String customerJson) throws JsonMappingException, JsonProcessingException {
		System.out.println("in add: /api/umbrella/add");
		ObjectMapper objectMapper = new ObjectMapper();
		
		CustomerJsonData customer_data = objectMapper.readValue(customerJson, CustomerJsonData.class);
	     
//		Customer customer = new Customer();
//		customer.getSurname(customer_data.getTimeSlot());
//		
//		service.add(customer);

	}
	
	@PostMapping("update")
	@CrossOrigin
	@ResponseBody
	public void update(@RequestBody String customer) throws JsonMappingException, JsonProcessingException {
		System.out.println("in update: /api/customer/update");
		ObjectMapper objectMapper = new ObjectMapper();
		
		CustomerJsonData customerJsonData= objectMapper.readValue(customer, CustomerJsonData.class);
	    Iterable <Customer> customers  = service.getById(customerJsonData.getId());
	    
	    System.out.println("id for update: " +customerJsonData.getId() + " surname: "
	    		+ customerJsonData.getSurName());
	    
	    for (Customer each : customers)
		{
	    	System.out.println("in foreach details: " + each.getId());
		    each.setAddress(customerJsonData.getAddress());
		    each.setName(customerJsonData.getName());
		    each.setSurname(customerJsonData.getSurName());
		    each.setPhone(customerJsonData.getPhone());
		    each.setEmail(customerJsonData.getEmail());
		    
		    service.update(each);
		}
	}
	
	

	
	@DeleteMapping("delete")
	@CrossOrigin
	@ResponseBody
	public void delete() throws JsonMappingException, JsonProcessingException {
		System.out.println("in delete: /api/delete");
	
	}
}
