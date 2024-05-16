/*
package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Photo;
import com.example.demo.repository.IPhotoRepository;

@Service("PhotoService")
public class PhotoService implements IPhotoService{
	
	@Autowired
	IPhotoRepository iPhotoRepository;
	
	@Override
	public Iterable <Photo> getAllPhoto(){
		return iPhotoRepository.findAll();
		
	}
	@Override
	public void addPhoto(String url) {
		Photo photo = new Photo(url);
		iPhotoRepository.save(photo);
	}
	@Override
	public void addPhoto(Photo photo) {
		// TODO Auto-generated method stub
		
	}

}
*/