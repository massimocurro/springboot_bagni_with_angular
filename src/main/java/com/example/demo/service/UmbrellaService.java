package com.example.demo.service;


import java.util.Collections;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Umbrella;
import com.example.demo.repository.IUmbrellaRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;



@Service("UmbrellaService")
public class UmbrellaService implements IUmbrellaService{
	
	@Autowired
	IUmbrellaRepository iRepository;
	
	@PersistenceContext
	private EntityManager entityManager;

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

	@Override
	public Umbrella getByUmbrellaAndPeriod(int id, String period) {
		// TODO Auto-generated method stub
		
		if (period.equals("Oggi")) {
			Date today = new Date();
			
		} else if (period.equals("Settimana")) {
			
		}
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		entityManager = entityManagerFactory.createEntityManager();
		
		Query jpqlQuery = this.entityManager.getEntityManagerFactory().createEntityManager().createQuery("SELECT u FROM UserEntity u WHERE u.id=:id");
		jpqlQuery.setParameter("id", id);
	    return (Umbrella) jpqlQuery.getSingleResult();
				
	}
	
	
	
	

}
