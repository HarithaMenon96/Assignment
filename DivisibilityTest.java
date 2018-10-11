package com.deloitte;

public class MyDivisibilityTest {

	public static void main(String[] args) {
		int a = 3, b = 5;
		for (int i = 0; i <= 50; i++) {
			if ((i % b == 0) && (i % a == 0))
				System.out.println("abcxyz");
			else if (i % b == 0)
				System.out.println("xyz");
			else if (i % a == 0)
				System.out.println("abc");
			else
				System.out.println(i);
		}

	}

}
