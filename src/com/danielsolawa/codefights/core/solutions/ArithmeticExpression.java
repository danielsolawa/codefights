package com.danielsolawa.codefights.core.solutions;

public class ArithmeticExpression {

	boolean arithmeticExpression(int a, int b, int c) {
	    if((a + b == c )|| (a - b == c )||( a * b == c) || ((double)a / b == c))
	        return true;


	    return false;
	}

	
	
}
