package com.management.hotel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Hotel_detail")
public class Hotel {
	@Id
     @Column(name="Hotel_Id")
	private String hotelId;
     @Column(name="Hotel_Name")
	private String hotelname;
     @Column(name="Hotel_Location")
	private String location;
     @Column(name="About")
	private String about;
	
	
	
	
}
