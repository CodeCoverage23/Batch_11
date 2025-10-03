package com.basic.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeywordDemo {

	public static void main(String[] args) throws Exception {

		// new FileReader("c:/test/test.txt");

		ThrowsKeywordDemo t = new ThrowsKeywordDemo();

		// t.checkException();
		try {
			t.checkFileException();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Rest of the code");

	}

	public void checkException() throws IOException {

		throw new IOException();

	}

	public void checkFileException() throws Exception {

		BufferedReader b = new BufferedReader(new FileReader("c:/test/test.txt"));

		if (b != null) {
			System.out.println(b.readLine());
		}

	}

}
