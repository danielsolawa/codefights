package com.danielsolawa.codefights.core.solutions;

public class WillYou {

	boolean willYou(boolean young, boolean beautiful, boolean loved) {

	    if(young && beautiful && !loved)
	        return true;
	    else if((!young || !beautiful) && loved)
	        return true;
	    
	    return false;
	    
	}

	
}
