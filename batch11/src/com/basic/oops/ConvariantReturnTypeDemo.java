package com.basic.oops;

class Main {

	public Main getInstance() {
		return this;
	}

}

public class ConvariantReturnTypeDemo extends Main {

	@Override
	public ConvariantReturnTypeDemo getInstance() {
		return this;
	}

}
