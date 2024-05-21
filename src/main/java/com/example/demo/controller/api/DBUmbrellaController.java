package com.example.demo.controller.api;



import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.UmbrellaJsonData;

import com.example.demo.model.Umbrella;

import com.example.demo.service.IUmbrellaService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

@RestController
@RequestMapping("api/umbrella")
public class DBUmbrellaController {

	@Autowired
	@Qualifier("UmbrellaService")
	private IUmbrellaService umbrellaService;

	@GetMapping("get/all")
	@CrossOrigin
	public Iterable <Umbrella> getAllUmbrella() {
		System.out.println("in get: /api/umbrella/get");
		return umbrellaService.getAll();
	}
	
	@GetMapping("get/{id}")
	@CrossOrigin
	public Iterable <Umbrella> getUmbrellaById(@PathVariable int id) {
		System.out.println("in get: /api/umbrella/get");
		return umbrellaService.getById(id);
	}
	

	@PostMapping("add")
	@CrossOrigin
	@ResponseBody
	public void add(@RequestBody String umbrella) throws JsonMappingException, JsonProcessingException {
		System.out.println("in add: /api/umbrella/add");
		ObjectMapper objectMapper = new ObjectMapper();
		
		UmbrellaJsonData umbrellaData = objectMapper.readValue(umbrella, UmbrellaJsonData.class);
	     
		Umbrella newUmbrella = new Umbrella();
		newUmbrella.setComments(umbrellaData.getComments());
		
		umbrellaService.add(newUmbrella);

	}
	
	@PostMapping("update")
	@CrossOrigin
	@ResponseBody
	public void update(@RequestBody String umbrella) throws JsonMappingException, JsonProcessingException {
		System.out.println("in add: /api/umbrella/update");
		ObjectMapper objectMapper = new ObjectMapper();
		
		UmbrellaJsonData umbrellaData = objectMapper.readValue(umbrella, UmbrellaJsonData.class);
	    Iterable <Umbrella> umbrellaList  = umbrellaService.getById(umbrellaData.getId());
	    
	    System.out.println("id for update: " +umbrellaData.getId());
	    
	    for (Umbrella each : umbrellaList)
		{
	    	System.out.println("in foreach details: " + each.getDetails());
		    each.setComments(umbrellaData.getComments());
		    each.setBooking_status(umbrellaData.getBookingStatus());
		    each.setDetails(umbrellaData.getDetails());
		    umbrellaService.update(each);
		}
	}
	
	

	
	@DeleteMapping("delete")
	@CrossOrigin
	@ResponseBody
	public void delete() throws JsonMappingException, JsonProcessingException {
		System.out.println("in delete: /api/delete");
	
	}
}
