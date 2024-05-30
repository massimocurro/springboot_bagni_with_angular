package com.example.bean.test;

import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICustomerRepository;
import com.example.demo.repository.IUmbrellaRepository;

@Configuration
public class ComponentClass2 {
	
	public String get() {return "Ciao";}
	
	private String name = "";
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Bean
	public ComponentClass getComponent() {return new ComponentClass();}
}
