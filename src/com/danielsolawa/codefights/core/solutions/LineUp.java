package com.danielsolawa.codefights.core.solutions;

public class LineUp {

	int lineUp(String commands) {
		int x = 0;
		int count = 0;
		for (int i = 0; i < commands.length(); i++) {
			char currentLetter = commands.charAt(i);
			if(currentLetter == 'A')
				x += 2;
			else if(currentLetter == 'L')
				x += 1;
			else
				x -= 1;
			
			count = (x % 2 == 0) ? count + 1 : count;
		}
		
		return count;
	}
	
	
}
