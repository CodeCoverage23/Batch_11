package com.myassignment;

import java.util.Scanner;

public class MarksCalculator {
	public static int calculateTotal(int m1, int m2, int m3, int m4, int m5) {
		return m1 + m2 + m3 + m4 + m5;
	}

	public static double calculateAverage(int total) {
		return total / 5.0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input marks for 5 subjects
		System.out.print("Enter marks for Subject 1: ");
		int m1 = sc.nextInt();

		System.out.print("Enter marks for Subject 2: ");
		int m2 = sc.nextInt();

		System.out.print("Enter marks for Subject 3: ");
		int m3 = sc.nextInt();

		System.out.print("Enter marks for Subject 4: ");
		int m4 = sc.nextInt();

		System.out.print("Enter marks for Subject 5: ");
		int m5 = sc.nextInt();

		int total = calculateTotal(m1, m2, m3, m4, m5);
		double average = calculateAverage(total);

		System.out.println("\nTotal Marks = " + total);
		System.out.println("Average Marks = " + average);

	}
}
