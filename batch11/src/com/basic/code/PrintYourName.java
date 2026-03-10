package com.basic.code;

public class PrintYourName {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			if (i % 5 == 0) {
				System.out.println("Your Name");
			} else if (i % 7 == 0) {
				System.out.println("Your Surname");
			} else if (i % 5 == 0 && i % 7 == 0) {
				System.out.println("Full name");
			} else {
				System.out.println(i);
			}

		}

	}

}
