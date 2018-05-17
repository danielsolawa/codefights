package com.danielsolawa.codefights.core.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveArrayPart {

	Integer[] removeArrayPart(Integer[] inputArray, int l, int r) {
		List<Integer> list = new ArrayList<>(Arrays.asList(inputArray));
		int itemsToRemove = r - l + 1;
		while(itemsToRemove > 0) {
			 list.remove(r);
			 r--;
			 itemsToRemove--;
		}
		
		return list.toArray(new Integer[list.size()]);
	}
	
	
}
