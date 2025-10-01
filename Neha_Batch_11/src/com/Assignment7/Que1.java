package com.Assignment7;
import java.util.Scanner;
/**
 * Check weather the character is alphabet, digit or special symbol 
 * */

public class Que1 {
	void checkchar(int chInt) {
		if(chInt>=48 && chInt<=57) {
			System.out.println("Entered charechter is Digit ");
		}
		else if(chInt>=65 && chInt<=90){
			System.out.println("Enetred character is Alphabe");
		}
		else if(chInt>=97 && chInt<=122) {
			System.out.println("Entered character is Alphabet");
		}
		else {
			System.out.println("Entered character is Special Symbol");
		}
		
	}
	public static void main(String [] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enetr any charechter : ");
	char ch = sc.next().charAt(0);
	Que1 obj = new Que1();
	int chInt=(int)ch;
	obj.checkchar(chInt);
	}
}
