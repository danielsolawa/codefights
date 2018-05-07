package com.danielsolawa.codefights.intro.solutions;

public class IsMAC48Address {

	boolean isMAC48Address(String s) {
		return s.matches("([0-9a-fA-F]{2}[-]){5}([0-9a-fA-F]{2})");
	}
}
