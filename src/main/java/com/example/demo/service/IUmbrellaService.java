package com.example.demo.service;



import java.util.Optional;

import com.example.demo.model.Umbrella;

public interface IUmbrellaService {
	
	Iterable <Umbrella> getAll();
	
	
	void add(Umbrella umbrella);
	
	Iterable<Umbrella> getById(int id);
	
	void update(Umbrella umbrella);
	
	Umbrella getByUmbrellaAndPeriod(int id, String period);
}
