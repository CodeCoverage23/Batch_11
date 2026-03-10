package com.management.hotel.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.management.hotel.Exception.ResourceNotFoundException;
import com.management.hotel.Repository.HotelRepository;
import com.management.hotel.entity.Hotel;

@Service
public class HotelServiceImpl implements HotelServices {
	@Autowired
	HotelRepository hotelRepository;

	@Override
	public ResponseEntity<Hotel> createHotelData(Hotel hotel) {
	      String randomid = UUID.randomUUID().toString();
	      hotel.setHotelId(randomid);
		Hotel save = hotelRepository.save(hotel);
		return new ResponseEntity<Hotel>(save,HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<List<Hotel>> getalldata() {
		List<Hotel> findAll = hotelRepository.findAll();
		return new ResponseEntity<List<Hotel>>(findAll,HttpStatus.OK);
	}

	@Override
	public Hotel getHotelById(String hotelId) {
	
		return hotelRepository.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("user with gievn id is not found in server "+hotelId ));
	}

}
