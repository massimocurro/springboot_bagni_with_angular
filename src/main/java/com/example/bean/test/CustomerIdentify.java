package com.example.bean.test;

import org.springframework.stereotype.Component;

//@Component
public class CustomerIdentify {
	
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String test) {
		this.identity = test;
	}
	private String identity = "default";
	
}
