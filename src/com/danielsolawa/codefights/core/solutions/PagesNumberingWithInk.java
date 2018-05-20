package com.danielsolawa.codefights.core.solutions;

public class PagesNumberingWithInk {

	static int pagesNumberingWithInk(int current, int numberOfDigits) {
		int length = String.valueOf(current).length(); 
		
		return length > numberOfDigits ? current -1 : pagesNumberingWithInk(current + 1, numberOfDigits - length) ;
	}
	
}
