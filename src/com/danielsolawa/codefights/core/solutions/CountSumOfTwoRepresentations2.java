package com.danielsolawa.codefights.core.solutions;

public class CountSumOfTwoRepresentations2 {

	int countSumOfTwoRepresentations2(int n, int l, int r) {
		int numberOfWays = 0;
		
		while(l <= r) {
			int currentSum = l + r ;
			if(currentSum == n)
				numberOfWays++;
			
			if(currentSum < n)
				l++;
			else 
				r--;
	
		}
		
		return numberOfWays;
	}

	
	
}
