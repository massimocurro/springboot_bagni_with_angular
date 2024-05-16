package com.example.demo.service;

import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Umbrella;
import com.example.demo.repository.IUmbrellaRepository;



@Service("UmbrellaService")
public class UmbrellaService implements IUmbrellaService{
	
	@Autowired
	IUmbrellaRepository iUmbrellaRepository;
	

	@Override
	public Iterable<Umbrella> getAllUmbrella() {
		// TODO Auto-generated method stub
		return iUmbrellaRepository.findAll();
	}

	@Override
	public void addUmbrella(Umbrella umbrella) {
		// TODO Auto-generated method stub
		iUmbrellaRepository.save(umbrella);
	}

	@Override
	public Iterable <Umbrella> getUmbrellaById(int id) {
		// TODO Auto-generated method stub
		
		return iUmbrellaRepository.findById(id).map(Collections::singleton)
		            .orElseGet(Collections::emptySet);
	}
}
