package com.danielsolawa.codefights.core.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatenateArrays {

	Integer[] concatenateArrays(Integer[] a, Integer[] b) {
		List<Integer> list = new ArrayList<>(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		
		return list.toArray(new Integer[list.size()]);
	}
	
	
}
