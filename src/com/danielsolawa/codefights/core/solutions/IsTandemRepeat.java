package com.danielsolawa.codefights.core.solutions;

public class IsTandemRepeat {

	boolean isTandemRepeat(String inputString) {
		if(!(inputString.length() % 2 == 0))
			return false;
		
		String firstHalf = inputString.substring(0, inputString.length() / 2);
		String secondHalf = inputString.substring(inputString.length() / 2, inputString.length());

		return firstHalf.equals(secondHalf);
	}

	
}
