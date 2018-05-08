package com.danielsolawa.codefights.core.solutions;

public class MaxMultiple {

	
	int maxMultiple(int divisor, int bound) {
		
		for(int i = bound; i > 1; i--) {
			if(i % divisor == 0)
				return i;
		}
		
		
		return 1;
	}
}
