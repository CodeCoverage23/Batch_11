package com.basic.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {

		NavigableSet<Integer> n = new TreeSet<Integer>();

		n.add(55);
		n.add(89);
		n.add(44);
		n.add(5);
		n.add(15);
		n.add(78);
		n.add(3);
		n.add(55);

		System.out.println(n);

		System.out.println(n.floor(50));
		System.out.println(n.ceiling(50));
		System.out.println(n.lower(44));
		System.out.println(n.higher(78));
		System.out.println(n.descendingSet());

		// Sorted Set specific method - [3, 5, 15, 44, 55, 78, 89]

		System.out.println(n.headSet(44)); // 3,5,15
		System.out.println(n.tailSet(55)); // 55, 78, 89
		System.out.println(n.subSet(5, 55)); // 5, 15, 44
		System.out.println(n.first()); // 3
		System.out.println(n.last()); // 89

	}

}
