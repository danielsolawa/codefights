package com.danielsolawa.codefights.core.solutions;

public class ComfortableNumbers {

	int comfortableNumbers(int l, int r) {
		int count = 0;
		
		for(int i = l; i < r; i++) {
			for(int j = i + 1; j <= r; j++) {
				if(isComfortable(i, j) && isComfortable(j, i))
					count++;
			}
		}
		
		return count;
	}
	
	boolean isComfortable(int a, int b) {
		return a >= (b - countDigits(b)) && a <=(b + countDigits(b)); 
	}
	
	
	int countDigits(int n) {
		return n > 0 ? (n%10) + countDigits(n/10) : 0 ;
	}
	
	
}
