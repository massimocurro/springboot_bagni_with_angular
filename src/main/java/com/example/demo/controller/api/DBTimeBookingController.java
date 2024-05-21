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

import com.example.demo.data.BookingTimeJsonData;
import com.example.demo.data.UmbrellaJsonData;
import com.example.demo.model.TimeBooking;
import com.example.demo.model.Umbrella;
import com.example.demo.model.UmbrellaBooking;
import com.example.demo.service.ITimeBookingService;
import com.example.demo.service.IUmbrellaBookingService;
import com.example.demo.service.IUmbrellaService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

@RestController
@RequestMapping("api/booking")
public class DBTimeBookingController {

	@Autowired
	@Qualifier("TimeBookingService")
	private ITimeBookingService service;

	@GetMapping("get/all")
	@CrossOrigin
	public Iterable <TimeBooking> getAll() {
		System.out.println("in get: /api/booking/get");
		return service.getAll();
	}
	
	@GetMapping("get/{id}")
	@CrossOrigin
	public Iterable <TimeBooking> getById(@PathVariable int id) {
		System.out.println("in get: /api/booking/get");
		return service.getById(id);
	}
	

	@PostMapping("add")
	@CrossOrigin
	@ResponseBody
	public void add(@RequestBody String timeBooking) throws JsonMappingException, JsonProcessingException {
		System.out.println("in add: /api/booking/add");
		ObjectMapper objectMapper = new ObjectMapper();
		
		BookingTimeJsonData umbrellaData = objectMapper.readValue(timeBooking, BookingTimeJsonData.class);
	     
		TimeBooking newBooking = new TimeBooking();
		newBooking.setDate(umbrellaData.getDate());
		
		service.add(newBooking);

	}
	
	@PostMapping("update")
	@CrossOrigin
	@ResponseBody
	public void update(@RequestBody String timeBooking) throws JsonMappingException, JsonProcessingException {
		System.out.println("in add: /api/booking/update");
		ObjectMapper objectMapper = new ObjectMapper();
		
		BookingTimeJsonData umbrellaData = objectMapper.readValue(timeBooking, BookingTimeJsonData.class);
	    Iterable <TimeBooking> timeBookingList  = service.getById(umbrellaData.getId());
	    
	    System.out.println("id for update: " +umbrellaData.getId());
	    
	    for (TimeBooking each : timeBookingList)
		{
		    each.setDate(umbrellaData.getDate());
		    service.update(each);
		}
	}
	
	

	
	@DeleteMapping("delete")
	@CrossOrigin
	@ResponseBody
	public void delete() throws JsonMappingException, JsonProcessingException {
		System.out.println("in delete: /api/booking/delete");
	
	}
}
