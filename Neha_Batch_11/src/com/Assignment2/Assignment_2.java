package com.Assignment2;

public class Assignment_2 {
	//Qur 4 Declare global variable y
	static int y=25;

	public static void main(String[] agrs) {
		//Que 1 ->> Declare the premitive data types 
		short s=10;
		int i=10000;
		long l=1234567890;
		float f=0.123f;
		double d= 123.33514365;
		char ch='h';
		boolean bool=true;
		
		
		System.out.println("Short : "+s);
		System.out.println("Int : "+i);
		System.out.println("Long : "+l);
		System.out.println("Float : "+f);
		System.out.println("Double : "+d);
		System.out.println("Charechter : "+ch);
		System.out.println("boolean : "+bool);
		
		
		//Que 2-> print 1st character of my name 
		String name="Neha"; 
		System.out.println(name.charAt(0));
		
		
		//Que 3 -> Declare the local variable
		int x; //declare
		
		x=50; //Que 4 -> assign local variable value as 50	
		
		
		System.out.println(y);//printing global variable value as 25	

		
	}
	
		
	
	
}
