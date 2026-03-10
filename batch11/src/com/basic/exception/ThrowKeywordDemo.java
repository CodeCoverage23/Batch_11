package com.basic.exception;

public class ThrowKeywordDemo {

	public static void main(String[] args) {

		String s1 = "Code";

		if (s1.length() > 3) {
			throw new StringIndexOutOfBoundsException("String has no index available");
		}

		System.out.println("Rest of the code");
	}

}
