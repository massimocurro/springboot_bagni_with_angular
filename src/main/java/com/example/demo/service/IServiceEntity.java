package com.example.demo.service;

import com.example.demo.model.User;

public interface IServiceEntity <T>{
	
	Iterable <T> getAll();
	
	void add(T entity);
	
	Iterable<T> getById(int id);
	
	void update(T entity);
	
	void delete(int id);
	
	Iterable<User> getByUserNameAndPassord(String username, String password);
	
	
}
