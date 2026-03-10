package com.management.hotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.hotel.entity.Hotel;
public interface HotelRepository extends JpaRepository<Hotel, String>{

}
