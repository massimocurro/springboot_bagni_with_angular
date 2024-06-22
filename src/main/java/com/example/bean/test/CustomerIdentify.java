package com.example.bean.test;

import org.springframework.stereotype.Component;


public class CustomerIdentify {
	
	public CustomerIdentify() {
		System.out.println("allocato CustomerIdentity!!!!!!!!!!!!!!!!!!!!");	
		}
	
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String test) {
		this.identity = test;
	}
	private String identity = "default";
	
}
