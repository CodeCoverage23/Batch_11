package com.basic.collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<String, String> map = new TreeMap<>();

		map.put("Apple", "Jammu");
		map.put("Greps", "Nashik");
		map.put("Mango", "Kokan");
		map.put("Banana", "Jalgaon");

		System.out.println(map);
		System.out.println(map.descendingKeySet());
		System.out.println(map.descendingMap());

		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey().toUpperCase() + "-----" + entry.getValue().toUpperCase());
		}

		// navigable map

		Entry<String, String> ceilingEntry = map.ceilingEntry("Guava");
		System.out.println(ceilingEntry);

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(109, "John");
		hm.put(104, "Pavan");
		hm.put(107, "Sam");
		hm.put(101, "John");
		hm.put(102, "John");

		System.out.println(hm);

		TreeMap<Integer, String> tm = new TreeMap<>(hm);
		System.out.println(tm);

	}

}
