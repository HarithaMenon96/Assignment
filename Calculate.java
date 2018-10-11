package com.deloitte;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		int a = 0, b = 0, result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		try {
			a = scan.nextInt();
			b = scan.nextInt();

			System.out.println("Enter the fuction you would like to operate");
			System.out.println("1. Add");
			System.out.println("2.Subtract");
			System.out.println("3.Multiply");
			System.out.println("4.Divide");
			try {
				int calculator = scan.nextInt();
				switch (calculator) {
				case 1:
					result = a + b;
					System.out.println(" The sum of " + a + " and " + b + " is " + result);
					break;
				case 2:
					result = a - b;
					System.out.println(" The sum of " + a + " and " + b + " is " + result);
					break;
				case 3:
					result = a * b;
					System.out.println(" The product of " + a + " and " + b + " is " + result);
					break;
				case 4:
					result = a / b;
					System.out.println(" The quotient of " + a + " and " + b + " is " + result);
					break;
				default:
					System.err.println("Please enter 1 to 4 only");
					break;

				}
			} catch (InputMismatchException e) {
				System.err.println("Please enter 1 to 4 only");
			}
		} catch (InputMismatchException e) {
			System.err.println("Enter numbers only");
		}

	}

}
