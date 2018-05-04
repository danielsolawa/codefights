package com.danielsolawa.codefights.solutions;

import java.util.Arrays;

public class SumUpNumbers {

	 	int sumUpNumbers(String inputString) {
	 		return Arrays.stream(inputString.split("\\D+")).filter(s -> s.length() > 0).mapToInt(Integer::parseInt).sum();
		}
	
}
