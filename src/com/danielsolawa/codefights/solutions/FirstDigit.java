package com.danielsolawa.codefights.solutions;

public class FirstDigit {

	
	
	char firstDigit(String inputString) {
		
		for (int i = 0; i < inputString.length(); i++) {
			if(Character.isDigit(inputString.charAt(i)))
				return inputString.charAt(i);
		}
		
		return '0';
	}
}
