package com.basic.oops;

class Bank {

	public int getInterestRate() {
		return 10;
	}

}

class SBI extends Bank {

	@Override
	public int getInterestRate() {
		return 7;
	}

}

class ICICI extends Bank {

	@Override
	public int getInterestRate() {
		return 9;
	}

}

class AXIS extends Bank {

	@Override
	public int getInterestRate() {
		return 8;
	}

}

public class MethodOverridingDemo2 {

	public static void main(String[] args) {

		SBI s = new SBI();

		ICICI i = new ICICI();

		AXIS a = new AXIS();

		System.out.println("SBI rate of interest " + s.getInterestRate());
		System.out.println("ICICI rate of interest " + i.getInterestRate());
		System.out.println("Axis rate of interest " + a.getInterestRate());

	}

}
