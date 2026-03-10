package com.basic.array;

public class ArrayDemo1 {

	int number;

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50, 60, 70 };

		System.out.println(a[0]);
		System.out.println(a[6]);

		System.out.println(a[4]);
		System.out.println("************************");

		System.out.println(a);
		
		for (int i = 0; i <= a.length; i++) {
			System.out.println(a[i]);
		}
		

	}

}
