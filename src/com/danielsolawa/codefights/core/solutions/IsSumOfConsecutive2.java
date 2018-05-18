package com.danielsolawa.codefights.core.solutions;

public class IsSumOfConsecutive2 {

	int isSumOfConsecutive2(int n) {
		int numberOfWays = 0;
		for (int i = 1; i < n; i++) {
			int current = i;
			for (int j = i+1; j < n; j++) {
				current += j;
				if(current == n)
					numberOfWays++;
			}		
		}
		
		return numberOfWays;
	}
	
}
