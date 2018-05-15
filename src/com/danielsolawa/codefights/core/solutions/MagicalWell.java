package com.danielsolawa.codefights.core.solutions;

public class MagicalWell {

	//Iterative solution
	int magicalWellI(int a, int b, int n) {
		int money = 0;
		while(n > 0) {
			money += (a*b);
			
			a++;
			b++;
			n--;
		}
		
		
		return money;
	}
	
	
	//Recursive solution
	int magicalWellR(int a, int b, int n) {
		if(n == 0)
			return 0;
		else
			return (a * b) + magicalWellR(a + 1, b + 1, n -1);
		
	}
	
}
