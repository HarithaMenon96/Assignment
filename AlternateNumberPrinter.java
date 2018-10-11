package com.deloitte;

public class MyAlternativePrinter {

	public static void main(String[] args) {
		
		try{int[] array1 = { 8, 9, 10, 11, 12, 13 };
		int[] array2 = {6,5,4,3,2,1};
		
		for(int i=0;i<6;i++) {
				System.out.println(array1[i]);
				System.out.println(array2[i]);
		}}
		catch(ArrayIndexOutOfBoundsException e) {}
	}
}
