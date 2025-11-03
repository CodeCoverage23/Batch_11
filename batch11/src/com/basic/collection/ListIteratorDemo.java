package com.basic.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		List<String> l = new LinkedList<>();

		l.add("Kishor");
		l.add("Sagar");
		l.add("Sachin");
		l.add("Shiva");
		System.out.println(l);
		ListIterator<String> listIterator = l.listIterator();

		while (listIterator.hasNext()) {
			String value = listIterator.next();

			if (value.equals("Kishor")) {
				listIterator.remove();
			} else if (value.equals("Sachin")) {
				listIterator.add("Pavan");
			} else if (value.equals("Pavan")) {
				listIterator.set("Swapnil");
			}
		}

		System.out.println(l);
		System.out.println("-------------------------");

		while (listIterator.hasPrevious()) {
			String previous = listIterator.previous();
			System.out.println(previous);

		}

	}

}
