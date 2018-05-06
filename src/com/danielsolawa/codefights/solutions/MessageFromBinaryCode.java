package com.danielsolawa.codefights.solutions;

public class MessageFromBinaryCode {
	
	
	String messageFromBinaryCode(String code) {
		String message = "";
		while(code.length() > 0) {
			String temp = code.substring(0, 8);
			message += (char)Integer.parseInt(temp, 2);
			code = code.substring(8, code.length());
		}
		
		
		return message;
	}


}
