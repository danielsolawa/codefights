package com.danielsolawa.codefights.core.solutions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MakeArrayConsecutive2 {

	int makeArrayConsecutive2(int[] statues) {
		Arrays.sort(statues);
		return (int) IntStream.range(1, statues.length).map(n -> Math.abs(statues[n] - statues[n-1] -1)).sum();
	}
	
	
}
