package com.danielsolawa.codefights.intro.solutions;

public class DeleteDigit {

	 int deleteDigit(int n) {
		String s = String.valueOf(n);
	
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < s.length(); i++) {
			StringBuilder sb = new StringBuilder(s);
			sb.deleteCharAt(i);
			max = Math.max(max, Integer.parseInt(sb.toString()));
		}
		
		
		return max;
	}
	
	
}
