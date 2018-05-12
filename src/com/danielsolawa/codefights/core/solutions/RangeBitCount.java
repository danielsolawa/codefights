package com.danielsolawa.codefights.core.solutions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RangeBitCount {

	int rangeBitCount(int a, int b) {
		List<String> list =  IntStream.range(a, b +1).mapToObj(n -> Integer.toBinaryString(n)).collect(Collectors.toList());
		int result = 0;
		
		for(String s : list)
			result += countDigits(s);
		
		return result;
	}
	
	int countDigits(String s) {
		int r = 0;
		for(int i = 0; i < s.length(); i++) {
			r += (s.charAt(i) - '0');
		}
		
		return r;
	}
	
	
}
