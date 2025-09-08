package com.basic.string;

public class StringMethods {

	public static void main(String[] args) {

		String s1 = "Java is a programmig language";

		String s2 = s1.replace(" ", "");
		String s3 = s1.replace(" ", "*");

		int length = s1.length();
		System.out.println(length);

		System.out.println(s2 + " : " + s2.length());

		System.out.println(s1.charAt(28));

		String substring1 = s1.substring(10);
		System.out.println(substring1);

		String substring2 = s1.substring(0, 5);
		System.out.println(substring2);

		System.out.println(s1.toUpperCase());

		System.out.println(s1.toLowerCase());

		System.out.println(s1.concat(" since 1995."));
		System.out.println(s1.contains("Java"));
		System.out.println(s3);

		String[] split = s1.split(" ");

		for (String s : split) {
			System.out.println(s);
		}

	}

}
