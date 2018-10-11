package com.deloitte;

public class DivisorsOfFifty {

	public static void main(String[] args) {
		int num = 50;
		for (int i = 1; i <= 50; i++) {
			if (num % i == 0) {
				System.out.println(+i + " is a divisor of 50");
			}

		}

	}

}
