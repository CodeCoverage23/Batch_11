package com.basic.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortIntegerData {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<>();

		l.add(89);
		l.add(77);
		l.add(89);
		l.add(8);
		l.add(9);
		l.add(189);
		l.add(889);
		l.add(8912);

		System.out.println(l);

		Collections.sort(l);

		System.out.println(l);

	}

}
