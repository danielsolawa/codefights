package com.danielsolawa.codefights.core.solutions;

public class LeastFactorial {

	int leastFactorial(int n) {
		int k = 1;
		while(getFactorial(k) < n) {
			k++;
		}
			
			
		return getFactorial(k);
	}


	int getFactorial(int n) {
		int result = 1;
		for(int i = 2; i <= n; i++)
			result *= i;
		
		return result;
	}
	
}
