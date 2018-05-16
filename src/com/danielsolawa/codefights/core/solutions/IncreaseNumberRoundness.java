package com.danielsolawa.codefights.core.solutions;

public class IncreaseNumberRoundness {

	boolean increaseNumberRoundness(int n) {
		String s = String.valueOf(n);
		char lastDigit = s.charAt(s.length()-1);
		for(int i = s.length() -2; i >= 0; i--) {
			
			if(lastDigit != '0' && s.charAt(i) == '0') {
				return true;
			}
				
			lastDigit = s.charAt(i);
		}
		
		return false;
	}
	
	
}
