package com.deloitte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import sun.rmi.runtime.Log;

public class MyReverseArray {

	public static void main(String[] args) {
		List cArry = new ArrayList();
		char[] cArr = { 'B', 'U', 'H', 'D', 'I', 'U', 'Q', 'I', 'L' };
		for (char alphabet : cArr) {
			cArry.add(alphabet);
		}
		Collections.reverse(cArry);
		System.out.println("After Reverse Order, cArr Contains : " + cArry);
	}
}
