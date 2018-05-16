package com.danielsolawa.codefights.core.solutions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CreateArray {

	int[] createArray(int size) {
		int arr[] = new int[size];
		Arrays.fill(arr, 1);
		return arr;
	}
	
	/*
	 * IntStream Solution
	 */
	int[] createArray2(int size) {
		return IntStream.range(0, size).map(n -> 1).toArray();
	}
	
}
