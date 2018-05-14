package com.danielsolawa.codefights.core.solutions;

public class EqualPairOfBits {
	
	int equalPairOfBits(int n, int m) {
		  return Integer.lowestOneBit(~(n^m)) ;
	}
	
}
