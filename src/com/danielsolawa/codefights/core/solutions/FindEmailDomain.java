package com.danielsolawa.codefights.core.solutions;

public class FindEmailDomain {

	String findEmailDomain(String address) {
		return address.substring(address.lastIndexOf('@') + 1, address.length());
	}
	
}
