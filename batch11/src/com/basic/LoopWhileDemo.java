package com.basic;

public class LoopWhileDemo {

	public static void main(String[] args) {

		// Table of 5

		int a = 1;
		while (a <= 10) {
			System.out.println(a * 5);
			a++;
		}

		System.out.println("---------------------------------------------------------");
		// Continue and break stmt
		a = 1;
		while (a <= 20) {

			int b = a * 5;

			a++;

			if (b == 50) {
				break;
			}
			System.out.println(b);
		}

		System.out.println("---------------------------------------------------------");

		for (int i = 1; i <= 10; i++) {

			if (i == 5) {
				continue;
			}

			System.out.println(i * 10);

		}

	}

}
