package com.danielsolawa.codefights.core.solutions;

public class IsMAC48Address {
	
	
	boolean isMAC48Address(String inputString) {
		return inputString.matches("([0-9A-F]{2})\\-([0-9A-F]{2})\\-([0-9A-F]{2})\\-([0-9A-F]{2})\\-([0-9A-F]{2})\\-([0-9A-F]{2})");
	}
}
