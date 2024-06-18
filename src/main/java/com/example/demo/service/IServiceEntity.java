package com.example.demo.service;




public interface IServiceEntity <T>{
	
	Iterable <T> getAll();
	
	void add(T entity);
	
	Iterable<T> getById(int id);
	
	void update(T entity);
	
	void delete(int id);
	
	
}
