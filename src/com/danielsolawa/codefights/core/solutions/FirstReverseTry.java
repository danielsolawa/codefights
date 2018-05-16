package com.danielsolawa.codefights.core.solutions;

public class FirstReverseTry {

	int[] firstReverseTry(int[] arr) {
		if(arr.length == 0)
			return arr;
		
		arr[0] = arr[0] + arr[arr.length-1];
		arr[arr.length-1] = arr[0] - arr[arr.length-1];
		arr[0] = arr[0] - arr[arr.length-1];
		
		return arr;
				
	}
	
}
