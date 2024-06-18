package com.example.demo;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.bean.test.CustomerIdentify;
import com.example.bean.test.Customer;
import com.example.demo.service.CustomerService;

import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Configuration
public class BagniApplication {

	public static void main(String[] args) {
		SpringApplication.run(BagniApplication.class, args);
		
	}
	

}
