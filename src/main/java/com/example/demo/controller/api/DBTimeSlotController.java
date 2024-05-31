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

import com.example.demo.data.TimeSlotJsonData;
import com.example.demo.data.UmbrellaJsonData;
import com.example.demo.model.TimeSlot;
import com.example.demo.model.Umbrella;
import com.example.demo.service.ITimeSlotService;
import com.example.demo.service.IUmbrellaService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

@RestController
@RequestMapping("api/time_slot")
public class DBTimeSlotController {

	@Autowired
	@Qualifier("TimeSlotService")
	private ITimeSlotService service;

	@GetMapping("get/all")
	@CrossOrigin
	public Iterable <TimeSlot> getAll() {
		System.out.println("in get: /api/time_slot/get");
		return service.getAll();
	}
	
	@GetMapping("get/{id}")
	@CrossOrigin
	public Iterable <TimeSlot> getById(@PathVariable int id) {
		System.out.println("in get: /api/umbrella/get");
		return service.getById(id);
	}
	

	@PostMapping("add")
	@CrossOrigin
	@ResponseBody
	public void add(@RequestBody String timeSlot) throws JsonMappingException, JsonProcessingException {
		System.out.println("in add: /api/umbrella/add");
		ObjectMapper objectMapper = new ObjectMapper();
		
		TimeSlotJsonData time_Slot = objectMapper.readValue(timeSlot, TimeSlotJsonData.class);
	     
		TimeSlot newTimeSlot = new TimeSlot();
		newTimeSlot.setTime_slot(time_Slot.getTimeSlot());
		
		service.add(newTimeSlot);

	}
	
	@PostMapping("update")
	@CrossOrigin
	@ResponseBody
	public void update(@RequestBody String timeSlot) throws JsonMappingException, JsonProcessingException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		TimeSlotJsonData timeSlotData= objectMapper.readValue(timeSlot, TimeSlotJsonData.class);
	    Iterable <TimeSlot> timeSlots  = service.getById(timeSlotData.getId());
	    System.out.println("in update: /api/time_slot/update");
	    System.out.println("TimeSlot id for update: " +timeSlotData.getId());
	    System.out.println("TimeSlot time_slot for update: " +timeSlotData.getTimeSlot());
	    
	    for (TimeSlot each : timeSlots)
		{
	    	System.out.println("saving time slot: " + each.getId());
		    each.setTime_slot(timeSlotData.getTimeSlot());
		    service.update(each);
		}
	}
	
	

	
	@DeleteMapping("delete")
	@CrossOrigin
	@ResponseBody
	public void delete() throws JsonMappingException, JsonProcessingException {
		System.out.println("in delete: /api/delete");
	
	}
}
