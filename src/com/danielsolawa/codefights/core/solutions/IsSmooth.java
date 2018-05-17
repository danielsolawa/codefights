package com.danielsolawa.codefights.core.solutions;

public class IsSmooth {

	boolean isSmooth(int[] arr) {
		int middle = 0;
		int index = 0;
		if((arr.length & 1) == 0) {
			index = (int) Math.ceil((arr.length-1)/2);	
			middle = arr[index] + arr[index+1];
		}
		else {
			index = (arr.length-1)/2;
			middle = arr[index];
		}

		
		return arr[0] == middle && middle == arr[arr.length-1];
		
	}
	
	
}
