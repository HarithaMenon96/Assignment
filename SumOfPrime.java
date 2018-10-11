

import java.lang.reflect.Array;

public class SumOfPrime {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		int length = Array.getLength(array1);
		int primecheck = 0;
		int sum = 0;
		for (int i = 2; i < length; i++) {
			for (int j = 2; j <= (i / 2); j++) {
				if (i % j == 0) {
					primecheck++;
					break;
				} else {
					primecheck = 0;
				}

			}
			if (primecheck == 0) {
				sum = sum + array1[i];
				System.out.println("array[" + i + "]=" + array1[i]);
			}

		}
		System.out.println(sum);

	}

}

