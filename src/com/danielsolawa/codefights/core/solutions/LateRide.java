package com.danielsolawa.codefights.core.solutions;

public class LateRide {
	
	int lateRide(int n) {
		String currentTime = (n / 60)+ "" + (n % 60);
		int result = 0;
		for(int i = 0; i < currentTime.length(); i++)
			result += (currentTime.charAt(i) - '0');
		
		return result;
	}
	
}
