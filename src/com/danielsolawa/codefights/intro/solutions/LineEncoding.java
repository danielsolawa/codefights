package com.danielsolawa.codefights.intro.solutions;

public class LineEncoding {

	
	String lineEncoding(String s) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		char lastChar = s.charAt(0);
		for(int i = 1; i <  s.length(); i++) {
			
			if(lastChar == s.charAt(i))
				count++;
			else {
				sb.append(saveLetter(count, lastChar));
				count = 1;
				lastChar = s.charAt(i);
			}
			
			if(i == s.length() -1)
				sb.append(saveLetter(count, s.charAt(i)));

		}
		
		
		return sb.toString();
		
	}

	
	String saveLetter(int count, char letter) {
		return count > 1 ? count + "" + letter : letter + "";
	}
	
	
}
