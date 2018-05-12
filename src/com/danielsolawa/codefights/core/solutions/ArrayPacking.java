package com.danielsolawa.codefights.core.solutions;

public class ArrayPacking {

	int arrayPacking(int[] a) {
		String s = "";
		for(int i = a.length-1; i >= 0; i--) {
			s += getBinary(a[i]);
		}
			
		
		return Integer.parseInt(s, 2);
	}
	
	static String getBinary(int val) {
		String s = "";
		for(int i = 0; i < 8; i++) {
			if(val % 2 == 1)
				s = 1 + s;
			else if(val % 2 == 0)
				s = 0 + s;
			
			val = val/2;
		}
		
		return s;
	}

	
	
}
