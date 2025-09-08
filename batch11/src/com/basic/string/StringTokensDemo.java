package com.basic.string;

import java.util.StringTokenizer;

public class StringTokensDemo {

	public static void main(String[] args) {

		String s1 = "Apple,Banana";

		StringTokenizer st = new StringTokenizer(s1, ",");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
