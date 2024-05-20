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
	IUmbrellaRepository iRepository;
	

	@Override
	public Iterable<Umbrella> getAll() {
		// TODO Auto-generated method stub
		return iRepository.findAll();
	}

	@Override
	public void add(Umbrella umbrella) {
		// TODO Auto-generated method stub
		iRepository.save(umbrella);
	}

	@Override
	public Iterable <Umbrella> getById(int id) {
		// TODO Auto-generated method stub
		
		return iRepository.findById(id).map(Collections::singleton)
		            .orElseGet(Collections::emptySet);
	}

	@Override
	public void update(Umbrella umbrella) {
		// TODO Auto-generated method stub
		//iUmbrellaRepository.findById(umbrella.)
		
		iRepository.save(umbrella);
	}
	

}
