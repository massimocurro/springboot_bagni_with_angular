/*
package com.example.demo.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Photo;
import com.example.demo.service.IPhotoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

@RestController
@RequestMapping("api")
public class DBPhotoController {

	@Autowired
	@Qualifier("PhotoService")
	private IPhotoService photoService;

	@GetMapping("get")
	public Iterable <Photo> getAllPhoto() {
		System.out.println("in get: /api/get");
		return photoService.getAllPhoto();
		
	}

	@PostMapping("add")
	@ResponseBody
	public void add(@RequestBody String photo) throws JsonMappingException, JsonProcessingException {
		System.out.println("in add: /api/add");
		ObjectMapper objectMapper = new ObjectMapper();
		
		
		Photo photos = objectMapper.readValue(photo, Photo.class);
	     
		photoService.addPhoto(photos.getUrl());

		
	}
	
	@PostMapping("test")		
	@ResponseBody
	public void test() throws JsonMappingException, JsonProcessingException {
		System.out.println("in test: /api/test");
	    photoService.addPhoto("www.testone in test");
	}
	
	@DeleteMapping("delete")		
	@ResponseBody
	public void delete() throws JsonMappingException, JsonProcessingException {
		System.out.println("in delete: /api/delete");
	
	}
}
*/
