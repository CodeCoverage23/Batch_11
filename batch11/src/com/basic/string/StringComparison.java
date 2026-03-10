package com.basic.string;

public class StringComparison {

	public static void main(String[] args) {

		StringComparison s = new StringComparison();

		String s1 = "code";
		String s2 = "CODE";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		String s3 = new String("code");

		System.out.println(s1 == s2); // false
		System.out.println(s1 == s3);

		String s4 = "A";
		String s5 = "B";

		System.out.println(s1.compareToIgnoreCase(s2)); // 0
		System.out.println(s4.compareTo(s5)); // -1
		System.out.println(s5.compareTo(s4)); // 1

		String s6 = "I love India";

		System.out.println("Starts with I : " + s6.startsWith("I"));
		System.out.println("END with I : " + s6.endsWith("India"));

		System.out.println(s1.startsWith(s3));

	}

}
