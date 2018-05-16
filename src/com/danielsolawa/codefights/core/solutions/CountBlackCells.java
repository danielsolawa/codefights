package com.danielsolawa.codefights.core.solutions;

public class CountBlackCells {

	int countBlackCells(int n, int m) {
		return gcd(n, m) > 1 ? (n + m) + gcd(n, m) - 2:  n + m - gcd(n, m);
	
	}
	
	int gcd(int a, int b) {
		return b != 0 ? gcd(b, a % b) : a;
	}
	
}
