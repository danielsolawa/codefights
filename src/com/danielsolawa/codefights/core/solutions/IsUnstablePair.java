package com.danielsolawa.codefights.core.solutions;

public class IsUnstablePair {
	
	
	boolean isUnstablePair(String filename1, String filename2) {
		
		return (filename1.compareTo(filename2) < 0 && filename1.compareToIgnoreCase(filename2) > 0) 
				|| (filename1.compareTo(filename2) > 0 && filename1.compareToIgnoreCase(filename2) < 0);
	}
}
