package com.management.hotel.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.management.hotel.entity.Hotel;

public interface HotelServices {

	// create a hotel data
	
	public ResponseEntity<Hotel> createHotelData(Hotel hotel);
	
	// get all hotel data
	public ResponseEntity<List<Hotel>> getalldata();
	
	
	// get Hotel by Id
	public Hotel getHotelById(String hotelId);
	
	
	
	
}
