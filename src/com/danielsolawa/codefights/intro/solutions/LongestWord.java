package com.danielsolawa.codefights.intro.solutions;

import java.util.Arrays;

public class LongestWord {

	String longestWord(String text) {
		String[] splited = text.split("\\W+");
		Arrays.sort(splited, (s1, s2) -> s1.length() - s2.length());
		
		return splited[splited.length - 1];
	}

}
