package com.danielsolawa.codefights.solutions;

public class KnapsackLight {

	int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
		if(weight1 + weight2 <= maxW) 
			return value1 + value2;
		else if(weight1 <= maxW && weight2 <= maxW)
			return Math.max(value1, value2);
		else if(weight1 <= maxW) 
			return value1;
		else if(weight2 <= maxW) 
			return value2;
		
		
		
		return 0;
	}
	
}
