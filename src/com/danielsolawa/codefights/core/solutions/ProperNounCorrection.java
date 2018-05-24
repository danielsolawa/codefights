package com.danielsolawa.codefights.core.solutions;

public class ProperNounCorrection {


	String properNounCorrection(String noun) {
		
		return Character.toUpperCase(noun.charAt(0)) + noun.substring(1, noun.length()).toLowerCase();
	}
	
}
