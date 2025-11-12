package com.basic.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<String, Double> lhm = new LinkedHashMap<>();

		lhm.put("Mango", 9.3);
		lhm.put("Greps", 8.5);
		lhm.put("Apple", 6.4);
		lhm.put("Banana", 9.3);
		lhm.put("Guava", 10.0);

		System.out.println(lhm);

		HashMap<String, Double> m = new HashMap<>(lhm);

		System.out.println(m);

		System.out.println("Value of the guava : " + lhm.get("Guava"));
		System.out.println("Value of the Key : " + lhm.getOrDefault("Kaccha Mango", 5.5));

		lhm.clear();

		System.out.println(lhm);

	}

}