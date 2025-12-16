package com.basic.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FailFastIterator {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>(); // UP-casting

		set.add("A");
		set.add("B");
		set.add("C");
		set.add("A");
		set.add("D");
		set.add("E");
		set.add("E");

		System.out.println("length : " + set.size()); // 7 or 6 or 5
		System.out.println("ConcurrentModificationException".length());

		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) { // traversing
			String next = itr.next();
			System.out.println(next);
			set.add("F"); // modification
		}

	}

}
