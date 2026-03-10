package com.basic.oops;

class Address {

	String flatNo;
	String landMark;
	long pincode;

}

public class AggregationDemo {

	int rollNo;
	String name;
	Address add;

	public AggregationDemo(int rollNo, String name, Address add) {
		this.rollNo = rollNo;
		this.name = name;
		this.add = add;
	}

}
