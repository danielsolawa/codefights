package com.danielsolawa.codefights.core.solutions;

public class KillKthBit {

	
	int killKthBit(int n, int k) {
		return n = ~(1<<k-1);
	}
}
