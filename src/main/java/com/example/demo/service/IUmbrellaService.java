package com.example.demo.service;



import java.util.Optional;

import com.example.demo.model.Umbrella;

public interface IUmbrellaService {
	
	Iterable <Umbrella> getAllUmbrella();
	
	
	void addUmbrella(Umbrella umbrella);
	
	Iterable<Umbrella> getUmbrellaById(int id);
}
