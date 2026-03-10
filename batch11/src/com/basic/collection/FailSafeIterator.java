package com.basic.collection;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class FailSafeIterator {

	ConcurrentHashMap<String, String> map;
	CopyOnWriteArraySet<String> set;

	public static void main(String[] args) {

		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

		list.add(12);
		list.add(15);
		list.add(19);
		list.add(12);
		list.add(122);
		list.add(1);
		list.add(2);

		System.out.println("Length : " + list.size());

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			Integer num = itr.next();
			System.out.println(num);
			list.add(25); // modification
		}

	}

}
