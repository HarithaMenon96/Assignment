
 package com.deloitte;

public class PrimeSquare {

	public static void main(String[] args) {

		int prime = 2;
		while (prime <= 30) {
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
				System.out.println(+prime * prime + " is square of " + prime);
			}

			prime++;
		}

	}
}
