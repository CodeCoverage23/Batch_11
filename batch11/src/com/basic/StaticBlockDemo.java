package com.basic;

public class StaticBlockDemo {

	static {
		System.out.println("I am static block..");
	}

	public static void main(String[] args) {
		System.out.println("I am main method...");
	}

	static final class Block {

	}

}
