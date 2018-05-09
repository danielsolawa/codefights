package com.danielsolawa.codefights.core.solutions;

public class MetroCard {

	

	int[] metroCard(int lastNumberOfDays) {
			int [] arr = null;
		
			if(lastNumberOfDays == 31) {
				arr= new int[2];
				arr[0]= 28;
				arr[1] = 30;
			}else {
				arr= new int[1];
				arr[0]= 31;	
			}
		return arr;
	}
	
	
}
