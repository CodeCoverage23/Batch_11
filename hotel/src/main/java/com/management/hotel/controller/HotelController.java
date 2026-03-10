package com.management.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.hotel.entity.Hotel;
import com.management.hotel.services.HotelServices;

@RestController
@RequestMapping("/hotel")
public class HotelController {
     @Autowired
	private HotelServices hotelServices;
	
	
	//handle create request
     @PostMapping("/create")
	public ResponseEntity<Hotel> CreatedHotel(@RequestBody Hotel hotel){
		ResponseEntity<Hotel> createHotelData = hotelServices.createHotelData(hotel);
		return createHotelData;
	}
	
	// handle getall request
     @GetMapping("/all")
     public ResponseEntity<List<Hotel>> getAllHotel(){
    	 ResponseEntity<List<Hotel>> getalldata = hotelServices.getalldata();
    	 return getalldata;
     }
     
     // handle get request for hotel id
     @GetMapping("/get/{hotelId}")
     public ResponseEntity<Hotel> getHotelById(@PathVariable String hotelId){
    	
    	 Hotel hotelById = hotelServices.getHotelById(hotelId);
    	 return new ResponseEntity<Hotel>(hotelById,HttpStatus.ACCEPTED);
    	 
    	 
     }
	
	
	
	
}
