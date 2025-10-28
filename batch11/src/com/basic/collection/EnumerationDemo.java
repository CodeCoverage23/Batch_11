package com.basic.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {

		Vector<String> fruits = new Vector<String>();

		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Cherry");
		fruits.add("Mango");

		System.out.println(fruits);

		// Requirement - Print the object (String) that Starts with char A

		Enumeration<String> e = fruits.elements();

		while (e.hasMoreElements()) {
			String element = e.nextElement();

			if (element.startsWith("A")) {
				System.out.println(element);
			}

		}

	}

}
