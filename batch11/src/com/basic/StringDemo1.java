package com.basic;

public class StringDemo1 {

	public static void main(String[] args) {

		String s1 = "Code";
		String s2 = "Code";

		String s3 = new String("Code");

		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
		System.out.println(s2 == s3); // false

	}

}
