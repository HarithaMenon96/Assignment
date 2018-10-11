package com.deloitte;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyFactorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		try {
			int entered = scan.nextInt();
			int factorial = entered;
			for (int i = 1; i < entered; i++) {
				factorial = factorial * i;

			}
			System.out.println("The factorial of " + entered + " is " + factorial);
		} catch (InputMismatchException e) {
			System.err.println("Please enter numbers only");
		}

	}
}
