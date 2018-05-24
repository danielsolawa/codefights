package com.danielsolawa.codefights.core.solutions;

public class IsCaseInsensitivePalindrome {

	boolean isCaseInsensitivePalindrome(String inputString) {
		return new StringBuilder(inputString).reverse().toString().toLowerCase().equals(inputString.toLowerCase());
	}
}
