package com.basic.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<>();

		for (int i = 1; i <= 10; i++) {
			set.add(i);
		}

		//set.add(55);

		System.out.println(set);

		LinkedHashSet<Integer> lhs = new LinkedHashSet<>(set);

		lhs.add(55);

		System.out.println(lhs);

	}

}
