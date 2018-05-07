package com.danielsolawa.codefights.intro.solutions;

public class FindEmailDomain {

	
	String findEmailDomain(String address) {
		
		return address.substring(address.lastIndexOf('@')+1, address.length());
	}
}
