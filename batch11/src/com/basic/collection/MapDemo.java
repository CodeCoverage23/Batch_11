package com.basic.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Mango");
		map.put(2, "Banana");
		map.put(4, "Cherry");
		map.put(3, "Apple");
		map.put(5, "Greps");

		System.out.println(map);
		System.out.println(map.containsValue("Apple"));
		// Duplicate Key
		map.put(3, "Stoberi");
		// Duplicate value
		map.put(6, "Stoberi");
		System.out.println(map);

		// use of replace method
		map.replace(6, "Guava");
		System.out.println(map);

		// use of contains Key Method

		System.out.println(map.containsKey(5));
		System.out.println(map.containsKey(10));

		if (map.containsKey(5)) {
			String string = map.get(5);
			System.out.println("Value of 5 : " + string);
			map.remove(5);
		}
		System.out.println(map);

		// use of contains value method
		System.out.println(map.containsValue("Apple"));

		// using for loop
		for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + m.getValue().toUpperCase());
		}

		// using iterator

		Set<Entry<Integer, String>> entrySet = map.entrySet();

		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();

		while (iterator.hasNext()) {

			Entry<Integer, String> next = iterator.next();

			System.out.println(next.getValue() + next.getKey());

		}

		// get key set

		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);

		// get value
		Collection<String> values = map.values();
		System.out.println(values);

	}

}
