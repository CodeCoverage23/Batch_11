package com.basic;

import java.util.Scanner;

public class IfElseIfDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		int marks = sc.nextInt();

		if (marks > 90) {
			System.out.println("Pass with gread : A");
		} else if (marks > 80) {
			System.out.println("Pass with gread : B");
		} else if (marks > 70) {
			System.out.println("Pass with gread : C");
		} else if (marks > 60) {
			System.out.println("Pass with gread : D");
		} else {
			System.out.println("Fail");
		}
		System.out.println("Rest of the code");
	}

}
