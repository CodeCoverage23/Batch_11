package com.basic.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Object> l = new LinkedList<>();

		l.add("Java");
		l.add(15);
		l.add('C');
		l.add(12.23);
		l.add(null);

		System.out.println(l);

		List<String> cities = new LinkedList<String>();

		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Nagpur");
		cities.add("Nagpur");
		cities.add("Nashik");

		// listOfCities.add(12); Compile time error

		System.out.println(cities);

		cities.set(3, "Indore");
		cities.addFirst("Delhi");
		System.out.println(cities);

		cities.remove("Indore");
		cities.removeLast();
		System.out.println(cities);

		ArrayList<String> al = new ArrayList<>(cities);

		/*
		 * TODO : 
		 * 1. Print length of each string 
		 * 2. Create the list of those lengths 
		 * 3. Perform addition of all the numbers
		 */

	}

}
