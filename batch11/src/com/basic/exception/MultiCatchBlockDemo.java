package com.basic.exception;

public class MultiCatchBlockDemo {

	public static void main(String[] args) {

		try {

			String s2 = "123455d";

			char charAt = s2.charAt(7);
			System.out.println("Char : " + charAt);

			int num = Integer.parseInt(s2);
			System.out.println(num + 10);

			String s1 = null;
			System.out.println(s1.length());

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			// System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Rest of the code...");

	}

}
