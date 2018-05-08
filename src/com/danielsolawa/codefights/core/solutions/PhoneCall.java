package com.danielsolawa.codefights.core.solutions;

public class PhoneCall {

	
	int phoneCall(int min1, int min2_10, int min11, int s) {
	    if(s < min1)
	        return 0;
	    
	    int count = 0;
	    while(s > 0) {
	    	if(count == 0)
	    		s -= min1;
	    	else if(count > 0 && count <= 9)
	    		s -= min2_10;
	    	else
	    		s -= min11;

	    	count++;
	    }
	    
	    return count;
	}
	
}
