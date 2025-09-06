package com.Assignment5;
import java.util.Scanner;
public class Que3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter three Integers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
	
		if(a >= b && a>=c) {
			System.out.println(+a + " Number is Greater ");
		}
		else if (b>=c) {
			System.out.println(+b +" Number is Greater ");
		}
		else {
			System.out.println(+c+" Number is Greater ");
			
			
		}
	}
	
	

}
