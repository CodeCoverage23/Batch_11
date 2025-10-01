package com.Assignment7;
import java.util.Scanner;
/**
 * Reverse the number 
 */
public class Que4 {
	
	void reverse(int n) {
		int s=0;
		int a;
		while (n!=0) {
			a= n%10;
			n=n/10;
			s= s*10 +a;
		}
		System.out.println("Reverse Integer is "+s);
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer : ");
		int n=sc.nextInt();
		Que4 obj = new Que4();
		obj.reverse(n);
		
	}

}
