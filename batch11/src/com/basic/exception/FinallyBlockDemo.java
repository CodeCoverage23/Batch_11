package com.basic.exception;

class DTO {
	private Integer num;

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

}

public class FinallyBlockDemo {

	public static void main(String[] args) {

		try {

			DTO d = new DTO();
			Integer num = d.getNum();
			System.out.println(num.intValue());

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Important code is executing...");
		}

		System.out.println("rset of the code....");

	}

}
