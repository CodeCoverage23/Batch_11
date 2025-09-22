package com.myassignment;

import java.util.Scanner;

public class numberPosNeg {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a > 0) {
			System.out.print("Number is Positive:" + a);
		} else {
			System.out.print("Number is Negative:" + a);
		}
	}
}