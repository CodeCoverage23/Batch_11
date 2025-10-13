package com.basic.collection;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList(); // default capacity 10

		System.out.println(al.size());

		al.add(12);
		al.add(10);
		al.add(18);
		al.add(11);
		al.add(1);
		al.add(12);
		al.add(12.12);
		al.add("Java");
		al.add(true);

		System.out.println(al);

		al.add(null);
		System.out.println(al);

		al.remove(3);
		System.out.println(al);

		al.set(3, "code coverage");
		System.out.println(al);

		al.removeFirst();
		al.removeLast();
		System.out.println(al);

		al.add(5, false);
		System.out.println(al);

		System.out.println(al.size());

		Object object = al.get(4);

		System.out.println(object);

		ArrayList al2 = new ArrayList(al); // capacity 50

		System.out.println("AL 2 : " + al2);

	}

}
