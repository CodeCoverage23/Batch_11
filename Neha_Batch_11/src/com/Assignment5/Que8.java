package com.Assignment5;

import java.util.Scanner;

public class Que8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an 2 Integers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Befor Swaping  n1 = " + n1 + " & n2 = " + n2);
		int temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("After Swaping  n1 = " + n1 + " & n2 = " + n2);

		Que8 ob = new Que8();
		ob.swap(12, 58);

	}

	void swap(int a, int b) {
		System.out.println("Befor Swaping without using  3rd veriable   a = " + a + " & b = " + b);
		a = a + b;// 5+6 =11
		b = a - b;// 11-6=5
		a = a - b;// 11-5=6

		System.out.println("After Swaping without using 3rd veriable   a = " + a + " & b = " + b);

	}

}
