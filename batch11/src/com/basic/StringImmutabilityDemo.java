package com.basic;

public class StringImmutabilityDemo {

	public static void main(String[] args) {

		String s = "Sachin";

		String st = s.concat(" Tendulkar");

		System.out.println(s);
		System.out.println(st);

	}

}
