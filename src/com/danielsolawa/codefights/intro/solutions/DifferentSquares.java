package com.danielsolawa.codefights.intro.solutions;

import java.util.HashSet;
import java.util.Set;

public class DifferentSquares {

	
	static int differentSquares(int[][] matrix) {
		Set<String> set = new HashSet<>();
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[i].length; j++) {
				
				set.add(matrix[i][j] + ""+ matrix[i][j-1] + ""+ matrix[i-1][j] + ""+ matrix[i-1][j-1]);
			}
		}
		
		
		return set.size();
	}
	
}
