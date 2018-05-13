package com.danielsolawa.codefights.core.solutions;

public class MirrorBits {

	int mirrorBits(int a) {

		return Integer.parseInt(new StringBuilder(Integer.toBinaryString(a)).reverse().toString(), 2);
	}
	
	
}
