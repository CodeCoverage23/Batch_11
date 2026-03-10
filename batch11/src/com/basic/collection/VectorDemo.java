package com.basic.collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>(50);

		for (int i = 1; i <= 50; i++) {
			vector.add(i);
		}
		System.out.println(vector);

		vector.remove(0);

		System.out.println(vector);

	}
}
