package com.basic.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Integer> h = new HashSet<>();

		h.add(54);
		h.add(54);
		h.add(14);
		h.add(59);
		h.add(154);
		h.add(514);

		System.out.println(h.add(549));
		System.out.println(h.add(549));

		h.add(null);

		System.out.println(h);
		System.out.println("Hash Code value of 54 : " + Integer.valueOf("54").hashCode());
		System.out.println("Hash Code value : " + h.hashCode());

		// A constructor with int initialCapacity, float loadFactor
		Set<String> s = new HashSet<>(100, 9);

		System.out.println("Size of set : " + s.size());

		for (int i = 1; i <= 89; i++) {
			s.add(String.valueOf(i));
		}

		System.out.println(s);
		System.out.println("Size of set : " + s.size());

		// A constructor with existing collection object

		List<Float> l = new ArrayList<>();

		l.add(1.1f);
		l.add(1.2f);
		l.add(2.1f);
		l.add(2.1f);
		l.add(1.5f);
		l.add(1.9f);
		l.add(1.1f);

		System.out.println(l);

		Set<Float> s1 = new HashSet<>(l);

		System.out.println(s1);
	}

}
