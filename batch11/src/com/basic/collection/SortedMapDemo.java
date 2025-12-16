package com.basic.collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

	public static void main(String[] args) {

		SortedMap<Integer, String> sm = new TreeMap<>(); // up-casting

		sm.put(19, "Pune");
		sm.put(1, "Mumbai");
		sm.put(10, "Indore");
		sm.put(7, "Pune");
		sm.put(2, "Delhi");
		sm.put(2, "Bengaluru");

		System.out.println(sm);

		System.out.println(sm.firstKey());

		System.out.println(sm.firstEntry());
		System.out.println(sm.lastKey());
		System.out.println(sm.lastEntry());

		System.out.println(sm.headMap(7));
		System.out.println(sm.tailMap(7));

		sm.putIfAbsent(14, "Akola");
		
		System.out.println(sm);

	}

}
