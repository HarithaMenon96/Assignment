package com.deloitte;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyPrimeNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to be checked");
		try {
			int prime = scan.nextInt();
			int primecheck = 0;
			for (int i = 2; i <= (prime / 2); i++) {
				for (int j = 2; j < i; j++) {
					if (prime % j == 0) {
						primecheck++;
						break;
					} else {
						primecheck = 0;
					}
				}
			}

			if (primecheck == 0) {
				System.out.println(+prime + " is a prime number");
			} else {
				System.out.println(+prime + " is not a prime number");

			}
		} catch (InputMismatchException e) {
			System.err.println("Please enter numbers only");
		}

	}
}
