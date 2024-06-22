package com.example.demo.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectTest {
	
	@Pointcut("execution(public java.lang.Iterable<com.example.demo.model.Umbrella> com.example.demo.service.UmbrellaService.getAll())")
	public void p1() {
	}
	@Before("p1()")
	public void p2() {
	    System.out.println("Aspect: before Called getAll()");
	}
	@After("p1()")
	public void p3() {
	    System.out.println("Aspect: after Called getAll()");
	}
}
