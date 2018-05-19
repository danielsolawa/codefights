package com.danielsolawa.codefights.core.solutions;

import java.util.HashSet;
import java.util.Set;

public class SquareDigitsSequence {

	int squareDigitsSequence(int n) {
		Set<Integer> set = new HashSet<>();
	    int n1 = n;
	    int counter = 1;
    
        if(n1 / 10 == 0)
            return 2;
    
	    do{
	    	n1 = n1/100 * n1/100
	    			+ ((n1/10) % 10) * ((n1/10) % 10)
	    			+ ((n1 % 10) * (n1 % 10));
	    	counter++;
	    	
	    	if(set.contains(n1))
	    		return counter;
	    	else
	    		set.add(n1);

	    }while(n1 != n);
	    
	    return counter;
	}
	
	
}
