package com.danielsolawa.codefights.core.solutions;

public class DifferentRightmostBit {

	int differentRightmostBit(int n, int m) {
		  return Integer.lowestOneBit(n^m) ;
	}
	
	
}
