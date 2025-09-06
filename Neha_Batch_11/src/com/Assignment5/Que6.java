package com.Assignment5;

import java.util.Scanner;

public class Que6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer : ");
		int num = sc.nextInt();
		if(num > 100) {
			System.out.println("Number is Greter than 100");
			
		}
		else {
			System.out.println("Number is less than 100 ");
		}
	}

}
