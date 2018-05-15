package com.danielsolawa.codefights.core.solutions;

public class AppleBoxes {

	/*
	 * Iterative Solution
	 */
	int appleBoxes(int k) {
		int yellow = 0;
		int red = 0;
		for(int i = 1; i <= k; i++) {
			if((i & 1) == 0)
				red += (i*i);
			else
				yellow += (i*i);	
		}

		return red - yellow;
	
	}
	
	/*
	 * Recursive Solution
	 */
	static int appleBoxesRec(int k) {
		
		return k % 2 == 0 ? countApples(k) - countApples(k-1) : countApples(k-1) - countApples(k);
	}
	
	static int countApples(int x) {
		return x > 0 ? (x * x) + countApples(x -2) : 0;
	}
	
}
