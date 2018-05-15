package com.danielsolawa.codefights.core.solutions;

public class AdditionWithoutCarrying {

	int additionWithoutCarrying(int param1, int param2) {
		if(param1 == 0 && param2 == 0)
			return 0;
		else {
			int result = (param1 % 10) + (param2 % 10) >= 10 ? ((param1 % 10) + (param2 % 10)) % 10 : ((param1 % 10) + (param2 % 10));
			return  (additionWithoutCarrying(param1 / 10 , param2 / 10) * 10)+ result;
		}

	}
	
}
