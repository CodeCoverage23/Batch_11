package com.basic.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo2 {

	public static void main(String[] args) {

		List<Double> l = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			l.add((double) i);
		}
		Iterator<Double> itr = l.iterator();

		while (itr.hasNext()) {
			Double next = itr.next();
			System.out.println(next);
			l.add(6.0); // CME - Fail fast iterator
		}

	}

}
