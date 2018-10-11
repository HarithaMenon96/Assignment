package com.deloitte;

import java.util.Scanner;

public class PyramidOfStars {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of Rows to print:");
		int rows = s.nextInt();
		System.out.println("Pyramid:");
		int limit = 0;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
			limit++;

		}
	}
}
