package com.basic.oops;

interface Printable {

	void print();

	void display();
	
	int numerOfStocks();

}

interface Showable {

	void print();

	void show();

}

public class Test implements Printable, Showable {

	@Override
	public void print() {
		System.out.println("Achived multiple inheritance");
	}

	@Override
	public void show() {
		System.out.println("method from showable interface");
	}

	@Override
	public void display() {
		System.out.println("method from printable interface");

	}

	public static void main(String[] args) {
		Test t = new Test();
		t.print();
		t.display();
		t.show();
	}

	@Override
	public int numerOfStocks() {
		// TODO Auto-generated method stub
		return 0;
	}

}
