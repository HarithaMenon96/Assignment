package com.deloitte;

import java.util.Scanner;

public class Roman {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number;
		System.out.println("Enter the number to converted to roman numerals (upto 3000)");
		number = scan.nextInt();
		String roman = ". ";
		int[] DecimalNumbers = { 1000, 500, 100, 50, 10, 5, 1 };
		char[] RomanNumerals = { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };
		int i;

		while (number > 0) {
			for (i = 0; i < 6; i++) {
				if (number - DecimalNumbers[i] >= 0) {
					System.out.print(RomanNumerals[i]);
					number -= DecimalNumbers[i];
					break;
				}

			}
		}
	}
}