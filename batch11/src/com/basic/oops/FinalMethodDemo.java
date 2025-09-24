package com.basic.oops;

class FinalMethod {

	public final void finalMethod() {
		System.out.println("This is final method");
	}

}

public class FinalMethodDemo extends FinalMethod {

	/*
	 * Can not override final method
	@Override
	public void finalMethod() {
		System.out.println("This is final method from parent class");
	}
	*/

	public static void main(String[] args) {
		new FinalMethodDemo().finalMethod();
	}

}
