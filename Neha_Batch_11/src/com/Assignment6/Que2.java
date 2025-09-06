package com.Assignment6;

public class Que2 {
	void multiplication(int no) {
		int i =1;
		while(i<=10) {
			System.out.println(no+ "*"+i + " = "+(no*i));
			i++;
		}
		
	}
	public static void main(String[] args) {
		Que2 ob=new Que2();
		ob.multiplication(5);
	}

}
