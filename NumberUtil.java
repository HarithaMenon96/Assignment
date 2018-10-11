
 package com.deloitte;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberUtil {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter operation of your choice");
		System.out.println("1.Multiplication");
		System.out.println("2. Square Root");
		try {int choice = scan.nextInt();
	
			switch (choice) {
			case 1:
				try {
					System.out.println("Enter two numbers");
					int a = scan.nextInt();
					int b = scan.nextInt();
					product(a, b);
					break;
				} catch (InputMismatchException e) {
					System.out.println("Please enter numbers only");
					break;
				}

			case 2:
				try {
					System.out.println("Enter the number");
					double q = scan.nextDouble();
					double squareroot = Math.sqrt(q);
					System.out.println("The square root of " + q + " is" + squareroot);
					break;
				} catch (InputMismatchException e) {
					System.out.println("Please enter numbers only");
					break;
				}
			default:
				System.err.println("Please enter numbers only");
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid Option.");
		}

	}

	private static void product(int a, int b) {
		int result;
		result = a * b;
		System.out.println("The product of " + a + "and " + b + " is" + result);
	}
}
