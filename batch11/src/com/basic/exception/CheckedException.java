package com.basic.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Compile time exception
 */
public class CheckedException {

	public static void main(String[] args) {

		try {
			new FileReader("C:/test/demo.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
