package com.danielsolawa.codefights.intro.solutions;

public class ValidTime {
	
	
	boolean validTime(String time) {
		int h = Integer.parseInt(time.substring(0, 2));
		int m = Integer.parseInt(time.substring(3, time.length()));
		
		
		return h < 25 && m < 60 ? true : false;

	}
	
	
}
