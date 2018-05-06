package com.danielsolawa.codefights.solutions;

public class DigitsProduct {

	
	int digitsProduct(int product) {
		for(int i = 1; i < 99999; i++) {
			String digits = String.valueOf(i);
			int result = (digits.charAt(0) - '0');
			for(int j = 1; j < digits.length(); j++) {
				result *= (digits.charAt(j) - '0');
			}
			if(result == product)
				return Integer.parseInt(digits);
				
		}
		
		return -1;
	}
	
}
