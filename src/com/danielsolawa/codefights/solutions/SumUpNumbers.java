package com.danielsolawa.codefights.solutions;

import java.util.Arrays;

public class SumUpNumbers {

	 	int sumUpNumbers(String inputString) {
			String[] splited = inputString.split("\\D+");

		
			return Arrays.stream(splited).mapToInt(s -> {
				if(s.length() > 0)
					return Integer.parseInt(s);
				else
					return 0;
			}).sum();
		}
	
}
