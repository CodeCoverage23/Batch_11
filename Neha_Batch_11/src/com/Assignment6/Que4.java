package com.Assignment6;
import java.util.Scanner;
public class Que4 {
	int fact=1;
	int factorial(int no) {
		if(no==0 || no==1) {
			return 1;
		}
		else {
			return no*factorial(no-1);
			
		}
		
		
	}
	public static void main(String[] args) {
		Que4 obj=new Que4();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an Integer : ");
		int no = sc.nextInt();
		
		int result =obj.factorial(no);
		
		System.out.println(result);
		
	}
}
