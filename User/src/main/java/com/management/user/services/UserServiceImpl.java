package com.management.user.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.management.user.Exception.ResourceNotFoundException;
import com.management.user.entity.Hotel;
import com.management.user.entity.Rating;
import com.management.user.entity.User;
import com.management.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	/*
	 * // RestTemplate is used to make HTTP requests to other microservices. It is
	 * injected using @Autowired annotation.
	 * 
	 * @Autowired 
	 * RestTemplate restTemplate;
	 */
	
	@Autowired
	WebClient.Builder webClient;

	@Override
	public User saveUser(User user) {
		String randomUserId = UUID.randomUUID().toString();
		user.setId(randomUserId);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {

		return userRepository.findAll();
	}

	@Override
	public User getUserById(String UserId) {
		// TODO Auto-generated method stub

		User user = userRepository.findById(UserId).orElseThrow(
				() -> new ResourceNotFoundException("user with gievn id is not found in server " + UserId));
		// Request ratings as an array of Rating to avoid Jackson deserializing into
		// LinkedHashMap
		/*
		 * ResponseEntity<Rating[]> response =
		 * restTemplate.getForEntity("http://RATING-MANAGEMENT-SYSTEM/ratings/all/" +
		 * user.getId(), Rating[].class); 
		 * Rating[] ratingArray = response.getBody();
		 * List<Rating> ratings = ratingArray == null ? new ArrayList<>() :
		 * Arrays.asList(ratingArray); System.out.println("Ratings for user " +
		 * user.getId() + ": " + ratings);
		 */
//		 List<Rating> ratings = Arrays.stream(ratingOfUser).toList();

		/*
		 * List<Rating> collect = ratings.stream().map(rating -> { ResponseEntity<Hotel>
		 * forEntity = restTemplate
		 * .getForEntity("http://HOTEL-MANAGEMENT-SYSTEM/hotel/get/" +
		 * rating.getHotelId(), Hotel.class); // Hotel hotel = forEntity.getBody();
		 */
		// Using WebClient to fetch hotel details for each rating
		Rating[] response = webClient.build().get()
				.uri("http://RATING-MANAGEMENT-SYSTEM/ratings/all/" + user.getId())
				.retrieve()
				.bodyToMono(Rating[].class)
				.block();
		List<Rating> ratings = response == null ? new ArrayList<>() :
			  Arrays.asList(response);
		
		List<Rating> collect = ratings.stream().map(rating -> {
			Hotel forEntity = webClient.build().get()
					.uri("http://HOTEL-MANAGEMENT-SYSTEM/hotel/get/" + rating.getHotelId())
					.retrieve()
					.bodyToMono(Hotel.class)
					.block();
		

			rating.setHotel(forEntity);
			return rating;

		}).collect(Collectors.toList());

		user.setRatings(collect);
		return user;
	}

}