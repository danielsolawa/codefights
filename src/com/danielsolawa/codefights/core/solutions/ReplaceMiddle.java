package com.danielsolawa.codefights.core.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceMiddle {

	Integer[] replaceMiddle(Integer[] arr) {
		if(!(arr.length % 2 == 0))
			return arr;
		
		int index = (int) Math.ceil((arr.length-1)/2);
		arr[index] = arr[index] + arr[index+1];
		List<Integer> list = new ArrayList<>(Arrays.asList(arr));
		list.remove(index + 1);
		
		
		return list.toArray(new Integer[list.size()]);
	}
	
	
}
