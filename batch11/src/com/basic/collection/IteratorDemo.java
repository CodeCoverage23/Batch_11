package com.basic.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		al.add(17);
		al.add(18);

		System.out.println(al);

		Iterator<Integer> iterator = al.iterator();

		// perform plus 10 operation with each collection object

		while (iterator.hasNext()) {
			Integer value = iterator.next();

			System.out.println(value + 10);

		}

	}

}
