package com.basic.collection;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {

		TreeSet<String> t = new TreeSet<>();

		t.add("S");
		t.add("A");
		t.add("C");
		t.add("R");
		t.add("V");
		t.add("N");
		t.add("S");

		System.out.println(t);

		List<Double> list = List.of(12.1, 45.4, 1.3);

		Set<Double> treeSet = new TreeSet<>(list);

		System.out.println(treeSet);

	}

}
