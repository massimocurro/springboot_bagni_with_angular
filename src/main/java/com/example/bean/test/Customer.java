package com.example.bean.test;

import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICustomerRepository;
import com.example.demo.repository.IUmbrellaRepository;



@Configuration
public class Customer {
	
	public String get() {return "Ciao";}
	
	private String name = "";
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Bean
	@Scope("singleton")
	//@Scope("prototype")
	public CustomerIdentify componentClass() {
		CustomerIdentify componentClass = new CustomerIdentify();
		return componentClass;}
}
