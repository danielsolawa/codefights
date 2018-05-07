package com.danielsolawa.codefights.solutions;

public class SpiralNumbers {
	
	int[][] spiralNumbers(int n) {
		int[][] arr = new int[n][n];
		int maxSize = n * n;
		int currentSize = 0;
		
		int i = 0, lastI = 0;
		int j = 0, lastJ = 0;
		
		//constraints
		int maxWidth = n, maxHeight = n;
		int minWidth = -1, minHeight = -1;
		
		//current direction. -1 down, 1 top, -2 left, 2 right
		int direction = 2;
		
		while(currentSize < maxSize) {
			//save
			lastI = i;
			lastJ = j;
			arr[i][j] = ++currentSize;
			
			//move 
			if(direction == 2)
				j++;
			else if(direction == -2)
				j--;
			else if(direction == 1)
				i--;
			else
				i++;

			
			//change direction 
			if(j == maxWidth || (direction == 2 && arr[i][j] != 0)) {
				direction = -1;
				i = lastI+1;
				j = lastJ;
			}
			else if(i == maxHeight || (direction == -1 && arr[i][j] != 0)) {
				direction = -2;
				i = lastI;
				j = lastJ-1;
			}
			else if(j == minWidth || (direction == -2 && arr[i][j] != 0)) {
				direction = 1;
				i = lastI-1;
				j = lastJ;
			}
			else if(i == minHeight || (direction == 1 && arr[i][j] != 0)) {
				direction = 2;
				i = lastI;
				j = lastJ+1;
			}

		}
		
		return arr;
	}
}
