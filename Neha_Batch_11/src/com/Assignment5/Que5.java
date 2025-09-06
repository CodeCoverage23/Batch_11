package com.Assignment5;
import java.util.Scanner;
public class Que5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer : ");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("Number is Even ");
			
		}
		else {
			System.out.println("Number is ODD ");
		}
	}

}
